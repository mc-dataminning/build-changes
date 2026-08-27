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

public class gql implements AutoCloseable {
   private static final wx a = wx.c("resourcePack.server.name");
   private static final Pattern b = Pattern.compile("^[a-fA-F0-9]{40}$");
   static final Logger c = LogUtils.getLogger();
   private static final atj d = $$0 -> {
   };
   private static final asj e = new asj(true, ate.b.a, true);
   private static final gqn f = new gqn() {
      @Override
      public void a(UUID $$0, gqn.b $$1) {
         gql.c.debug("Downloaded pack {} changed state to {}", $$0, $$1);
      }

      @Override
      public void a(UUID $$0, gqn.a $$1) {
         gql.c.debug("Downloaded pack {} finished with state {}", $$0, $$1);
      }
   };
   final fdz g;
   private atj h = d;
   @Nullable
   private gqo.a i;
   final gqp j;
   private final asd k;
   private ati l = ati.f;
   gqn m = f;
   private int n;

   public gql(fdz $$0, Path $$1, frm.d $$2) {
      this.g = $$0;

      try {
         this.k = new asd($$1);
      } catch (IOException var5) {
         throw new UncheckedIOException("Failed to open download queue in directory " + $$1, var5);
      }

      Executor $$4 = $$0::i;
      this.j = new gqp(this.a(this.k, $$4, $$2.a, $$2.d), new gqn() {
         @Override
         public void a(UUID $$0, gqn.b $$1) {
            gql.this.m.a($$0, $$1);
         }

         @Override
         public void a(UUID $$0, gqn.a $$1) {
            gql.this.m.a($$0, $$1);
         }
      }, this.j(), this.a($$4), gqp.c.a);
   }

   axv.a a(final int $$0) {
      return new axv.a() {
         private final fih.a c = new fih.a();
         private wx d = wx.i();
         @Nullable
         private wx e = null;
         private int f;
         private int g;
         private OptionalLong h = OptionalLong.empty();

         private void b() {
            fih.b(gql.this.g.aA(), this.c, this.d, this.e);
         }

         private void b(long $$0x) {
            if (this.h.isPresent()) {
               this.e = wx.a("download.pack.progress.percent", $$0 * 100L / this.h.getAsLong());
            } else {
               this.e = wx.a("download.pack.progress.bytes", eze.b($$0));
            }

            this.b();
         }

         @Override
         public void a() {
            this.f++;
            this.d = wx.a("download.pack.title", this.f, $$0);
            this.b();
            gql.c.debug("Starting pack {}/{} download", this.f, $$0);
         }

         @Override
         public void a(OptionalLong $$0x) {
            gql.c.debug("File size = {} bytes", $$0);
            this.h = $$0;
            this.b(0L);
         }

         @Override
         public void a(long $$0x) {
            gql.c.debug("Progress for pack {}: {} bytes", this.f, $$0);
            this.b($$0);
         }

         @Override
         public void a(boolean $$0x) {
            if (!$$0) {
               gql.c.info("Pack {} failed to download", this.f);
               this.g++;
            } else {
               gql.c.debug("Download ended for pack {}", this.f);
            }

            if (this.f == $$0) {
               if (this.g > 0) {
                  this.d = wx.a("download.pack.failed", this.g, $$0);
                  this.e = null;
                  this.b();
               } else {
                  fih.a(gql.this.g.aA(), this.c);
               }
            }
         }
      };
   }

   private gqm a(final asd $$0, final Executor $$1, final feo $$2, final Proxy $$3) {
      return new gqm() {
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
               String.valueOf($$0.a(ask.a)),
               "User-Agent",
               "Minecraft Java/" + $$0.c()
            );
         }

         @Override
         public void a(Map<UUID, asd.c> $$0x, Consumer<asd.b> $$1x) {
            $$0.a(new asd.a(g, 262144000, this.a(), $$3, gql.this.a($$0.size())), $$0).thenAcceptAsync($$1, $$1);
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
               gql.this.j.e();
            }

            this.c = false;
         }
      };
   }

   private gqo j() {
      return this::a;
   }

   @Nullable
   private List<ate> a(List<gqo.b> $$0) {
      List<ate> $$1 = new ArrayList<>($$0.size());

      for (gqo.b $$2 : Lists.reverse($$0)) {
         String $$3 = String.format(Locale.ROOT, "server/%08X/%s", this.n++, $$2.a());
         Path $$4 = $$2.b();
         ash $$5 = new ash($$3, a, this.l, Optional.empty());
         ate.c $$6 = new asf.a($$4);
         int $$7 = aa.b().a(ask.a);
         ate.a $$8 = ate.a($$5, $$6, $$7);
         if ($$8 == null) {
            c.warn("Invalid pack metadata in {}, ignoring all", $$4);
            return null;
         }

         $$1.add(new ate($$5, $$6, $$8, e));
      }

      return $$1;
   }

   public atj a() {
      return $$0 -> this.h.loadPacks($$0);
   }

   private static atj b(List<ate> $$0) {
      return $$0.isEmpty() ? d : $$0::forEach;
   }

   private void a(gqo.a $$0) {
      this.i = $$0;
      List<gqo.b> $$1 = $$0.b();
      List<ate> $$2 = this.a($$1);
      if ($$2 == null) {
         $$0.a(false);
         List<gqo.b> $$3 = $$0.b();
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
         List<ate> $$0 = this.a(this.i.b());
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

   private static gqn a(final vv $$0) {
      return new gqn() {
         @Override
         public void a(UUID $$0x, gqn.b $$1) {
            gql.c.debug("Pack {} changed status to {}", $$0, $$1);

            aaa.a $$2 = switch ($$1) {
               case a -> aaa.a.d;
               case b -> aaa.a.e;
            };
            $$0.a(new aaa($$0, $$2));
         }

         @Override
         public void a(UUID $$0x, gqn.a $$1) {
            gql.c.debug("Pack {} changed status to {}", $$0, $$1);

            aaa.a $$2 = switch ($$1) {
               case b -> aaa.a.a;
               case d -> aaa.a.c;
               case a -> aaa.a.b;
               case c -> aaa.a.h;
               case e -> aaa.a.g;
            };
            $$0.a(new aaa($$0, $$2));
         }
      };
   }

   public void a(vv $$0, gqp.c $$1) {
      this.l = ati.f;
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
      this.l = ati.e;
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
      final gqn $$2 = this.m;
      this.m = new gqn() {
         @Override
         public void a(UUID $$0x, gqn.b $$1x) {
            $$2.a($$0, $$1);
         }

         @Override
         public void a(UUID $$0x, gqn.a $$1x) {
            if ($$0.equals($$0)) {
               gql.this.m = $$2;
               if ($$1 == gqn.a.b) {
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
