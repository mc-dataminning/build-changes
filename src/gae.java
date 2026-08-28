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

public class gae extends fsm<gae.a> {
   static final ale a = ale.b("server_list/incompatible");
   static final ale m = ale.b("server_list/unreachable");
   static final ale n = ale.b("server_list/ping_1");
   static final ale o = ale.b("server_list/ping_2");
   static final ale p = ale.b("server_list/ping_3");
   static final ale q = ale.b("server_list/ping_4");
   static final ale r = ale.b("server_list/ping_5");
   static final ale s = ale.b("server_list/pinging_1");
   static final ale u = ale.b("server_list/pinging_2");
   static final ale v = ale.b("server_list/pinging_3");
   static final ale w = ale.b("server_list/pinging_4");
   static final ale x = ale.b("server_list/pinging_5");
   static final ale y = ale.b("server_list/join_highlighted");
   static final ale z = ale.b("server_list/join");
   static final ale A = ale.b("server_list/move_up_highlighted");
   static final ale B = ale.b("server_list/move_up");
   static final ale C = ale.b("server_list/move_down_highlighted");
   static final ale D = ale.b("server_list/move_down");
   static final Logger E = LogUtils.getLogger();
   static final ThreadPoolExecutor F = new ScheduledThreadPoolExecutor(
      5, new ThreadFactoryBuilder().setNameFormat("Server Pinger #%d").setDaemon(true).setUncaughtExceptionHandler(new r(E)).build()
   );
   static final ww G = ww.c("lanServer.scanning");
   static final ww H = ww.c("multiplayer.status.cannot_resolve").b(-65536);
   static final ww I = ww.c("multiplayer.status.cannot_connect").b(-65536);
   static final ww J = ww.c("multiplayer.status.incompatible");
   static final ww K = ww.c("multiplayer.status.no_connection");
   static final ww L = ww.c("multiplayer.status.pinging");
   static final ww M = ww.c("multiplayer.status.online");
   private final gaa N;
   private final List<gae.d> O = Lists.newArrayList();
   private final gae.a P = new gae.b();
   private final List<gae.c> Q = Lists.newArrayList();

   public gae(gaa $$0, fof $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$1, $$2, $$3, $$4, $$5);
      this.N = $$0;
   }

   private void c() {
      this.s();
      this.O.forEach($$1 -> this.b($$1));
      this.b(this.P);
      this.Q.forEach($$1 -> this.b($$1));
   }

   public void a(@Nullable gae.a $$0) {
      super.a($$0);
      this.N.E();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      gae.a $$3 = this.p();
      return $$3 != null && $$3.a($$0, $$1, $$2) || super.a($$0, $$1, $$2);
   }

   public void a(gjt $$0) {
      this.O.clear();

      for (int $$1 = 0; $$1 < $$0.c(); $$1++) {
         this.O.add(new gae.d(this.N, $$0.a($$1)));
      }

      this.c();
   }

   public void a(List<hml> $$0) {
      int $$1 = $$0.size() - this.Q.size();
      this.Q.clear();

      for (hml $$2 : $$0) {
         this.Q.add(new gae.c(this.N, $$2));
      }

      this.c();

      for (int $$3 = this.Q.size() - $$1; $$3 < this.Q.size(); $$3++) {
         gae.c $$4 = this.Q.get($$3);
         int $$5 = $$3 - this.Q.size() + this.aD_().size();
         int $$6 = this.d($$5);
         int $$7 = this.e($$5);
         if ($$7 >= this.G() && $$6 <= this.I()) {
            this.c.aY().b(ww.a("multiplayer.lan.server_found", $$4.c()));
         }
      }
   }

   @Override
   public int a() {
      return 305;
   }

   public void b() {
   }

   public abstract static class a extends fsm.a<gae.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends gae.a {
      private final fof a = fof.Q();

      @Override
      public void a(frc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.b(this.a.h, gae.G, this.a.z.n / 2 - this.a.h.a(gae.G) / 2, $$10, -1);
         String $$11 = fwx.a(af.c());
         $$0.b(this.a.h, $$11, this.a.z.n / 2 - this.a.h.b($$11) / 2, $$10 + 9, -8355712);
      }

      @Override
      public ww a() {
         return gae.G;
      }
   }

   public static class c extends gae.a {
      private static final int c = 32;
      private static final ww d = ww.c("lanServer.title");
      private static final ww e = ww.c("selectServer.hiddenAddress");
      private final gaa f;
      protected final fof a;
      protected final hml b;
      private long g;

      protected c(gaa $$0, hml $$1) {
         this.f = $$0;
         this.b = $$1;
         this.a = fof.Q();
      }

      @Override
      public void a(frc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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

      public hml b() {
         return this.b;
      }

      @Override
      public ww a() {
         return ww.a("narrator.select", this.c());
      }

      public ww c() {
         return ww.i().b(d).b(wv.v).f(this.b.a());
      }
   }

   public class d extends gae.a {
      private static final int b = 32;
      private static final int c = 32;
      private static final int d = 5;
      private static final int e = 10;
      private static final int f = 8;
      private final gaa g;
      private final fof h;
      private final gjs i;
      private final fws j;
      @Nullable
      private byte[] k;
      private long l;
      @Nullable
      private List<ww> m;
      @Nullable
      private ale n;
      @Nullable
      private ww o;

      protected d(final gaa $$1, final gjs $$2) {
         this.g = $$1;
         this.i = $$2;
         this.h = fof.Q();
         this.j = fws.b(this.h.aa(), $$2.b);
         this.d();
      }

      @Override
      public void a(frc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.i.g() == gjs.b.a) {
            this.i.a(gjs.b.b);
            this.i.d = wv.a;
            this.i.c = wv.a;
            gae.F.submit(() -> {
               try {
                  this.g.F().a(this.i, () -> this.h.execute(this::b), () -> {
                     this.i.a(this.i.g == ab.b().e() ? gjs.b.e : gjs.b.d);
                     this.h.execute(this::d);
                  });
               } catch (UnknownHostException var2x) {
                  this.i.a(gjs.b.c);
                  this.i.d = gae.H;
                  this.h.execute(this::d);
               } catch (Exception var3x) {
                  this.i.a(gjs.b.c);
                  this.i.d = gae.I;
                  this.h.execute(this::d);
               }
            });
         }

         $$0.b(this.h.h, this.i.a, $$3 + 32 + 3, $$2 + 1, -1);
         List<ayw> $$10 = this.h.h.c(this.i.d, $$4 - 32 - 2);

         for (int $$11 = 0; $$11 < Math.min($$10.size(), 2); $$11++) {
            $$0.b(this.h.h, $$10.get($$11), $$3 + 32 + 3, $$2 + 12 + 9 * $$11, -8355712);
         }

         this.a($$0, $$3, $$2, this.j.b());
         if (this.i.g() == gjs.b.b) {
            int $$12 = (int)(af.c() / 100L + (long)($$1 * 2) & 7L);
            if ($$12 > 4) {
               $$12 = 8 - $$12;
            }
            this.n = switch ($$12) {
               case 1 -> gae.u;
               case 2 -> gae.v;
               case 3 -> gae.w;
               case 4 -> gae.x;
               default -> gae.s;
            };
         }

         int $$13 = $$3 + $$4 - 10 - 5;
         if (this.n != null) {
            $$0.a(gpn::H, this.n, $$13, $$2, 10, 8);
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

         ww $$15 = (ww)(this.i.g() == gjs.b.d ? this.i.h.f().a(n.m) : this.i.c);
         int $$16 = this.h.h.a($$15);
         int $$17 = $$13 - $$16 - 5;
         $$0.b(this.h.h, $$15, $$17, $$2 + 1, -8355712);
         if (this.o != null && $$6 >= $$13 && $$6 <= $$13 + 10 && $$7 >= $$2 && $$7 <= $$2 + 8) {
            this.g.d(this.o);
         } else if (this.m != null && $$6 >= $$17 && $$6 <= $$17 + $$16 && $$7 >= $$2 && $$7 <= $$2 - 1 + 9) {
            this.g.b(Lists.transform(this.m, ww::g));
         }

         if (this.h.n.ac().c() || $$8) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$18 = $$6 - $$3;
            int $$19 = $$7 - $$2;
            if (this.e()) {
               if ($$18 < 32 && $$18 > 16) {
                  $$0.a(gpn::H, gae.y, $$3, $$2, 32, 32);
               } else {
                  $$0.a(gpn::H, gae.z, $$3, $$2, 32, 32);
               }
            }

            if ($$1 > 0) {
               if ($$18 < 16 && $$19 < 16) {
                  $$0.a(gpn::H, gae.A, $$3, $$2, 32, 32);
               } else {
                  $$0.a(gpn::H, gae.B, $$3, $$2, 32, 32);
               }
            }

            if ($$1 < this.g.G().c() - 1) {
               if ($$18 < 16 && $$19 > 16) {
                  $$0.a(gpn::H, gae.C, $$3, $$2, 32, 32);
               } else {
                  $$0.a(gpn::H, gae.D, $$3, $$2, 32, 32);
               }
            }
         }
      }

      private void d() {
         this.m = null;
         switch (this.i.g()) {
            case a:
            case b:
               this.n = gae.n;
               this.o = gae.L;
               break;
            case d:
               this.n = gae.a;
               this.o = gae.J;
               this.m = this.i.i;
               break;
            case c:
               this.n = gae.m;
               this.o = gae.K;
               break;
            case e:
               if (this.i.f < 150L) {
                  this.n = gae.r;
               } else if (this.i.f < 300L) {
                  this.n = gae.q;
               } else if (this.i.f < 600L) {
                  this.n = gae.p;
               } else if (this.i.f < 1000L) {
                  this.n = gae.o;
               } else {
                  this.n = gae.n;
               }

               this.o = ww.a("multiplayer.status.ping", this.i.f);
               this.m = this.i.i;
         }
      }

      public void b() {
         this.g.G().b();
      }

      protected void a(frc $$0, int $$1, int $$2, ale $$3) {
         $$0.a(gpn::H, $$3, $$1, $$2, 0.0F, 0.0F, 32, 32, 32, 32);
      }

      private boolean e() {
         return true;
      }

      private boolean a(@Nullable byte[] $$0) {
         if ($$0 == null) {
            this.j.a();
         } else {
            try {
               this.j.a(fhq.a($$0));
            } catch (Throwable var3) {
               gae.E.error("Invalid icon for server {} ({})", new Object[]{this.i.a, this.i.b, var3});
               return false;
            }
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fxi.t()) {
            gae $$3 = this.g.s;
            int $$4 = $$3.aD_().indexOf(this);
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
         gae.a $$2 = this.g.s.aD_().get($$1);
         this.g.s.a($$2);
         gae.this.f($$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         double $$3 = $$0 - (double)gae.this.u();
         double $$4 = $$1 - (double)gae.this.d(gae.this.aD_().indexOf(this));
         if ($$3 <= 32.0) {
            if ($$3 < 32.0 && $$3 > 16.0 && this.e()) {
               this.g.a(this);
               this.g.m();
               return true;
            }

            int $$5 = this.g.s.aD_().indexOf(this);
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

      public gjs c() {
         return this.i;
      }

      @Override
      public ww a() {
         xk $$0 = ww.i();
         $$0.b(ww.a("narrator.select", this.i.a));
         $$0.b(wv.t);
         switch (this.i.g()) {
            case b:
               $$0.b(gae.L);
               break;
            case d:
               $$0.b(gae.J);
               $$0.b(wv.t);
               $$0.b(ww.a("multiplayer.status.version.narration", this.i.h));
               $$0.b(wv.t);
               $$0.b(ww.a("multiplayer.status.motd.narration", this.i.d));
               break;
            case c:
               $$0.b(gae.K);
               break;
            default:
               $$0.b(gae.M);
               $$0.b(wv.t);
               $$0.b(ww.a("multiplayer.status.ping.narration", this.i.f));
               $$0.b(wv.t);
               $$0.b(ww.a("multiplayer.status.motd.narration", this.i.d));
               if (this.i.e != null) {
                  $$0.b(wv.t);
                  $$0.b(ww.a("multiplayer.status.player_count.narration", this.i.e.b(), this.i.e.a()));
                  $$0.b(wv.t);
                  $$0.b(wz.a(this.i.i, ww.b(", ")));
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
