import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;
import com.mojang.logging.LogUtils;
import com.mojang.util.UndashedUuid;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.net.Proxy;
import java.net.URL;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.OptionalLong;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ghb implements AutoCloseable {
   private static final vf a = vf.c("resourcePack.server.name");
   private static final Pattern b = Pattern.compile("^[a-fA-F0-9]{40}$");
   static final Logger c = LogUtils.getLogger();
   private static final apu d = $$0 -> {
   };
   private static final ghd e = ($$0, $$1) -> c.debug("Downloaded pack {} changed state to {}", $$0, $$1);
   final evh f;
   private apu g = d;
   @Nullable
   private ghe.a h;
   final ghf i;
   private final aor j;
   private apt k = apt.f;
   private ghd l = e;

   public ghb(evh $$0, Path $$1, fio.d $$2) {
      this.f = $$0;

      try {
         this.j = new aor($$1);
      } catch (IOException var5) {
         throw new UncheckedIOException("Failed to open download queue in directory " + $$1, var5);
      }

      Executor $$4 = $$0::i;
      this.i = new ghf(this.a(this.j, $$4, $$2.a, $$2.d), ($$0x, $$1x) -> this.l.sendResponse($$0x, $$1x), this.j(), this.a($$4), ghf.c.a);
   }

   aue.a a(final int $$0) {
      return new aue.a() {
         private final ezm.a c = new ezm.a(10000L);
         private vf d = vf.i();
         @Nullable
         private vf e = null;
         private int f;
         private OptionalLong g = OptionalLong.empty();

         private void c() {
            ezm.b(ghb.this.f.ay(), this.c, this.d, this.e);
         }

         private void b(long $$0x) {
            if (this.g.isPresent()) {
               this.e = vf.a("download.pack.progress.percent", $$0 * 100L / this.g.getAsLong());
            } else {
               this.e = vf.a("download.pack.progress.bytes", eqm.b($$0));
            }

            this.c();
         }

         @Override
         public void a() {
            this.f++;
            this.d = vf.a("download.pack.title", this.f, $$0);
            this.c();
            ghb.c.debug("Starting pack {}/{} download", this.f, $$0);
         }

         @Override
         public void a(OptionalLong $$0x) {
            ghb.c.debug("File size = {} bytes", $$0);
            this.g = $$0;
            this.b(0L);
         }

         @Override
         public void a(long $$0x) {
            ghb.c.debug("Progress for pack {}: {} bytes", this.f, $$0);
            this.b($$0);
         }

         @Override
         public void b() {
            ghb.c.debug("Download ended for pack {}", this.f);
            if (this.f == $$0) {
               ezm.a(ghb.this.f.ay(), this.c);
            }
         }
      };
   }

   private ghc a(final aor $$0, final Executor $$1, final evw $$2, final Proxy $$3) {
      return new ghc() {
         private static final int f = 262144000;
         private static final HashFunction g = Hashing.sha1();

         private Map<String, String> a() {
            ad $$0 = aa.b();
            return Map.of(
               "X-Minecraft-Username",
               $$2.c(),
               "X-Minecraft-UUID",
               UndashedUuid.toString($$2.b()),
               "X-Minecraft-Version",
               $$0.c(),
               "X-Minecraft-Version-ID",
               $$0.b(),
               "X-Minecraft-Pack-Format",
               String.valueOf($$0.a(aow.a)),
               "User-Agent",
               "Minecraft Java/" + $$0.c()
            );
         }

         @Override
         public void a(Map<UUID, aor.c> $$0x, Consumer<aor.b> $$1x) {
            $$0.a(new aor.a(g, 262144000, this.a(), $$3, ghb.this.a($$0.size())), $$0).thenAcceptAsync($$1, $$1);
         }
      };
   }

   private Runnable a(final Executor $$0) {
      return new Runnable() {
         private boolean c;
         private boolean d;

         @Override
         public void run() {
            this.d = true;
            if (!this.c) {
               this.c = true;
               $$0.execute(this::a);
            }
         }

         private void a() {
            while (this.d) {
               this.d = false;
               ghb.this.i.e();
            }

            this.c = false;
         }
      };
   }

   private ghe j() {
      return this::a;
   }

   @Nullable
   private List<app> a(List<ghe.b> $$0) {
      List<app> $$1 = new ArrayList<>($$0.size());

      for (ghe.b $$2 : $$0) {
         String $$3 = "server/" + $$2.a();
         Path $$4 = $$2.b();
         app.c $$5 = new aot.a($$4, false);
         int $$6 = aa.b().a(aow.a);
         app.a $$7 = app.a($$3, $$5, $$6);
         if ($$7 == null) {
            c.warn("Invalid pack metadata in {}, ignoring all", $$4);
            return null;
         }

         $$1.add(app.a($$3, a, true, $$5, $$7, app.b.a, true, this.k));
      }

      return $$1;
   }

   public apu a() {
      return $$0 -> this.g.loadPacks($$0);
   }

   private static apu b(List<app> $$0) {
      return $$0.isEmpty() ? d : $$0::forEach;
   }

   private void a(ghe.a $$0) {
      this.h = $$0;
      List<ghe.b> $$1 = $$0.b();
      List<app> $$2 = this.a($$1);
      if ($$2 == null) {
         $$0.a(false);
         List<ghe.b> $$3 = $$0.b();
         $$2 = this.a($$3);
         if ($$2 == null) {
            c.warn("Double failure in loading server packs");
            $$2 = List.of();
         }
      }

      this.g = b($$2);
      this.f.k();
   }

   public void b() {
      if (this.h != null) {
         this.h.a(false);
         List<app> $$0 = this.a(this.h.b());
         if ($$0 == null) {
            c.warn("Double failure in loading server packs");
            $$0 = List.of();
         }

         this.g = b($$0);
      }
   }

   public void c() {
      if (this.h != null) {
         this.h.a(true);
         this.h = null;
         this.g = d;
      }
   }

   public void d() {
      if (this.h != null) {
         this.h.a();
         this.h = null;
      }
   }

   @Nullable
   private static HashCode a(@Nullable String $$0) {
      return $$0 != null && b.matcher($$0).matches() ? HashCode.fromString($$0.toLowerCase(Locale.ROOT)) : null;
   }

   public void a(UUID $$0, URL $$1, @Nullable String $$2) {
      HashCode $$3 = a($$2);
      this.i.a($$0, $$1, $$3);
   }

   public void a(UUID $$0, Path $$1) {
      this.i.a($$0, $$1);
   }

   public void a(UUID $$0) {
      this.i.a($$0);
   }

   public void e() {
      this.i.a();
   }

   private static ghd a(ug $$0) {
      return ($$1, $$2) -> {
         c.debug("Pack {} changed status to {}", $$1, $$2);

         xv.a $$3 = switch ($$2) {
            case a -> xv.a.d;
            case c -> xv.a.a;
            case e -> xv.a.c;
            case b -> xv.a.b;
            case d -> xv.a.g;
            case f -> xv.a.f;
         };
         $$0.a(new xv($$1, $$3));
      };
   }

   public void a(ug $$0, ghf.c $$1) {
      this.k = apt.f;
      this.l = a($$0);
      switch ($$1) {
         case b:
            this.i.b();
            break;
         case c:
            this.i.c();
            break;
         case a:
            this.i.d();
      }
   }

   public void f() {
      this.k = apt.e;
      this.l = e;
      this.i.b();
   }

   public void g() {
      this.i.b();
   }

   public void h() {
      this.i.c();
   }

   public CompletableFuture<Void> b(UUID $$0) {
      CompletableFuture<Void> $$1 = new CompletableFuture<>();
      ghd $$2 = this.l;
      this.l = ($$3, $$4) -> {
         if ($$0.equals($$3)) {
            if ($$4 == ghd.a.a) {
               $$2.sendResponse($$3, $$4);
               return;
            }

            this.l = $$2;
            if ($$4 == ghd.a.c) {
               $$1.complete(null);
            } else {
               $$1.completeExceptionally(new IllegalStateException("Failed to apply pack " + $$3 + ", reason: " + $$4));
            }

            $$2.sendResponse($$3, $$4);
         }
      };
      return $$1;
   }

   public void i() {
      this.i.a();
      this.l = e;
      this.i.d();
   }

   @Override
   public void close() throws IOException {
      this.j.close();
   }
}
