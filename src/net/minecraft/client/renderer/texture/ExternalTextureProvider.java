package net.minecraft.client.renderer.texture;

import java.io.IOException;
import java.nio.file.Path;
import net.minecraft.resources.Identifier;
import net.minecraft.server.packs.resources.ResourceManager;

public class ExternalTextureProvider implements TextureProvider<ExternalTextureProvider.ExternalTexture, TextureHandle> {
   private final TextureHandle handle;
   private final ExternalTextureProvider.Dumper dumper;

   public ExternalTextureProvider(final TextureHandle handle, final ExternalTextureProvider.Dumper dumper) {
      this.handle = handle;
      this.dumper = dumper;
   }

   public ExternalTextureProvider(final TextureResources resources) {
      this(resources, resources::dumpContents);
   }

   public ExternalTextureProvider.ExternalTexture prepareState(final ResourceManager resourceManager, final Identifier identifier) throws IOException {
      return new ExternalTextureProvider.ExternalTexture(this.handle);
   }

   public ExternalTextureProvider.ExternalTexture missingState() {
      return new ExternalTextureProvider.ExternalTexture(this.handle);
   }

   public TextureHandle createTexture(final ExternalTextureProvider.ExternalTexture state, final Identifier identifier) {
      return state.handle;
   }

   @Override
   public void dumpContents(final Identifier identifier, final Path outputDirectory, final TextureHandle texture) {
      this.dumper.dumpContents(identifier, outputDirectory);
   }

   @Override
   public void releaseTexture(final TextureHandle texture) {
   }

   @FunctionalInterface
   public interface Dumper {
      void dumpContents(Identifier identifier, Path outputDirectory);
   }

   public record ExternalTexture(TextureHandle handle) implements TextureProvider.IntermediaryResources {
      @Override
      public void close() {
      }
   }
}
