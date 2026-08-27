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

public class gca implements apf, gcb, AutoCloseable {
   private static final Logger b = LogUtils.getLogger();
   public static final agm a = new agm("");
   private final Map<agm, gbk> c = Maps.newHashMap();
   private final Set<gcb> d = Sets.newHashSet();
   private final Map<String, Integer> e = Maps.newHashMap();
   private final apl f;

   public gca(apl $$0) {
      this.f = $$0;
   }

   public void a(agm $$0) {
      if (!RenderSystem.isOnRenderThread()) {
         RenderSystem.recordRenderCall(() -> this.d($$0));
      } else {
         this.d($$0);
      }
   }

   private void d(agm $$0) {
      gbk $$1 = this.c.get($$0);
      if ($$1 == null) {
         $$1 = new gbs($$0);
         this.a($$0, $$1);
      }

      $$1.c();
   }

   public void a(agm $$0, gbk $$1) {
      $$1 = this.d($$0, $$1);
      gbk $$2 = this.c.put($$0, $$1);
      if ($$2 != $$1) {
         if ($$2 != null && $$2 != gbp.c()) {
            this.c($$0, $$2);
         }

         if ($$1 instanceof gcb) {
            this.d.add((gcb)$$1);
         }
      }
   }

   private void c(agm $$0, gbk $$1) {
      if ($$1 != gbp.c()) {
         this.d.remove($$1);

         try {
            $$1.close();
         } catch (Exception var4) {
            b.warn("Failed to close texture {}", $$0, var4);
         }
      }

      $$1.b();
   }

   private gbk d(agm $$0, gbk $$1) {
      try {
         $$1.a(this.f);
         return $$1;
      } catch (IOException var6) {
         if ($$0 != a) {
            b.warn("Failed to load texture: {}", $$0, var6);
         }

         return gbp.c();
      } catch (Throwable var7) {
         o $$4 = o.a(var7, "Registering texture");
         p $$5 = $$4.a("Resource location being registered");
         $$5.a("Resource location", $$0);
         $$5.a("Texture object class", () -> $$1.getClass().getName());
         throw new y($$4);
      }
   }

   public gbk b(agm $$0) {
      gbk $$1 = this.c.get($$0);
      if ($$1 == null) {
         $$1 = new gbs($$0);
         this.a($$0, $$1);
      }

      return $$1;
   }

   public gbk b(agm $$0, gbk $$1) {
      return this.c.getOrDefault($$0, $$1);
   }

   public agm a(String $$0, gbm $$1) {
      Integer $$2 = this.e.get($$0);
      if ($$2 == null) {
         $$2 = 1;
      } else {
         $$2 = $$2 + 1;
      }

      this.e.put($$0, $$2);
      agm $$3 = new agm(String.format(Locale.ROOT, "dynamic/%s_%d", $$0, $$2));
      this.a($$3, $$1);
      return $$3;
   }

   public CompletableFuture<Void> a(agm $$0, Executor $$1) {
      if (!this.c.containsKey($$0)) {
         gbr $$2 = new gbr(this.f, $$0, $$1);
         this.c.put($$0, $$2);
         return $$2.d().thenRunAsync(() -> this.a($$0, (gbk)$$2), gca::a);
      } else {
         return CompletableFuture.completedFuture(null);
      }
   }

   private static void a(Runnable $$0) {
      eti.N().execute(() -> RenderSystem.recordRenderCall($$0::run));
   }

   @Override
   public void e() {
      for (gcb $$0 : this.d) {
         $$0.e();
      }
   }

   public void c(agm $$0) {
      gbk $$1 = this.c.remove($$0);
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
   public CompletableFuture<Void> a(apf.a $$0, apl $$1, bfs $$2, bfs $$3, Executor $$4, Executor $$5) {
      CompletableFuture<Void> $$6 = new CompletableFuture<>();
      fbe.a(this, $$4).thenCompose($$0::a).thenAcceptAsync($$3x -> {
         gbp.c();
         ere.a(this.f);
         Iterator<Entry<agm, gbk>> $$4x = this.c.entrySet().iterator();

         while ($$4x.hasNext()) {
            Entry<agm, gbk> $$5x = $$4x.next();
            agm $$6x = $$5x.getKey();
            gbk $$7 = $$5x.getValue();
            if ($$7 == gbp.c() && !$$6x.equals(gbp.b())) {
               $$4x.remove();
            } else {
               $$7.a(this, $$1, $$6x, $$5);
            }
         }

         eti.N().i(() -> $$6.complete(null));
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
         if ($$2 instanceof gbl $$3) {
            try {
               $$3.a($$1, $$0);
            } catch (IOException var5) {
               b.error("Failed to dump texture {}", $$1, var5);
            }
         }
      });
   }
}
