import com.mojang.blaze3d.platform.TextureUtil;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gym extends gye {
   static final Logger e = LogUtils.getLogger();
   protected final all d;

   public gym(all $$0) {
      this.d = $$0;
   }

   @Override
   public void a(ave $$0) throws IOException {
      gym.a $$1 = this.b($$0);
      $$1.c();
      har $$2 = $$1.a();
      boolean $$3;
      if ($$2 != null) {
         this.c = $$2.a();
         $$3 = $$2.b();
      } else {
         this.c = false;
         $$3 = false;
      }

      fdk $$5 = $$1.b();
      if (!RenderSystem.isOnRenderThreadOrInit()) {
         RenderSystem.recordRenderCall(() -> this.a($$5, this.c, $$3));
      } else {
         this.a($$5, this.c, $$3);
      }
   }

   private void a(fdk $$0, boolean $$1, boolean $$2) {
      TextureUtil.prepareImage(this.a(), 0, $$0.a(), $$0.b());
      $$0.a(0, 0, 0, 0, 0, $$0.a(), $$0.b(), $$1, $$2, false, true);
   }

   protected gym.a b(ave $$0) {
      return gym.a.a($$0, this.d);
   }

   protected static class a implements Closeable {
      @Nullable
      private final har a;
      @Nullable
      private final fdk b;
      @Nullable
      private final IOException c;

      public a(IOException $$0) {
         this.c = $$0;
         this.a = null;
         this.b = null;
      }

      public a(@Nullable har $$0, fdk $$1) {
         this.c = null;
         this.a = $$0;
         this.b = $$1;
      }

      public static gym.a a(ave $$0, all $$1) {
         try {
            avc $$2 = $$0.getResourceOrThrow($$1);

            fdk $$4;
            try (InputStream $$3 = $$2.d()) {
               $$4 = fdk.a($$3);
            }

            har $$6 = null;

            try {
               $$6 = $$2.f().a(har.a).orElse(null);
            } catch (RuntimeException var8) {
               gym.e.warn("Failed reading metadata of: {}", $$1, var8);
            }

            return new gym.a($$6, $$4);
         } catch (IOException var10) {
            return new gym.a(var10);
         }
      }

      @Nullable
      public har a() {
         return this.a;
      }

      public fdk b() throws IOException {
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
