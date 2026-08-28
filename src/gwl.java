import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import org.slf4j.Logger;

public class gwl implements aum, gwm, AutoCloseable {
   private static final Logger b = LogUtils.getLogger();
   public static final alb a = alb.b("");
   private final Map<alb, gvv> c = Maps.newHashMap();
   private final Set<gwm> d = Sets.newHashSet();
   private final Map<String, Integer> e = Maps.newHashMap();
   private final aus f;

   public gwl(aus $$0) {
      this.f = $$0;
   }

   public void a(alb $$0) {
      if (!RenderSystem.isOnRenderThread()) {
         RenderSystem.recordRenderCall(() -> this.d($$0));
      } else {
         this.d($$0);
      }
   }

   private void d(alb $$0) {
      gvv $$1 = this.c.get($$0);
      if ($$1 == null) {
         $$1 = new gwd($$0);
         this.a($$0, $$1);
      }

      $$1.d();
   }

   public void a(alb $$0, gvv $$1) {
      $$1 = this.d($$0, $$1);
      gvv $$2 = this.c.put($$0, $$1);
      if ($$2 != $$1) {
         if ($$2 != null && $$2 != gwa.c()) {
            this.c($$0, $$2);
         }

         if ($$1 instanceof gwm) {
            this.d.add((gwm)$$1);
         }
      }
   }

   private void c(alb $$0, gvv $$1) {
      if ($$1 != gwa.c()) {
         this.d.remove($$1);

         try {
            $$1.close();
         } catch (Exception var4) {
            b.warn("Failed to close texture {}", $$0, var4);
         }
      }

      $$1.b();
   }

   private gvv d(alb $$0, gvv $$1) {
      try {
         $$1.a(this.f);
         return $$1;
      } catch (IOException var6) {
         if ($$0 != a) {
            b.warn("Failed to load texture: {}", $$0, var6);
         }

         return gwa.c();
      } catch (Throwable var7) {
         o $$4 = o.a(var7, "Registering texture");
         p $$5 = $$4.a("Resource location being registered");
         $$5.a("Resource location", $$0);
         $$5.a("Texture object class", () -> $$1.getClass().getName());
         throw new z($$4);
      }
   }

   public gvv b(alb $$0) {
      gvv $$1 = this.c.get($$0);
      if ($$1 == null) {
         $$1 = new gwd($$0);
         this.a($$0, $$1);
      }

      return $$1;
   }

   public gvv b(alb $$0, gvv $$1) {
      return this.c.getOrDefault($$0, $$1);
   }

   public alb a(String $$0, gvx $$1) {
      Integer $$2 = this.e.get($$0);
      if ($$2 == null) {
         $$2 = 1;
      } else {
         $$2 = $$2 + 1;
      }

      this.e.put($$0, $$2);
      alb $$3 = alb.b(String.format(Locale.ROOT, "dynamic/%s_%d", $$0, $$2));
      this.a($$3, $$1);
      return $$3;
   }

   public CompletableFuture<Void> a(alb $$0, Executor $$1) {
      if (!this.c.containsKey($$0)) {
         gwc $$2 = new gwc(this.f, $$0, $$1);
         this.c.put($$0, $$2);
         return $$2.e().thenRunAsync(() -> this.a($$0, (gvv)$$2), gwl::a);
      } else {
         return CompletableFuture.completedFuture(null);
      }
   }

   private static void a(Runnable $$0) {
      fib.Q().execute(() -> RenderSystem.recordRenderCall($$0::run));
   }

   @Override
   public void f() {
      for (gwm $$0 : this.d) {
         $$0.f();
      }
   }

   public void c(alb $$0) {
      gvv $$1 = this.c.remove($$0);
      if ($$1 != null) {
         this.c($$0, $$1);
      }
   }

   @Override
   public void close() {
      this.c.forEach(this::c);
      this.c.clear();
      this.d.clear();
      this.e.clear();
   }

   @Override
   public CompletableFuture<Void> a(aum.a $$0, aus $$1, bny $$2, bny $$3, Executor $$4, Executor $$5) {
      CompletableFuture<Void> $$6 = new CompletableFuture<>();
      fpv.a(this, $$4).thenCompose($$0::a).thenAcceptAsync($$3x -> {
         gwa.c();
         ffe.a(this.f);
         Iterator<Entry<alb, gvv>> $$4x = this.c.entrySet().iterator();

         while ($$4x.hasNext()) {
            Entry<alb, gvv> $$5x = $$4x.next();
            alb $$6x = $$5x.getKey();
            gvv $$7 = $$5x.getValue();
            if ($$7 == gwa.c() && !$$6x.equals(gwa.b())) {
               $$4x.remove();
            } else {
               $$7.a(this, $$1, $$6x, $$5);
            }
         }

         fib.Q().i(() -> $$6.complete(null));
      }, $$0x -> RenderSystem.recordRenderCall($$0x::run));
      return $$6;
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
         if ($$2 instanceof gvw $$3) {
            try {
               $$3.a($$1, $$0);
            } catch (IOException var5) {
               b.error("Failed to dump texture {}", $$1, var5);
            }
         }
      });
   }
}
