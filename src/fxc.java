import com.google.common.collect.Lists;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.mojang.logging.LogUtils;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fxc extends fpm<fxc.a> {
   static final aku a = aku.b("server_list/incompatible");
   static final aku m = aku.b("server_list/unreachable");
   static final aku n = aku.b("server_list/ping_1");
   static final aku o = aku.b("server_list/ping_2");
   static final aku p = aku.b("server_list/ping_3");
   static final aku q = aku.b("server_list/ping_4");
   static final aku r = aku.b("server_list/ping_5");
   static final aku s = aku.b("server_list/pinging_1");
   static final aku u = aku.b("server_list/pinging_2");
   static final aku v = aku.b("server_list/pinging_3");
   static final aku w = aku.b("server_list/pinging_4");
   static final aku x = aku.b("server_list/pinging_5");
   static final aku y = aku.b("server_list/join_highlighted");
   static final aku z = aku.b("server_list/join");
   static final aku A = aku.b("server_list/move_up_highlighted");
   static final aku B = aku.b("server_list/move_up");
   static final aku C = aku.b("server_list/move_down_highlighted");
   static final aku D = aku.b("server_list/move_down");
   static final Logger E = LogUtils.getLogger();
   static final ThreadPoolExecutor F = new ScheduledThreadPoolExecutor(
      5, new ThreadFactoryBuilder().setNameFormat("Server Pinger #%d").setDaemon(true).setUncaughtExceptionHandler(new r(E)).build()
   );
   static final wo G = wo.c("lanServer.scanning");
   static final wo H = wo.c("multiplayer.status.cannot_resolve").b(-65536);
   static final wo I = wo.c("multiplayer.status.cannot_connect").b(-65536);
   static final wo J = wo.c("multiplayer.status.incompatible");
   static final wo K = wo.c("multiplayer.status.no_connection");
   static final wo L = wo.c("multiplayer.status.pinging");
   static final wo M = wo.c("multiplayer.status.online");
   private final fwy N;
   private final List<fxc.d> O = Lists.newArrayList();
   private final fxc.a P = new fxc.b();
   private final List<fxc.c> Q = Lists.newArrayList();

   public fxc(fwy $$0, flh $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$1, $$2, $$3, $$4, $$5);
      this.N = $$0;
   }

   private void c() {
      this.s();
      this.O.forEach($$1 -> this.b($$1));
      this.b(this.P);
      this.Q.forEach($$1 -> this.b($$1));
   }

   public void a(@Nullable fxc.a $$0) {
      super.a($$0);
      this.N.E();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      fxc.a $$3 = this.p();
      return $$3 != null && $$3.a($$0, $$1, $$2) || super.a($$0, $$1, $$2);
   }

   public void a(ggm $$0) {
      this.O.clear();

      for (int $$1 = 0; $$1 < $$0.c(); $$1++) {
         this.O.add(new fxc.d(this.N, $$0.a($$1)));
      }

      this.c();
   }

   public void a(List<hiy> $$0) {
      int $$1 = $$0.size() - this.Q.size();
      this.Q.clear();

      for (hiy $$2 : $$0) {
         this.Q.add(new fxc.c(this.N, $$2));
      }

      this.c();

      for (int $$3 = this.Q.size() - $$1; $$3 < this.Q.size(); $$3++) {
         fxc.c $$4 = this.Q.get($$3);
         int $$5 = $$3 - this.Q.size() + this.aH_().size();
         int $$6 = this.d($$5);
         int $$7 = this.e($$5);
         if ($$7 >= this.G() && $$6 <= this.I()) {
            this.c.aY().b(wo.a("multiplayer.lan.server_found", $$4.c()));
         }
      }
   }

   @Override
   public int a() {
      return 305;
   }

   public void b() {
   }

   public abstract static class a extends fpm.a<fxc.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends fxc.a {
      private final flh a = flh.Q();

      @Override
      public void a(fob $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.b(this.a.h, fxc.G, this.a.z.n / 2 - this.a.h.a(fxc.G) / 2, $$10, -1);
         String $$11 = ftx.a(af.c());
         $$0.b(this.a.h, $$11, this.a.z.n / 2 - this.a.h.b($$11) / 2, $$10 + 9, -8355712);
      }

      @Override
      public wo a() {
         return fxc.G;
      }
   }

   public static class c extends fxc.a {
      private static final int c = 32;
      private static final wo d = wo.c("lanServer.title");
      private static final wo e = wo.c("selectServer.hiddenAddress");
      private final fwy f;
      protected final flh a;
      protected final hiy b;
      private long g;

      protected c(fwy $$0, hiy $$1) {
         this.f = $$0;
         this.b = $$1;
         this.a = flh.Q();
      }

      @Override
      public void a(fob $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.b(this.a.h, d, $$3 + 32 + 3, $$2 + 1, -1);
         $$0.b(this.a.h, this.b.a(), $$3 + 32 + 3, $$2 + 12, -8355712);
         if (this.a.n.l) {
            $$0.b(this.a.h, e, $$3 + 32 + 3, $$2 + 12 + 11, 3158064);
         } else {
            $$0.b(this.a.h, this.b.b(), $$3 + 32 + 3, $$2 + 12 + 11, 3158064);
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         this.f.a(this);
         if (af.c() - this.g < 250L) {
            this.f.m();
         }

         this.g = af.c();
         return super.a($$0, $$1, $$2);
      }

      public hiy b() {
         return this.b;
      }

      @Override
      public wo a() {
         return wo.a("narrator.select", this.c());
      }

      public wo c() {
         return wo.i().b(d).b(wn.v).f(this.b.a());
      }
   }

   public class d extends fxc.a {
      private static final int b = 32;
      private static final int c = 32;
      private static final int d = 5;
      private static final int e = 10;
      private static final int f = 8;
      private final fwy g;
      private final flh h;
      private final ggl i;
      private final fts j;
      @Nullable
      private byte[] k;
      private long l;
      @Nullable
      private List<wo> m;
      @Nullable
      private aku n;
      @Nullable
      private wo o;

      protected d(final fwy $$1, final ggl $$2) {
         this.g = $$1;
         this.i = $$2;
         this.h = flh.Q();
         this.j = fts.b(this.h.aa(), $$2.b);
         this.d();
      }

      @Override
      public void a(fob $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.i.g() == ggl.b.a) {
            this.i.a(ggl.b.b);
            this.i.d = wn.a;
            this.i.c = wn.a;
            fxc.F.submit(() -> {
               try {
                  this.g.F().a(this.i, () -> this.h.execute(this::b), () -> {
                     this.i.a(this.i.g == ab.b().e() ? ggl.b.e : ggl.b.d);
                     this.h.execute(this::d);
                  });
               } catch (UnknownHostException var2x) {
                  this.i.a(ggl.b.c);
                  this.i.d = fxc.H;
                  this.h.execute(this::d);
               } catch (Exception var3x) {
                  this.i.a(ggl.b.c);
                  this.i.d = fxc.I;
                  this.h.execute(this::d);
               }
            });
         }

         $$0.b(this.h.h, this.i.a, $$3 + 32 + 3, $$2 + 1, -1);
         List<ayk> $$10 = this.h.h.c(this.i.d, $$4 - 32 - 2);

         for (int $$11 = 0; $$11 < Math.min($$10.size(), 2); $$11++) {
            $$0.b(this.h.h, $$10.get($$11), $$3 + 32 + 3, $$2 + 12 + 9 * $$11, -8355712);
         }

         this.a($$0, $$3, $$2, this.j.b());
         if (this.i.g() == ggl.b.b) {
            int $$12 = (int)(af.c() / 100L + (long)($$1 * 2) & 7L);
            if ($$12 > 4) {
               $$12 = 8 - $$12;
            }
            this.n = switch ($$12) {
               case 1 -> fxc.u;
               case 2 -> fxc.v;
               case 3 -> fxc.w;
               case 4 -> fxc.x;
               default -> fxc.s;
            };
         }

         int $$13 = $$3 + $$4 - 10 - 5;
         if (this.n != null) {
            $$0.a(gmf::H, this.n, $$13, $$2, 10, 8);
         }

         byte[] $$14 = this.i.c();
         if (!Arrays.equals($$14, this.k)) {
            if (this.a($$14)) {
               this.k = $$14;
            } else {
               this.i.a(null);
               this.b();
            }
         }

         wo $$15 = (wo)(this.i.g() == ggl.b.d ? this.i.h.f().a(n.m) : this.i.c);
         int $$16 = this.h.h.a($$15);
         int $$17 = $$13 - $$16 - 5;
         $$0.b(this.h.h, $$15, $$17, $$2 + 1, -8355712);
         if (this.o != null && $$6 >= $$13 && $$6 <= $$13 + 10 && $$7 >= $$2 && $$7 <= $$2 + 8) {
            this.g.d(this.o);
         } else if (this.m != null && $$6 >= $$17 && $$6 <= $$17 + $$16 && $$7 >= $$2 && $$7 <= $$2 - 1 + 9) {
            this.g.b(Lists.transform(this.m, wo::g));
         }

         if (this.h.n.ac().c() || $$8) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$18 = $$6 - $$3;
            int $$19 = $$7 - $$2;
            if (this.e()) {
               if ($$18 < 32 && $$18 > 16) {
                  $$0.a(gmf::H, fxc.y, $$3, $$2, 32, 32);
               } else {
                  $$0.a(gmf::H, fxc.z, $$3, $$2, 32, 32);
               }
            }

            if ($$1 > 0) {
               if ($$18 < 16 && $$19 < 16) {
                  $$0.a(gmf::H, fxc.A, $$3, $$2, 32, 32);
               } else {
                  $$0.a(gmf::H, fxc.B, $$3, $$2, 32, 32);
               }
            }

            if ($$1 < this.g.G().c() - 1) {
               if ($$18 < 16 && $$19 > 16) {
                  $$0.a(gmf::H, fxc.C, $$3, $$2, 32, 32);
               } else {
                  $$0.a(gmf::H, fxc.D, $$3, $$2, 32, 32);
               }
            }
         }
      }

      private void d() {
         this.m = null;
         switch (this.i.g()) {
            case a:
            case b:
               this.n = fxc.n;
               this.o = fxc.L;
               break;
            case d:
               this.n = fxc.a;
               this.o = fxc.J;
               this.m = this.i.i;
               break;
            case c:
               this.n = fxc.m;
               this.o = fxc.K;
               break;
            case e:
               if (this.i.f < 150L) {
                  this.n = fxc.r;
               } else if (this.i.f < 300L) {
                  this.n = fxc.q;
               } else if (this.i.f < 600L) {
                  this.n = fxc.p;
               } else if (this.i.f < 1000L) {
                  this.n = fxc.o;
               } else {
                  this.n = fxc.n;
               }

               this.o = wo.a("multiplayer.status.ping", this.i.f);
               this.m = this.i.i;
         }
      }

      public void b() {
         this.g.G().b();
      }

      protected void a(fob $$0, int $$1, int $$2, aku $$3) {
         $$0.a(gmf::H, $$3, $$1, $$2, 0.0F, 0.0F, 32, 32, 32, 32);
      }

      private boolean e() {
         return true;
      }

      private boolean a(@Nullable byte[] $$0) {
         if ($$0 == null) {
            this.j.a();
         } else {
            try {
               this.j.a(fes.a($$0));
            } catch (Throwable var3) {
               fxc.E.error("Invalid icon for server {} ({})", new Object[]{this.i.a, this.i.b, var3});
               return false;
            }
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fui.t()) {
            fxc $$3 = this.g.s;
            int $$4 = $$3.aH_().indexOf(this);
            if ($$4 == -1) {
               return true;
            }

            if ($$0 == 264 && $$4 < this.g.G().c() - 1 || $$0 == 265 && $$4 > 0) {
               this.a($$4, $$0 == 264 ? $$4 + 1 : $$4 - 1);
               return true;
            }
         }

         return super.a($$0, $$1, $$2);
      }

      private void a(int $$0, int $$1) {
         this.g.G().a($$0, $$1);
         this.g.s.a(this.g.G());
         fxc.a $$2 = this.g.s.aH_().get($$1);
         this.g.s.a($$2);
         fxc.this.f($$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         double $$3 = $$0 - (double)fxc.this.u();
         double $$4 = $$1 - (double)fxc.this.d(fxc.this.aH_().indexOf(this));
         if ($$3 <= 32.0) {
            if ($$3 < 32.0 && $$3 > 16.0 && this.e()) {
               this.g.a(this);
               this.g.m();
               return true;
            }

            int $$5 = this.g.s.aH_().indexOf(this);
            if ($$3 < 16.0 && $$4 < 16.0 && $$5 > 0) {
               this.a($$5, $$5 - 1);
               return true;
            }

            if ($$3 < 16.0 && $$4 > 16.0 && $$5 < this.g.G().c() - 1) {
               this.a($$5, $$5 + 1);
               return true;
            }
         }

         this.g.a(this);
         if (af.c() - this.l < 250L) {
            this.g.m();
         }

         this.l = af.c();
         return super.a($$0, $$1, $$2);
      }

      public ggl c() {
         return this.i;
      }

      @Override
      public wo a() {
         xc $$0 = wo.i();
         $$0.b(wo.a("narrator.select", this.i.a));
         $$0.b(wn.t);
         switch (this.i.g()) {
            case b:
               $$0.b(fxc.L);
               break;
            case d:
               $$0.b(fxc.J);
               $$0.b(wn.t);
               $$0.b(wo.a("multiplayer.status.version.narration", this.i.h));
               $$0.b(wn.t);
               $$0.b(wo.a("multiplayer.status.motd.narration", this.i.d));
               break;
            case c:
               $$0.b(fxc.K);
               break;
            default:
               $$0.b(fxc.M);
               $$0.b(wn.t);
               $$0.b(wo.a("multiplayer.status.ping.narration", this.i.f));
               $$0.b(wn.t);
               $$0.b(wo.a("multiplayer.status.motd.narration", this.i.d));
               if (this.i.e != null) {
                  $$0.b(wn.t);
                  $$0.b(wo.a("multiplayer.status.player_count.narration", this.i.e.b(), this.i.e.a()));
                  $$0.b(wn.t);
                  $$0.b(wr.a(this.i.i, wo.b(", ")));
               }
         }

         return $$0;
      }

      @Override
      public void close() {
         this.j.close();
      }
   }
}
