package net.minecraft.util.parsing.packrat;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.util.Util;
import org.jspecify.annotations.Nullable;

public interface ErrorCollector {
   ErrorCollector NOP = new ErrorCollector() {
      @Override
      public void store(final int cursor, final Suggestion suggestion, final Object reason) {
      }

      @Override
      public void finish(final int finalCursor) {
      }
   };

   void store(int cursor, Suggestion suggestion, Object reason);

   default void store(final int cursor, final Object reason) {
      this.store(cursor, Suggestion.EMPTY, reason);
   }

   void finish(int finalCursor);

   class LongestOnly implements ErrorCollector {
      private ErrorCollector.LongestOnly.@Nullable MutableErrorEntry[] entries = new ErrorCollector.LongestOnly.MutableErrorEntry[16];
      private int nextErrorEntry;
      private int lastCursor = -1;

      private void discardErrorsFromShorterParse(final int cursor) {
         if (cursor > this.lastCursor) {
            this.lastCursor = cursor;
            this.nextErrorEntry = 0;
         }
      }

      @Override
      public void finish(final int finalCursor) {
         this.discardErrorsFromShorterParse(finalCursor);
      }

      @Override
      public void store(final int cursor, final Suggestion suggestions, final Object reason) {
         this.discardErrorsFromShorterParse(cursor);
         if (cursor == this.lastCursor) {
            this.addErrorEntry(suggestions, reason);
         }
      }

      private void addErrorEntry(final Suggestion suggestions, final Object reason) {
         int currentSize = this.entries.length;
         if (this.nextErrorEntry >= currentSize) {
            int newSize = Util.growByHalf(currentSize, this.nextErrorEntry + 1);
            ErrorCollector.LongestOnly.MutableErrorEntry[] newEntries = new ErrorCollector.LongestOnly.MutableErrorEntry[newSize];
            System.arraycopy(this.entries, 0, newEntries, 0, currentSize);
            this.entries = newEntries;
         }

         int entryIndex = this.nextErrorEntry++;
         ErrorCollector.LongestOnly.MutableErrorEntry entry = this.entries[entryIndex];
         if (entry == null) {
            entry = new ErrorCollector.LongestOnly.MutableErrorEntry();
            this.entries[entryIndex] = entry;
         }

         entry.suggestions = suggestions;
         entry.reason = reason;
      }

      public List<ErrorEntry> entries() {
         int errorCount = this.nextErrorEntry;
         if (errorCount == 0) {
            return List.of();
         }

         List<ErrorEntry> result = new ArrayList<>(errorCount);

         for (int i = 0; i < errorCount; i++) {
            ErrorCollector.LongestOnly.MutableErrorEntry entry = this.entries[i];
            result.add(new ErrorEntry(this.lastCursor, entry.suggestions, entry.reason));
         }

         return result;
      }

      public int cursor() {
         return this.lastCursor;
      }

      private static class MutableErrorEntry {
         private Suggestion suggestions = Suggestion.EMPTY;
         private Object reason = "empty";
      }
   }
}
