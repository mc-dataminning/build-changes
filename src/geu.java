import com.mojang.blaze3d.platform.TextureUtil;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class geu extends gem {
   static final Logger f = LogUtils.getLogger();
   protected final ahh e;

   public geu(ahh $$0) {
      this.e = $$0;
   }

   @Override
   public void a(aqj $$0) throws IOException {
      geu.a $$1 = this.b($$0);
      $$1.c();
      ggx $$2 = $$1.a();
      boolean $$3;
      boolean $$4;
      if ($$2 != null) {
         $$3 = $$2.a();
         $$4 = $$2.b();
      } else {
         $$3 = false;
         $$4 = false;
      }

      epl $$7 = $$1.b();
      if (!RenderSystem.isOnRenderThreadOrInit()) {
         RenderSystem.recordRenderCall(() -> this.a($$7, $$3, $$4));
      } else {
         this.a($$7, $$3, $$4);
      }
   }

   private void a(epl $$0, boolean $$1, boolean $$2) {
      TextureUtil.prepareImage(this.a(), 0, $$0.a(), $$0.b());
      $$0.a(0, 0, 0, 0, 0, $$0.a(), $$0.b(), $$1, $$2, false, true);
   }

   protected geu.a b(aqj $$0) {
      return geu.a.a($$0, this.e);
   }

   protected static class a implements Closeable {
      @Nullable
      private final ggx a;
      @Nullable
      private final epl b;
      @Nullable
      private final IOException c;

      public a(IOException $$0) {
         this.c = $$0;
         this.a = null;
         this.b = null;
      }

      public a(@Nullable ggx $$0, epl $$1) {
         this.c = null;
         this.a = $$0;
         this.b = $$1;
      }

      public static geu.a a(aqj $$0, ahh $$1) {
         try {
            aqh $$2 = $$0.getResourceOrThrow($$1);

            epl $$4;
            try (InputStream $$3 = $$2.d()) {
               $$4 = epl.a($$3);
            }

            ggx $$6 = null;

            try {
               $$6 = $$2.f().a(ggx.a).orElse(null);
            } catch (RuntimeException var8) {
               geu.f.warn("Failed reading metadata of: {}", $$1, var8);
            }

            return new geu.a($$6, $$4);
         } catch (IOException var10) {
            return new geu.a(var10);
         }
      }

      @Nullable
      public ggx a() {
         return this.a;
      }

      public epl b() throws IOException {
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
