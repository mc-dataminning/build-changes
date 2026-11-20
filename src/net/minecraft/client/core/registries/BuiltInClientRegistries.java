package net.minecraft.client.core.registries;

import com.mojang.serialization.MapCodec;
import net.minecraft.client.color.item.ItemTintSource;
import net.minecraft.client.color.item.ItemTintSources;
import net.minecraft.client.gui.components.debug.DebugScreenEntries;
import net.minecraft.client.gui.components.debug.DebugScreenEntry;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.particle.ParticleProvider;
import net.minecraft.client.particle.ParticleResources;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.renderer.item.ItemModel;
import net.minecraft.client.renderer.item.ItemModels;
import net.minecraft.client.renderer.item.properties.conditional.ConditionalItemModelProperties;
import net.minecraft.client.renderer.item.properties.conditional.ConditionalItemModelProperty;
import net.minecraft.client.renderer.item.properties.numeric.RangeSelectItemModelProperties;
import net.minecraft.client.renderer.item.properties.numeric.RangeSelectItemModelProperty;
import net.minecraft.client.renderer.item.properties.select.SelectItemModelProperties;
import net.minecraft.client.renderer.item.properties.select.SelectItemModelProperty;
import net.minecraft.client.renderer.special.SpecialModelRenderer;
import net.minecraft.client.renderer.special.SpecialModelRenderers;
import net.minecraft.client.renderer.texture.atlas.SpriteSource;
import net.minecraft.client.renderer.texture.atlas.SpriteSources;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltinRegistryBuilder;

public class BuiltInClientRegistries {
   private static final BuiltinRegistryBuilder BUILDER = new BuiltinRegistryBuilder(ClientRegistries.ROOT_REGISTRY_NAME);
   public static final Registry<BlockEntityRendererProvider<?, ?>> BLOCK_ENTITY_RENDERER = BUILDER.registerSimple(
      ClientRegistries.BLOCK_ENTITY_RENDERER, BlockEntityRenderers::bootstrap
   );
   public static final Registry<MapCodec<? extends ConditionalItemModelProperty>> CONDITIONAL_ITEM_MODEL_PROPERTY_TYPE = BUILDER.registerSimple(
      ClientRegistries.CONDITIONAL_ITEM_MODEL_PROPERTY_TYPE, ConditionalItemModelProperties::bootstrap
   );
   public static final Registry<DebugScreenEntry> DEBUG_SCREEN_ENTRY = BUILDER.registerSimple(
      ClientRegistries.DEBUG_SCREEN_ENTRY, DebugScreenEntries::bootstrap
   );
   public static final Registry<EntityRendererProvider<?>> ENTITY_RENDERER = BUILDER.registerSimple(
      ClientRegistries.ENTITY_RENDERER, EntityRenderers::bootstrap
   );
   public static final Registry<MapCodec<? extends ItemModel.Unbaked>> ITEM_MODEL_TYPE = BUILDER.registerSimple(
      ClientRegistries.ITEM_MODEL_TYPE, ItemModels::bootstrap
   );
   public static final Registry<MapCodec<? extends ItemTintSource>> ITEM_TINT_SOURCE_TYPE = BUILDER.registerSimple(
      ClientRegistries.ITEM_TINT_SOURCE_TYPE, ItemTintSources::bootstrap
   );
   public static final Registry<MenuScreens.ScreenConstructor<?, ?>> MENU_SCREEN = BUILDER.registerSimple(ClientRegistries.MENU_SCREEN, MenuScreens::bootstrap);
   public static final Registry<ParticleProvider<?>> PARTICLE_PROVIDER = BUILDER.registerSimple(
      ClientRegistries.PARTICLE_PROVIDER, ParticleResources::bootstrap
   );
   public static final Registry<MapCodec<? extends RangeSelectItemModelProperty>> RANGE_SELECT_ITEM_MODEL_PROPERTY_TYPE = BUILDER.registerSimple(
      ClientRegistries.RANGE_SELECT_ITEM_MODEL_PROPERTY_TYPE, RangeSelectItemModelProperties::bootstrap
   );
   public static final Registry<SelectItemModelProperty.Type<?, ?>> SELECT_ITEM_MODEL_PROPERTY_TYPE = BUILDER.registerSimple(
      ClientRegistries.SELECT_ITEM_MODEL_PROPERTY_TYPE, SelectItemModelProperties::bootstrap
   );
   public static final Registry<MapCodec<? extends SpecialModelRenderer.Unbaked<?>>> SPECIAL_MODEL_RENDERER_TYPE = BUILDER.registerSimple(
      ClientRegistries.SPECIAL_MODEL_RENDERER_TYPE, SpecialModelRenderers::bootstrap
   );
   public static final Registry<MapCodec<? extends SpriteSource>> SPRITE_SOURCE_TYPE = BUILDER.registerSimple(
      ClientRegistries.SPRITE_SOURCE_TYPE, SpriteSources::bootstrap
   );
   public static final Registry<? extends Registry<?>> REGISTRY = BUILDER.build();

   public static void bootStrap() {
      BUILDER.bootStrap();
   }
}
