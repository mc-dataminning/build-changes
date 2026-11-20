package net.minecraft.client;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BiConsumer;
import net.minecraft.network.chat.FormattedText;
import net.minecraft.network.chat.Style;
import net.minecraft.util.FormattedCharSequence;
import net.minecraft.util.FormattedCharSink;
import net.minecraft.util.StringDecomposer;
import org.apache.commons.lang3.mutable.MutableFloat;
import org.apache.commons.lang3.mutable.MutableInt;
import org.jspecify.annotations.Nullable;

public class StringSplitter {
   private final StringSplitter.WidthProvider widthProvider;

   public StringSplitter(final StringSplitter.WidthProvider widthProvider) {
      this.widthProvider = widthProvider;
   }

   public float stringWidth(final @Nullable String str) {
      if (str == null) {
         return 0.0F;
      }

      MutableFloat result = new MutableFloat();
      StringDecomposer.iterateFormatted(str, Style.EMPTY, (var2x, style, codepoint) -> {
         result.add(this.widthProvider.getWidth(codepoint, style));
         return true;
      });
      return result.floatValue();
   }

   public float stringWidth(final FormattedText text) {
      MutableFloat result = new MutableFloat();
      StringDecomposer.iterateFormatted(text, Style.EMPTY, (var2x, style, codepoint) -> {
         result.add(this.widthProvider.getWidth(codepoint, style));
         return true;
      });
      return result.floatValue();
   }

   public float stringWidth(final FormattedCharSequence text) {
      MutableFloat result = new MutableFloat();
      text.accept((var2x, style, codepoint) -> {
         result.add(this.widthProvider.getWidth(codepoint, style));
         return true;
      });
      return result.floatValue();
   }

   public int plainIndexAtWidth(final String str, final int maxWidth, final Style style) {
      StringSplitter.WidthLimitedCharSink output = new StringSplitter.WidthLimitedCharSink(maxWidth);
      StringDecomposer.iterate(str, style, output);
      return output.getPosition();
   }

   public String plainHeadByWidth(final String str, final int maxWidth, final Style style) {
      return str.substring(0, this.plainIndexAtWidth(str, maxWidth, style));
   }

   public String plainTailByWidth(final String str, final int maxWidth, final Style style) {
      MutableFloat currentWidth = new MutableFloat();
      MutableInt result = new MutableInt(str.length());
      StringDecomposer.iterateBackwards(str, style, (position, s, codepoint) -> {
         float w = currentWidth.addAndGet(this.widthProvider.getWidth(codepoint, s));
         if (w > maxWidth) {
            return false;
         }

         result.setValue(position);
         return true;
      });
      return str.substring(result.intValue());
   }

   public FormattedText headByWidth(final FormattedText text, final int width, final Style initialStyle) {
      final StringSplitter.WidthLimitedCharSink output = new StringSplitter.WidthLimitedCharSink(width);
      return text.visitUnbounded(new FormattedText.StyledContentConsumer<FormattedText>() {
         private final ComponentCollector collector = new ComponentCollector();
         private int count;

         @Override
         public Optional<FormattedText> accept(final Style style, final String contents) {
            if (++this.count > 65536) {
               return Optional.of(this.collector.getResultOrEmpty());
            }

            output.resetPosition();
            if (!StringDecomposer.iterateFormatted(contents, style, output)) {
               String partial = contents.substring(0, output.getPosition());
               if (!partial.isEmpty()) {
                  this.collector.append(FormattedText.of(partial, style));
               }

               return Optional.of(this.collector.getResultOrEmpty());
            } else {
               if (!contents.isEmpty()) {
                  this.collector.append(FormattedText.of(contents, style));
               }

               return Optional.empty();
            }
         }
      }, initialStyle).orElse(text);
   }

   public int findLineBreak(final String input, final int max, final Style initialStyle) {
      StringSplitter.LineBreakFinder finder = new StringSplitter.LineBreakFinder(max);
      boolean reachedLineEnd = StringDecomposer.iterateFormatted(input, initialStyle, finder);
      return reachedLineEnd ? input.length() : finder.getSplitPosition();
   }

   public static int getWordPosition(final String text, final int dir, final int from, final boolean stripSpaces) {
      int result = from;
      boolean reverse = dir < 0;
      int abs = Math.abs(dir);

      for (int i = 0; i < abs; i++) {
         if (reverse) {
            while (stripSpaces && result > 0 && (text.charAt(result - 1) == ' ' || text.charAt(result - 1) == '\n')) {
               result--;
            }

            while (result > 0 && text.charAt(result - 1) != ' ' && text.charAt(result - 1) != '\n') {
               result--;
            }
         } else {
            int length = text.length();
            int index1 = text.indexOf(32, result);
            int index2 = text.indexOf(10, result);
            if (index1 == -1 && index2 == -1) {
               result = -1;
            } else if (index1 != -1 && index2 != -1) {
               result = Math.min(index1, index2);
            } else if (index1 != -1) {
               result = index1;
            } else {
               result = index2;
            }

            if (result == -1) {
               result = length;
            } else {
               while (stripSpaces && result < length && (text.charAt(result) == ' ' || text.charAt(result) == '\n')) {
                  result++;
               }
            }
         }
      }

      return result;
   }

   public void splitLines(
      final String input, final int maxWidth, final Style initialStyle, final boolean includeAll, final StringSplitter.LinePosConsumer output
   ) {
      int start = 0;
      int size = input.length();
      Style workStyle = initialStyle;
      StringSplitter.LineBreakFinder finder = new StringSplitter.LineBreakFinder(maxWidth);

      while (start < size) {
         boolean endOfText = StringDecomposer.iterateFormatted(input, start, workStyle, initialStyle, finder);
         if (endOfText) {
            output.accept(workStyle, start, size);
            break;
         }

         int lineBreak = finder.getSplitPosition();
         int lineBreakCodepoint = finder.getSplitCodepoint();
         int adjustedBreak = lineBreakCodepoint != 10 && lineBreakCodepoint != 32 ? lineBreak : lineBreak + 1;
         output.accept(workStyle, start, includeAll ? adjustedBreak : lineBreak);
         start = adjustedBreak;
         workStyle = finder.getSplitStyle();
         finder.resetForNewLine();
      }
   }

   public List<FormattedText> splitLines(final String input, final int maxWidth, final Style initialStyle) {
      List<FormattedText> result = new ArrayList<>();
      this.splitLines(input, maxWidth, initialStyle, false, (style, start, end) -> result.add(FormattedText.of(input.substring(start, end), style)));
      return result;
   }

   public List<FormattedText> splitLines(final FormattedText input, final int maxWidth, final Style initialStyle) {
      List<FormattedText> result = new ArrayList<>();
      this.splitLines(input, maxWidth, initialStyle, (text, var2) -> result.add(text));
      return result;
   }

   public void splitLines(final FormattedText input, final int maxWidth, final Style initialStyle, final BiConsumer<FormattedText, Boolean> output) {
      Deque<StringSplitter.LineComponent> partList = new ArrayDeque<>();
      input.visitWithoutResult((style, contents) -> {
         if (!contents.isEmpty()) {
            partList.addLast(new StringSplitter.LineComponent(contents, style));
         }

         return Optional.empty();
      }, initialStyle);
      StringSplitter.FlatComponents parts = new StringSplitter.FlatComponents(partList);
      boolean shouldContinue = true;
      boolean forceNewLine = false;
      boolean isWrapped = false;
      StringSplitter.LineBreakFinder finder = new StringSplitter.LineBreakFinder(maxWidth);
      ComponentCollector componentCollector = new ComponentCollector();

      while (shouldContinue) {
         shouldContinue = false;
         if (parts.findNextLineBreak(finder, initialStyle)) {
            int lineBreak = finder.getSplitPosition();
            Style lineBreakStyle = finder.getSplitStyle();
            int lineSplitCodepoint = finder.getSplitCodepoint();
            boolean isNewLine = lineSplitCodepoint == 10;
            boolean skipNextChar = isNewLine || lineSplitCodepoint == 32;
            forceNewLine = isNewLine;
            parts.splitAt(lineBreak, skipNextChar ? 1 : 0, lineBreakStyle, componentCollector);
            FormattedText result = componentCollector.getResultOrEmpty();
            componentCollector.reset();
            output.accept(result, isWrapped);
            isWrapped = !isNewLine;
            finder.resetForNewLine();
            shouldContinue = true;
         }
      }

      parts.getRemainder(componentCollector);
      FormattedText lastLine = componentCollector.getResult();
      if (lastLine != null) {
         output.accept(lastLine, isWrapped);
      } else if (forceNewLine) {
         output.accept(FormattedText.EMPTY, false);
      }
   }

   private static class FlatComponents {
      private final Deque<StringSplitter.LineComponent> parts;
      private @Nullable String currentText;
      private int currentPosition;
      private Style currentStyle = Style.EMPTY;
      private StringSplitter.@Nullable LineComponent currentFullPart;

      public FlatComponents(final Deque<StringSplitter.LineComponent> parts) {
         this.parts = parts;
      }

      public void splitAt(final int prefixSize, final int discardSize, final Style splitStyle, final ComponentCollector output) {
         int cutPosition = prefixSize;
         boolean discarding = false;

         while (this.currentText != null || !this.parts.isEmpty()) {
            if (this.currentText == null) {
               this.fetchNextPart();
            }

            int contentsSize = this.currentText.length();
            if (!discarding) {
               if (cutPosition > contentsSize) {
                  this.outputCurrentPart(output);
                  this.discardCurrentPart();
                  cutPosition -= contentsSize;
               } else {
                  this.outputCurrentPart(output, cutPosition);
                  cutPosition += discardSize;
                  discarding = true;
               }
            }

            if (discarding) {
               if (cutPosition <= contentsSize) {
                  this.consumeFromCurrentPart(cutPosition, splitStyle);
                  break;
               }

               this.discardCurrentPart();
               cutPosition -= contentsSize;
            }
         }
      }

      private void fetchNextPart() {
         StringSplitter.LineComponent element = this.parts.removeFirst();
         this.currentFullPart = element;
         this.currentText = element.contents;
         this.currentStyle = element.style;
         this.currentPosition = 0;
      }

      private void outputCurrentPart(final ComponentCollector output) {
         if (this.currentFullPart != null) {
            output.append(this.currentFullPart);
         } else {
            String currentText = Objects.requireNonNull(this.currentText);
            output.append(FormattedText.of(currentText.substring(this.currentPosition), this.currentStyle));
         }
      }

      private void outputCurrentPart(final ComponentCollector output, final int cutPosition) {
         String beforeSplit = Objects.requireNonNull(this.currentText).substring(this.currentPosition, cutPosition);
         if (!beforeSplit.isEmpty()) {
            output.append(FormattedText.of(beforeSplit, this.currentStyle));
         }
      }

      private void consumeFromCurrentPart(final int cutPosition, final Style splitStyle) {
         String currentText = Objects.requireNonNull(this.currentText);
         if (cutPosition == currentText.length()) {
            this.discardCurrentPart();
         } else {
            this.currentPosition = cutPosition;
            this.currentStyle = splitStyle;
            this.currentFullPart = null;
         }
      }

      private void discardCurrentPart() {
         this.currentText = null;
         this.currentFullPart = null;
      }

      public void getRemainder(final ComponentCollector result) {
         if (this.currentText != null) {
            result.append(FormattedText.of(this.currentText.substring(this.currentPosition), this.currentStyle));
            this.discardCurrentPart();
         }

         this.parts.forEach(result::append);
         this.parts.clear();
      }

      public boolean findNextLineBreak(final StringSplitter.LineBreakFinder finder, final Style initialStyle) {
         if (this.currentText != null) {
            boolean foundLineBreak = !StringDecomposer.iterateFormatted(this.currentText, this.currentPosition, this.currentStyle, initialStyle, finder);
            if (foundLineBreak) {
               return true;
            }

            finder.addToOffset(this.currentText.length());
         }

         for (StringSplitter.LineComponent part : this.parts) {
            boolean foundLineBreak = !StringDecomposer.iterateFormatted(part.contents, 0, part.style, initialStyle, finder);
            if (foundLineBreak) {
               return true;
            }

            finder.addToOffset(part.contents.length());
         }

         return false;
      }
   }

   private class LineBreakFinder implements FormattedCharSink {
      private final float maxWidth;
      private int lineBreak = -1;
      private Style lineBreakStyle = Style.EMPTY;
      private int lineBreakCodepoint = -1;
      private boolean hadNonZeroWidthChar;
      private float width;
      private int lastSpace = -1;
      private Style lastSpaceStyle = Style.EMPTY;
      private int offset;

      public LineBreakFinder(final float maxWidth) {
         this.maxWidth = Math.max(maxWidth, 1.0F);
      }

      public void resetForNewLine() {
         this.lineBreak = -1;
         this.lineBreakStyle = Style.EMPTY;
         this.lineBreakCodepoint = -1;
         this.hadNonZeroWidthChar = false;
         this.width = 0.0F;
         this.lastSpace = -1;
         this.lastSpaceStyle = Style.EMPTY;
         this.offset = 0;
      }

      @Override
      public boolean accept(final int position, final Style style, final int codepoint) {
         int adjustedPosition = position + this.offset;
         switch (codepoint) {
            case 10:
               return this.lineBreakFound(adjustedPosition, 10, style);
            case 32:
               this.lastSpace = adjustedPosition;
               this.lastSpaceStyle = style;
            default:
               float charWidth = StringSplitter.this.widthProvider.getWidth(codepoint, style);
               this.width += charWidth;
               if (!this.hadNonZeroWidthChar || !(this.width > this.maxWidth)) {
                  this.hadNonZeroWidthChar |= charWidth != 0.0F;
                  return true;
               } else {
                  return this.lastSpace != -1
                     ? this.lineBreakFound(this.lastSpace, 32, this.lastSpaceStyle)
                     : this.lineBreakFound(adjustedPosition, codepoint, style);
               }
         }
      }

      private boolean lineBreakFound(final int index, final int codepoint, final Style style) {
         this.lineBreak = index;
         this.lineBreakCodepoint = codepoint;
         this.lineBreakStyle = style;
         return false;
      }

      public int getSplitPosition() {
         if (this.lineBreak == -1) {
            throw new IllegalStateException("No line break found");
         } else {
            return this.lineBreak;
         }
      }

      public int getSplitCodepoint() {
         if (this.lineBreakCodepoint == -1) {
            throw new IllegalStateException("No line break found");
         } else {
            return this.lineBreakCodepoint;
         }
      }

      public Style getSplitStyle() {
         return this.lineBreakStyle;
      }

      public void addToOffset(final int delta) {
         this.offset += delta;
      }
   }

   private record LineComponent(String contents, Style style) implements FormattedText {
      @Override
      public <T> Optional<T> visitUnbounded(final FormattedText.ContentConsumer<T> output) {
         return output.accept(this.contents);
      }

      @Override
      public <T> Optional<T> visitUnbounded(final FormattedText.StyledContentConsumer<T> output, final Style parentStyle) {
         return output.accept(this.style.applyTo(parentStyle), this.contents);
      }
   }

   @FunctionalInterface
   public interface LinePosConsumer {
      void accept(Style style, int start, int end);
   }

   private class WidthLimitedCharSink implements FormattedCharSink {
      private float maxWidth;
      private int position;

      public WidthLimitedCharSink(final float maxWidth) {
         this.maxWidth = maxWidth;
      }

      @Override
      public boolean accept(final int position, final Style style, final int codepoint) {
         this.maxWidth = this.maxWidth - StringSplitter.this.widthProvider.getWidth(codepoint, style);
         if (this.maxWidth >= 0.0F) {
            this.position = position + Character.charCount(codepoint);
            return true;
         } else {
            return false;
         }
      }

      public int getPosition() {
         return this.position;
      }

      public void resetPosition() {
         this.position = 0;
      }
   }

   @FunctionalInterface
   public interface WidthProvider {
      float getWidth(int codepoint, Style style);
   }
}
