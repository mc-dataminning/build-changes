package net.minecraft.client.gui.screens;

import com.google.common.hash.Hashing;
import com.mojang.blaze3d.platform.NativeImage;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.renderer.texture.TextureResources;
import net.minecraft.resources.Identifier;
import net.minecraft.util.Util;

public class FaviconTexture implements AutoCloseable {
   private static final Identifier MISSING_LOCATION = Identifier.withDefaultNamespace("textures/misc/unknown_server.png");
   private static final int WIDTH = 64;
   private static final int HEIGHT = 64;
   private final TextureManager textureManager;
   private final Identifier textureLocation;
   private boolean uploaded;
   private boolean closed;

   private FaviconTexture(final TextureManager textureManager, final Identifier textureLocation) {
      this.textureManager = textureManager;
      this.textureLocation = textureLocation;
   }

   public static FaviconTexture forWorld(final TextureManager textureManager, final String levelId) {
      return new FaviconTexture(
         textureManager,
         Identifier.withDefaultNamespace(
            "worlds/" + Util.sanitizeName(levelId, Identifier::validPathChar) + "/" + Hashing.sha1().hashUnencodedChars(levelId) + "/icon"
         )
      );
   }

   public static FaviconTexture forServer(final TextureManager textureManager, final String address) {
      return new FaviconTexture(textureManager, Identifier.withDefaultNamespace("servers/" + Hashing.sha1().hashUnencodedChars(address) + "/icon"));
   }

   public void upload(final NativeImage image) {
      try (image) {
         if (image.getWidth() != 64 || image.getHeight() != 64) {
            throw new IllegalArgumentException("Icon must be 64x64, but was " + image.getWidth() + "x" + image.getHeight());
         }

         this.checkOpen();
         this.textureManager.register(this.textureLocation, TextureResources.from2dImage(() -> "Favicon " + this.textureLocation, image));
         this.uploaded = true;
      } catch (Throwable t) {
         this.clear();
         throw t;
      }
   }

   public void clear() {
      this.checkOpen();
      this.textureManager.release(this.textureLocation);
   }

   public Identifier textureLocation() {
      return this.uploaded ? this.textureLocation : MISSING_LOCATION;
   }

   @Override
   public void close() {
      this.clear();
      this.closed = true;
   }

   public boolean isClosed() {
      return this.closed;
   }

   private void checkOpen() {
      if (this.closed) {
         throw new IllegalStateException("Icon already closed");
      }
   }
}
