import com.mojang.blaze3d.platform.TextureUtil;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;

public class haz extends hbe {
   private static final Logger e = LogUtils.getLogger();
   private static final int f = 64;
   private static final int g = 64;
   private static final int h = 32;
   @Nullable
   private final File i;
   private final String j;
   private final boolean k;
   @Nullable
   private final Runnable l;
   @Nullable
   private CompletableFuture<?> m;
   private boolean n;

   public haz(@Nullable File $$0, String $$1, alz $$2, boolean $$3, @Nullable Runnable $$4) {
      super($$2);
      this.i = $$0;
      this.j = $$1;
      this.k = $$3;
      this.l = $$4;
   }

   private void a(ffs $$0) {
      if (this.l != null) {
         this.l.run();
      }

      fmg.Q().execute(() -> {
         this.n = true;
         if (!RenderSystem.isOnRenderThread()) {
            RenderSystem.recordRenderCall(() -> this.b($$0));
         } else {
            this.b($$0);
         }
      });
   }

   private void b(ffs $$0) {
      TextureUtil.prepareImage(this.a(), $$0.a(), $$0.b());
      $$0.a(0, 0, 0, true);
   }

   @Override
   public void a(avv $$0) throws IOException {
      fmg.Q().execute(() -> {
         if (!this.n) {
            try {
               super.a($$0);
            } catch (IOException var3x) {
               e.warn("Failed to load texture: {}", this.d, var3x);
            }

            this.n = true;
         }
      });
      if (this.m == null) {
         ffs $$2;
         if (this.i != null && this.i.isFile()) {
            e.debug("Loading http texture from local cache ({})", this.i);
            FileInputStream $$1 = new FileInputStream(this.i);
            $$2 = this.a($$1);
         } else {
            $$2 = null;
         }

         if ($$2 != null) {
            this.a($$2);
         } else {
            this.m = CompletableFuture.runAsync(() -> {
               HttpURLConnection $$0x = null;
               e.debug("Downloading http texture from {} to {}", this.j, this.i);

               try {
                  $$0x = (HttpURLConnection)new URL(this.j).openConnection(fmg.Q().Z());
                  $$0x.setDoInput(true);
                  $$0x.setDoOutput(false);
                  $$0x.connect();
                  if ($$0x.getResponseCode() / 100 == 2) {
                     InputStream $$1x;
                     if (this.i != null) {
                        FileUtils.copyInputStreamToFile($$0x.getInputStream(), this.i);
                        $$1x = new FileInputStream(this.i);
                     } else {
                        $$1x = $$0x.getInputStream();
                     }

                     fmg.Q().execute(() -> {
                        ffs $$1xx = this.a($$1x);
                        if ($$1xx != null) {
                           this.a($$1xx);
                        }
                     });
                     return;
                  }
               } catch (Exception var6) {
                  e.error("Couldn't download http texture", var6);
                  return;
               } finally {
                  if ($$0x != null) {
                     $$0x.disconnect();
                  }
               }
            }, ae.g().a("downloadTexture"));
         }
      }
   }

   @Nullable
   private ffs a(InputStream $$0) {
      ffs $$1 = null;

      try {
         $$1 = ffs.a($$0);
         if (this.k) {
            $$1 = this.c($$1);
         }
      } catch (Exception var4) {
         e.warn("Error while loading the skin texture", var4);
      }

      return $$1;
   }

   @Nullable
   private ffs c(ffs $$0) {
      int $$1 = $$0.b();
      int $$2 = $$0.a();
      if ($$2 == 64 && ($$1 == 32 || $$1 == 64)) {
         boolean $$3 = $$1 == 32;
         if ($$3) {
            ffs $$4 = new ffs(64, 64, true);
            $$4.a($$0);
            $$0.close();
            $$0 = $$4;
            $$4.a(0, 32, 64, 32, 0);
            $$4.a(4, 16, 16, 32, 4, 4, true, false);
            $$4.a(8, 16, 16, 32, 4, 4, true, false);
            $$4.a(0, 20, 24, 32, 4, 12, true, false);
            $$4.a(4, 20, 16, 32, 4, 12, true, false);
            $$4.a(8, 20, 8, 32, 4, 12, true, false);
            $$4.a(12, 20, 16, 32, 4, 12, true, false);
            $$4.a(44, 16, -8, 32, 4, 4, true, false);
            $$4.a(48, 16, -8, 32, 4, 4, true, false);
            $$4.a(40, 20, 0, 32, 4, 12, true, false);
            $$4.a(44, 20, -8, 32, 4, 12, true, false);
            $$4.a(48, 20, -16, 32, 4, 12, true, false);
            $$4.a(52, 20, -8, 32, 4, 12, true, false);
         }

         b($$0, 0, 0, 32, 16);
         if ($$3) {
            a($$0, 32, 0, 64, 32);
         }

         b($$0, 0, 16, 64, 32);
         b($$0, 16, 48, 48, 64);
         return $$0;
      } else {
         $$0.close();
         e.warn("Discarding incorrectly sized ({}x{}) skin texture from {}", new Object[]{$$2, $$1, this.j});
         return null;
      }
   }

   private static void a(ffs $$0, int $$1, int $$2, int $$3, int $$4) {
      for (int $$5 = $$1; $$5 < $$3; $$5++) {
         for (int $$6 = $$2; $$6 < $$4; $$6++) {
            int $$7 = $$0.a($$5, $$6);
            if (ayp.a($$7) < 128) {
               return;
            }
         }
      }

      for (int $$8 = $$1; $$8 < $$3; $$8++) {
         for (int $$9 = $$2; $$9 < $$4; $$9++) {
            $$0.a($$8, $$9, $$0.a($$8, $$9) & 16777215);
         }
      }
   }

   private static void b(ffs $$0, int $$1, int $$2, int $$3, int $$4) {
      for (int $$5 = $$1; $$5 < $$3; $$5++) {
         for (int $$6 = $$2; $$6 < $$4; $$6++) {
            $$0.a($$5, $$6, ayp.f($$0.a($$5, $$6)));
         }
      }
   }
}
