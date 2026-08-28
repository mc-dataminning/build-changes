import com.mojang.blaze3d.platform.TextureUtil;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gou extends gom {
   static final Logger f = LogUtils.getLogger();
   protected final alf e;

   public gou(alf $$0) {
      this.e = $$0;
   }

   @Override
   public void a(aup $$0) throws IOException {
      gou.a $$1 = this.b($$0);
      $$1.c();
      gqy $$2 = $$1.a();
      boolean $$3;
      boolean $$4;
      if ($$2 != null) {
         $$3 = $$2.a();
         $$4 = $$2.b();
      } else {
         $$3 = false;
         $$4 = false;
      }

      ezb $$7 = $$1.b();
      if (!RenderSystem.isOnRenderThreadOrInit()) {
         RenderSystem.recordRenderCall(() -> this.a($$7, $$3, $$4));
      } else {
         this.a($$7, $$3, $$4);
      }
   }

   private void a(ezb $$0, boolean $$1, boolean $$2) {
      TextureUtil.prepareImage(this.a(), 0, $$0.a(), $$0.b());
      $$0.a(0, 0, 0, 0, 0, $$0.a(), $$0.b(), $$1, $$2, false, true);
   }

   protected gou.a b(aup $$0) {
      return gou.a.a($$0, this.e);
   }

   protected static class a implements Closeable {
      @Nullable
      private final gqy a;
      @Nullable
      private final ezb b;
      @Nullable
      private final IOException c;

      public a(IOException $$0) {
         this.c = $$0;
         this.a = null;
         this.b = null;
      }

      public a(@Nullable gqy $$0, ezb $$1) {
         this.c = null;
         this.a = $$0;
         this.b = $$1;
      }

      public static gou.a a(aup $$0, alf $$1) {
         try {
            aun $$2 = $$0.getResourceOrThrow($$1);

            ezb $$4;
            try (InputStream $$3 = $$2.d()) {
               $$4 = ezb.a($$3);
            }

            gqy $$6 = null;

            try {
               $$6 = $$2.f().a(gqy.a).orElse(null);
            } catch (RuntimeException var8) {
               gou.f.warn("Failed reading metadata of: {}", $$1, var8);
            }

            return new gou.a($$6, $$4);
         } catch (IOException var10) {
            return new gou.a(var10);
         }
      }

      @Nullable
      public gqy a() {
         return this.a;
      }

      public ezb b() throws IOException {
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
