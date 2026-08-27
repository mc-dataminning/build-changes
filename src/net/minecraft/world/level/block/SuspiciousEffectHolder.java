package net.minecraft.world.level.block;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.component.SuspiciousStewEffects;
import net.minecraft.world.level.ItemLike;
import org.jspecify.annotations.Nullable;

public interface SuspiciousEffectHolder {
   SuspiciousStewEffects getSuspiciousEffects();

   static List<SuspiciousEffectHolder> getAllEffectHolders() {
      return BuiltInRegistries.ITEM.stream().map(SuspiciousEffectHolder::tryGet).filter(Objects::nonNull).collect(Collectors.toList());
   }

   @Nullable
   static SuspiciousEffectHolder tryGet(final ItemLike item) {
      if (item.asItem() instanceof BlockItem blockItem) {
         Block var6 = blockItem.getBlock();
         if (var6 instanceof SuspiciousEffectHolder) {
            return (SuspiciousEffectHolder)var6;
         }
      }

      Item effectHolder = item.asItem();
      return effectHolder instanceof SuspiciousEffectHolder ? (SuspiciousEffectHolder)effectHolder : null;
   }
}
