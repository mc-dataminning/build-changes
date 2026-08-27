import com.google.common.collect.Lists;
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
import java.util.Optional;
import java.util.OptionalLong;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gpo implements AutoCloseable {
   private static final wu a = wu.c("resourcePack.server.name");
   private static final Pattern b = Pattern.compile("^[a-fA-F0-9]{40}$");
   static final Logger c = LogUtils.getLogger();
   private static final ate d = $$0 -> {
   };
   private static final ase e = new ase(true, asz.b.a, true);
   private static final gpq f = new gpq() {
      @Override
      public void a(UUID $$0, gpq.b $$1) {
         gpo.c.debug("Downloaded pack {} changed state to {}", $$0, $$1);
      }

      @Override
      public void a(UUID $$0, gpq.a $$1) {
         gpo.c.debug("Downloaded pack {} finished with state {}", $$0, $$1);
      }
   };
   final fde g;
   private ate h = d;
   @Nullable
   private gpr.a i;
   final gps j;
   private final ary k;
   private atd l = atd.f;
   gpq m = f;
   private int n;

   public gpo(fde $$0, Path $$1, fqr.d $$2) {
      this.g = $$0;

      try {
         this.k = new ary($$1);
      } catch (IOException var5) {
         throw new UncheckedIOException("Failed to open download queue in directory " + $$1, var5);
      }

      Executor $$4 = $$0::i;
      this.j = new gps(this.a(this.k, $$4, $$2.a, $$2.d), new gpq() {
         @Override
         public void a(UUID $$0, gpq.b $$1) {
            gpo.this.m.a($$0, $$1);
         }

         @Override
         public void a(UUID $$0, gpq.a $$1) {
            gpo.this.m.a($$0, $$1);
         }
      }, this.j(), this.a($$4), gps.c.a);
   }

   axq.a a(final int $$0) {
      return new axq.a() {
         private final fhm.a c = new fhm.a();
         private wu d = wu.i();
         @Nullable
         private wu e = null;
         private int f;
         private int g;
         private OptionalLong h = OptionalLong.empty();

         private void b() {
            fhm.b(gpo.this.g.aA(), this.c, this.d, this.e);
         }

         private void b(long $$0x) {
            if (this.h.isPresent()) {
               this.e = wu.a("download.pack.progress.percent", $$0 * 100L / this.h.getAsLong());
            } else {
               this.e = wu.a("download.pack.progress.bytes", eyj.b($$0));
            }

            this.b();
         }

         @Override
         public void a() {
            this.f++;
            this.d = wu.a("download.pack.title", this.f, $$0);
            this.b();
            gpo.c.debug("Starting pack {}/{} download", this.f, $$0);
         }

         @Override
         public void a(OptionalLong $$0x) {
            gpo.c.debug("File size = {} bytes", $$0);
            this.h = $$0;
            this.b(0L);
         }

         @Override
         public void a(long $$0x) {
            gpo.c.debug("Progress for pack {}: {} bytes", this.f, $$0);
            this.b($$0);
         }

         @Override
         public void a(boolean $$0x) {
            if (!$$0) {
               gpo.c.info("Pack {} failed to download", this.f);
               this.g++;
            } else {
               gpo.c.debug("Download ended for pack {}", this.f);
            }

            if (this.f == $$0) {
               if (this.g > 0) {
                  this.d = wu.a("download.pack.failed", this.g, $$0);
                  this.e = null;
                  this.b();
               } else {
                  fhm.a(gpo.this.g.aA(), this.c);
               }
            }
         }
      };
   }

   private gpp a(final ary $$0, final Executor $$1, final fdt $$2, final Proxy $$3) {
      return new gpp() {
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
               String.valueOf($$0.a(asf.a)),
               "User-Agent",
               "Minecraft Java/" + $$0.c()
            );
         }

         @Override
         public void a(Map<UUID, ary.c> $$0x, Consumer<ary.b> $$1x) {
            $$0.a(new ary.a(g, 262144000, this.a(), $$3, gpo.this.a($$0.size())), $$0).thenAcceptAsync($$1, $$1);
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
               gpo.this.j.e();
            }

            this.c = false;
         }
      };
   }

   private gpr j() {
      return this::a;
   }

   @Nullable
   private List<asz> a(List<gpr.b> $$0) {
      List<asz> $$1 = new ArrayList<>($$0.size());

      for (gpr.b $$2 : Lists.reverse($$0)) {
         String $$3 = String.format(Locale.ROOT, "server/%08X/%s", this.n++, $$2.a());
         Path $$4 = $$2.b();
         asc $$5 = new asc($$3, a, this.l, Optional.empty());
         asz.c $$6 = new asa.a($$4);
         int $$7 = aa.b().a(asf.a);
         asz.a $$8 = asz.a($$5, $$6, $$7);
         if ($$8 == null) {
            c.warn("Invalid pack metadata in {}, ignoring all", $$4);
            return null;
         }

         $$1.add(new asz($$5, $$6, $$8, e));
      }

      return $$1;
   }

   public ate a() {
      return $$0 -> this.h.loadPacks($$0);
   }

   private static ate b(List<asz> $$0) {
      return $$0.isEmpty() ? d : $$0::forEach;
   }

   private void a(gpr.a $$0) {
      this.i = $$0;
      List<gpr.b> $$1 = $$0.b();
      List<asz> $$2 = this.a($$1);
      if ($$2 == null) {
         $$0.a(false);
         List<gpr.b> $$3 = $$0.b();
         $$2 = this.a($$3);
         if ($$2 == null) {
            c.warn("Double failure in loading server packs");
            $$2 = List.of();
         }
      }

      this.h = b($$2);
      this.g.l();
   }

   public void b() {
      if (this.i != null) {
         this.i.a(false);
         List<asz> $$0 = this.a(this.i.b());
         if ($$0 == null) {
            c.warn("Double failure in loading server packs");
            $$0 = List.of();
         }

         this.h = b($$0);
      }
   }

   public void c() {
      if (this.i != null) {
         this.i.a(true);
         this.i = null;
         this.h = d;
      }
   }

   public void d() {
      if (this.i != null) {
         this.i.a();
         this.i = null;
      }
   }

   @Nullable
   private static HashCode a(@Nullable String $$0) {
      return $$0 != null && b.matcher($$0).matches() ? HashCode.fromString($$0.toLowerCase(Locale.ROOT)) : null;
   }

   public void a(UUID $$0, URL $$1, @Nullable String $$2) {
      HashCode $$3 = a($$2);
      this.j.a($$0, $$1, $$3);
   }

   public void a(UUID $$0, Path $$1) {
      this.j.a($$0, $$1);
   }

   public void a(UUID $$0) {
      this.j.a($$0);
   }

   public void e() {
      this.j.a();
   }

   private static gpq a(final vs $$0) {
      return new gpq() {
         @Override
         public void a(UUID $$0x, gpq.b $$1) {
            gpo.c.debug("Pack {} changed status to {}", $$0, $$1);

            zx.a $$2 = switch ($$1) {
               case a -> zx.a.d;
               case b -> zx.a.e;
            };
            $$0.a(new zx($$0, $$2));
         }

         @Override
         public void a(UUID $$0x, gpq.a $$1) {
            gpo.c.debug("Pack {} changed status to {}", $$0, $$1);

            zx.a $$2 = switch ($$1) {
               case b -> zx.a.a;
               case d -> zx.a.c;
               case a -> zx.a.b;
               case c -> zx.a.h;
               case e -> zx.a.g;
            };
            $$0.a(new zx($$0, $$2));
         }
      };
   }

   public void a(vs $$0, gps.c $$1) {
      this.l = atd.f;
      this.m = a($$0);
      switch ($$1) {
         case b:
            this.j.b();
            break;
         case c:
            this.j.c();
            break;
         case a:
            this.j.d();
      }
   }

   public void f() {
      this.l = atd.e;
      this.m = f;
      this.j.b();
   }

   public void g() {
      this.j.b();
   }

   public void h() {
      this.j.c();
   }

   public CompletableFuture<Void> b(final UUID $$0) {
      final CompletableFuture<Void> $$1 = new CompletableFuture<>();
      final gpq $$2 = this.m;
      this.m = new gpq() {
         @Override
         public void a(UUID $$0x, gpq.b $$1x) {
            $$2.a($$0, $$1);
         }

         @Override
         public void a(UUID $$0x, gpq.a $$1x) {
            if ($$0.equals($$0)) {
               gpo.this.m = $$2;
               if ($$1 == gpq.a.b) {
                  $$1.complete(null);
               } else {
                  $$1.completeExceptionally(new IllegalStateException("Failed to apply pack " + $$0 + ", reason: " + $$1));
               }
            }

            $$2.a($$0, $$1);
         }
      };
      return $$1;
   }

   public void i() {
      this.j.a();
      this.m = f;
      this.j.d();
   }

   @Override
   public void close() throws IOException {
      this.k.close();
   }
}
