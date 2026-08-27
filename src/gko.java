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
import java.util.OptionalLong;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gko implements AutoCloseable {
   private static final vs a = vs.c("resourcePack.server.name");
   private static final Pattern b = Pattern.compile("^[a-fA-F0-9]{40}$");
   static final Logger c = LogUtils.getLogger();
   private static final ars d = $$0 -> {
   };
   private static final gkq e = new gkq() {
      @Override
      public void a(UUID $$0, gkq.b $$1) {
         gko.c.debug("Downloaded pack {} changed state to {}", $$0, $$1);
      }

      @Override
      public void a(UUID $$0, gkq.a $$1) {
         gko.c.debug("Downloaded pack {} finished with state {}", $$0, $$1);
      }
   };
   final eyk f;
   private ars g = d;
   @Nullable
   private gkr.a h;
   final gks i;
   private final aqp j;
   private arr k = arr.f;
   gkq l = e;
   private int m;

   public gko(eyk $$0, Path $$1, flv.d $$2) {
      this.f = $$0;

      try {
         this.j = new aqp($$1);
      } catch (IOException var5) {
         throw new UncheckedIOException("Failed to open download queue in directory " + $$1, var5);
      }

      Executor $$4 = $$0::i;
      this.i = new gks(this.a(this.j, $$4, $$2.a, $$2.d), new gkq() {
         @Override
         public void a(UUID $$0, gkq.b $$1) {
            gko.this.l.a($$0, $$1);
         }

         @Override
         public void a(UUID $$0, gkq.a $$1) {
            gko.this.l.a($$0, $$1);
         }
      }, this.j(), this.a($$4), gks.c.a);
   }

   awd.a a(final int $$0) {
      return new awd.a() {
         private final fcs.a c = new fcs.a();
         private vs d = vs.i();
         @Nullable
         private vs e = null;
         private int f;
         private int g;
         private OptionalLong h = OptionalLong.empty();

         private void b() {
            fcs.b(gko.this.f.ax(), this.c, this.d, this.e);
         }

         private void b(long $$0x) {
            if (this.h.isPresent()) {
               this.e = vs.a("download.pack.progress.percent", $$0 * 100L / this.h.getAsLong());
            } else {
               this.e = vs.a("download.pack.progress.bytes", etp.b($$0));
            }

            this.b();
         }

         @Override
         public void a() {
            this.f++;
            this.d = vs.a("download.pack.title", this.f, $$0);
            this.b();
            gko.c.debug("Starting pack {}/{} download", this.f, $$0);
         }

         @Override
         public void a(OptionalLong $$0x) {
            gko.c.debug("File size = {} bytes", $$0);
            this.h = $$0;
            this.b(0L);
         }

         @Override
         public void a(long $$0x) {
            gko.c.debug("Progress for pack {}: {} bytes", this.f, $$0);
            this.b($$0);
         }

         @Override
         public void a(boolean $$0x) {
            if (!$$0) {
               gko.c.info("Pack {} failed to download", this.f);
               this.g++;
            } else {
               gko.c.debug("Download ended for pack {}", this.f);
            }

            if (this.f == $$0) {
               if (this.g > 0) {
                  this.d = vs.a("download.pack.failed", this.g, $$0);
                  this.e = null;
                  this.b();
               } else {
                  fcs.a(gko.this.f.ax(), this.c);
               }
            }
         }
      };
   }

   private gkp a(final aqp $$0, final Executor $$1, final eyz $$2, final Proxy $$3) {
      return new gkp() {
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
               String.valueOf($$0.a(aqu.a)),
               "User-Agent",
               "Minecraft Java/" + $$0.c()
            );
         }

         @Override
         public void a(Map<UUID, aqp.c> $$0x, Consumer<aqp.b> $$1x) {
            $$0.a(new aqp.a(g, 262144000, this.a(), $$3, gko.this.a($$0.size())), $$0).thenAcceptAsync($$1, $$1);
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
               gko.this.i.e();
            }

            this.c = false;
         }
      };
   }

   private gkr j() {
      return this::a;
   }

   @Nullable
   private List<arn> a(List<gkr.b> $$0) {
      List<arn> $$1 = new ArrayList<>($$0.size());

      for (gkr.b $$2 : Lists.reverse($$0)) {
         String $$3 = String.format(Locale.ROOT, "server/%08X/%s", this.m++, $$2.a());
         Path $$4 = $$2.b();
         arn.c $$5 = new aqr.a($$4, false);
         int $$6 = aa.b().a(aqu.a);
         arn.a $$7 = arn.a($$3, $$5, $$6);
         if ($$7 == null) {
            c.warn("Invalid pack metadata in {}, ignoring all", $$4);
            return null;
         }

         $$1.add(arn.a($$3, a, true, $$5, $$7, arn.b.a, true, this.k));
      }

      return $$1;
   }

   public ars a() {
      return $$0 -> this.g.loadPacks($$0);
   }

   private static ars b(List<arn> $$0) {
      return $$0.isEmpty() ? d : $$0::forEach;
   }

   private void a(gkr.a $$0) {
      this.h = $$0;
      List<gkr.b> $$1 = $$0.b();
      List<arn> $$2 = this.a($$1);
      if ($$2 == null) {
         $$0.a(false);
         List<gkr.b> $$3 = $$0.b();
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
         List<arn> $$0 = this.a(this.h.b());
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

   private static gkq a(final uq $$0) {
      return new gkq() {
         @Override
         public void a(UUID $$0x, gkq.b $$1) {
            gko.c.debug("Pack {} changed status to {}", $$0, $$1);

            yv.a $$2 = switch ($$1) {
               case a -> yv.a.d;
               case b -> yv.a.e;
            };
            $$0.a(new yv($$0, $$2));
         }

         @Override
         public void a(UUID $$0x, gkq.a $$1) {
            gko.c.debug("Pack {} changed status to {}", $$0, $$1);

            yv.a $$2 = switch ($$1) {
               case b -> yv.a.a;
               case d -> yv.a.c;
               case a -> yv.a.b;
               case c -> yv.a.h;
               case e -> yv.a.g;
            };
            $$0.a(new yv($$0, $$2));
         }
      };
   }

   public void a(uq $$0, gks.c $$1) {
      this.k = arr.f;
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
      this.k = arr.e;
      this.l = e;
      this.i.b();
   }

   public void g() {
      this.i.b();
   }

   public void h() {
      this.i.c();
   }

   public CompletableFuture<Void> b(final UUID $$0) {
      final CompletableFuture<Void> $$1 = new CompletableFuture<>();
      final gkq $$2 = this.l;
      this.l = new gkq() {
         @Override
         public void a(UUID $$0x, gkq.b $$1x) {
            $$2.a($$0, $$1);
         }

         @Override
         public void a(UUID $$0x, gkq.a $$1x) {
            if ($$0.equals($$0)) {
               gko.this.l = $$2;
               if ($$1 == gkq.a.b) {
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
      this.i.a();
      this.l = e;
      this.i.d();
   }

   @Override
   public void close() throws IOException {
      this.j.close();
   }
}
