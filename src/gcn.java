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

public class gcn implements aou {
   private static final Logger a = LogUtils.getLogger();
   private static final Pattern b = Pattern.compile("^[a-fA-F0-9]{40}$");
   private static final int c = 262144000;
   private static final int d = 10;
   private static final String e = "server";
   private static final ur f = ur.c("resourcePack.server.name");
   private static final ur g = ur.c("multiplayer.applyingPack");
   private final File h;
   private final ReentrantLock i = new ReentrantLock();
   @Nullable
   private CompletableFuture<?> j;
   @Nullable
   private aop k;

   public gcn(File $$0) {
      this.h = $$0;
   }

   @Override
   public void a(Consumer<aop> $$0) {
      if (this.k != null) {
         $$0.accept(this.k);
      }
   }

   private static Map<String, String> b() {
      return Map.of(
         "X-Minecraft-Username",
         etd.N().U().c(),
         "X-Minecraft-UUID",
         UndashedUuid.toString(etd.N().U().b()),
         "X-Minecraft-Version",
         aa.b().c(),
         "X-Minecraft-Version-ID",
         aa.b().b(),
         "X-Minecraft-Pack-Format",
         String.valueOf(aa.b().a(anw.a)),
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
         etd $$5 = etd.N();
         File $$6 = new File(this.h, $$3);
         CompletableFuture<?> $$7;
         if ($$6.exists()) {
            $$7 = CompletableFuture.completedFuture("");
         } else {
            far $$8 = new far($$2);
            Map<String, String> $$9 = b();
            $$5.h(() -> $$5.a($$8));
            $$7 = atd.a($$6, $$0, $$9, 262144000, $$8, $$5.W());
         }

         this.j = $$7.<Void>thenCompose($$4x -> {
               if (!this.a($$4, $$6)) {
                  return CompletableFuture.failedFuture(new RuntimeException("Hash check failure for file " + $$6 + ", see log"));
               } else {
                  $$5.execute(() -> {
                     if (!$$2) {
                        $$5.a(new faa(g));
                     }
                  });
                  return this.a($$6, aot.f);
               }
            })
            .exceptionallyCompose($$2x -> this.a().thenAcceptAsync($$2xx -> {
                  a.warn("Pack application failed: {}, deleting file {}", $$2x.getMessage(), $$6);
                  a($$6);
               }, ac.g()).thenAcceptAsync($$1xx -> $$5.a(new ezn($$1xxx -> {
                     if ($$1xxx) {
                        $$5.a(null);
                     } else {
                        flk $$2xx = $$5.I();
                        if ($$2xx != null) {
                           $$2xx.m().a(ur.c("connect.aborted"));
                        }
                     }
                  }, ur.c("multiplayer.texturePrompt.failure.line1"), ur.c("multiplayer.texturePrompt.failure.line2"), uq.i, ur.c("menu.disconnect"))), $$5))
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
            return etd.N().O();
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

   public CompletableFuture<Void> a(File $$0, aot $$1) {
      aop.c $$2 = new ant.a($$0, false);
      int $$3 = aa.b().a(anw.a);
      aop.a $$4 = aop.a("server", $$2, $$3);
      if ($$4 == null) {
         return CompletableFuture.failedFuture(new IllegalArgumentException("Invalid pack metadata at " + $$0));
      } else {
         a.info("Applying server pack {}", $$0);
         this.k = aop.a("server", f, true, $$2, $$4, aop.b.a, true, $$1);
         return etd.N().O();
      }
   }

   public CompletableFuture<Void> a(een.c $$0) {
      Path $$1 = $$0.a(eel.k);
      return Files.exists($$1) && !Files.isDirectory($$1) ? this.a($$1.toFile(), aot.e) : CompletableFuture.completedFuture(null);
   }
}
