package net.minecraft.client.gui.components;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import net.minecraft.client.OptionInstance;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.network.chat.CommonComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.resources.Identifier;
import org.jspecify.annotations.Nullable;

public class CycleButton<Value> extends AbstractCycleButton<Value> {
   private static final List<Boolean> BOOLEAN_OPTIONS = ImmutableList.of(Boolean.TRUE, Boolean.FALSE);
   private final Function<CycleButton<Value>, MutableComponent> narrationProvider;
   private final CycleButton.DisplayState displayState;
   private final CycleButton.SpriteSupplier<Value> spriteSupplier;

   private CycleButton(
      final int x,
      final int y,
      final int width,
      final int height,
      final Component name,
      final int index,
      final Value value,
      final Supplier<Value> defaultValueSupplier,
      final AbstractCycleButton.ValueListSupplier<Value> values,
      final Function<Value, Component> valueStringifier,
      final Function<CycleButton<Value>, MutableComponent> narrationProvider,
      final AbstractCycleButton.OnValueChange<Value> onValueChange,
      final OptionInstance.TooltipSupplier<Value> tooltipSupplier,
      final CycleButton.DisplayState displayState,
      final CycleButton.SpriteSupplier<Value> spriteSupplier
   ) {
      super(x, y, width, height, name, index, value, defaultValueSupplier, values, valueStringifier, onValueChange, tooltipSupplier);
      this.narrationProvider = narrationProvider;
      this.displayState = displayState;
      this.spriteSupplier = spriteSupplier;
      this.updateValue(value);
   }

   @Override
   protected void extractContents(final GuiGraphicsExtractor graphics, final int mouseX, final int mouseY, final float a) {
      Identifier sprite = this.spriteSupplier.apply(this, this.getValue());
      if (sprite != null) {
         graphics.blitSprite(RenderPipelines.GUI_TEXTURED, sprite, this.getX(), this.getY(), this.getWidth(), this.getHeight());
      } else {
         this.extractDefaultSprite(graphics);
      }

      if (this.displayState != CycleButton.DisplayState.HIDE) {
         this.extractDefaultLabel(graphics.textRendererForWidget(this, GuiGraphicsExtractor.HoveredTextEffects.NONE));
      }
   }

   @Override
   protected Component createLabelForValue(final Value newValue) {
      return this.displayState == CycleButton.DisplayState.VALUE ? this.valueStringifier.apply(newValue) : this.createFullName(newValue);
   }

   @Override
   protected MutableComponent createNarrationMessage() {
      return this.narrationProvider.apply(this);
   }

   public MutableComponent createDefaultNarrationMessage() {
      return wrapDefaultNarrationMessage(this.displayState == CycleButton.DisplayState.VALUE ? this.createFullName(this.value) : this.getMessage());
   }

   public static <Value> CycleButton.Builder<Value> builder(final Function<Value, Component> valueStringifier, final Supplier<Value> defaultValueSupplier) {
      return new CycleButton.Builder<>(valueStringifier, defaultValueSupplier);
   }

   public static <Value> CycleButton.Builder<Value> builder(final Function<Value, Component> valueStringifier, final Value defaultValue) {
      return new CycleButton.Builder<>(valueStringifier, () -> defaultValue);
   }

   public static CycleButton.Builder<Boolean> booleanBuilder(final Component trueText, final Component falseText, final boolean defaultValue) {
      return new CycleButton.Builder<>(b -> b == Boolean.TRUE ? trueText : falseText, () -> defaultValue).withValues(BOOLEAN_OPTIONS);
   }

   public static CycleButton.Builder<Boolean> onOffBuilder(final boolean initialValue) {
      return new CycleButton.Builder<>(b -> b == Boolean.TRUE ? CommonComponents.OPTION_ON : CommonComponents.OPTION_OFF, () -> initialValue)
         .withValues(BOOLEAN_OPTIONS);
   }

   public static class Builder<Value> extends AbstractCycleButton.Builder<Value, CycleButton.Builder<Value>> {
      private CycleButton.SpriteSupplier<Value> spriteSupplier = (var0, var1) -> null;
      private Function<CycleButton<Value>, MutableComponent> narrationProvider = CycleButton::createDefaultNarrationMessage;
      private CycleButton.DisplayState displayState = CycleButton.DisplayState.NAME_AND_VALUE;

      public Builder(final Function<Value, Component> valueStringifier, final Supplier<Value> defaultValueSupplier) {
         super(valueStringifier, defaultValueSupplier);
      }

      public CycleButton.Builder<Value> withCustomNarration(final Function<CycleButton<Value>, MutableComponent> narrationProvider) {
         this.narrationProvider = narrationProvider;
         return this;
      }

      public CycleButton.Builder<Value> withSprite(final CycleButton.SpriteSupplier<Value> spriteSupplier) {
         this.spriteSupplier = spriteSupplier;
         return this;
      }

      public CycleButton.Builder<Value> displayState(final CycleButton.DisplayState state) {
         this.displayState = state;
         return this;
      }

      public CycleButton.Builder<Value> displayOnlyValue() {
         return this.displayState(CycleButton.DisplayState.VALUE);
      }

      public CycleButton<Value> create(final Component name, final AbstractCycleButton.OnValueChange<Value> valueChangeListener) {
         return this.create(0, 0, 150, 20, name, valueChangeListener);
      }

      public CycleButton<Value> create(final int x, final int y, final int width, final int height, final Component name) {
         return this.create(x, y, width, height, name, (var0, var1) -> {});
      }

      public CycleButton<Value> create(
         final int x, final int y, final int width, final int height, final Component name, final AbstractCycleButton.OnValueChange<Value> valueChangeListener
      ) {
         List<Value> values = this.values.getDefaultList();
         if (values.isEmpty()) {
            throw new IllegalStateException("No values for cycle button");
         }

         Value initialValue = this.defaultValueSupplier.get();
         int initialIndex = values.indexOf(initialValue);
         return new CycleButton<>(
            x,
            y,
            width,
            height,
            name,
            initialIndex,
            initialValue,
            this.defaultValueSupplier,
            this.values,
            this.valueStringifier,
            this.narrationProvider,
            valueChangeListener,
            this.tooltipSupplier,
            this.displayState,
            this.spriteSupplier
         );
      }
   }

   public enum DisplayState {
      NAME_AND_VALUE,
      VALUE,
      HIDE;
   }

   @FunctionalInterface
   public interface SpriteSupplier<Value> {
      @Nullable Identifier apply(CycleButton<Value> button, Value value);
   }
}
