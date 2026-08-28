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

public class fxf extends fpp<fxf.a> {
   static final akv a = akv.b("server_list/incompatible");
   static final akv m = akv.b("server_list/unreachable");
   static final akv n = akv.b("server_list/ping_1");
   static final akv o = akv.b("server_list/ping_2");
   static final akv p = akv.b("server_list/ping_3");
   static final akv q = akv.b("server_list/ping_4");
   static final akv r = akv.b("server_list/ping_5");
   static final akv s = akv.b("server_list/pinging_1");
   static final akv u = akv.b("server_list/pinging_2");
   static final akv v = akv.b("server_list/pinging_3");
   static final akv w = akv.b("server_list/pinging_4");
   static final akv x = akv.b("server_list/pinging_5");
   static final akv y = akv.b("server_list/join_highlighted");
   static final akv z = akv.b("server_list/join");
   static final akv A = akv.b("server_list/move_up_highlighted");
   static final akv B = akv.b("server_list/move_up");
   static final akv C = akv.b("server_list/move_down_highlighted");
   static final akv D = akv.b("server_list/move_down");
   static final Logger E = LogUtils.getLogger();
   static final ThreadPoolExecutor F = new ScheduledThreadPoolExecutor(
      5, new ThreadFactoryBuilder().setNameFormat("Server Pinger #%d").setDaemon(true).setUncaughtExceptionHandler(new r(E)).build()
   );
   static final wp G = wp.c("lanServer.scanning");
   static final wp H = wp.c("multiplayer.status.cannot_resolve").b(-65536);
   static final wp I = wp.c("multiplayer.status.cannot_connect").b(-65536);
   static final wp J = wp.c("multiplayer.status.incompatible");
   static final wp K = wp.c("multiplayer.status.no_connection");
   static final wp L = wp.c("multiplayer.status.pinging");
   static final wp M = wp.c("multiplayer.status.online");
   private final fxb N;
   private final List<fxf.d> O = Lists.newArrayList();
   private final fxf.a P = new fxf.b();
   private final List<fxf.c> Q = Lists.newArrayList();

   public fxf(fxb $$0, flj $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$1, $$2, $$3, $$4, $$5);
      this.N = $$0;
   }

   private void c() {
      this.s();
      this.O.forEach($$1 -> this.b($$1));
      this.b(this.P);
      this.Q.forEach($$1 -> this.b($$1));
   }

   public void a(@Nullable fxf.a $$0) {
      super.a($$0);
      this.N.E();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      fxf.a $$3 = this.p();
      return $$3 != null && $$3.a($$0, $$1, $$2) || super.a($$0, $$1, $$2);
   }

   public void a(ggp $$0) {
      this.O.clear();

      for (int $$1 = 0; $$1 < $$0.c(); $$1++) {
         this.O.add(new fxf.d(this.N, $$0.a($$1)));
      }

      this.c();
   }

   public void a(List<hje> $$0) {
      int $$1 = $$0.size() - this.Q.size();
      this.Q.clear();

      for (hje $$2 : $$0) {
         this.Q.add(new fxf.c(this.N, $$2));
      }

      this.c();

      for (int $$3 = this.Q.size() - $$1; $$3 < this.Q.size(); $$3++) {
         fxf.c $$4 = this.Q.get($$3);
         int $$5 = $$3 - this.Q.size() + this.aH_().size();
         int $$6 = this.d($$5);
         int $$7 = this.e($$5);
         if ($$7 >= this.G() && $$6 <= this.I()) {
            this.c.aY().b(wp.a("multiplayer.lan.server_found", $$4.c()));
         }
      }
   }

   @Override
   public int a() {
      return 305;
   }

   public void b() {
   }

   public abstract static class a extends fpp.a<fxf.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends fxf.a {
      private final flj a = flj.Q();

      @Override
      public void a(foe $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.b(this.a.h, fxf.G, this.a.z.n / 2 - this.a.h.a(fxf.G) / 2, $$10, -1);
         String $$11 = fua.a(af.c());
         $$0.b(this.a.h, $$11, this.a.z.n / 2 - this.a.h.b($$11) / 2, $$10 + 9, -8355712);
      }

      @Override
      public wp a() {
         return fxf.G;
      }
   }

   public static class c extends fxf.a {
      private static final int c = 32;
      private static final wp d = wp.c("lanServer.title");
      private static final wp e = wp.c("selectServer.hiddenAddress");
      private final fxb f;
      protected final flj a;
      protected final hje b;
      private long g;

      protected c(fxb $$0, hje $$1) {
         this.f = $$0;
         this.b = $$1;
         this.a = flj.Q();
      }

      @Override
      public void a(foe $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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

      public hje b() {
         return this.b;
      }

      @Override
      public wp a() {
         return wp.a("narrator.select", this.c());
      }

      public wp c() {
         return wp.i().b(d).b(wo.v).f(this.b.a());
      }
   }

   public class d extends fxf.a {
      private static final int b = 32;
      private static final int c = 32;
      private static final int d = 5;
      private static final int e = 10;
      private static final int f = 8;
      private final fxb g;
      private final flj h;
      private final ggo i;
      private final ftv j;
      @Nullable
      private byte[] k;
      private long l;
      @Nullable
      private List<wp> m;
      @Nullable
      private akv n;
      @Nullable
      private wp o;

      protected d(final fxb $$1, final ggo $$2) {
         this.g = $$1;
         this.i = $$2;
         this.h = flj.Q();
         this.j = ftv.b(this.h.aa(), $$2.b);
         this.d();
      }

      @Override
      public void a(foe $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.i.g() == ggo.b.a) {
            this.i.a(ggo.b.b);
            this.i.d = wo.a;
            this.i.c = wo.a;
            fxf.F.submit(() -> {
               try {
                  this.g.F().a(this.i, () -> this.h.execute(this::b), () -> {
                     this.i.a(this.i.g == ab.b().e() ? ggo.b.e : ggo.b.d);
                     this.h.execute(this::d);
                  });
               } catch (UnknownHostException var2x) {
                  this.i.a(ggo.b.c);
                  this.i.d = fxf.H;
                  this.h.execute(this::d);
               } catch (Exception var3x) {
                  this.i.a(ggo.b.c);
                  this.i.d = fxf.I;
                  this.h.execute(this::d);
               }
            });
         }

         $$0.b(this.h.h, this.i.a, $$3 + 32 + 3, $$2 + 1, -1);
         List<ayl> $$10 = this.h.h.c(this.i.d, $$4 - 32 - 2);

         for (int $$11 = 0; $$11 < Math.min($$10.size(), 2); $$11++) {
            $$0.b(this.h.h, $$10.get($$11), $$3 + 32 + 3, $$2 + 12 + 9 * $$11, -8355712);
         }

         this.a($$0, $$3, $$2, this.j.b());
         if (this.i.g() == ggo.b.b) {
            int $$12 = (int)(af.c() / 100L + (long)($$1 * 2) & 7L);
            if ($$12 > 4) {
               $$12 = 8 - $$12;
            }
            this.n = switch ($$12) {
               case 1 -> fxf.u;
               case 2 -> fxf.v;
               case 3 -> fxf.w;
               case 4 -> fxf.x;
               default -> fxf.s;
            };
         }

         int $$13 = $$3 + $$4 - 10 - 5;
         if (this.n != null) {
            $$0.a(gmi::H, this.n, $$13, $$2, 10, 8);
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

         wp $$15 = (wp)(this.i.g() == ggo.b.d ? this.i.h.f().a(n.m) : this.i.c);
         int $$16 = this.h.h.a($$15);
         int $$17 = $$13 - $$16 - 5;
         $$0.b(this.h.h, $$15, $$17, $$2 + 1, -8355712);
         if (this.o != null && $$6 >= $$13 && $$6 <= $$13 + 10 && $$7 >= $$2 && $$7 <= $$2 + 8) {
            this.g.d(this.o);
         } else if (this.m != null && $$6 >= $$17 && $$6 <= $$17 + $$16 && $$7 >= $$2 && $$7 <= $$2 - 1 + 9) {
            this.g.b(Lists.transform(this.m, wp::g));
         }

         if (this.h.n.ac().c() || $$8) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$18 = $$6 - $$3;
            int $$19 = $$7 - $$2;
            if (this.e()) {
               if ($$18 < 32 && $$18 > 16) {
                  $$0.a(gmi::H, fxf.y, $$3, $$2, 32, 32);
               } else {
                  $$0.a(gmi::H, fxf.z, $$3, $$2, 32, 32);
               }
            }

            if ($$1 > 0) {
               if ($$18 < 16 && $$19 < 16) {
                  $$0.a(gmi::H, fxf.A, $$3, $$2, 32, 32);
               } else {
                  $$0.a(gmi::H, fxf.B, $$3, $$2, 32, 32);
               }
            }

            if ($$1 < this.g.G().c() - 1) {
               if ($$18 < 16 && $$19 > 16) {
                  $$0.a(gmi::H, fxf.C, $$3, $$2, 32, 32);
               } else {
                  $$0.a(gmi::H, fxf.D, $$3, $$2, 32, 32);
               }
            }
         }
      }

      private void d() {
         this.m = null;
         switch (this.i.g()) {
            case a:
            case b:
               this.n = fxf.n;
               this.o = fxf.L;
               break;
            case d:
               this.n = fxf.a;
               this.o = fxf.J;
               this.m = this.i.i;
               break;
            case c:
               this.n = fxf.m;
               this.o = fxf.K;
               break;
            case e:
               if (this.i.f < 150L) {
                  this.n = fxf.r;
               } else if (this.i.f < 300L) {
                  this.n = fxf.q;
               } else if (this.i.f < 600L) {
                  this.n = fxf.p;
               } else if (this.i.f < 1000L) {
                  this.n = fxf.o;
               } else {
                  this.n = fxf.n;
               }

               this.o = wp.a("multiplayer.status.ping", this.i.f);
               this.m = this.i.i;
         }
      }

      public void b() {
         this.g.G().b();
      }

      protected void a(foe $$0, int $$1, int $$2, akv $$3) {
         $$0.a(gmi::H, $$3, $$1, $$2, 0.0F, 0.0F, 32, 32, 32, 32);
      }

      private boolean e() {
         return true;
      }

      private boolean a(@Nullable byte[] $$0) {
         if ($$0 == null) {
            this.j.a();
         } else {
            try {
               this.j.a(feu.a($$0));
            } catch (Throwable var3) {
               fxf.E.error("Invalid icon for server {} ({})", new Object[]{this.i.a, this.i.b, var3});
               return false;
            }
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (ful.t()) {
            fxf $$3 = this.g.s;
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
         fxf.a $$2 = this.g.s.aH_().get($$1);
         this.g.s.a($$2);
         fxf.this.f($$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         double $$3 = $$0 - (double)fxf.this.u();
         double $$4 = $$1 - (double)fxf.this.d(fxf.this.aH_().indexOf(this));
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

      public ggo c() {
         return this.i;
      }

      @Override
      public wp a() {
         xd $$0 = wp.i();
         $$0.b(wp.a("narrator.select", this.i.a));
         $$0.b(wo.t);
         switch (this.i.g()) {
            case b:
               $$0.b(fxf.L);
               break;
            case d:
               $$0.b(fxf.J);
               $$0.b(wo.t);
               $$0.b(wp.a("multiplayer.status.version.narration", this.i.h));
               $$0.b(wo.t);
               $$0.b(wp.a("multiplayer.status.motd.narration", this.i.d));
               break;
            case c:
               $$0.b(fxf.K);
               break;
            default:
               $$0.b(fxf.M);
               $$0.b(wo.t);
               $$0.b(wp.a("multiplayer.status.ping.narration", this.i.f));
               $$0.b(wo.t);
               $$0.b(wp.a("multiplayer.status.motd.narration", this.i.d));
               if (this.i.e != null) {
                  $$0.b(wo.t);
                  $$0.b(wp.a("multiplayer.status.player_count.narration", this.i.e.b(), this.i.e.a()));
                  $$0.b(wo.t);
                  $$0.b(ws.a(this.i.i, wp.b(", ")));
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
