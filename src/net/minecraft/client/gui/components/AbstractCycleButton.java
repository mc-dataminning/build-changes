package net.minecraft.client.gui.components;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import java.util.function.Supplier;
import net.minecraft.client.Minecraft;
import net.minecraft.client.OptionInstance;
import net.minecraft.client.gui.narration.NarratedElementType;
import net.minecraft.client.gui.narration.NarrationElementOutput;
import net.minecraft.client.input.InputWithModifiers;
import net.minecraft.network.chat.CommonComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.util.Mth;

public abstract class AbstractCycleButton<Value> extends AbstractButton implements ResettableOptionWidget {
   public static final BooleanSupplier DEFAULT_ALT_LIST_SELECTOR = () -> Minecraft.getInstance().hasAltDown();
   protected final Supplier<Value> defaultValueSupplier;
   protected final Component name;
   protected int index;
   protected Value value;
   protected final AbstractCycleButton.ValueListSupplier<Value> values;
   protected final Function<Value, Component> valueStringifier;
   protected final AbstractCycleButton.OnValueChange<Value> onValueChange;
   protected final OptionInstance.TooltipSupplier<Value> tooltipSupplier;

   public AbstractCycleButton(
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
      final AbstractCycleButton.OnValueChange<Value> onValueChange,
      final OptionInstance.TooltipSupplier<Value> tooltipSupplier
   ) {
      super(x, y, width, height, Component.empty());
      this.name = name;
      this.index = index;
      this.defaultValueSupplier = defaultValueSupplier;
      this.value = value;
      this.values = values;
      this.valueStringifier = valueStringifier;
      this.onValueChange = onValueChange;
      this.tooltipSupplier = tooltipSupplier;
   }

   protected void updateTooltip() {
      this.setTooltip(this.tooltipSupplier.apply(this.value));
   }

   @Override
   public void onPress(final InputWithModifiers input) {
      if (input.hasShiftDown()) {
         this.cycleValue(-1);
      } else {
         this.cycleValue(1);
      }
   }

   private void cycleValue(final int delta) {
      List<Value> list = this.values.getSelectedList();
      this.index = Mth.positiveModulo(this.index + delta, list.size());
      Value newValue = list.get(this.index);
      this.updateValue(newValue);
      this.onValueChange.onValueChange(this, newValue);
   }

   protected Value getCycledValue(final int delta) {
      List<Value> list = this.values.getSelectedList();
      return list.get(Mth.positiveModulo(this.index + delta, list.size()));
   }

   @Override
   public boolean mouseScrolled(final double x, final double y, final double scrollX, final double scrollY) {
      if (scrollY > 0.0) {
         this.cycleValue(-1);
      } else if (scrollY < 0.0) {
         this.cycleValue(1);
      }

      return true;
   }

   public void setValue(final Value newValue) {
      List<Value> list = this.values.getSelectedList();
      int newIndex = list.indexOf(newValue);
      if (newIndex != -1) {
         this.index = newIndex;
      }

      this.updateValue(newValue);
   }

   @Override
   public void resetValue() {
      this.setValue(this.defaultValueSupplier.get());
   }

   protected void updateValue(final Value newValue) {
      Component newMessage = this.createLabelForValue(newValue);
      this.setMessage(newMessage);
      this.value = newValue;
      this.updateTooltip();
   }

   public Value getValue() {
      return this.value;
   }

   protected Component createLabelForValue(final Value newValue) {
      return this.createFullName(newValue);
   }

   protected MutableComponent createFullName(final Value newValue) {
      return CommonComponents.optionNameValue(this.name, this.valueStringifier.apply(newValue));
   }

   @Override
   public void updateWidgetNarration(final NarrationElementOutput output) {
      output.add(NarratedElementType.TITLE, this.createNarrationMessage());
      if (this.active) {
         Value nextValue = this.getCycledValue(1);
         Component nextValueText = this.createLabelForValue(nextValue);
         if (this.isFocused()) {
            output.add(NarratedElementType.USAGE, Component.translatable("narration.cycle_button.usage.focused", nextValueText));
         } else {
            output.add(NarratedElementType.USAGE, Component.translatable("narration.cycle_button.usage.hovered", nextValueText));
         }
      }
   }

   public abstract static class Builder<Value, B extends AbstractCycleButton.Builder<Value, B>> {
      protected final Function<Value, Component> valueStringifier;
      protected final Supplier<Value> defaultValueSupplier;
      protected OptionInstance.TooltipSupplier<Value> tooltipSupplier = var0 -> null;
      protected AbstractCycleButton.ValueListSupplier<Value> values = AbstractCycleButton.ValueListSupplier.create(ImmutableList.of());

      public Builder(final Function<Value, Component> valueStringifier, final Supplier<Value> defaultValueSupplier) {
         this.valueStringifier = valueStringifier;
         this.defaultValueSupplier = defaultValueSupplier;
      }

      public B withValues(final Collection<Value> values) {
         return this.withValues(AbstractCycleButton.ValueListSupplier.create(values));
      }

      @SafeVarargs
      public final B withValues(final Value... values) {
         return this.withValues(ImmutableList.copyOf(values));
      }

      public B withValues(final List<Value> values, final List<Value> altValues) {
         return this.withValues(AbstractCycleButton.ValueListSupplier.create(AbstractCycleButton.DEFAULT_ALT_LIST_SELECTOR, values, altValues));
      }

      public B withValues(final BooleanSupplier altCondition, final List<Value> values, final List<Value> altValues) {
         return this.withValues(AbstractCycleButton.ValueListSupplier.create(altCondition, values, altValues));
      }

      public B withValues(final AbstractCycleButton.ValueListSupplier<Value> valueListSupplier) {
         this.values = valueListSupplier;
         return (B)this;
      }

      public B withTooltip(final OptionInstance.TooltipSupplier<Value> tooltipSupplier) {
         this.tooltipSupplier = tooltipSupplier;
         return (B)this;
      }

      public B withTooltip() {
         return this.withTooltip(value -> Tooltip.create(this.valueStringifier.apply(value)));
      }
   }

   @FunctionalInterface
   public interface OnValueChange<Value> {
      void onValueChange(AbstractCycleButton<Value> button, Value value);
   }

   public interface ValueListSupplier<Value> {
      List<Value> getSelectedList();

      List<Value> getDefaultList();

      static <Value> AbstractCycleButton.ValueListSupplier<Value> create(final Collection<Value> values) {
         final List<Value> copy = ImmutableList.copyOf(values);
         return new AbstractCycleButton.ValueListSupplier<Value>() {
            @Override
            public List<Value> getSelectedList() {
               return copy;
            }

            @Override
            public List<Value> getDefaultList() {
               return copy;
            }
         };
      }

      static <Value> AbstractCycleButton.ValueListSupplier<Value> create(
         final BooleanSupplier altSelector, final List<Value> defaultList, final List<Value> altList
      ) {
         final List<Value> defaultCopy = ImmutableList.copyOf(defaultList);
         final List<Value> altCopy = ImmutableList.copyOf(altList);
         return new AbstractCycleButton.ValueListSupplier<Value>() {
            @Override
            public List<Value> getSelectedList() {
               return altSelector.getAsBoolean() ? altCopy : defaultCopy;
            }

            @Override
            public List<Value> getDefaultList() {
               return defaultCopy;
            }
         };
      }
   }
}
