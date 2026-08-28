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

public class hek implements auj, hel, AutoCloseable {
   private static final Logger b = LogUtils.getLogger();
   public static final aku a = aku.b("");
   private final Map<aku, hdu> c = Maps.newHashMap();
   private final Set<hel> d = Sets.newHashSet();
   private final Map<String, Integer> e = Maps.newHashMap();
   private final aup f;

   public hek(aup $$0) {
      this.f = $$0;
   }

   public void a(aku $$0, hdu $$1) {
      $$1 = this.d($$0, $$1);
      hdu $$2 = this.c.put($$0, $$1);
      if ($$2 != $$1) {
         if ($$2 != null && $$2 != hdz.c()) {
            this.c($$0, $$2);
         }

         if ($$1 instanceof hel) {
            this.d.add((hel)$$1);
         }
      }
   }

   private void c(aku $$0, hdu $$1) {
      if ($$1 != hdz.c()) {
         this.d.remove($$1);

         try {
            $$1.close();
         } catch (Exception var4) {
            b.warn("Failed to close texture {}", $$0, var4);
         }
      }

      $$1.b();
   }

   private hdu d(aku $$0, hdu $$1) {
      try {
         $$1.a(this.f);
         return $$1;
      } catch (IOException var6) {
         if ($$0 != a) {
            b.warn("Failed to load texture: {}", $$0, var6);
         }

         return hdz.c();
      } catch (Throwable var7) {
         o $$4 = o.a(var7, "Registering texture");
         p $$5 = $$4.a("Resource location being registered");
         $$5.a("Resource location", $$0);
         $$5.a("Texture object class", () -> $$1.getClass().getName());
         throw new z($$4);
      }
   }

   public hdu a(aku $$0) {
      hdu $$1 = this.c.get($$0);
      if ($$1 == null) {
         $$1 = new hec($$0);
         this.a($$0, $$1);
      }

      return $$1;
   }

   public hdu b(aku $$0, hdu $$1) {
      return this.c.getOrDefault($$0, $$1);
   }

   public aku a(String $$0, hdw $$1) {
      Integer $$2 = this.e.get($$0);
      if ($$2 == null) {
         $$2 = 1;
      } else {
         $$2 = $$2 + 1;
      }

      this.e.put($$0, $$2);
      aku $$3 = aku.b(String.format(Locale.ROOT, "dynamic/%s_%d", $$0, $$2));
      this.a($$3, $$1);
      return $$3;
   }

   public CompletableFuture<Void> a(aku $$0, Executor $$1) {
      if (!this.c.containsKey($$0)) {
         heb $$2 = new heb(this.f, $$0, $$1);
         this.c.put($$0, $$2);
         return $$2.e().thenRunAsync(() -> this.a($$0, (hdu)$$2), hek::a);
      } else {
         return CompletableFuture.completedFuture(null);
      }
   }

   private static void a(Runnable $$0) {
      flj.Q().execute(() -> RenderSystem.recordRenderCall($$0::run));
   }

   @Override
   public void f() {
      for (hel $$0 : this.d) {
         $$0.f();
      }
   }

   public void b(aku $$0) {
      hdu $$1 = this.c.remove($$0);
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
   public CompletableFuture<Void> a(auj.a $$0, aup $$1, Executor $$2, Executor $$3) {
      CompletableFuture<Void> $$4 = new CompletableFuture<>();
      fum.a(this, $$2).thenCompose($$0::a).thenAcceptAsync($$3x -> {
         hdz.c();
         fip.a(this.f);
         Iterator<Entry<aku, hdu>> $$4x = this.c.entrySet().iterator();

         while ($$4x.hasNext()) {
            Entry<aku, hdu> $$5 = $$4x.next();
            aku $$6 = $$5.getKey();
            hdu $$7 = $$5.getValue();
            if ($$7 == hdz.c() && !$$6.equals(hdz.b())) {
               $$4x.remove();
            } else {
               $$7.a(this, $$1, $$6, $$3);
            }
         }

         flj.Q().a_(() -> $$4.complete(null));
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
         if ($$2 instanceof hdv $$3) {
            try {
               $$3.a($$1, $$0);
            } catch (IOException var5) {
               b.error("Failed to dump texture {}", $$1, var5);
            }
         }
      });
   }
}
