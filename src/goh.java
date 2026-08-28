import com.mojang.blaze3d.platform.TextureUtil;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class goh extends gof implements gog {
   private static final Logger e = LogUtils.getLogger();
   @Nullable
   private eyu f;

   public goh(eyu $$0) {
      this.f = $$0;
      if (!RenderSystem.isOnRenderThread()) {
         RenderSystem.recordRenderCall(() -> {
            TextureUtil.prepareImage(this.a(), this.f.a(), this.f.b());
            this.d();
         });
      } else {
         TextureUtil.prepareImage(this.a(), this.f.a(), this.f.b());
         this.d();
      }
   }

   public goh(int $$0, int $$1, boolean $$2) {
      RenderSystem.assertOnGameThreadOrInit();
      this.f = new eyu($$0, $$1, $$2);
      TextureUtil.prepareImage(this.a(), this.f.a(), this.f.b());
   }

   @Override
   public void a(aul $$0) {
   }

   @Override
   public void d() {
      if (this.f != null) {
         this.c();
         this.f.a(0, 0, 0, false);
      } else {
         e.warn("Trying to upload disposed texture {}", this.a());
      }
   }

   @Nullable
   public eyu e() {
      return this.f;
   }

   public void a(eyu $$0) {
      if (this.f != null) {
         this.f.close();
      }

      this.f = $$0;
   }

   @Override
   public void close() {
      if (this.f != null) {
         this.f.close();
         this.b();
         this.f = null;
      }
   }

   @Override
   public void a(alb $$0, Path $$1) throws IOException {
      if (this.f != null) {
         String $$2 = $$0.c() + ".png";
         Path $$3 = $$1.resolve($$2);
         this.f.a($$3);
      }
   }
}
