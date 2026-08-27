import com.mojang.blaze3d.platform.TextureUtil;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gef extends gdx {
   static final Logger f = LogUtils.getLogger();
   protected final ahg e;

   public gef(ahg $$0) {
      this.e = $$0;
   }

   @Override
   public void a(aqh $$0) throws IOException {
      gef.a $$1 = this.b($$0);
      $$1.c();
      ggi $$2 = $$1.a();
      boolean $$3;
      boolean $$4;
      if ($$2 != null) {
         $$3 = $$2.a();
         $$4 = $$2.b();
      } else {
         $$3 = false;
         $$4 = false;
      }

      epb $$7 = $$1.b();
      if (!RenderSystem.isOnRenderThreadOrInit()) {
         RenderSystem.recordRenderCall(() -> this.a($$7, $$3, $$4));
      } else {
         this.a($$7, $$3, $$4);
      }
   }

   private void a(epb $$0, boolean $$1, boolean $$2) {
      TextureUtil.prepareImage(this.a(), 0, $$0.a(), $$0.b());
      $$0.a(0, 0, 0, 0, 0, $$0.a(), $$0.b(), $$1, $$2, false, true);
   }

   protected gef.a b(aqh $$0) {
      return gef.a.a($$0, this.e);
   }

   protected static class a implements Closeable {
      @Nullable
      private final ggi a;
      @Nullable
      private final epb b;
      @Nullable
      private final IOException c;

      public a(IOException $$0) {
         this.c = $$0;
         this.a = null;
         this.b = null;
      }

      public a(@Nullable ggi $$0, epb $$1) {
         this.c = null;
         this.a = $$0;
         this.b = $$1;
      }

      public static gef.a a(aqh $$0, ahg $$1) {
         try {
            aqf $$2 = $$0.getResourceOrThrow($$1);

            epb $$4;
            try (InputStream $$3 = $$2.d()) {
               $$4 = epb.a($$3);
            }

            ggi $$6 = null;

            try {
               $$6 = $$2.f().a(ggi.a).orElse(null);
            } catch (RuntimeException var8) {
               gef.f.warn("Failed reading metadata of: {}", $$1, var8);
            }

            return new gef.a($$6, $$4);
         } catch (IOException var10) {
            return new gef.a(var10);
         }
      }

      @Nullable
      public ggi a() {
         return this.a;
      }

      public epb b() throws IOException {
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
