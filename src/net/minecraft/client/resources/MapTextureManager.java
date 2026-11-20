package net.minecraft.client.resources;

import com.mojang.blaze3d.platform.NativeImage;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.renderpearl.api.GpuFormat;
import com.mojang.renderpearl.api.device.GpuDevice;
import com.mojang.renderpearl.api.textures.FilterMode;
import com.mojang.renderpearl.api.textures.GpuSampler;
import com.mojang.renderpearl.api.textures.GpuTexture;
import com.mojang.renderpearl.api.textures.GpuTextureView;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import net.minecraft.client.renderer.texture.ExternalTextureProvider;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.renderer.texture.TextureResources;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.saveddata.maps.MapId;
import net.minecraft.world.level.saveddata.maps.MapItemSavedData;

public class MapTextureManager implements AutoCloseable {
   private final Int2ObjectMap<MapTextureManager.MapInstance> maps = new Int2ObjectOpenHashMap();
   private final TextureManager textureManager;

   public MapTextureManager(final TextureManager textureManager) {
      this.textureManager = textureManager;
   }

   public void update(final MapId id, final MapItemSavedData data) {
      this.getOrCreateMapInstance(id, data).forceUpload();
   }

   public Identifier prepareMapTexture(final MapId id, final MapItemSavedData data) {
      MapTextureManager.MapInstance mapInstance = this.getOrCreateMapInstance(id, data);
      mapInstance.updateTextureIfNeeded();
      return mapInstance.location;
   }

   public void resetData() {
      this.maps.values().forEach(MapTextureManager.MapInstance::close);
      this.maps.clear();
   }

   private MapTextureManager.MapInstance getOrCreateMapInstance(final MapId id, final MapItemSavedData data) {
      return (MapTextureManager.MapInstance)this.maps.compute(id.id(), (k, instance) -> {
         if (instance == null) {
            return new MapTextureManager.MapInstance(k, data);
         }

         instance.replaceMapData(data);
         return instance;
      });
   }

   @Override
   public void close() {
      this.resetData();
   }

   private class MapInstance {
      private MapItemSavedData data;
      private boolean requiresUpload = true;
      private final Identifier location;
      private final GpuTexture texture;

      private MapInstance(final int id, final MapItemSavedData data) {
         this.data = data;
         GpuDevice device = RenderSystem.getDevice();
         this.texture = device.createTexture(() -> "Map " + id, 5, GpuFormat.RGBA8_UNORM, 128, 128, 1, 1);
         GpuSampler sampler = RenderSystem.getSamplerCache().getRepeat(FilterMode.NEAREST);
         GpuTextureView textureView = device.createTextureView(this.texture);
         this.location = Identifier.withDefaultNamespace("map/" + id);
         MapTextureManager.this.textureManager
            .registerProvider(this.location, new ExternalTextureProvider(new TextureResources(this.texture, textureView, sampler)));
      }

      private void replaceMapData(final MapItemSavedData data) {
         boolean dataChanged = this.data != data;
         this.data = data;
         this.requiresUpload |= dataChanged;
      }

      public void forceUpload() {
         this.requiresUpload = true;
      }

      public void close() {
         MapTextureManager.this.textureManager.release(this.location);
         this.texture.close();
      }

      private void updateTextureIfNeeded() {
         if (this.requiresUpload) {
            try (NativeImage pixels = new NativeImage(128, 128, false)) {
               for (int y = 0; y < 128; y++) {
                  for (int x = 0; x < 128; x++) {
                     int i = x + y * 128;
                     pixels.setPixel(x, y, MapColor.getColorFromPackedId(this.data.colors[i]));
                  }
               }

               pixels.writeToGpuTexture(RenderSystem.getDevice().createCommandEncoder(), this.texture);
            }

            this.requiresUpload = false;
         }
      }
   }
}
