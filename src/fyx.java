import com.mojang.blaze3d.platform.TextureUtil;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fyx extends fyp {
   static final Logger f = LogUtils.getLogger();
   protected final aex e;

   public fyx(aex $$0) {
      this.e = $$0;
   }

   @Override
   public void a(anu $$0) throws IOException {
      fyx.a $$1 = this.b($$0);
      $$1.c();
      gbb $$2 = $$1.a();
      boolean $$3;
      boolean $$4;
      if ($$2 != null) {
         $$3 = $$2.a();
         $$4 = $$2.b();
      } else {
         $$3 = false;
         $$4 = false;
      }

      ekq $$7 = $$1.b();
      if (!RenderSystem.isOnRenderThreadOrInit()) {
         RenderSystem.recordRenderCall(() -> this.a($$7, $$3, $$4));
      } else {
         this.a($$7, $$3, $$4);
      }
   }

   private void a(ekq $$0, boolean $$1, boolean $$2) {
      TextureUtil.prepareImage(this.a(), 0, $$0.a(), $$0.b());
      $$0.a(0, 0, 0, 0, 0, $$0.a(), $$0.b(), $$1, $$2, false, true);
   }

   protected fyx.a b(anu $$0) {
      return fyx.a.a($$0, this.e);
   }

   protected static class a implements Closeable {
      @Nullable
      private final gbb a;
      @Nullable
      private final ekq b;
      @Nullable
      private final IOException c;

      public a(IOException $$0) {
         this.c = $$0;
         this.a = null;
         this.b = null;
      }

      public a(@Nullable gbb $$0, ekq $$1) {
         this.c = null;
         this.a = $$0;
         this.b = $$1;
      }

      public static fyx.a a(anu $$0, aex $$1) {
         try {
            ans $$2 = $$0.getResourceOrThrow($$1);

            ekq $$4;
            try (InputStream $$3 = $$2.d()) {
               $$4 = ekq.a($$3);
            }

            gbb $$6 = null;

            try {
               $$6 = $$2.f().a(gbb.a).orElse(null);
            } catch (RuntimeException var8) {
               fyx.f.warn("Failed reading metadata of: {}", $$1, var8);
            }

            return new fyx.a($$6, $$4);
         } catch (IOException var10) {
            return new fyx.a(var10);
         }
      }

      @Nullable
      public gbb a() {
         return this.a;
      }

      public ekq b() throws IOException {
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
