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

public class hbk implements avp, hbl, AutoCloseable {
   private static final Logger b = LogUtils.getLogger();
   public static final alz a = alz.b("");
   private final Map<alz, hau> c = Maps.newHashMap();
   private final Set<hbl> d = Sets.newHashSet();
   private final Map<String, Integer> e = Maps.newHashMap();
   private final avv f;

   public hbk(avv $$0) {
      this.f = $$0;
   }

   public void a(alz $$0, hau $$1) {
      $$1 = this.d($$0, $$1);
      hau $$2 = this.c.put($$0, $$1);
      if ($$2 != $$1) {
         if ($$2 != null && $$2 != haz.c()) {
            this.c($$0, $$2);
         }

         if ($$1 instanceof hbl) {
            this.d.add((hbl)$$1);
         }
      }
   }

   private void c(alz $$0, hau $$1) {
      if ($$1 != haz.c()) {
         this.d.remove($$1);

         try {
            $$1.close();
         } catch (Exception var4) {
            b.warn("Failed to close texture {}", $$0, var4);
         }
      }

      $$1.b();
   }

   private hau d(alz $$0, hau $$1) {
      try {
         $$1.a(this.f);
         return $$1;
      } catch (IOException var6) {
         if ($$0 != a) {
            b.warn("Failed to load texture: {}", $$0, var6);
         }

         return haz.c();
      } catch (Throwable var7) {
         o $$4 = o.a(var7, "Registering texture");
         p $$5 = $$4.a("Resource location being registered");
         $$5.a("Resource location", $$0);
         $$5.a("Texture object class", () -> $$1.getClass().getName());
         throw new z($$4);
      }
   }

   public hau a(alz $$0) {
      hau $$1 = this.c.get($$0);
      if ($$1 == null) {
         $$1 = new hbc($$0);
         this.a($$0, $$1);
      }

      return $$1;
   }

   public hau b(alz $$0, hau $$1) {
      return this.c.getOrDefault($$0, $$1);
   }

   public alz a(String $$0, haw $$1) {
      Integer $$2 = this.e.get($$0);
      if ($$2 == null) {
         $$2 = 1;
      } else {
         $$2 = $$2 + 1;
      }

      this.e.put($$0, $$2);
      alz $$3 = alz.b(String.format(Locale.ROOT, "dynamic/%s_%d", $$0, $$2));
      this.a($$3, $$1);
      return $$3;
   }

   public CompletableFuture<Void> a(alz $$0, Executor $$1) {
      if (!this.c.containsKey($$0)) {
         hbb $$2 = new hbb(this.f, $$0, $$1);
         this.c.put($$0, $$2);
         return $$2.e().thenRunAsync(() -> this.a($$0, (hau)$$2), hbk::a);
      } else {
         return CompletableFuture.completedFuture(null);
      }
   }

   private static void a(Runnable $$0) {
      fme.Q().execute(() -> RenderSystem.recordRenderCall($$0::run));
   }

   @Override
   public void f() {
      for (hbl $$0 : this.d) {
         $$0.f();
      }
   }

   public void b(alz $$0) {
      hau $$1 = this.c.remove($$0);
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
   public CompletableFuture<Void> a(avp.a $$0, avv $$1, Executor $$2, Executor $$3) {
      CompletableFuture<Void> $$4 = new CompletableFuture<>();
      fty.a(this, $$2).thenCompose($$0::a).thenAcceptAsync($$3x -> {
         haz.c();
         fjl.a(this.f);
         Iterator<Entry<alz, hau>> $$4x = this.c.entrySet().iterator();

         while ($$4x.hasNext()) {
            Entry<alz, hau> $$5 = $$4x.next();
            alz $$6 = $$5.getKey();
            hau $$7 = $$5.getValue();
            if ($$7 == haz.c() && !$$6.equals(haz.b())) {
               $$4x.remove();
            } else {
               $$7.a(this, $$1, $$6, $$3);
            }
         }

         fme.Q().a_(() -> $$4.complete(null));
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
         if ($$2 instanceof hav $$3) {
            try {
               $$3.a($$1, $$0);
            } catch (IOException var5) {
               b.error("Failed to dump texture {}", $$1, var5);
            }
         }
      });
   }
}
