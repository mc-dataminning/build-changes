import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;
import org.slf4j.Logger;

public class hiq {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 64;
   private static final int c = 64;
   private static final int d = 32;

   public static CompletableFuture<alg> a(alg $$0, Path $$1, String $$2, boolean $$3) {
      return CompletableFuture.<fik>supplyAsync(() -> {
         fik $$3x;
         try {
            $$3x = a($$1, $$2);
         } catch (IOException var5) {
            throw new UncheckedIOException(var5);
         }

         return $$3 ? a($$3x, $$2) : $$3x;
      }, af.j().a("downloadTexture")).thenCompose($$1x -> a($$0, $$1x));
   }

   private static fik a(Path $$0, String $$1) throws IOException {
      if (Files.isRegularFile($$0)) {
         a.debug("Loading HTTP texture from local cache ({})", $$0);

         fik var17;
         try (InputStream $$2 = Files.newInputStream($$0)) {
            var17 = fik.a($$2);
         }

         return var17;
      } else {
         HttpURLConnection $$3 = null;
         a.debug("Downloading HTTP texture from {} to {}", $$1, $$0);
         URI $$4 = URI.create($$1);

         fik $$7;
         try {
            $$3 = (HttpURLConnection)$$4.toURL().openConnection(foz.Q().Z());
            $$3.setDoInput(true);
            $$3.setDoOutput(false);
            $$3.connect();
            int $$5 = $$3.getResponseCode();
            if ($$5 / 100 != 2) {
               throw new IOException("Failed to open " + $$4 + ", HTTP error code: " + $$5);
            }

            byte[] $$6 = $$3.getInputStream().readAllBytes();

            try {
               v.c($$0.getParent());
               Files.write($$0, $$6);
            } catch (IOException var13) {
               a.warn("Failed to cache texture {} in {}", $$1, $$0);
            }

            $$7 = fik.a($$6);
         } finally {
            if ($$3 != null) {
               $$3.disconnect();
            }
         }

         return $$7;
      }
   }

   private static CompletableFuture<alg> a(alg $$0, fik $$1) {
      foz $$2 = foz.Q();
      return CompletableFuture.supplyAsync(() -> {
         $$2.aa().a($$0, new hik($$1));
         return $$0;
      }, $$2);
   }

   private static fik a(fik $$0, String $$1) {
      int $$2 = $$0.b();
      int $$3 = $$0.a();
      if ($$3 == 64 && ($$2 == 32 || $$2 == 64)) {
         boolean $$4 = $$2 == 32;
         if ($$4) {
            fik $$5 = new fik(64, 64, true);
            $$5.a($$0);
            $$0.close();
            $$0 = $$5;
            $$5.a(0, 32, 64, 32, 0);
            $$5.a(4, 16, 16, 32, 4, 4, true, false);
            $$5.a(8, 16, 16, 32, 4, 4, true, false);
            $$5.a(0, 20, 24, 32, 4, 12, true, false);
            $$5.a(4, 20, 16, 32, 4, 12, true, false);
            $$5.a(8, 20, 8, 32, 4, 12, true, false);
            $$5.a(12, 20, 16, 32, 4, 12, true, false);
            $$5.a(44, 16, -8, 32, 4, 4, true, false);
            $$5.a(48, 16, -8, 32, 4, 4, true, false);
            $$5.a(40, 20, 0, 32, 4, 12, true, false);
            $$5.a(44, 20, -8, 32, 4, 12, true, false);
            $$5.a(48, 20, -16, 32, 4, 12, true, false);
            $$5.a(52, 20, -8, 32, 4, 12, true, false);
         }

         b($$0, 0, 0, 32, 16);
         if ($$4) {
            a($$0, 32, 0, 64, 32);
         }

         b($$0, 0, 16, 64, 32);
         b($$0, 16, 48, 48, 64);
         return $$0;
      } else {
         $$0.close();
         throw new IllegalStateException("Discarding incorrectly sized (" + $$3 + "x" + $$2 + ") skin texture from " + $$1);
      }
   }

   private static void a(fik $$0, int $$1, int $$2, int $$3, int $$4) {
      for (int $$5 = $$1; $$5 < $$3; $$5++) {
         for (int $$6 = $$2; $$6 < $$4; $$6++) {
            int $$7 = $$0.a($$5, $$6);
            if (axw.a($$7) < 128) {
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

   private static void b(fik $$0, int $$1, int $$2, int $$3, int $$4) {
      for (int $$5 = $$1; $$5 < $$3; $$5++) {
         for (int $$6 = $$2; $$6 < $$4; $$6++) {
            $$0.a($$5, $$6, axw.f($$0.a($$5, $$6)));
         }
      }
   }
}
