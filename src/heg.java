import com.mojang.blaze3d.platform.TextureUtil;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class heg extends hee implements hef {
   private static final Logger d = LogUtils.getLogger();
   @Nullable
   private fev e;

   public heg(fev $$0) {
      this.e = $$0;
      if (!RenderSystem.isOnRenderThread()) {
         RenderSystem.recordRenderCall(() -> {
            TextureUtil.prepareImage(this.a(), this.e.a(), this.e.b());
            this.d();
         });
      } else {
         TextureUtil.prepareImage(this.a(), this.e.a(), this.e.b());
         this.d();
      }
   }

   public heg(int $$0, int $$1, boolean $$2) {
      this.e = new fev($$0, $$1, $$2);
      TextureUtil.prepareImage(this.a(), this.e.a(), this.e.b());
   }

   @Override
   public void d() {
      if (this.e != null) {
         this.c();
         this.e.a(0, 0, 0, false);
      } else {
         d.warn("Trying to upload disposed texture {}", this.a());
      }
   }

   @Nullable
   public fev e() {
      return this.e;
   }

   public void a(fev $$0) {
      if (this.e != null) {
         this.e.close();
      }

      this.e = $$0;
   }

   @Override
   public void close() {
      if (this.e != null) {
         this.e.close();
         this.b();
         this.e = null;
      }
   }

   @Override
   public void a(akv $$0, Path $$1) throws IOException {
      if (this.e != null) {
         String $$2 = $$0.c() + ".png";
         Path $$3 = $$1.resolve($$2);
         this.e.a($$3);
      }
   }
}
