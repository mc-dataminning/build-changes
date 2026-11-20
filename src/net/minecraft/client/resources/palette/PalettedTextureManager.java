package net.minecraft.client.resources.palette;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.mojang.blaze3d.platform.NativeImage;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import com.mojang.renderpearl.api.GpuFormat;
import com.mojang.renderpearl.api.device.GpuDevice;
import com.mojang.renderpearl.api.textures.FilterMode;
import com.mojang.renderpearl.api.textures.GpuSampler;
import com.mojang.renderpearl.api.textures.GpuTexture;
import com.mojang.renderpearl.api.textures.GpuTextureView;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.BiFunction;
import net.minecraft.client.renderer.texture.DynamicAtlasTree;
import net.minecraft.client.renderer.texture.DynamicAtlasTreeSlot;
import net.minecraft.client.renderer.texture.ExternalTextureProvider;
import net.minecraft.client.renderer.texture.MissingTextureAtlasSprite;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.renderer.texture.TextureResources;
import net.minecraft.client.renderer.texture.UvMapping;
import net.minecraft.client.resources.metadata.texture.PaletteMetadataSection;
import net.minecraft.resources.Identifier;
import net.minecraft.server.packs.resources.PreparableReloadListener;
import net.minecraft.server.packs.resources.Resource;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.util.ARGB;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class PalettedTextureManager implements PreparableReloadListener, AutoCloseable {
   private static final Logger LOGGER = LogUtils.getLogger();
   private final TextureManager textureManager;
   private BiFunction<Identifier, Identifier, PaletteMapping> paletteMappings = (var0, var1) -> PaletteMapping.NONE;
   private final LoadingCache<Identifier, Optional<PalettedTextureManager.BaseTexture>> baseTextureCache;
   private final List<PalettedTextureManager.AtlasTexture> atlasTextures = new ArrayList<>();
   private final List<PalettedTextureManager.OverflowTexture> overflowTextures = new ArrayList<>();
   private final Map<PalettedTextureManager.SlotKey, PalettedTextureManager.Handle> handles = new HashMap<>();
   private final PalettedTextureManager.Handle missingHandle;

   public PalettedTextureManager(final ResourceManager resourceManager, final TextureManager textureManager) {
      this.textureManager = textureManager;
      this.baseTextureCache = CacheBuilder.newBuilder()
         .expireAfterAccess(Duration.ofMinutes(5L))
         .maximumSize(64L)
         .removalListener(notification -> ((Optional)notification.getValue()).ifPresent(PalettedTextureManager.BaseTexture::close))
         .build(new CacheLoader<Identifier, Optional<PalettedTextureManager.BaseTexture>>() {
            public Optional<PalettedTextureManager.BaseTexture> load(final Identifier id) {
               return Optional.ofNullable(PalettedTextureManager.loadBaseTexture(id, resourceManager));
            }
         });
      this.missingHandle = new PalettedTextureManager.Handle() {
         @Override
         public Identifier textureLocation() {
            return MissingTextureAtlasSprite.getLocation();
         }

         @Override
         public float getU(final float offset) {
            return offset;
         }

         @Override
         public float getV(final float offset) {
            return offset;
         }
      };
   }

   private static PalettedTextureManager.@Nullable BaseTexture loadBaseTexture(final Identifier id, final ResourceManager resourceManager) {
      Identifier location = id.withPath(path -> "textures/" + path + ".png");

      try {
         Resource resource = resourceManager.getResourceOrThrow(location);

         NativeImage image;
         try (InputStream input = resource.open()) {
            image = NativeImage.read(input);
         }

         return new PalettedTextureManager.BaseTexture(image, resource.metadata().getSection(PaletteMetadataSection.TYPE).orElse(null));
      } catch (IOException e) {
         LOGGER.error("Failed to load paletted base texture at {}", location, e);
         return null;
      }
   }

   public PalettedTextureManager.Handle getOrPrepare(final Identifier baseTexture, final Identifier paletteId) {
      PalettedTextureManager.SlotKey key = new PalettedTextureManager.SlotKey(baseTexture, paletteId);
      PalettedTextureManager.Handle existingHandle = this.handles.get(key);
      if (existingHandle != null) {
         return existingHandle;
      }

      PalettedTextureManager.Handle handle = this.prepareSlot(baseTexture, paletteId);
      this.handles.put(key, handle);
      return handle;
   }

   private PalettedTextureManager.Handle prepareSlot(final Identifier baseTextureId, final Identifier paletteId) {
      Optional<PalettedTextureManager.BaseTexture> maybeBaseTexture = (Optional<PalettedTextureManager.BaseTexture>)this.baseTextureCache
         .getUnchecked(baseTextureId);
      if (maybeBaseTexture.isEmpty()) {
         return this.missingHandle;
      }

      PalettedTextureManager.BaseTexture baseTexture = maybeBaseTexture.get();
      PaletteMetadataSection paletteMetadata = baseTexture.paletteMetadata();
      PaletteMapping paletteMapping = paletteMetadata != null ? this.paletteMappings.apply(paletteMetadata.basePalette(), paletteId) : PaletteMapping.NONE;

      try (NativeImage newTexture = baseTexture.image().mappedCopy(paletteMapping)) {
         PalettedTextureManager.Slot slot = this.allocateSlot(newTexture.getWidth(), newTexture.getHeight());
         newTexture.writeToGpuTexture(RenderSystem.getDevice().createCommandEncoder(), slot.texture.texture(), 0, 0, slot.x, slot.y);
         return slot;
      }
   }

   private PalettedTextureManager.Slot allocateSlot(final int width, final int height) {
      if (width <= 512 && height <= 512) {
         for (PalettedTextureManager.AtlasTexture atlas : this.atlasTextures) {
            DynamicAtlasTreeSlot atlasSlot = atlas.tryAllocateSlot(width, height);
            if (atlasSlot != null) {
               return new PalettedTextureManager.Slot(atlas.texture, atlas.location, atlasSlot.x(), atlasSlot.y(), atlasSlot.width(), atlasSlot.height());
            }
         }

         PalettedTextureManager.AtlasTexture atlas = new PalettedTextureManager.AtlasTexture(
            Identifier.withDefaultNamespace("paletted/atlas_" + this.atlasTextures.size())
         );
         this.textureManager.registerProvider(atlas.location, new ExternalTextureProvider(atlas.texture));
         this.atlasTextures.add(atlas);
         DynamicAtlasTreeSlot atlasSlot = atlas.tryAllocateSlot(width, height);
         if (atlasSlot == null) {
            throw new IllegalStateException("Could not allocate slot in fresh atlas for sprite with size " + width + "x" + height);
         } else {
            return new PalettedTextureManager.Slot(atlas.texture, atlas.location, atlasSlot.x(), atlasSlot.y(), atlasSlot.width(), atlasSlot.height());
         }
      } else {
         PalettedTextureManager.OverflowTexture texture = new PalettedTextureManager.OverflowTexture(
            Identifier.withDefaultNamespace("paletted/overflow_" + this.overflowTextures.size()), width, height
         );
         this.textureManager.registerProvider(texture.location, new ExternalTextureProvider(texture.texture));
         this.overflowTextures.add(texture);
         return new PalettedTextureManager.Slot(texture.texture, texture.location, 0, 0, width, height);
      }
   }

   @Override
   public void close() {
      for (PalettedTextureManager.AtlasTexture atlas : this.atlasTextures) {
         this.textureManager.release(atlas.location);
         atlas.texture.close();
      }

      for (PalettedTextureManager.OverflowTexture texture : this.overflowTextures) {
         this.textureManager.release(texture.location);
         texture.texture.close();
      }

      this.atlasTextures.clear();
      this.overflowTextures.clear();
      this.handles.clear();
      this.paletteMappings = (var0, var1) -> PaletteMapping.NONE;
      this.baseTextureCache.invalidateAll();
   }

   @Override
   public CompletableFuture<Void> reload(
      final PreparableReloadListener.SharedState currentReload,
      final Executor taskExecutor,
      final PreparableReloadListener.PreparationBarrier preparationBarrier,
      final Executor reloadExecutor
   ) {
      return Palette.listAndLoad(currentReload.resourceManager(), taskExecutor).thenCompose(preparationBarrier::wait).thenAcceptAsync(palettes -> {
         this.close();
         PaletteMappingCache paletteMappings = new PaletteMappingCache((Map<Identifier, Palette>)palettes);
         this.paletteMappings = paletteMappings::get;
      }, reloadExecutor);
   }

   private static class AtlasTexture {
      private static final int SIZE = 512;
      private final Identifier location;
      private final DynamicAtlasTree tree = new DynamicAtlasTree(0, 0, 512, 512);
      private final TextureResources texture;

      private AtlasTexture(final Identifier location) {
         GpuDevice device = RenderSystem.getDevice();
         GpuTexture texture = device.createTexture(() -> "Paletted Atlas", 7, GpuFormat.RGBA8_UNORM, 512, 512, 1, 1);
         GpuTextureView textureView = device.createTextureView(texture);
         GpuSampler sampler = RenderSystem.getSamplerCache().getRepeat(FilterMode.NEAREST);
         this.texture = new TextureResources(texture, textureView, sampler, argb -> ARGB.alpha(argb) == 0 ? -16777216 : argb);
         this.location = location;
      }

      public @Nullable DynamicAtlasTreeSlot tryAllocateSlot(final int width, final int height) {
         return this.tree.insert(width, height, 0);
      }
   }

   private record BaseTexture(NativeImage image, @Nullable PaletteMetadataSection paletteMetadata) implements AutoCloseable {
      @Override
      public void close() {
         this.image.close();
      }
   }

   public interface Handle extends UvMapping {
      Identifier textureLocation();
   }

   private static class OverflowTexture {
      private final Identifier location;
      private final TextureResources texture;

      public OverflowTexture(final Identifier location, final int width, final int height) {
         GpuDevice device = RenderSystem.getDevice();
         GpuTexture texture = device.createTexture(location::toString, 5, GpuFormat.RGBA8_UNORM, width, height, 1, 1);
         GpuSampler sampler = RenderSystem.getSamplerCache().getRepeat(FilterMode.NEAREST);
         GpuTextureView textureView = device.createTextureView(texture);
         this.texture = new TextureResources(texture, textureView, sampler);
         this.location = location;
      }
   }

   private record Slot(TextureResources texture, Identifier textureLocation, int x, int y, int width, int height) implements PalettedTextureManager.Handle {
      @Override
      public float getU(final float offset) {
         return (this.x + offset * this.width) / this.texture.texture().getWidth(0);
      }

      @Override
      public float getV(final float offset) {
         return (this.y + offset * this.height) / this.texture.texture().getHeight(0);
      }
   }

   private record SlotKey(Identifier baseTexture, Identifier paletteId) {
   }
}
