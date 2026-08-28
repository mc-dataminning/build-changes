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

public class gov implements auf, gow, AutoCloseable {
   private static final Logger b = LogUtils.getLogger();
   public static final alb a = new alb("");
   private final Map<alb, gof> c = Maps.newHashMap();
   private final Set<gow> d = Sets.newHashSet();
   private final Map<String, Integer> e = Maps.newHashMap();
   private final aul f;

   public gov(aul $$0) {
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
      gof $$1 = this.c.get($$0);
      if ($$1 == null) {
         $$1 = new gon($$0);
         this.a($$0, $$1);
      }

      $$1.c();
   }

   public void a(alb $$0, gof $$1) {
      $$1 = this.d($$0, $$1);
      gof $$2 = this.c.put($$0, $$1);
      if ($$2 != $$1) {
         if ($$2 != null && $$2 != gok.c()) {
            this.c($$0, $$2);
         }

         if ($$1 instanceof gow) {
            this.d.add((gow)$$1);
         }
      }
   }

   private void c(alb $$0, gof $$1) {
      if ($$1 != gok.c()) {
         this.d.remove($$1);

         try {
            $$1.close();
         } catch (Exception var4) {
            b.warn("Failed to close texture {}", $$0, var4);
         }
      }

      $$1.b();
   }

   private gof d(alb $$0, gof $$1) {
      try {
         $$1.a(this.f);
         return $$1;
      } catch (IOException var6) {
         if ($$0 != a) {
            b.warn("Failed to load texture: {}", $$0, var6);
         }

         return gok.c();
      } catch (Throwable var7) {
         o $$4 = o.a(var7, "Registering texture");
         p $$5 = $$4.a("Resource location being registered");
         $$5.a("Resource location", $$0);
         $$5.a("Texture object class", () -> $$1.getClass().getName());
         throw new y($$4);
      }
   }

   public gof b(alb $$0) {
      gof $$1 = this.c.get($$0);
      if ($$1 == null) {
         $$1 = new gon($$0);
         this.a($$0, $$1);
      }

      return $$1;
   }

   public gof b(alb $$0, gof $$1) {
      return this.c.getOrDefault($$0, $$1);
   }

   public alb a(String $$0, goh $$1) {
      Integer $$2 = this.e.get($$0);
      if ($$2 == null) {
         $$2 = 1;
      } else {
         $$2 = $$2 + 1;
      }

      this.e.put($$0, $$2);
      alb $$3 = new alb(String.format(Locale.ROOT, "dynamic/%s_%d", $$0, $$2));
      this.a($$3, $$1);
      return $$3;
   }

   public CompletableFuture<Void> a(alb $$0, Executor $$1) {
      if (!this.c.containsKey($$0)) {
         gom $$2 = new gom(this.f, $$0, $$1);
         this.c.put($$0, $$2);
         return $$2.d().thenRunAsync(() -> this.a($$0, (gof)$$2), gov::a);
      } else {
         return CompletableFuture.completedFuture(null);
      }
   }

   private static void a(Runnable $$0) {
      ffa.Q().execute(() -> RenderSystem.recordRenderCall($$0::run));
   }

   @Override
   public void e() {
      for (gow $$0 : this.d) {
         $$0.e();
      }
   }

   public void c(alb $$0) {
      gof $$1 = this.c.remove($$0);
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
   public CompletableFuture<Void> a(auf.a $$0, aul $$1, bnd $$2, bnd $$3, Executor $$4, Executor $$5) {
      CompletableFuture<Void> $$6 = new CompletableFuture<>();
      fnd.a(this, $$4).thenCompose($$0::a).thenAcceptAsync($$3x -> {
         gok.c();
         fcw.a(this.f);
         Iterator<Entry<alb, gof>> $$4x = this.c.entrySet().iterator();

         while ($$4x.hasNext()) {
            Entry<alb, gof> $$5x = $$4x.next();
            alb $$6x = $$5x.getKey();
            gof $$7 = $$5x.getValue();
            if ($$7 == gok.c() && !$$6x.equals(gok.b())) {
               $$4x.remove();
            } else {
               $$7.a(this, $$1, $$6x, $$5);
            }
         }

         ffa.Q().i(() -> $$6.complete(null));
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
         if ($$2 instanceof gog $$3) {
            try {
               $$3.a($$1, $$0);
            } catch (IOException var5) {
               b.error("Failed to dump texture {}", $$1, var5);
            }
         }
      });
   }
}
