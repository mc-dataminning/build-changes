import com.mojang.blaze3d.platform.TextureUtil;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fyz extends fyr {
   static final Logger f = LogUtils.getLogger();
   protected final aey e;

   public fyz(aey $$0) {
      this.e = $$0;
   }

   @Override
   public void a(anv $$0) throws IOException {
      fyz.a $$1 = this.b($$0);
      $$1.c();
      gbd $$2 = $$1.a();
      boolean $$3;
      boolean $$4;
      if ($$2 != null) {
         $$3 = $$2.a();
         $$4 = $$2.b();
      } else {
         $$3 = false;
         $$4 = false;
      }

      eks $$7 = $$1.b();
      if (!RenderSystem.isOnRenderThreadOrInit()) {
         RenderSystem.recordRenderCall(() -> this.a($$7, $$3, $$4));
      } else {
         this.a($$7, $$3, $$4);
      }
   }

   private void a(eks $$0, boolean $$1, boolean $$2) {
      TextureUtil.prepareImage(this.a(), 0, $$0.a(), $$0.b());
      $$0.a(0, 0, 0, 0, 0, $$0.a(), $$0.b(), $$1, $$2, false, true);
   }

   protected fyz.a b(anv $$0) {
      return fyz.a.a($$0, this.e);
   }

   protected static class a implements Closeable {
      @Nullable
      private final gbd a;
      @Nullable
      private final eks b;
      @Nullable
      private final IOException c;

      public a(IOException $$0) {
         this.c = $$0;
         this.a = null;
         this.b = null;
      }

      public a(@Nullable gbd $$0, eks $$1) {
         this.c = null;
         this.a = $$0;
         this.b = $$1;
      }

      public static fyz.a a(anv $$0, aey $$1) {
         try {
            ant $$2 = $$0.getResourceOrThrow($$1);

            eks $$4;
            try (InputStream $$3 = $$2.d()) {
               $$4 = eks.a($$3);
            }

            gbd $$6 = null;

            try {
               $$6 = $$2.f().a(gbd.a).orElse(null);
            } catch (RuntimeException var8) {
               fyz.f.warn("Failed reading metadata of: {}", $$1, var8);
            }

            return new fyz.a($$6, $$4);
         } catch (IOException var10) {
            return new fyz.a(var10);
         }
      }

      @Nullable
      public gbd a() {
         return this.a;
      }

      public eks b() throws IOException {
         if (this.c != null) {
            throw this.c;
         } else {
            return this.b;
         }
      }

      @Override
      public void close() {
         if (this.b != null) {
            this.b.close();
         }
      }

      public void c() throws IOException {
         if (this.c != null) {
            throw this.c;
         }
      }
   }
}
