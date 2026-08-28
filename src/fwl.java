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

public class fwl extends fov<fwl.a> {
   static final alz a = alz.b("server_list/incompatible");
   static final alz m = alz.b("server_list/unreachable");
   static final alz n = alz.b("server_list/ping_1");
   static final alz o = alz.b("server_list/ping_2");
   static final alz p = alz.b("server_list/ping_3");
   static final alz q = alz.b("server_list/ping_4");
   static final alz r = alz.b("server_list/ping_5");
   static final alz s = alz.b("server_list/pinging_1");
   static final alz u = alz.b("server_list/pinging_2");
   static final alz v = alz.b("server_list/pinging_3");
   static final alz w = alz.b("server_list/pinging_4");
   static final alz x = alz.b("server_list/pinging_5");
   static final alz y = alz.b("server_list/join_highlighted");
   static final alz z = alz.b("server_list/join");
   static final alz A = alz.b("server_list/move_up_highlighted");
   static final alz B = alz.b("server_list/move_up");
   static final alz C = alz.b("server_list/move_down_highlighted");
   static final alz D = alz.b("server_list/move_down");
   static final Logger E = LogUtils.getLogger();
   static final ThreadPoolExecutor F = new ScheduledThreadPoolExecutor(
      5, new ThreadFactoryBuilder().setNameFormat("Server Pinger #%d").setDaemon(true).setUncaughtExceptionHandler(new r(E)).build()
   );
   static final xv G = xv.c("lanServer.scanning");
   static final xv H = xv.c("multiplayer.status.cannot_resolve").b(-65536);
   static final xv I = xv.c("multiplayer.status.cannot_connect").b(-65536);
   static final xv J = xv.c("multiplayer.status.incompatible");
   static final xv K = xv.c("multiplayer.status.no_connection");
   static final xv L = xv.c("multiplayer.status.pinging");
   static final xv M = xv.c("multiplayer.status.online");
   private final fwh N;
   private final List<fwl.d> O = Lists.newArrayList();
   private final fwl.a P = new fwl.b();
   private final List<fwl.c> Q = Lists.newArrayList();

   public fwl(fwh $$0, flz $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$1, $$2, $$3, $$4, $$5);
      this.N = $$0;
   }

   private void c() {
      this.j();
      this.O.forEach($$1 -> this.b($$1));
      this.b(this.P);
      this.Q.forEach($$1 -> this.b($$1));
   }

   public void a(@Nullable fwl.a $$0) {
      super.a($$0);
      this.N.E();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      fwl.a $$3 = this.g();
      return $$3 != null && $$3.a($$0, $$1, $$2) || super.a($$0, $$1, $$2);
   }

   public void a(gft $$0) {
      this.O.clear();

      for (int $$1 = 0; $$1 < $$0.c(); $$1++) {
         this.O.add(new fwl.d(this.N, $$0.a($$1)));
      }

      this.c();
   }

   public void a(List<hfq> $$0) {
      int $$1 = $$0.size() - this.Q.size();
      this.Q.clear();

      for (hfq $$2 : $$0) {
         this.Q.add(new fwl.c(this.N, $$2));
      }

      this.c();

      for (int $$3 = this.Q.size() - $$1; $$3 < this.Q.size(); $$3++) {
         fwl.c $$4 = this.Q.get($$3);
         int $$5 = $$3 - this.Q.size() + this.aI_().size();
         int $$6 = this.g($$5);
         int $$7 = this.h($$5);
         if ($$7 >= this.E() && $$6 <= this.G()) {
            this.c.aZ().b(xv.a("multiplayer.lan.server_found", $$4.c()));
         }
      }
   }

   @Override
   public int a() {
      return 305;
   }

   public void b() {
   }

   public abstract static class a extends fov.a<fwl.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends fwl.a {
      private final flz a = flz.Q();

      @Override
      public void a(fnl $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.a(this.a.h, fwl.G, this.a.z.n / 2 - this.a.h.a(fwl.G) / 2, $$10, 16777215, false);
         String $$11 = ftg.a(ae.c());
         $$0.a(this.a.h, $$11, this.a.z.n / 2 - this.a.h.b($$11) / 2, $$10 + 9, -8355712, false);
      }

      @Override
      public xv a() {
         return fwl.G;
      }
   }

   public static class c extends fwl.a {
      private static final int c = 32;
      private static final xv d = xv.c("lanServer.title");
      private static final xv e = xv.c("selectServer.hiddenAddress");
      private final fwh f;
      protected final flz a;
      protected final hfq b;
      private long g;

      protected c(fwh $$0, hfq $$1) {
         this.f = $$0;
         this.b = $$1;
         this.a = flz.Q();
      }

      @Override
      public void a(fnl $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(this.a.h, d, $$3 + 32 + 3, $$2 + 1, 16777215, false);
         $$0.a(this.a.h, this.b.a(), $$3 + 32 + 3, $$2 + 12, -8355712, false);
         if (this.a.n.l) {
            $$0.a(this.a.h, e, $$3 + 32 + 3, $$2 + 12 + 11, 3158064, false);
         } else {
            $$0.a(this.a.h, this.b.b(), $$3 + 32 + 3, $$2 + 12 + 11, 3158064, false);
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         this.f.a(this);
         if (ae.c() - this.g < 250L) {
            this.f.l();
         }

         this.g = ae.c();
         return super.a($$0, $$1, $$2);
      }

      public hfq b() {
         return this.b;
      }

      @Override
      public xv a() {
         return xv.a("narrator.select", this.c());
      }

      public xv c() {
         return xv.i().b(d).b(xu.v).f(this.b.a());
      }
   }

   public class d extends fwl.a {
      private static final int b = 32;
      private static final int c = 32;
      private static final int d = 5;
      private static final int e = 10;
      private static final int f = 8;
      private final fwh g;
      private final flz h;
      private final gfs i;
      private final ftb j;
      @Nullable
      private byte[] k;
      private long l;
      @Nullable
      private List<xv> m;
      @Nullable
      private alz n;
      @Nullable
      private xv o;

      protected d(final fwh $$1, final gfs $$2) {
         this.g = $$1;
         this.i = $$2;
         this.h = flz.Q();
         this.j = ftb.b(this.h.aa(), $$2.b);
         this.d();
      }

      @Override
      public void a(fnl $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.i.g() == gfs.b.a) {
            this.i.a(gfs.b.b);
            this.i.d = xu.a;
            this.i.c = xu.a;
            fwl.F.submit(() -> {
               try {
                  this.g.F().a(this.i, () -> this.h.execute(this::b), () -> {
                     this.i.a(this.i.g == ab.b().e() ? gfs.b.e : gfs.b.d);
                     this.h.execute(this::d);
                  });
               } catch (UnknownHostException var2x) {
                  this.i.a(gfs.b.c);
                  this.i.d = fwl.H;
                  this.h.execute(this::d);
               } catch (Exception var3x) {
                  this.i.a(gfs.b.c);
                  this.i.d = fwl.I;
                  this.h.execute(this::d);
               }
            });
         }

         $$0.a(this.h.h, this.i.a, $$3 + 32 + 3, $$2 + 1, 16777215, false);
         List<azq> $$10 = this.h.h.c(this.i.d, $$4 - 32 - 2);

         for (int $$11 = 0; $$11 < Math.min($$10.size(), 2); $$11++) {
            $$0.a(this.h.h, $$10.get($$11), $$3 + 32 + 3, $$2 + 12 + 9 * $$11, -8355712, false);
         }

         this.a($$0, $$3, $$2, this.j.b());
         if (this.i.g() == gfs.b.b) {
            int $$12 = (int)(ae.c() / 100L + (long)($$1 * 2) & 7L);
            if ($$12 > 4) {
               $$12 = 8 - $$12;
            }
            this.n = switch ($$12) {
               case 1 -> fwl.u;
               case 2 -> fwl.v;
               case 3 -> fwl.w;
               case 4 -> fwl.x;
               default -> fwl.s;
            };
         }

         int $$13 = $$3 + $$4 - 10 - 5;
         if (this.n != null) {
            $$0.a(glo::B, this.n, $$13, $$2, 10, 8);
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

         xv $$15 = (xv)(this.i.g() == gfs.b.d ? this.i.h.f().a(n.m) : this.i.c);
         int $$16 = this.h.h.a($$15);
         int $$17 = $$13 - $$16 - 5;
         $$0.a(this.h.h, $$15, $$17, $$2 + 1, -8355712, false);
         if (this.o != null && $$6 >= $$13 && $$6 <= $$13 + 10 && $$7 >= $$2 && $$7 <= $$2 + 8) {
            this.g.d(this.o);
         } else if (this.m != null && $$6 >= $$17 && $$6 <= $$17 + $$16 && $$7 >= $$2 && $$7 <= $$2 - 1 + 9) {
            this.g.b(Lists.transform(this.m, xv::g));
         }

         if (this.h.n.ac().c() || $$8) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$18 = $$6 - $$3;
            int $$19 = $$7 - $$2;
            if (this.e()) {
               if ($$18 < 32 && $$18 > 16) {
                  $$0.a(glo::B, fwl.y, $$3, $$2, 32, 32);
               } else {
                  $$0.a(glo::B, fwl.z, $$3, $$2, 32, 32);
               }
            }

            if ($$1 > 0) {
               if ($$18 < 16 && $$19 < 16) {
                  $$0.a(glo::B, fwl.A, $$3, $$2, 32, 32);
               } else {
                  $$0.a(glo::B, fwl.B, $$3, $$2, 32, 32);
               }
            }

            if ($$1 < this.g.G().c() - 1) {
               if ($$18 < 16 && $$19 > 16) {
                  $$0.a(glo::B, fwl.C, $$3, $$2, 32, 32);
               } else {
                  $$0.a(glo::B, fwl.D, $$3, $$2, 32, 32);
               }
            }
         }
      }

      private void d() {
         this.m = null;
         switch (this.i.g()) {
            case a:
            case b:
               this.n = fwl.n;
               this.o = fwl.L;
               break;
            case d:
               this.n = fwl.a;
               this.o = fwl.J;
               this.m = this.i.i;
               break;
            case c:
               this.n = fwl.m;
               this.o = fwl.K;
               break;
            case e:
               if (this.i.f < 150L) {
                  this.n = fwl.r;
               } else if (this.i.f < 300L) {
                  this.n = fwl.q;
               } else if (this.i.f < 600L) {
                  this.n = fwl.p;
               } else if (this.i.f < 1000L) {
                  this.n = fwl.o;
               } else {
                  this.n = fwl.n;
               }

               this.o = xv.a("multiplayer.status.ping", this.i.f);
               this.m = this.i.i;
         }
      }

      public void b() {
         this.g.G().b();
      }

      protected void a(fnl $$0, int $$1, int $$2, alz $$3) {
         $$0.a(glo::B, $$3, $$1, $$2, 0.0F, 0.0F, 32, 32, 32, 32);
      }

      private boolean e() {
         return true;
      }

      private boolean a(@Nullable byte[] $$0) {
         if ($$0 == null) {
            this.j.a();
         } else {
            try {
               this.j.a(ffl.a($$0));
            } catch (Throwable var3) {
               fwl.E.error("Invalid icon for server {} ({})", new Object[]{this.i.a, this.i.b, var3});
               return false;
            }
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (ftr.s()) {
            fwl $$3 = this.g.s;
            int $$4 = $$3.aI_().indexOf(this);
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
         fwl.a $$2 = this.g.s.aI_().get($$1);
         this.g.s.a($$2);
         fwl.this.f($$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         double $$3 = $$0 - (double)fwl.this.s();
         double $$4 = $$1 - (double)fwl.this.g(fwl.this.aI_().indexOf(this));
         if ($$3 <= 32.0) {
            if ($$3 < 32.0 && $$3 > 16.0 && this.e()) {
               this.g.a(this);
               this.g.l();
               return true;
            }

            int $$5 = this.g.s.aI_().indexOf(this);
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
         if (ae.c() - this.l < 250L) {
            this.g.l();
         }

         this.l = ae.c();
         return super.a($$0, $$1, $$2);
      }

      public gfs c() {
         return this.i;
      }

      @Override
      public xv a() {
         yj $$0 = xv.i();
         $$0.b(xv.a("narrator.select", this.i.a));
         $$0.b(xu.t);
         switch (this.i.g()) {
            case b:
               $$0.b(fwl.L);
               break;
            case d:
               $$0.b(fwl.J);
               $$0.b(xu.t);
               $$0.b(xv.a("multiplayer.status.version.narration", this.i.h));
               $$0.b(xu.t);
               $$0.b(xv.a("multiplayer.status.motd.narration", this.i.d));
               break;
            case c:
               $$0.b(fwl.K);
               break;
            default:
               $$0.b(fwl.M);
               $$0.b(xu.t);
               $$0.b(xv.a("multiplayer.status.ping.narration", this.i.f));
               $$0.b(xu.t);
               $$0.b(xv.a("multiplayer.status.motd.narration", this.i.d));
               if (this.i.e != null) {
                  $$0.b(xu.t);
                  $$0.b(xv.a("multiplayer.status.player_count.narration", this.i.e.b(), this.i.e.a()));
                  $$0.b(xu.t);
                  $$0.b(xy.a(this.i.i, xv.b(", ")));
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
