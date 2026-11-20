package net.minecraft.client.renderer.texture;

import com.mojang.blaze3d.platform.NativeImage;
import com.mojang.logging.LogUtils;
import com.mojang.renderpearl.util.UncheckedAutoCloseable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import net.minecraft.CrashReport;
import net.minecraft.CrashReportCategory;
import net.minecraft.ReportedException;
import net.minecraft.resources.Identifier;
import net.minecraft.server.packs.resources.PreparableReloadListener;
import net.minecraft.server.packs.resources.ResourceManager;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class TextureManager implements PreparableReloadListener, UncheckedAutoCloseable {
   private static final Logger LOGGER = LogUtils.getLogger();
   private final Map<Identifier, TextureManager.Entry<?, ?>> byPath = new HashMap<>();
   private final ResourceManager resourceManager;
   private final TextureResources missingTexture;

   public TextureManager(final ResourceManager resourceManager) {
      this.resourceManager = resourceManager;

      try (NativeImage checkerboard = MissingTextureAtlasSprite.generateMissingImage()) {
         this.missingTexture = TextureResources.from2dImage(() -> "(intentionally-)Missing Texture", checkerboard);
         this.registerProvider(MissingTextureAtlasSprite.getLocation(), new ExternalTextureProvider(this.missingTexture));
      }
   }

   public <ResourcesType extends TextureProvider.IntermediaryResources, HandleType extends TextureHandle> void registerProvider(
      final Identifier location, final TextureProvider<ResourcesType, HandleType> provider
   ) {
      TextureManager.Entry<?, ?> old = this.byPath.put(location, new TextureManager.Entry<>(location, provider, null));
      if (old != null) {
         this.safeClose(location, old);
      }
   }

   private void safeClose(final Identifier id, final TextureManager.Entry<?, ?> entry) {
      try {
         entry.close();
      } catch (Exception e) {
         LOGGER.warn("Failed to close texture {}", id, e);
      }
   }

   public TextureHandle getTexture(final Identifier location) {
      TextureManager.Entry<?, ?> entry = this.byPath.computeIfAbsent(location, loc -> new TextureManager.Entry<>(loc, TextureProvider2d.INSTANCE, null));
      if (entry.current == null) {
         entry.loadCurrentTexture(this.resourceManager);
      }

      return entry.current;
   }

   public void release(final Identifier location) {
      TextureManager.Entry<?, ?> entry = this.byPath.remove(location);
      if (entry != null) {
         this.safeClose(location, entry);
      }
   }

   @Override
   public void close() {
      this.byPath.forEach((var0, entry) -> entry.close());
      this.byPath.clear();
      this.missingTexture.close();
   }

   @Override
   public CompletableFuture<Void> reload(
      final PreparableReloadListener.SharedState currentReload,
      final Executor taskExecutor,
      final PreparableReloadListener.PreparationBarrier preparationBarrier,
      final Executor reloadExecutor
   ) {
      ResourceManager manager = currentReload.resourceManager();
      Map<TextureManager.Entry<?, ?>, CompletableFuture<?>> reloads = new HashMap<>();
      this.byPath.forEach((var3, entry) -> reloads.put((TextureManager.Entry<?, ?>)entry, entry.scheduleLoad(manager, taskExecutor)));
      return CompletableFuture.allOf(reloads.values().toArray(CompletableFuture[]::new))
         .thenCompose(preparationBarrier::wait)
         .thenAcceptAsync(var1 -> reloads.forEach((entry, reload) -> {
            if (entry.pendingReload == reload) {
               entry.finishReload();
            }
         }), reloadExecutor)
         .whenCompleteAsync((var1, var2) -> reloads.forEach(TextureManager.Entry::discardPendingReload), reloadExecutor);
   }

   public void dumpTextures(final Path targetDir) {
      try {
         Files.createDirectories(targetDir);
      } catch (IOException e) {
         LOGGER.error("Failed to create directory {}", targetDir, e);
         return;
      }

      this.byPath.forEach((location, entry) -> {
         try {
            entry.dumpContents(targetDir);
         } catch (Exception e) {
            LOGGER.error("Failed to dump texture {}", location, e);
         }
      });
   }

   private static class Entry<ResourcesType extends TextureProvider.IntermediaryResources, HandleType extends TextureHandle> implements UncheckedAutoCloseable {
      private final Identifier identifier;
      private final TextureProvider<ResourcesType, HandleType> provider;
      private @Nullable HandleType current;
      private @Nullable CompletableFuture<ResourcesType> pendingReload;

      public Entry(final Identifier identifier, final TextureProvider<ResourcesType, HandleType> provider, final @Nullable HandleType current) {
         this.identifier = identifier;
         this.provider = provider;
         this.current = current;
      }

      protected void loadCurrentTexture(final ResourceManager resourceManager) {
         try (ResourcesType content = this.loadContentsSafe(resourceManager)) {
            this.current = this.provider.createTexture(content, this.identifier);
         } catch (Throwable t) {
            CrashReport report = CrashReport.forThrowable(t, "Uploading texture");
            CrashReportCategory category = report.addCategory("Uploaded texture");
            category.setDetail("Texture id", this.identifier);
            throw new ReportedException(report);
         }
      }

      private ResourcesType loadContentsSafe(final ResourceManager resourceManager) {
         try {
            return this.loadContents(resourceManager);
         } catch (Exception e) {
            TextureManager.LOGGER.error("Failed to load texture {}", this.identifier, e);
            return this.provider.missingState();
         }
      }

      private ResourcesType loadContents(final ResourceManager resourceManager) throws IOException {
         try {
            return this.provider.prepareState(resourceManager, this.identifier);
         } catch (FileNotFoundException e) {
            return this.provider.missingState();
         }
      }

      private CompletableFuture<ResourcesType> scheduleLoad(final ResourceManager resourceManager, final Executor executor) {
         this.discardPendingReload(this.pendingReload);
         this.pendingReload = CompletableFuture.supplyAsync(() -> {
            try {
               return this.loadContents(resourceManager);
            } catch (IOException e) {
               throw new UncheckedIOException(e);
            }
         }, executor);
         return this.pendingReload;
      }

      private void discardPendingReload(final @Nullable CompletableFuture<?> expectedReload) {
         if (this.pendingReload != null && this.pendingReload == expectedReload) {
            this.pendingReload.thenAccept(UncheckedAutoCloseable::close);
            this.pendingReload = null;
         }
      }

      private void finishReload() {
         if (this.pendingReload != null) {
            try (ResourcesType state = this.pendingReload.join()) {
               if (this.current != null) {
                  this.provider.releaseTexture(this.current);
               }

               this.current = this.provider.createTexture(state, this.identifier);
            } finally {
               this.pendingReload = null;
            }
         }
      }

      @Override
      public void close() {
         this.discardPendingReload(this.pendingReload);
         if (this.current != null) {
            this.provider.releaseTexture(this.current);
         }
      }

      public void dumpContents(final Path outputDirectory) {
         if (this.current != null) {
            this.provider.dumpContents(this.identifier, outputDirectory, this.current);
         }
      }
   }
}
