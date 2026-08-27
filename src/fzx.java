import com.google.common.hash.Hashing;
import com.mojang.logging.LogUtils;
import com.mojang.util.UndashedUuid;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.comparator.LastModifiedFileComparator;
import org.apache.commons.io.filefilter.TrueFileFilter;
import org.slf4j.Logger;

public class fzx implements anh {
   private static final Logger a = LogUtils.getLogger();
   private static final Pattern b = Pattern.compile("^[a-fA-F0-9]{40}$");
   private static final int c = 262144000;
   private static final int d = 10;
   private static final String e = "server";
   private static final tl f = tl.c("resourcePack.server.name");
   private static final tl g = tl.c("multiplayer.applyingPack");
   private final File h;
   private final ReentrantLock i = new ReentrantLock();
   @Nullable
   private CompletableFuture<?> j;
   @Nullable
   private anc k;

   public fzx(File $$0) {
      this.h = $$0;
   }

   @Override
   public void a(Consumer<anc> $$0) {
      if (this.k != null) {
         $$0.accept(this.k);
      }
   }

   private static Map<String, String> b() {
      return Map.of(
         "X-Minecraft-Username",
         eqv.O().V().c(),
         "X-Minecraft-UUID",
         UndashedUuid.toString(eqv.O().V().b()),
         "X-Minecraft-Version",
         aa.b().c(),
         "X-Minecraft-Version-ID",
         aa.b().b(),
         "X-Minecraft-Pack-Format",
         String.valueOf(aa.b().a(amj.a)),
         "User-Agent",
         "Minecraft Java/" + aa.b().c()
      );
   }

   public CompletableFuture<?> a(URL $$0, String $$1, boolean $$2) {
      String $$3 = Hashing.sha1().hashString($$0.toString(), StandardCharsets.UTF_8).toString();
      String $$4 = b.matcher($$1).matches() ? $$1 : "";
      this.i.lock();

      CompletableFuture var14;
      try {
         eqv $$5 = eqv.O();
         File $$6 = new File(this.h, $$3);
         CompletableFuture<?> $$7;
         if ($$6.exists()) {
            $$7 = CompletableFuture.completedFuture("");
         } else {
            eyi $$8 = new eyi($$2);
            Map<String, String> $$9 = b();
            $$5.h(() -> $$5.a($$8));
            $$7 = arp.a($$6, $$0, $$9, 262144000, $$8, $$5.X());
         }

         this.j = $$7.<Void>thenCompose($$4x -> {
               if (!this.a($$4, $$6)) {
                  return CompletableFuture.failedFuture(new RuntimeException("Hash check failure for file " + $$6 + ", see log"));
               } else {
                  $$5.execute(() -> {
                     if (!$$2) {
                        $$5.a(new exq(g));
                     }
                  });
                  return this.a($$6, ang.f);
               }
            })
            .exceptionallyCompose($$2x -> this.a().thenAcceptAsync($$2xx -> {
                  a.warn("Pack application failed: {}, deleting file {}", $$2x.getMessage(), $$6);
                  a($$6);
               }, ac.g()).thenAcceptAsync($$1xx -> $$5.a(new exd($$1xxx -> {
                     if ($$1xxx) {
                        $$5.a(null);
                     } else {
                        fiy $$2xx = $$5.J();
                        if ($$2xx != null) {
                           $$2xx.l().a(tl.c("connect.aborted"));
                        }
                     }
                  }, tl.c("multiplayer.texturePrompt.failure.line1"), tl.c("multiplayer.texturePrompt.failure.line2"), tk.i, tl.c("menu.disconnect"))), $$5))
            .thenAcceptAsync($$0x -> this.c(), ac.g());
         var14 = this.j;
      } finally {
         this.i.unlock();
      }

      return var14;
   }

   private static void a(File $$0) {
      try {
         Files.delete($$0.toPath());
      } catch (IOException var2) {
         a.warn("Failed to delete file {}: {}", $$0, var2.getMessage());
      }
   }

   public CompletableFuture<Void> a() {
      this.i.lock();

      try {
         if (this.j != null) {
            this.j.cancel(true);
         }

         this.j = null;
         if (this.k != null) {
            this.k = null;
            return eqv.O().P();
         }
      } finally {
         this.i.unlock();
      }

      return CompletableFuture.completedFuture(null);
   }

   private boolean a(String $$0, File $$1) {
      try {
         String $$2 = com.google.common.io.Files.asByteSource($$1).hash(Hashing.sha1()).toString();
         if ($$0.isEmpty()) {
            a.info("Found file {} without verification hash", $$1);
            return true;
         }

         if ($$2.toLowerCase(Locale.ROOT).equals($$0.toLowerCase(Locale.ROOT))) {
            a.info("Found file {} matching requested hash {}", $$1, $$0);
            return true;
         }

         a.warn("File {} had wrong hash (expected {}, found {}).", new Object[]{$$1, $$0, $$2});
      } catch (IOException var4) {
         a.warn("File {} couldn't be hashed.", $$1, var4);
      }

      return false;
   }

   private void c() {
      if (this.h.isDirectory()) {
         try {
            List<File> $$0 = new ArrayList<>(FileUtils.listFiles(this.h, TrueFileFilter.TRUE, null));
            $$0.sort(LastModifiedFileComparator.LASTMODIFIED_REVERSE);
            int $$1 = 0;

            for (File $$2 : $$0) {
               if ($$1++ >= 10) {
                  a.info("Deleting old server resource pack {}", $$2.getName());
                  FileUtils.deleteQuietly($$2);
               }
            }
         } catch (Exception var5) {
            a.error("Error while deleting old server resource pack : {}", var5.getMessage());
         }
      }
   }

   public CompletableFuture<Void> a(File $$0, ang $$1) {
      anc.c $$2 = new amg.a($$0, false);
      int $$3 = aa.b().a(amj.a);
      anc.a $$4 = anc.a("server", $$2, $$3);
      if ($$4 == null) {
         return CompletableFuture.failedFuture(new IllegalArgumentException("Invalid pack metadata at " + $$0));
      } else {
         a.info("Applying server pack {}", $$0);
         this.k = anc.a("server", f, true, $$2, $$4, anc.b.a, true, $$1);
         return eqv.O().P();
      }
   }

   public CompletableFuture<Void> a(ecg.c $$0) {
      Path $$1 = $$0.a(ece.k);
      return Files.exists($$1) && !Files.isDirectory($$1) ? this.a($$1.toFile(), ang.e) : CompletableFuture.completedFuture(null);
   }
}
