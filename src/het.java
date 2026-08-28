import com.mojang.blaze3d.systems.RenderSystem;
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

public class het implements auj, heu, AutoCloseable {
   private static final Logger b = LogUtils.getLogger();
   public static final akv a = akv.b("");
   private final Map<akv, hec> c = new HashMap<>();
   private final Set<heu> d = new HashSet<>();
   private final aup e;

   public het(aup $$0) {
      this.e = $$0;
      fet $$1 = heg.a();
      this.a(heg.c(), new hee($$1));
   }

   public void a(akv $$0, hei $$1) {
      try {
         $$1.a(this.b($$0, $$1));
      } catch (Throwable var6) {
         o $$3 = o.a(var6, "Uploading texture");
         p $$4 = $$3.a("Uploaded texture");
         $$4.a("Resource location", $$1.d());
         $$4.a("Texture id", $$0);
         throw new z($$3);
      }

      this.a($$0, (hec)$$1);
   }

   private hes b(akv $$0, hei $$1) {
      try {
         return a(this.e, $$0, $$1);
      } catch (Exception var4) {
         b.error("Failed to load texture {} into slot {}", new Object[]{$$1.d(), $$0, var4});
         return hes.a();
      }
   }

   public void a(akv $$0) {
      this.a($$0, (hec)(new hej($$0)));
   }

   public void a(akv $$0, hec $$1) {
      hec $$2 = this.c.put($$0, $$1);
      if ($$2 != $$1) {
         if ($$2 != null) {
            this.b($$0, $$2);
         }

         if ($$1 instanceof heu $$3) {
            this.d.add($$3);
         }
      }
   }

   private void b(akv $$0, hec $$1) {
      this.d.remove($$1);

      try {
         $$1.close();
      } catch (Exception var4) {
         b.warn("Failed to close texture {}", $$0, var4);
      }

      $$1.b();
   }

   public hec b(akv $$0) {
      hec $$1 = this.c.get($$0);
      if ($$1 != null) {
         return $$1;
      } else {
         hej $$2 = new hej($$0);
         this.a($$0, (hei)$$2);
         return $$2;
      }
   }

   @Override
   public void e() {
      for (heu $$0 : this.d) {
         $$0.e();
      }
   }

   public void c(akv $$0) {
      hec $$1 = this.c.remove($$0);
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
   public CompletableFuture<Void> a(auj.a $$0, aup $$1, Executor $$2, Executor $$3) {
      List<het.a> $$4 = new ArrayList<>();
      this.c.forEach(($$3x, $$4x) -> {
         if ($$4x instanceof hei $$5) {
            $$4.add(a($$1, $$3x, $$5, $$2));
         }
      });
      return CompletableFuture.allOf($$4.stream().map(het.a::b).toArray(CompletableFuture[]::new)).thenCompose($$0::a).thenAcceptAsync($$1x -> {
         fio.a(this.e);

         for (het.a $$2x : $$4) {
            $$2x.a.a($$2x.b.join());
         }
      }, $$3);
   }

   public void a(Path $$0) {
      if (!RenderSystem.isOnRenderThread()) {
         RenderSystem.recordRenderCall(() -> this.b($$0));
      } else {
         this.b($$0);
      }
   }

   private void b(Path $$0) {
      try {
         Files.createDirectories($$0);
      } catch (IOException var3) {
         b.error("Failed to create directory {}", $$0, var3);
         return;
      }

      this.c.forEach(($$1, $$2) -> {
         if ($$2 instanceof hed $$3) {
            try {
               $$3.a($$1, $$0);
            } catch (IOException var5) {
               b.error("Failed to dump texture {}", $$1, var5);
            }
         }
      });
   }

   private static hes a(aup $$0, akv $$1, hei $$2) throws IOException {
      try {
         return $$2.a($$0);
      } catch (FileNotFoundException var4) {
         if ($$1 != a) {
            b.warn("Missing resource {} referenced from {}", $$2.d(), $$1);
         }

         return hes.a();
      }
   }

   private static het.a a(aup $$0, akv $$1, hei $$2, Executor $$3) {
      return new het.a($$2, CompletableFuture.supplyAsync(() -> {
         try {
            return a($$0, $$1, $$2);
         } catch (IOException var4) {
            throw new UncheckedIOException(var4);
         }
      }, $$3));
   }

   static record a(hei a, CompletableFuture<hes> b) {
   }
}
