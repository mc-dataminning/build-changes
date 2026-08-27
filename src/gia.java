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

public class gia implements arz, gib, AutoCloseable {
   private static final Logger b = LogUtils.getLogger();
   public static final ajc a = new ajc("");
   private final Map<ajc, ghk> c = Maps.newHashMap();
   private final Set<gib> d = Sets.newHashSet();
   private final Map<String, Integer> e = Maps.newHashMap();
   private final asf f;

   public gia(asf $$0) {
      this.f = $$0;
   }

   public void a(ajc $$0) {
      if (!RenderSystem.isOnRenderThread()) {
         RenderSystem.recordRenderCall(() -> this.d($$0));
      } else {
         this.d($$0);
      }
   }

   private void d(ajc $$0) {
      ghk $$1 = this.c.get($$0);
      if ($$1 == null) {
         $$1 = new ghs($$0);
         this.a($$0, $$1);
      }

      $$1.c();
   }

   public void a(ajc $$0, ghk $$1) {
      $$1 = this.d($$0, $$1);
      ghk $$2 = this.c.put($$0, $$1);
      if ($$2 != $$1) {
         if ($$2 != null && $$2 != ghp.c()) {
            this.c($$0, $$2);
         }

         if ($$1 instanceof gib) {
            this.d.add((gib)$$1);
         }
      }
   }

   private void c(ajc $$0, ghk $$1) {
      if ($$1 != ghp.c()) {
         this.d.remove($$1);

         try {
            $$1.close();
         } catch (Exception var4) {
            b.warn("Failed to close texture {}", $$0, var4);
         }
      }

      $$1.b();
   }

   private ghk d(ajc $$0, ghk $$1) {
      try {
         $$1.a(this.f);
         return $$1;
      } catch (IOException var6) {
         if ($$0 != a) {
            b.warn("Failed to load texture: {}", $$0, var6);
         }

         return ghp.c();
      } catch (Throwable var7) {
         o $$4 = o.a(var7, "Registering texture");
         p $$5 = $$4.a("Resource location being registered");
         $$5.a("Resource location", $$0);
         $$5.a("Texture object class", () -> $$1.getClass().getName());
         throw new y($$4);
      }
   }

   public ghk b(ajc $$0) {
      ghk $$1 = this.c.get($$0);
      if ($$1 == null) {
         $$1 = new ghs($$0);
         this.a($$0, $$1);
      }

      return $$1;
   }

   public ghk b(ajc $$0, ghk $$1) {
      return this.c.getOrDefault($$0, $$1);
   }

   public ajc a(String $$0, ghm $$1) {
      Integer $$2 = this.e.get($$0);
      if ($$2 == null) {
         $$2 = 1;
      } else {
         $$2 = $$2 + 1;
      }

      this.e.put($$0, $$2);
      ajc $$3 = new ajc(String.format(Locale.ROOT, "dynamic/%s_%d", $$0, $$2));
      this.a($$3, $$1);
      return $$3;
   }

   public CompletableFuture<Void> a(ajc $$0, Executor $$1) {
      if (!this.c.containsKey($$0)) {
         ghr $$2 = new ghr(this.f, $$0, $$1);
         this.c.put($$0, $$2);
         return $$2.d().thenRunAsync(() -> this.a($$0, (ghk)$$2), gia::a);
      } else {
         return CompletableFuture.completedFuture(null);
      }
   }

   private static void a(Runnable $$0) {
      eyk.P().execute(() -> RenderSystem.recordRenderCall($$0::run));
   }

   @Override
   public void e() {
      for (gib $$0 : this.d) {
         $$0.e();
      }
   }

   public void c(ajc $$0) {
      ghk $$1 = this.c.remove($$0);
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
   public CompletableFuture<Void> a(arz.a $$0, asf $$1, bjc $$2, bjc $$3, Executor $$4, Executor $$5) {
      CompletableFuture<Void> $$6 = new CompletableFuture<>();
      fgm.a(this, $$4).thenCompose($$0::a).thenAcceptAsync($$3x -> {
         ghp.c();
         ewg.a(this.f);
         Iterator<Entry<ajc, ghk>> $$4x = this.c.entrySet().iterator();

         while ($$4x.hasNext()) {
            Entry<ajc, ghk> $$5x = $$4x.next();
            ajc $$6x = $$5x.getKey();
            ghk $$7 = $$5x.getValue();
            if ($$7 == ghp.c() && !$$6x.equals(ghp.b())) {
               $$4x.remove();
            } else {
               $$7.a(this, $$1, $$6x, $$5);
            }
         }

         eyk.P().i(() -> $$6.complete(null));
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
         if ($$2 instanceof ghl $$3) {
            try {
               $$3.a($$1, $$0);
            } catch (IOException var5) {
               b.error("Failed to dump texture {}", $$1, var5);
            }
         }
      });
   }
}
