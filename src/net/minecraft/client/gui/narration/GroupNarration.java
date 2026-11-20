package net.minecraft.client.gui.narration;

import java.util.List;
import net.minecraft.client.gui.navigation.ScreenAxis;
import net.minecraft.network.chat.Component;
import net.minecraft.util.Mth;
import org.jspecify.annotations.Nullable;

public interface GroupNarration {
   String LIST_POSITION_KEY = "narrator.position.list";
   GroupNarration LIST = list("narrator.position.list");

   static GroupNarration list(final String positionKey) {
      return new GroupNarration.AsList(positionKey, null, null);
   }

   static GroupNarration list(final String positionKey, final String usageKey, final @Nullable ScreenAxis axis) {
      return new GroupNarration.AsList(positionKey, usageKey, axis);
   }

   static GroupNarration grid(final int columns, final String usageKey) {
      return new GroupNarration.AsGrid(columns, usageKey);
   }

   @Nullable Component position(int index, int count);

   @Nullable Component usage(int count);

   default <T> void narratePosition(final NarrationElementOutput output, final List<T> children, final T child) {
      Component position = this.createPositionNarration(children, child);
      if (position != null) {
         output.add(NarratedElementType.POSITION, position);
      }
   }

   default <T> @Nullable Component createPositionNarration(final List<T> children, final T child) {
      int index = children.indexOf(child);
      return index != -1 ? this.position(index, children.size()) : null;
   }

   default void narrateUsage(final NarrationElementOutput output, final List<?> children) {
      Component usage = this.usage(children.size());
      if (usage != null) {
         output.add(NarratedElementType.USAGE, usage);
      }
   }

   private static Component createUsageNarration(final String usageKey, final @Nullable ScreenAxis axis) {
      String directionKey = switch (axis) {
         case null -> "narration.group_navigation.usage.direction.any";
         case HORIZONTAL -> "narration.group_navigation.usage.direction.horizontal";
         case VERTICAL -> "narration.group_navigation.usage.direction.vertical";
      };
      return Component.translatable(usageKey, Component.translatable(directionKey));
   }

   record AsGrid(int columns, String usageKey) implements GroupNarration {
      @Override
      public @Nullable Component position(final int index, final int count) {
         return count > 1
            ? Component.translatable(
               "narrator.position.grid",
               index % this.columns + 1,
               Math.min(this.columns, count),
               index / this.columns + 1,
               Mth.positiveCeilDiv(count, this.columns)
            )
            : null;
      }

      @Override
      public @Nullable Component usage(final int count) {
         return count > 1 ? GroupNarration.createUsageNarration(this.usageKey, null) : null;
      }
   }

   record AsList(String positionKey, @Nullable String usageKey, @Nullable ScreenAxis axis) implements GroupNarration {
      @Override
      public @Nullable Component position(final int index, final int count) {
         return count > 1 ? Component.translatable(this.positionKey, index + 1, count) : null;
      }

      @Override
      public @Nullable Component usage(final int count) {
         return count > 1 && this.usageKey != null ? GroupNarration.createUsageNarration(this.usageKey, this.axis) : null;
      }
   }
}
