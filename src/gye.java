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

public class gye implements auu, gyf, AutoCloseable {
   private static final Logger b = LogUtils.getLogger();
   public static final ali a = ali.b("");
   private final Map<ali, gxo> c = Maps.newHashMap();
   private final Set<gyf> d = Sets.newHashSet();
   private final Map<String, Integer> e = Maps.newHashMap();
   private final avb f;

   public gye(avb $$0) {
      this.f = $$0;
   }

   public void a(ali $$0, gxo $$1) {
      $$1 = this.d($$0, $$1);
      gxo $$2 = this.c.put($$0, $$1);
      if ($$2 != $$1) {
         if ($$2 != null && $$2 != gxt.c()) {
            this.c($$0, $$2);
         }

         if ($$1 instanceof gyf) {
            this.d.add((gyf)$$1);
         }
      }
   }

   private void c(ali $$0, gxo $$1) {
      if ($$1 != gxt.c()) {
         this.d.remove($$1);

         try {
            $$1.close();
         } catch (Exception var4) {
            b.warn("Failed to close texture {}", $$0, var4);
         }
      }

      $$1.b();
   }

   private gxo d(ali $$0, gxo $$1) {
      try {
         $$1.a(this.f);
         return $$1;
      } catch (IOException var6) {
         if ($$0 != a) {
            b.warn("Failed to load texture: {}", $$0, var6);
         }

         return gxt.c();
      } catch (Throwable var7) {
         o $$4 = o.a(var7, "Registering texture");
         p $$5 = $$4.a("Resource location being registered");
         $$5.a("Resource location", $$0);
         $$5.a("Texture object class", () -> $$1.getClass().getName());
         throw new z($$4);
      }
   }

   public gxo a(ali $$0) {
      gxo $$1 = this.c.get($$0);
      if ($$1 == null) {
         $$1 = new gxw($$0);
         this.a($$0, $$1);
      }

      return $$1;
   }

   public gxo b(ali $$0, gxo $$1) {
      return this.c.getOrDefault($$0, $$1);
   }

   public ali a(String $$0, gxq $$1) {
      Integer $$2 = this.e.get($$0);
      if ($$2 == null) {
         $$2 = 1;
      } else {
         $$2 = $$2 + 1;
      }

      this.e.put($$0, $$2);
      ali $$3 = ali.b(String.format(Locale.ROOT, "dynamic/%s_%d", $$0, $$2));
      this.a($$3, $$1);
      return $$3;
   }

   public CompletableFuture<Void> a(ali $$0, Executor $$1) {
      if (!this.c.containsKey($$0)) {
         gxv $$2 = new gxv(this.f, $$0, $$1);
         this.c.put($$0, $$2);
         return $$2.e().thenRunAsync(() -> this.a($$0, (gxo)$$2), gye::a);
      } else {
         return CompletableFuture.completedFuture(null);
      }
   }

   private static void a(Runnable $$0) {
      fji.Q().execute(() -> RenderSystem.recordRenderCall($$0::run));
   }

   @Override
   public void f() {
      for (gyf $$0 : this.d) {
         $$0.f();
      }
   }

   public void b(ali $$0) {
      gxo $$1 = this.c.remove($$0);
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
   public CompletableFuture<Void> a(auu.a $$0, avb $$1, Executor $$2, Executor $$3) {
      CompletableFuture<Void> $$4 = new CompletableFuture<>();
      frc.a(this, $$2).thenCompose($$0::a).thenAcceptAsync($$3x -> {
         gxt.c();
         fgl.a(this.f);
         Iterator<Entry<ali, gxo>> $$4x = this.c.entrySet().iterator();

         while ($$4x.hasNext()) {
            Entry<ali, gxo> $$5 = $$4x.next();
            ali $$6 = $$5.getKey();
            gxo $$7 = $$5.getValue();
            if ($$7 == gxt.c() && !$$6.equals(gxt.b())) {
               $$4x.remove();
            } else {
               $$7.a(this, $$1, $$6, $$3);
            }
         }

         fji.Q().a_(() -> $$4.complete(null));
      }, $$0x -> RenderSystem.recordRenderCall($$0x::run));
      return $$4;
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
         if ($$2 instanceof gxp $$3) {
            try {
               $$3.a($$1, $$0);
            } catch (IOException var5) {
               b.error("Failed to dump texture {}", $$1, var5);
            }
         }
      });
   }
}
