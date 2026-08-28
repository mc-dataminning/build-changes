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

public class goz implements aui, gpa, AutoCloseable {
   private static final Logger b = LogUtils.getLogger();
   public static final ale a = new ale("");
   private final Map<ale, goj> c = Maps.newHashMap();
   private final Set<gpa> d = Sets.newHashSet();
   private final Map<String, Integer> e = Maps.newHashMap();
   private final auo f;

   public goz(auo $$0) {
      this.f = $$0;
   }

   public void a(ale $$0) {
      if (!RenderSystem.isOnRenderThread()) {
         RenderSystem.recordRenderCall(() -> this.d($$0));
      } else {
         this.d($$0);
      }
   }

   private void d(ale $$0) {
      goj $$1 = this.c.get($$0);
      if ($$1 == null) {
         $$1 = new gor($$0);
         this.a($$0, $$1);
      }

      $$1.c();
   }

   public void a(ale $$0, goj $$1) {
      $$1 = this.d($$0, $$1);
      goj $$2 = this.c.put($$0, $$1);
      if ($$2 != $$1) {
         if ($$2 != null && $$2 != goo.c()) {
            this.c($$0, $$2);
         }

         if ($$1 instanceof gpa) {
            this.d.add((gpa)$$1);
         }
      }
   }

   private void c(ale $$0, goj $$1) {
      if ($$1 != goo.c()) {
         this.d.remove($$1);

         try {
            $$1.close();
         } catch (Exception var4) {
            b.warn("Failed to close texture {}", $$0, var4);
         }
      }

      $$1.b();
   }

   private goj d(ale $$0, goj $$1) {
      try {
         $$1.a(this.f);
         return $$1;
      } catch (IOException var6) {
         if ($$0 != a) {
            b.warn("Failed to load texture: {}", $$0, var6);
         }

         return goo.c();
      } catch (Throwable var7) {
         o $$4 = o.a(var7, "Registering texture");
         p $$5 = $$4.a("Resource location being registered");
         $$5.a("Resource location", $$0);
         $$5.a("Texture object class", () -> $$1.getClass().getName());
         throw new y($$4);
      }
   }

   public goj b(ale $$0) {
      goj $$1 = this.c.get($$0);
      if ($$1 == null) {
         $$1 = new gor($$0);
         this.a($$0, $$1);
      }

      return $$1;
   }

   public goj b(ale $$0, goj $$1) {
      return this.c.getOrDefault($$0, $$1);
   }

   public ale a(String $$0, gol $$1) {
      Integer $$2 = this.e.get($$0);
      if ($$2 == null) {
         $$2 = 1;
      } else {
         $$2 = $$2 + 1;
      }

      this.e.put($$0, $$2);
      ale $$3 = new ale(String.format(Locale.ROOT, "dynamic/%s_%d", $$0, $$2));
      this.a($$3, $$1);
      return $$3;
   }

   public CompletableFuture<Void> a(ale $$0, Executor $$1) {
      if (!this.c.containsKey($$0)) {
         goq $$2 = new goq(this.f, $$0, $$1);
         this.c.put($$0, $$2);
         return $$2.d().thenRunAsync(() -> this.a($$0, (goj)$$2), goz::a);
      } else {
         return CompletableFuture.completedFuture(null);
      }
   }

   private static void a(Runnable $$0) {
      ffe.Q().execute(() -> RenderSystem.recordRenderCall($$0::run));
   }

   @Override
   public void e() {
      for (gpa $$0 : this.d) {
         $$0.e();
      }
   }

   public void c(ale $$0) {
      goj $$1 = this.c.remove($$0);
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
   public CompletableFuture<Void> a(aui.a $$0, auo $$1, bnh $$2, bnh $$3, Executor $$4, Executor $$5) {
      CompletableFuture<Void> $$6 = new CompletableFuture<>();
      fnh.a(this, $$4).thenCompose($$0::a).thenAcceptAsync($$3x -> {
         goo.c();
         fda.a(this.f);
         Iterator<Entry<ale, goj>> $$4x = this.c.entrySet().iterator();

         while ($$4x.hasNext()) {
            Entry<ale, goj> $$5x = $$4x.next();
            ale $$6x = $$5x.getKey();
            goj $$7 = $$5x.getValue();
            if ($$7 == goo.c() && !$$6x.equals(goo.b())) {
               $$4x.remove();
            } else {
               $$7.a(this, $$1, $$6x, $$5);
            }
         }

         ffe.Q().i(() -> $$6.complete(null));
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
         if ($$2 instanceof gok $$3) {
            try {
               $$3.a($$1, $$0);
            } catch (IOException var5) {
               b.error("Failed to dump texture {}", $$1, var5);
            }
         }
      });
   }
}
