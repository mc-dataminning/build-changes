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

public class gny implements AutoCloseable {
   private static final wg a = wg.c("resourcePack.server.name");
   private static final Pattern b = Pattern.compile("^[a-fA-F0-9]{40}$");
   static final Logger c = LogUtils.getLogger();
   private static final asp d = $$0 -> {
   };
   private static final arp e = new arp(true, ask.b.a, true);
   private static final goa f = new goa() {
      @Override
      public void a(UUID $$0, goa.b $$1) {
         gny.c.debug("Downloaded pack {} changed state to {}", $$0, $$1);
      }

      @Override
      public void a(UUID $$0, goa.a $$1) {
         gny.c.debug("Downloaded pack {} finished with state {}", $$0, $$1);
      }
   };
   final fbp g;
   private asp h = d;
   @Nullable
   private gob.a i;
   final goc j;
   private final arj k;
   private aso l = aso.f;
   goa m = f;
   private int n;

   public gny(fbp $$0, Path $$1, fpc.d $$2) {
      this.g = $$0;

      try {
         this.k = new arj($$1);
      } catch (IOException var5) {
         throw new UncheckedIOException("Failed to open download queue in directory " + $$1, var5);
      }

      Executor $$4 = $$0::i;
      this.j = new goc(this.a(this.k, $$4, $$2.a, $$2.d), new goa() {
         @Override
         public void a(UUID $$0, goa.b $$1) {
            gny.this.m.a($$0, $$1);
         }

         @Override
         public void a(UUID $$0, goa.a $$1) {
            gny.this.m.a($$0, $$1);
         }
      }, this.j(), this.a($$4), goc.c.a);
   }

   axb.a a(final int $$0) {
      return new axb.a() {
         private final ffx.a c = new ffx.a();
         private wg d = wg.i();
         @Nullable
         private wg e = null;
         private int f;
         private int g;
         private OptionalLong h = OptionalLong.empty();

         private void b() {
            ffx.b(gny.this.g.aA(), this.c, this.d, this.e);
         }

         private void b(long $$0x) {
            if (this.h.isPresent()) {
               this.e = wg.a("download.pack.progress.percent", $$0 * 100L / this.h.getAsLong());
            } else {
               this.e = wg.a("download.pack.progress.bytes", ewu.b($$0));
            }

            this.b();
         }

         @Override
         public void a() {
            this.f++;
            this.d = wg.a("download.pack.title", this.f, $$0);
            this.b();
            gny.c.debug("Starting pack {}/{} download", this.f, $$0);
         }

         @Override
         public void a(OptionalLong $$0x) {
            gny.c.debug("File size = {} bytes", $$0);
            this.h = $$0;
            this.b(0L);
         }

         @Override
         public void a(long $$0x) {
            gny.c.debug("Progress for pack {}: {} bytes", this.f, $$0);
            this.b($$0);
         }

         @Override
         public void a(boolean $$0x) {
            if (!$$0) {
               gny.c.info("Pack {} failed to download", this.f);
               this.g++;
            } else {
               gny.c.debug("Download ended for pack {}", this.f);
            }

            if (this.f == $$0) {
               if (this.g > 0) {
                  this.d = wg.a("download.pack.failed", this.g, $$0);
                  this.e = null;
                  this.b();
               } else {
                  ffx.a(gny.this.g.aA(), this.c);
               }
            }
         }
      };
   }

   private gnz a(final arj $$0, final Executor $$1, final fce $$2, final Proxy $$3) {
      return new gnz() {
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
               String.valueOf($$0.a(arq.a)),
               "User-Agent",
               "Minecraft Java/" + $$0.c()
            );
         }

         @Override
         public void a(Map<UUID, arj.c> $$0x, Consumer<arj.b> $$1x) {
            $$0.a(new arj.a(g, 262144000, this.a(), $$3, gny.this.a($$0.size())), $$0).thenAcceptAsync($$1, $$1);
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
               gny.this.j.e();
            }

            this.c = false;
         }
      };
   }

   private gob j() {
      return this::a;
   }

   @Nullable
   private List<ask> a(List<gob.b> $$0) {
      List<ask> $$1 = new ArrayList<>($$0.size());

      for (gob.b $$2 : Lists.reverse($$0)) {
         String $$3 = String.format(Locale.ROOT, "server/%08X/%s", this.n++, $$2.a());
         Path $$4 = $$2.b();
         arn $$5 = new arn($$3, a, this.l, Optional.empty());
         ask.c $$6 = new arl.a($$4);
         int $$7 = aa.b().a(arq.a);
         ask.a $$8 = ask.a($$5, $$6, $$7);
         if ($$8 == null) {
            c.warn("Invalid pack metadata in {}, ignoring all", $$4);
            return null;
         }

         $$1.add(new ask($$5, $$6, $$8, e));
      }

      return $$1;
   }

   public asp a() {
      return $$0 -> this.h.loadPacks($$0);
   }

   private static asp b(List<ask> $$0) {
      return $$0.isEmpty() ? d : $$0::forEach;
   }

   private void a(gob.a $$0) {
      this.i = $$0;
      List<gob.b> $$1 = $$0.b();
      List<ask> $$2 = this.a($$1);
      if ($$2 == null) {
         $$0.a(false);
         List<gob.b> $$3 = $$0.b();
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
         List<ask> $$0 = this.a(this.i.b());
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

   private static goa a(final ve $$0) {
      return new goa() {
         @Override
         public void a(UUID $$0x, goa.b $$1) {
            gny.c.debug("Pack {} changed status to {}", $$0, $$1);

            zj.a $$2 = switch ($$1) {
               case a -> zj.a.d;
               case b -> zj.a.e;
            };
            $$0.a(new zj($$0, $$2));
         }

         @Override
         public void a(UUID $$0x, goa.a $$1) {
            gny.c.debug("Pack {} changed status to {}", $$0, $$1);

            zj.a $$2 = switch ($$1) {
               case b -> zj.a.a;
               case d -> zj.a.c;
               case a -> zj.a.b;
               case c -> zj.a.h;
               case e -> zj.a.g;
            };
            $$0.a(new zj($$0, $$2));
         }
      };
   }

   public void a(ve $$0, goc.c $$1) {
      this.l = aso.f;
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
      this.l = aso.e;
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
      final goa $$2 = this.m;
      this.m = new goa() {
         @Override
         public void a(UUID $$0x, goa.b $$1x) {
            $$2.a($$0, $$1);
         }

         @Override
         public void a(UUID $$0x, goa.a $$1x) {
            if ($$0.equals($$0)) {
               gny.this.m = $$2;
               if ($$1 == goa.a.b) {
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
