package net.minecraft.client.core.registries;

import net.minecraft.client.gui.components.debug.DebugScreenEntries;
import net.minecraft.client.gui.components.debug.DebugScreenEntry;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.particle.ParticleProvider;
import net.minecraft.client.particle.ParticleResources;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltinRegistryBuilder;

public class BuiltInClientRegistries {
   private static final BuiltinRegistryBuilder BUILDER = new BuiltinRegistryBuilder(ClientRegistries.ROOT_REGISTRY_NAME);
   public static final Registry<BlockEntityRendererProvider<?, ?>> BLOCK_ENTITY_RENDERER = BUILDER.registerSimple(
      ClientRegistries.BLOCK_ENTITY_RENDERER, BlockEntityRenderers::bootstrap
   );
   public static final Registry<DebugScreenEntry> DEBUG_SCREEN_ENTRY = BUILDER.registerSimple(
      ClientRegistries.DEBUG_SCREEN_ENTRY, DebugScreenEntries::bootstrap
   );
   public static final Registry<EntityRendererProvider<?>> ENTITY_RENDERER = BUILDER.registerSimple(
      ClientRegistries.ENTITY_RENDERER, EntityRenderers::bootstrap
   );
   public static final Registry<MenuScreens.ScreenConstructor<?, ?>> MENU_SCREEN = BUILDER.registerSimple(ClientRegistries.MENU_SCREEN, MenuScreens::bootstrap);
   public static final Registry<ParticleProvider<?>> PARTICLE_PROVIDER = BUILDER.registerSimple(
      ClientRegistries.PARTICLE_PROVIDER, ParticleResources::bootstrap
   );
   public static final Registry<? extends Registry<?>> REGISTRY = BUILDER.build();

   public static void bootStrap() {
      BUILDER.bootStrap();
   }
}
