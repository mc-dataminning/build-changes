import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.TextureFormat;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.file.Path;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class hkd extends hkb implements hkc {
   private static final Logger c = LogUtils.getLogger();
   @Nullable
   private fkf d;

   public hkd(Supplier<String> $$0, fkf $$1) {
      this.d = $$1;
      this.a = RenderSystem.getDevice().createTexture($$0, TextureFormat.RGBA8, this.d.a(), this.d.b(), 1);
      this.b();
   }

   public hkd(String $$0, int $$1, int $$2, boolean $$3) {
      this.d = new fkf($$1, $$2, $$3);
      this.a = RenderSystem.getDevice().createTexture($$0, TextureFormat.RGBA8, this.d.a(), this.d.b(), 1);
   }

   public hkd(Supplier<String> $$0, int $$1, int $$2, boolean $$3) {
      this.d = new fkf($$1, $$2, $$3);
      this.a = RenderSystem.getDevice().createTexture($$0, TextureFormat.RGBA8, this.d.a(), this.d.b(), 1);
   }

   public void b() {
      if (this.d != null && this.a != null) {
         RenderSystem.getDevice().createCommandEncoder().writeToTexture(this.a, this.d);
      } else {
         c.warn("Trying to upload disposed texture {}", this.a().getLabel());
      }
   }

   @Nullable
   public fkf c() {
      return this.d;
   }

   public void a(fkf $$0) {
      if (this.d != null) {
         this.d.close();
      }

      this.d = $$0;
   }

   @Override
   public void close() {
      if (this.d != null) {
         this.d.close();
         this.d = null;
      }

      super.close();
   }

   @Override
   public void a(alr $$0, Path $$1) throws IOException {
      if (this.d != null) {
         String $$2 = $$0.c() + ".png";
         Path $$3 = $$1.resolve($$2);
         this.d.a($$3);
      }
   }
}
