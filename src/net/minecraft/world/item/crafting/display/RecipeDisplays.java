package net.minecraft.world.item.crafting.display;

import net.minecraft.core.Registry;
import net.minecraft.core.WritableRegistry;

public class RecipeDisplays {
   public static void bootstrap(final WritableRegistry<RecipeDisplay.Type<?>> registry) {
      Registry.register(registry, "crafting_shapeless", ShapelessCraftingRecipeDisplay.TYPE);
      Registry.register(registry, "crafting_shaped", ShapedCraftingRecipeDisplay.TYPE);
      Registry.register(registry, "furnace", FurnaceRecipeDisplay.TYPE);
      Registry.register(registry, "stonecutter", StonecutterRecipeDisplay.TYPE);
      Registry.register(registry, "smithing", SmithingRecipeDisplay.TYPE);
   }
}
