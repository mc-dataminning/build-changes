import com.mojang.logging.LogUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import org.slf4j.Logger;

public class hks implements avi, hkt, AutoCloseable {
   private static final Logger b = LogUtils.getLogger();
   public static final alr a = alr.b("");
   private final Map<alr, hkb> c = new HashMap<>();
   private final Set<hkt> d = new HashSet<>();
   private final avo e;

   public hks(avo $$0) {
      this.e = $$0;
      fkf $$1 = hkf.a();
      this.a(hkf.c(), new hkd(() -> "(intentionally-)Missing Texture", $$1));
   }

   public void a(alr $$0, hkh $$1) {
      try {
         $$1.a(this.b($$0, $$1));
      } catch (Throwable var6) {
         p $$3 = p.a(var6, "Uploading texture");
         q $$4 = $$3.a("Uploaded texture");
         $$4.a("Resource location", $$1.b());
         $$4.a("Texture id", $$0);
         throw new aa($$3);
      }

      this.a($$0, (hkb)$$1);
   }

   private hkr b(alr $$0, hkh $$1) {
      try {
         return a(this.e, $$0, $$1);
      } catch (Exception var4) {
         b.error("Failed to load texture {} into slot {}", new Object[]{$$1.b(), $$0, var4});
         return hkr.a();
      }
   }

   public void a(alr $$0) {
      this.a($$0, (hkb)(new hki($$0)));
   }

   public void a(alr $$0, hkb $$1) {
      hkb $$2 = this.c.put($$0, $$1);
      if ($$2 != $$1) {
         if ($$2 != null) {
            this.b($$0, $$2);
         }

         if ($$1 instanceof hkt $$3) {
            this.d.add($$3);
         }
      }
   }

   private void b(alr $$0, hkb $$1) {
      this.d.remove($$1);

      try {
         $$1.close();
      } catch (Exception var4) {
         b.warn("Failed to close texture {}", $$0, var4);
      }
   }

   public hkb b(alr $$0) {
      hkb $$1 = this.c.get($$0);
      if ($$1 != null) {
         return $$1;
      } else {
         hki $$2 = new hki($$0);
         this.a($$0, (hkh)$$2);
         return $$2;
      }
   }

   @Override
   public void c() {
      for (hkt $$0 : this.d) {
         $$0.c();
      }
   }

   public void c(alr $$0) {
      hkb $$1 = this.c.remove($$0);
      if ($$1 != null) {
         this.b($$0, $$1);
      }
   }

   @Override
   public void close() {
      this.c.forEach(this::b);
      this.c.clear();
      this.d.clear();
   }

   @Override
   public CompletableFuture<Void> reload(avi.a $$0, avo $$1, Executor $$2, Executor $$3) {
      List<hks.a> $$4 = new ArrayList<>();
      this.c.forEach(($$3x, $$4x) -> {
         if ($$4x instanceof hkh $$5) {
            $$4.add(a($$1, $$3x, $$5, $$2));
         }
      });
      return CompletableFuture.allOf($$4.stream().map(hks.a::b).toArray(CompletableFuture[]::new)).thenCompose($$0::wait).thenAcceptAsync($$1x -> {
         fnv.a(this.e);

         for (hks.a $$2x : $$4) {
            $$2x.a.a($$2x.b.join());
         }
      }, $$3);
   }

   public void a(Path $$0) {
      try {
         Files.createDirectories($$0);
      } catch (IOException var3) {
         b.error("Failed to create directory {}", $$0, var3);
         return;
      }

      this.c.forEach(($$1, $$2) -> {
         if ($$2 instanceof hkc $$3) {
            try {
               $$3.a($$1, $$0);
            } catch (IOException var5) {
               b.error("Failed to dump texture {}", $$1, var5);
            }
         }
      });
   }

   private static hkr a(avo $$0, alr $$1, hkh $$2) throws IOException {
      try {
         return $$2.a($$0);
      } catch (FileNotFoundException var4) {
         if ($$1 != a) {
            b.warn("Missing resource {} referenced from {}", $$2.b(), $$1);
         }

         return hkr.a();
      }
   }

   private static hks.a a(avo $$0, alr $$1, hkh $$2, Executor $$3) {
      return new hks.a($$2, CompletableFuture.supplyAsync(() -> {
         try {
            return a($$0, $$1, $$2);
         } catch (IOException var4) {
            throw new UncheckedIOException(var4);
         }
      }, $$3));
   }

   static record a(hkh a, CompletableFuture<hkr> b) {
   }
}
