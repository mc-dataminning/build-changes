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

public class hiz implements auw, hja, AutoCloseable {
   private static final Logger b = LogUtils.getLogger();
   public static final alg a = alg.b("");
   private final Map<alg, hii> c = new HashMap<>();
   private final Set<hja> d = new HashSet<>();
   private final avd e;

   public hiz(avd $$0) {
      this.e = $$0;
      fik $$1 = him.a();
      this.a(him.c(), new hik($$1));
   }

   public void a(alg $$0, hio $$1) {
      try {
         $$1.a(this.b($$0, $$1));
      } catch (Throwable var6) {
         o $$3 = o.a(var6, "Uploading texture");
         p $$4 = $$3.a("Uploaded texture");
         $$4.a("Resource location", $$1.d());
         $$4.a("Texture id", $$0);
         throw new z($$3);
      }

      this.a($$0, (hii)$$1);
   }

   private hiy b(alg $$0, hio $$1) {
      try {
         return a(this.e, $$0, $$1);
      } catch (Exception var4) {
         b.error("Failed to load texture {} into slot {}", new Object[]{$$1.d(), $$0, var4});
         return hiy.a();
      }
   }

   public void a(alg $$0) {
      this.a($$0, (hii)(new hip($$0)));
   }

   public void a(alg $$0, hii $$1) {
      hii $$2 = this.c.put($$0, $$1);
      if ($$2 != $$1) {
         if ($$2 != null) {
            this.b($$0, $$2);
         }

         if ($$1 instanceof hja $$3) {
            this.d.add($$3);
         }
      }
   }

   private void b(alg $$0, hii $$1) {
      this.d.remove($$1);

      try {
         $$1.close();
      } catch (Exception var4) {
         b.warn("Failed to close texture {}", $$0, var4);
      }

      $$1.b();
   }

   public hii b(alg $$0) {
      hii $$1 = this.c.get($$0);
      if ($$1 != null) {
         return $$1;
      } else {
         hip $$2 = new hip($$0);
         this.a($$0, (hio)$$2);
         return $$2;
      }
   }

   @Override
   public void e() {
      for (hja $$0 : this.d) {
         $$0.e();
      }
   }

   public void c(alg $$0) {
      hii $$1 = this.c.remove($$0);
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
   public CompletableFuture<Void> a(auw.a $$0, avd $$1, Executor $$2, Executor $$3) {
      List<hiz.a> $$4 = new ArrayList<>();
      this.c.forEach(($$3x, $$4x) -> {
         if ($$4x instanceof hio $$5) {
            $$4.add(a($$1, $$3x, $$5, $$2));
         }
      });
      return CompletableFuture.allOf($$4.stream().map(hiz.a::b).toArray(CompletableFuture[]::new)).thenCompose($$0::a).thenAcceptAsync($$1x -> {
         fme.a(this.e);

         for (hiz.a $$2x : $$4) {
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
         if ($$2 instanceof hij $$3) {
            try {
               $$3.a($$1, $$0);
            } catch (IOException var5) {
               b.error("Failed to dump texture {}", $$1, var5);
            }
         }
      });
   }

   private static hiy a(avd $$0, alg $$1, hio $$2) throws IOException {
      try {
         return $$2.a($$0);
      } catch (FileNotFoundException var4) {
         if ($$1 != a) {
            b.warn("Missing resource {} referenced from {}", $$2.d(), $$1);
         }

         return hiy.a();
      }
   }

   private static hiz.a a(avd $$0, alg $$1, hio $$2, Executor $$3) {
      return new hiz.a($$2, CompletableFuture.supplyAsync(() -> {
         try {
            return a($$0, $$1, $$2);
         } catch (IOException var4) {
            throw new UncheckedIOException(var4);
         }
      }, $$3));
   }

   static record a(hio a, CompletableFuture<hiy> b) {
   }
}
