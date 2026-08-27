import com.mojang.blaze3d.platform.TextureUtil;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ghs extends ghk {
   static final Logger f = LogUtils.getLogger();
   protected final ajc e;

   public ghs(ajc $$0) {
      this.e = $$0;
   }

   @Override
   public void a(asf $$0) throws IOException {
      ghs.a $$1 = this.b($$0);
      $$1.c();
      gjv $$2 = $$1.a();
      boolean $$3;
      boolean $$4;
      if ($$2 != null) {
         $$3 = $$2.a();
         $$4 = $$2.b();
      } else {
         $$3 = false;
         $$4 = false;
      }

      ese $$7 = $$1.b();
      if (!RenderSystem.isOnRenderThreadOrInit()) {
         RenderSystem.recordRenderCall(() -> this.a($$7, $$3, $$4));
      } else {
         this.a($$7, $$3, $$4);
      }
   }

   private void a(ese $$0, boolean $$1, boolean $$2) {
      TextureUtil.prepareImage(this.a(), 0, $$0.a(), $$0.b());
      $$0.a(0, 0, 0, 0, 0, $$0.a(), $$0.b(), $$1, $$2, false, true);
   }

   protected ghs.a b(asf $$0) {
      return ghs.a.a($$0, this.e);
   }

   protected static class a implements Closeable {
      @Nullable
      private final gjv a;
      @Nullable
      private final ese b;
      @Nullable
      private final IOException c;

      public a(IOException $$0) {
         this.c = $$0;
         this.a = null;
         this.b = null;
      }

      public a(@Nullable gjv $$0, ese $$1) {
         this.c = null;
         this.a = $$0;
         this.b = $$1;
      }

      public static ghs.a a(asf $$0, ajc $$1) {
         try {
            asd $$2 = $$0.getResourceOrThrow($$1);

            ese $$4;
            try (InputStream $$3 = $$2.d()) {
               $$4 = ese.a($$3);
            }

            gjv $$6 = null;

            try {
               $$6 = $$2.f().a(gjv.a).orElse(null);
            } catch (RuntimeException var8) {
               ghs.f.warn("Failed reading metadata of: {}", $$1, var8);
            }

            return new ghs.a($$6, $$4);
         } catch (IOException var10) {
            return new ghs.a(var10);
         }
      }

      @Nullable
      public gjv a() {
         return this.a;
      }

      public ese b() throws IOException {
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
