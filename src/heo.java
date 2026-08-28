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

public class heo implements aui, hep, AutoCloseable {
   private static final Logger b = LogUtils.getLogger();
   public static final aku a = aku.b("");
   private final Map<aku, hdx> c = new HashMap<>();
   private final Set<hep> d = new HashSet<>();
   private final auo e;

   public heo(auo $$0) {
      this.e = $$0;
      fes $$1 = heb.a();
      this.a(heb.c(), new hdz($$1));
   }

   public void a(aku $$0, hed $$1) {
      try {
         $$1.a(a(this.e, $$0, $$1));
      } catch (Throwable var6) {
         o $$3 = o.a(var6, "Registering texture");
         p $$4 = $$3.a("Resource location being registered");
         $$4.a("Resource location", $$1.e());
         $$4.a("Texture id", $$0);
         throw new z($$3);
      }

      this.a($$0, (hdx)$$1);
   }

   public void a(aku $$0) {
      this.a($$0, (hdx)(new hee($$0)));
   }

   public void a(aku $$0, hdx $$1) {
      hdx $$2 = this.c.put($$0, $$1);
      if ($$2 != $$1) {
         if ($$2 != null) {
            this.b($$0, $$2);
         }

         if ($$1 instanceof hep $$3) {
            this.d.add($$3);
         }
      }
   }

   private void b(aku $$0, hdx $$1) {
      this.d.remove($$1);

      try {
         $$1.close();
      } catch (Exception var4) {
         b.warn("Failed to close texture {}", $$0, var4);
      }

      $$1.b();
   }

   public hdx b(aku $$0) {
      hdx $$1 = this.c.get($$0);
      if ($$1 != null) {
         return $$1;
      } else {
         hee $$2 = new hee($$0);
         this.a($$0, (hed)$$2);
         return $$2;
      }
   }

   @Override
   public void f() {
      for (hep $$0 : this.d) {
         $$0.f();
      }
   }

   public void c(aku $$0) {
      hdx $$1 = this.c.remove($$0);
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
   public CompletableFuture<Void> a(aui.a $$0, auo $$1, Executor $$2, Executor $$3) {
      List<heo.a> $$4 = new ArrayList<>();
      this.c.forEach(($$3x, $$4x) -> {
         if ($$4x instanceof hed $$5) {
            $$4.add(a($$1, $$3x, $$5, $$2));
         }
      });
      return CompletableFuture.allOf($$4.stream().map(heo.a::b).toArray(CompletableFuture[]::new)).thenCompose($$0::a).thenAcceptAsync($$1x -> {
         fin.a(this.e);

         for (heo.a $$2x : $$4) {
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
         if ($$2 instanceof hdy $$3) {
            try {
               $$3.a($$1, $$0);
            } catch (IOException var5) {
               b.error("Failed to dump texture {}", $$1, var5);
            }
         }
      });
   }

   private static hen a(auo $$0, aku $$1, hed $$2) throws IOException {
      try {
         return $$2.a($$0);
      } catch (FileNotFoundException var4) {
         if ($$1 != a) {
            b.warn("Missing resource {} referenced from {}", $$2.e(), $$1);
         }

         return hen.a();
      }
   }

   private static heo.a a(auo $$0, aku $$1, hed $$2, Executor $$3) {
      return new heo.a($$2, CompletableFuture.supplyAsync(() -> {
         try {
            return a($$0, $$1, $$2);
         } catch (IOException var4) {
            throw new UncheckedIOException(var4);
         }
      }, $$3));
   }

   static record a(hed a, CompletableFuture<hen> b) {
   }
}
