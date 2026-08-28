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

public class gry implements AutoCloseable {
   private static final wu a = wu.c("resourcePack.server.name");
   private static final Pattern b = Pattern.compile("^[a-fA-F0-9]{40}$");
   static final Logger c = LogUtils.getLogger();
   private static final ath d = $$0 -> {
   };
   private static final ash e = new ash(true, atc.b.a, true);
   private static final gsa f = new gsa() {
      @Override
      public void a(UUID $$0, gsa.b $$1) {
         gry.c.debug("Downloaded pack {} changed state to {}", $$0, $$1);
      }

      @Override
      public void a(UUID $$0, gsa.a $$1) {
         gry.c.debug("Downloaded pack {} finished with state {}", $$0, $$1);
      }
   };
   final ffn g;
   private ath h = d;
   @Nullable
   private gsb.a i;
   final gsc j;
   private final asb k;
   private atg l = atg.f;
   gsa m = f;
   private int n;

   public gry(ffn $$0, Path $$1, fsy.d $$2) {
      this.g = $$0;

      try {
         this.k = new asb($$1);
      } catch (IOException var5) {
         throw new UncheckedIOException("Failed to open download queue in directory " + $$1, var5);
      }

      Executor $$4 = $$0::i;
      this.j = new gsc(this.a(this.k, $$4, $$2.a, $$2.d), new gsa() {
         @Override
         public void a(UUID $$0, gsa.b $$1) {
            gry.this.m.a($$0, $$1);
         }

         @Override
         public void a(UUID $$0, gsa.a $$1) {
            gry.this.m.a($$0, $$1);
         }
      }, this.j(), this.a($$4), gsc.c.a);
   }

   axv.a a(final int $$0) {
      return new axv.a() {
         private final fju.a c = new fju.a();
         private wu d = wu.i();
         @Nullable
         private wu e = null;
         private int f;
         private int g;
         private OptionalLong h = OptionalLong.empty();

         private void b() {
            fju.b(gry.this.g.ax(), this.c, this.d, this.e);
         }

         private void b(long $$0x) {
            if (this.h.isPresent()) {
               this.e = wu.a("download.pack.progress.percent", $$0 * 100L / this.h.getAsLong());
            } else {
               this.e = wu.a("download.pack.progress.bytes", fas.b($$0));
            }

            this.b();
         }

         @Override
         public void a() {
            this.f++;
            this.d = wu.a("download.pack.title", this.f, $$0);
            this.b();
            gry.c.debug("Starting pack {}/{} download", this.f, $$0);
         }

         @Override
         public void a(OptionalLong $$0x) {
            gry.c.debug("File size = {} bytes", $$0);
            this.h = $$0;
            this.b(0L);
         }

         @Override
         public void a(long $$0x) {
            gry.c.debug("Progress for pack {}: {} bytes", this.f, $$0);
            this.b($$0);
         }

         @Override
         public void a(boolean $$0x) {
            if (!$$0) {
               gry.c.info("Pack {} failed to download", this.f);
               this.g++;
            } else {
               gry.c.debug("Download ended for pack {}", this.f);
            }

            if (this.f == $$0) {
               if (this.g > 0) {
                  this.d = wu.a("download.pack.failed", this.g, $$0);
                  this.e = null;
                  this.b();
               } else {
                  fju.a(gry.this.g.ax(), this.c);
               }
            }
         }
      };
   }

   private grz a(final asb $$0, final Executor $$1, final fgb $$2, final Proxy $$3) {
      return new grz() {
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
               String.valueOf($$0.a(asi.a)),
               "User-Agent",
               "Minecraft Java/" + $$0.c()
            );
         }

         @Override
         public void a(Map<UUID, asb.c> $$0x, Consumer<asb.b> $$1x) {
            $$0.a(new asb.a(g, 262144000, this.a(), $$3, gry.this.a($$0.size())), $$0).thenAcceptAsync($$1, $$1);
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
               gry.this.j.e();
            }

            this.c = false;
         }
      };
   }

   private gsb j() {
      return this::a;
   }

   @Nullable
   private List<atc> a(List<gsb.b> $$0) {
      List<atc> $$1 = new ArrayList<>($$0.size());

      for (gsb.b $$2 : Lists.reverse($$0)) {
         String $$3 = String.format(Locale.ROOT, "server/%08X/%s", this.n++, $$2.a());
         Path $$4 = $$2.b();
         asf $$5 = new asf($$3, a, this.l, Optional.empty());
         atc.c $$6 = new asd.a($$4);
         int $$7 = aa.b().a(asi.a);
         atc.a $$8 = atc.a($$5, $$6, $$7);
         if ($$8 == null) {
            c.warn("Invalid pack metadata in {}, ignoring all", $$4);
            return null;
         }

         $$1.add(new atc($$5, $$6, $$8, e));
      }

      return $$1;
   }

   public ath a() {
      return $$0 -> this.h.loadPacks($$0);
   }

   private static ath b(List<atc> $$0) {
      return $$0.isEmpty() ? d : $$0::forEach;
   }

   private void a(gsb.a $$0) {
      this.i = $$0;
      List<gsb.b> $$1 = $$0.b();
      List<atc> $$2 = this.a($$1);
      if ($$2 == null) {
         $$0.a(false);
         List<gsb.b> $$3 = $$0.b();
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
         List<atc> $$0 = this.a(this.i.b());
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

   private static gsa a(final vp $$0) {
      return new gsa() {
         @Override
         public void a(UUID $$0x, gsa.b $$1) {
            gry.c.debug("Pack {} changed status to {}", $$0, $$1);

            zx.a $$2 = switch ($$1) {
               case a -> zx.a.d;
               case b -> zx.a.e;
            };
            $$0.a(new zx($$0, $$2));
         }

         @Override
         public void a(UUID $$0x, gsa.a $$1) {
            gry.c.debug("Pack {} changed status to {}", $$0, $$1);

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

   public void a(vp $$0, gsc.c $$1) {
      this.l = atg.f;
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
      this.l = atg.e;
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
      final gsa $$2 = this.m;
      this.m = new gsa() {
         @Override
         public void a(UUID $$0x, gsa.b $$1x) {
            $$2.a($$0, $$1);
         }

         @Override
         public void a(UUID $$0x, gsa.a $$1x) {
            if ($$0.equals($$0)) {
               gry.this.m = $$2;
               if ($$1 == gsa.a.b) {
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
