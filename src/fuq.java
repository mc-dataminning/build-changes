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

public class fuq extends fmz<fuq.a> {
   static final alj a = alj.b("server_list/incompatible");
   static final alj m = alj.b("server_list/unreachable");
   static final alj n = alj.b("server_list/ping_1");
   static final alj o = alj.b("server_list/ping_2");
   static final alj p = alj.b("server_list/ping_3");
   static final alj q = alj.b("server_list/ping_4");
   static final alj r = alj.b("server_list/ping_5");
   static final alj s = alj.b("server_list/pinging_1");
   static final alj u = alj.b("server_list/pinging_2");
   static final alj v = alj.b("server_list/pinging_3");
   static final alj w = alj.b("server_list/pinging_4");
   static final alj x = alj.b("server_list/pinging_5");
   static final alj y = alj.b("server_list/join_highlighted");
   static final alj z = alj.b("server_list/join");
   static final alj A = alj.b("server_list/move_up_highlighted");
   static final alj B = alj.b("server_list/move_up");
   static final alj C = alj.b("server_list/move_down_highlighted");
   static final alj D = alj.b("server_list/move_down");
   static final Logger E = LogUtils.getLogger();
   static final ThreadPoolExecutor F = new ScheduledThreadPoolExecutor(
      5, new ThreadFactoryBuilder().setNameFormat("Server Pinger #%d").setDaemon(true).setUncaughtExceptionHandler(new r(E)).build()
   );
   static final xj G = xj.c("lanServer.scanning");
   static final xj H = xj.c("multiplayer.status.cannot_resolve").b(-65536);
   static final xj I = xj.c("multiplayer.status.cannot_connect").b(-65536);
   static final xj J = xj.c("multiplayer.status.incompatible");
   static final xj K = xj.c("multiplayer.status.no_connection");
   static final xj L = xj.c("multiplayer.status.pinging");
   static final xj M = xj.c("multiplayer.status.online");
   private final fum N;
   private final List<fuq.d> O = Lists.newArrayList();
   private final fuq.a P = new fuq.b();
   private final List<fuq.c> Q = Lists.newArrayList();

   public fuq(fum $$0, fke $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$1, $$2, $$3, $$4, $$5);
      this.N = $$0;
   }

   private void J() {
      this.k();
      this.O.forEach($$1 -> this.b($$1));
      this.b(this.P);
      this.Q.forEach($$1 -> this.b($$1));
   }

   public void a(@Nullable fuq.a $$0) {
      super.a($$0);
      this.N.F();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      fuq.a $$3 = this.h();
      return $$3 != null && $$3.a($$0, $$1, $$2) || super.a($$0, $$1, $$2);
   }

   public void a(gdw $$0) {
      this.O.clear();

      for (int $$1 = 0; $$1 < $$0.c(); $$1++) {
         this.O.add(new fuq.d(this.N, $$0.a($$1)));
      }

      this.J();
   }

   public void a(List<hdq> $$0) {
      int $$1 = $$0.size() - this.Q.size();
      this.Q.clear();

      for (hdq $$2 : $$0) {
         this.Q.add(new fuq.c(this.N, $$2));
      }

      this.J();

      for (int $$3 = this.Q.size() - $$1; $$3 < this.Q.size(); $$3++) {
         fuq.c $$4 = this.Q.get($$3);
         int $$5 = $$3 - this.Q.size() + this.aH_().size();
         int $$6 = this.g($$5);
         int $$7 = this.h($$5);
         if ($$7 >= this.E() && $$6 <= this.G()) {
            this.c.aZ().b(xj.a("multiplayer.lan.server_found", $$4.c()));
         }
      }
   }

   @Override
   public int b() {
      return 305;
   }

   public void c() {
   }

   public abstract static class a extends fmz.a<fuq.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends fuq.a {
      private final fke a = fke.Q();

      @Override
      public void a(flq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.a(this.a.h, fuq.G, this.a.z.n / 2 - this.a.h.a(fuq.G) / 2, $$10, 16777215, false);
         String $$11 = frl.a(ae.c());
         $$0.a(this.a.h, $$11, this.a.z.n / 2 - this.a.h.b($$11) / 2, $$10 + 9, -8355712, false);
      }

      @Override
      public xj a() {
         return fuq.G;
      }
   }

   public static class c extends fuq.a {
      private static final int c = 32;
      private static final xj d = xj.c("lanServer.title");
      private static final xj e = xj.c("selectServer.hiddenAddress");
      private final fum f;
      protected final fke a;
      protected final hdq b;
      private long g;

      protected c(fum $$0, hdq $$1) {
         this.f = $$0;
         this.b = $$1;
         this.a = fke.Q();
      }

      @Override
      public void a(flq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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
            this.f.m();
         }

         this.g = ae.c();
         return super.a($$0, $$1, $$2);
      }

      public hdq b() {
         return this.b;
      }

      @Override
      public xj a() {
         return xj.a("narrator.select", this.c());
      }

      public xj c() {
         return xj.i().b(d).b(xi.v).f(this.b.a());
      }
   }

   public class d extends fuq.a {
      private static final int b = 32;
      private static final int c = 32;
      private static final int d = 5;
      private static final int e = 10;
      private static final int f = 8;
      private final fum g;
      private final fke h;
      private final gdv i;
      private final frg j;
      @Nullable
      private byte[] k;
      private long l;
      @Nullable
      private List<xj> m;
      @Nullable
      private alj n;
      @Nullable
      private xj o;

      protected d(final fum $$1, final gdv $$2) {
         this.g = $$1;
         this.i = $$2;
         this.h = fke.Q();
         this.j = frg.b(this.h.aa(), $$2.b);
         this.d();
      }

      @Override
      public void a(flq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.i.g() == gdv.b.a) {
            this.i.a(gdv.b.b);
            this.i.d = xi.a;
            this.i.c = xi.a;
            fuq.F.submit(() -> {
               try {
                  this.g.G().a(this.i, () -> this.h.execute(this::b), () -> {
                     this.i.a(this.i.g == ab.b().e() ? gdv.b.e : gdv.b.d);
                     this.h.execute(this::d);
                  });
               } catch (UnknownHostException var2x) {
                  this.i.a(gdv.b.c);
                  this.i.d = fuq.H;
                  this.h.execute(this::d);
               } catch (Exception var3x) {
                  this.i.a(gdv.b.c);
                  this.i.d = fuq.I;
                  this.h.execute(this::d);
               }
            });
         }

         $$0.a(this.h.h, this.i.a, $$3 + 32 + 3, $$2 + 1, 16777215, false);
         List<ayy> $$10 = this.h.h.c(this.i.d, $$4 - 32 - 2);

         for (int $$11 = 0; $$11 < Math.min($$10.size(), 2); $$11++) {
            $$0.a(this.h.h, $$10.get($$11), $$3 + 32 + 3, $$2 + 12 + 9 * $$11, -8355712, false);
         }

         this.a($$0, $$3, $$2, this.j.b());
         if (this.i.g() == gdv.b.b) {
            int $$12 = (int)(ae.c() / 100L + (long)($$1 * 2) & 7L);
            if ($$12 > 4) {
               $$12 = 8 - $$12;
            }
            this.n = switch ($$12) {
               case 1 -> fuq.u;
               case 2 -> fuq.v;
               case 3 -> fuq.w;
               case 4 -> fuq.x;
               default -> fuq.s;
            };
         }

         int $$13 = $$3 + $$4 - 10 - 5;
         if (this.n != null) {
            $$0.a(gjq::B, this.n, $$13, $$2, 10, 8);
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

         xj $$15 = (xj)(this.i.g() == gdv.b.d ? this.i.h.f().a(n.m) : this.i.c);
         int $$16 = this.h.h.a($$15);
         int $$17 = $$13 - $$16 - 5;
         $$0.a(this.h.h, $$15, $$17, $$2 + 1, -8355712, false);
         if (this.o != null && $$6 >= $$13 && $$6 <= $$13 + 10 && $$7 >= $$2 && $$7 <= $$2 + 8) {
            this.g.d(this.o);
         } else if (this.m != null && $$6 >= $$17 && $$6 <= $$17 + $$16 && $$7 >= $$2 && $$7 <= $$2 - 1 + 9) {
            this.g.b(Lists.transform(this.m, xj::g));
         }

         if (this.h.n.ab().c() || $$8) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$18 = $$6 - $$3;
            int $$19 = $$7 - $$2;
            if (this.e()) {
               if ($$18 < 32 && $$18 > 16) {
                  $$0.a(gjq::B, fuq.y, $$3, $$2, 32, 32);
               } else {
                  $$0.a(gjq::B, fuq.z, $$3, $$2, 32, 32);
               }
            }

            if ($$1 > 0) {
               if ($$18 < 16 && $$19 < 16) {
                  $$0.a(gjq::B, fuq.A, $$3, $$2, 32, 32);
               } else {
                  $$0.a(gjq::B, fuq.B, $$3, $$2, 32, 32);
               }
            }

            if ($$1 < this.g.J().c() - 1) {
               if ($$18 < 16 && $$19 > 16) {
                  $$0.a(gjq::B, fuq.C, $$3, $$2, 32, 32);
               } else {
                  $$0.a(gjq::B, fuq.D, $$3, $$2, 32, 32);
               }
            }
         }
      }

      private void d() {
         this.m = null;
         switch (this.i.g()) {
            case a:
            case b:
               this.n = fuq.n;
               this.o = fuq.L;
               break;
            case d:
               this.n = fuq.a;
               this.o = fuq.J;
               this.m = this.i.i;
               break;
            case c:
               this.n = fuq.m;
               this.o = fuq.K;
               break;
            case e:
               if (this.i.f < 150L) {
                  this.n = fuq.r;
               } else if (this.i.f < 300L) {
                  this.n = fuq.q;
               } else if (this.i.f < 600L) {
                  this.n = fuq.p;
               } else if (this.i.f < 1000L) {
                  this.n = fuq.o;
               } else {
                  this.n = fuq.n;
               }

               this.o = xj.a("multiplayer.status.ping", this.i.f);
               this.m = this.i.i;
         }
      }

      public void b() {
         this.g.J().b();
      }

      protected void a(flq $$0, int $$1, int $$2, alj $$3) {
         $$0.a(gjq::B, $$3, $$1, $$2, 0.0F, 0.0F, 32, 32, 32, 32);
      }

      private boolean e() {
         return true;
      }

      private boolean a(@Nullable byte[] $$0) {
         if ($$0 == null) {
            this.j.a();
         } else {
            try {
               this.j.a(fdr.a($$0));
            } catch (Throwable var3) {
               fuq.E.error("Invalid icon for server {} ({})", new Object[]{this.i.a, this.i.b, var3});
               return false;
            }
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (frw.t()) {
            fuq $$3 = this.g.s;
            int $$4 = $$3.aH_().indexOf(this);
            if ($$4 == -1) {
               return true;
            }

            if ($$0 == 264 && $$4 < this.g.J().c() - 1 || $$0 == 265 && $$4 > 0) {
               this.a($$4, $$0 == 264 ? $$4 + 1 : $$4 - 1);
               return true;
            }
         }

         return super.a($$0, $$1, $$2);
      }

      private void a(int $$0, int $$1) {
         this.g.J().a($$0, $$1);
         this.g.s.a(this.g.J());
         fuq.a $$2 = this.g.s.aH_().get($$1);
         this.g.s.a($$2);
         fuq.this.f($$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         double $$3 = $$0 - (double)fuq.this.s();
         double $$4 = $$1 - (double)fuq.this.g(fuq.this.aH_().indexOf(this));
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

            if ($$3 < 16.0 && $$4 > 16.0 && $$5 < this.g.J().c() - 1) {
               this.a($$5, $$5 + 1);
               return true;
            }
         }

         this.g.a(this);
         if (ae.c() - this.l < 250L) {
            this.g.m();
         }

         this.l = ae.c();
         return super.a($$0, $$1, $$2);
      }

      public gdv c() {
         return this.i;
      }

      @Override
      public xj a() {
         xx $$0 = xj.i();
         $$0.b(xj.a("narrator.select", this.i.a));
         $$0.b(xi.t);
         switch (this.i.g()) {
            case b:
               $$0.b(fuq.L);
               break;
            case d:
               $$0.b(fuq.J);
               $$0.b(xi.t);
               $$0.b(xj.a("multiplayer.status.version.narration", this.i.h));
               $$0.b(xi.t);
               $$0.b(xj.a("multiplayer.status.motd.narration", this.i.d));
               break;
            case c:
               $$0.b(fuq.K);
               break;
            default:
               $$0.b(fuq.M);
               $$0.b(xi.t);
               $$0.b(xj.a("multiplayer.status.ping.narration", this.i.f));
               $$0.b(xi.t);
               $$0.b(xj.a("multiplayer.status.motd.narration", this.i.d));
               if (this.i.e != null) {
                  $$0.b(xi.t);
                  $$0.b(xj.a("multiplayer.status.player_count.narration", this.i.e.b(), this.i.e.a()));
                  $$0.b(xi.t);
                  $$0.b(xm.a(this.i.i, xj.b(", ")));
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
