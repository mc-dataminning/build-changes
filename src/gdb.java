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

public class gdb extends fvj<gdb.a> {
   static final alk a = alk.b("server_list/incompatible");
   static final alk m = alk.b("server_list/unreachable");
   static final alk n = alk.b("server_list/ping_1");
   static final alk o = alk.b("server_list/ping_2");
   static final alk p = alk.b("server_list/ping_3");
   static final alk q = alk.b("server_list/ping_4");
   static final alk r = alk.b("server_list/ping_5");
   static final alk s = alk.b("server_list/pinging_1");
   static final alk u = alk.b("server_list/pinging_2");
   static final alk v = alk.b("server_list/pinging_3");
   static final alk w = alk.b("server_list/pinging_4");
   static final alk x = alk.b("server_list/pinging_5");
   static final alk y = alk.b("server_list/join_highlighted");
   static final alk z = alk.b("server_list/join");
   static final alk A = alk.b("server_list/move_up_highlighted");
   static final alk B = alk.b("server_list/move_up");
   static final alk C = alk.b("server_list/move_down_highlighted");
   static final alk D = alk.b("server_list/move_down");
   static final Logger E = LogUtils.getLogger();
   static final ThreadPoolExecutor F = new ScheduledThreadPoolExecutor(
      5, new ThreadFactoryBuilder().setNameFormat("Server Pinger #%d").setDaemon(true).setUncaughtExceptionHandler(new s(E)).build()
   );
   static final xc G = xc.c("lanServer.scanning");
   static final xc H = xc.c("multiplayer.status.cannot_resolve").b(-65536);
   static final xc I = xc.c("multiplayer.status.cannot_connect").b(-65536);
   static final xc J = xc.c("multiplayer.status.incompatible");
   static final xc K = xc.c("multiplayer.status.no_connection");
   static final xc L = xc.c("multiplayer.status.pinging");
   static final xc M = xc.c("multiplayer.status.online");
   private final gcx N;
   private final List<gdb.d> O = Lists.newArrayList();
   private final gdb.a P = new gdb.b();
   private final List<gdb.c> Q = Lists.newArrayList();

   public gdb(gcx $$0, frf $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$1, $$2, $$3, $$4, $$5);
      this.N = $$0;
   }

   private void c() {
      this.s();
      this.O.forEach($$1 -> this.b($$1));
      this.b(this.P);
      this.Q.forEach($$1 -> this.b($$1));
   }

   public void a(@Nullable gdb.a $$0) {
      super.a($$0);
      this.N.E();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      gdb.a $$3 = this.p();
      return $$3 != null && $$3.a($$0, $$1, $$2) || super.a($$0, $$1, $$2);
   }

   public void a(gmt $$0) {
      this.O.clear();

      for (int $$1 = 0; $$1 < $$0.c(); $$1++) {
         this.O.add(new gdb.d(this.N, $$0.a($$1)));
      }

      this.c();
   }

   public void a(List<hpo> $$0) {
      int $$1 = $$0.size() - this.Q.size();
      this.Q.clear();

      for (hpo $$2 : $$0) {
         this.Q.add(new gdb.c(this.N, $$2));
      }

      this.c();

      for (int $$3 = this.Q.size() - $$1; $$3 < this.Q.size(); $$3++) {
         gdb.c $$4 = this.Q.get($$3);
         int $$5 = $$3 - this.Q.size() + this.aI_().size();
         int $$6 = this.d($$5);
         int $$7 = this.e($$5);
         if ($$7 >= this.G() && $$6 <= this.I()) {
            this.c.aY().b(xc.a("multiplayer.lan.server_found", $$4.c()));
         }
      }
   }

   @Override
   public int a() {
      return 305;
   }

   public void b() {
   }

   public abstract static class a extends fvj.a<gdb.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends gdb.a {
      private final frf a = frf.Q();

      @Override
      public void a(ftz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.b(this.a.h, gdb.G, this.a.z.n / 2 - this.a.h.a(gdb.G) / 2, $$10, -1);
         String $$11 = fzu.a(ag.c());
         $$0.b(this.a.h, $$11, this.a.z.n / 2 - this.a.h.b($$11) / 2, $$10 + 9, -8355712);
      }

      @Override
      public xc a() {
         return gdb.G;
      }
   }

   public static class c extends gdb.a {
      private static final int c = 32;
      private static final xc d = xc.c("lanServer.title");
      private static final xc e = xc.c("selectServer.hiddenAddress");
      private final gcx f;
      protected final frf a;
      protected final hpo b;
      private long g;

      protected c(gcx $$0, hpo $$1) {
         this.f = $$0;
         this.b = $$1;
         this.a = frf.Q();
      }

      @Override
      public void a(ftz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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
         if (ag.c() - this.g < 250L) {
            this.f.m();
         }

         this.g = ag.c();
         return super.a($$0, $$1, $$2);
      }

      public hpo b() {
         return this.b;
      }

      @Override
      public xc a() {
         return xc.a("narrator.select", this.c());
      }

      public xc c() {
         return xc.i().b(d).b(xb.v).f(this.b.a());
      }
   }

   public class d extends gdb.a {
      private static final int b = 32;
      private static final int c = 32;
      private static final int d = 5;
      private static final int e = 10;
      private static final int f = 8;
      private final gcx g;
      private final frf h;
      private final gms i;
      private final fzp j;
      @Nullable
      private byte[] k;
      private long l;
      @Nullable
      private List<xc> m;
      @Nullable
      private alk n;
      @Nullable
      private xc o;

      protected d(final gcx $$1, final gms $$2) {
         this.g = $$1;
         this.i = $$2;
         this.h = frf.Q();
         this.j = fzp.b(this.h.aa(), $$2.b);
         this.d();
      }

      @Override
      public void a(ftz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.i.g() == gms.b.a) {
            this.i.a(gms.b.b);
            this.i.d = xb.a;
            this.i.c = xb.a;
            gdb.F.submit(() -> {
               try {
                  this.g.F().a(this.i, () -> this.h.execute(this::b), () -> {
                     this.i.a(this.i.g == ac.b().e() ? gms.b.e : gms.b.d);
                     this.h.execute(this::d);
                  });
               } catch (UnknownHostException var2x) {
                  this.i.a(gms.b.c);
                  this.i.d = gdb.H;
                  this.h.execute(this::d);
               } catch (Exception var3x) {
                  this.i.a(gms.b.c);
                  this.i.d = gdb.I;
                  this.h.execute(this::d);
               }
            });
         }

         $$0.b(this.h.h, this.i.a, $$3 + 32 + 3, $$2 + 1, -1);
         List<azc> $$10 = this.h.h.c(this.i.d, $$4 - 32 - 2);

         for (int $$11 = 0; $$11 < Math.min($$10.size(), 2); $$11++) {
            $$0.b(this.h.h, $$10.get($$11), $$3 + 32 + 3, $$2 + 12 + 9 * $$11, -8355712);
         }

         this.a($$0, $$3, $$2, this.j.b());
         if (this.i.g() == gms.b.b) {
            int $$12 = (int)(ag.c() / 100L + (long)($$1 * 2) & 7L);
            if ($$12 > 4) {
               $$12 = 8 - $$12;
            }
            this.n = switch ($$12) {
               case 1 -> gdb.u;
               case 2 -> gdb.v;
               case 3 -> gdb.w;
               case 4 -> gdb.x;
               default -> gdb.s;
            };
         }

         int $$13 = $$3 + $$4 - 10 - 5;
         if (this.n != null) {
            $$0.a(gsn::H, this.n, $$13, $$2, 10, 8);
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

         xc $$15 = (xc)(this.i.g() == gms.b.d ? this.i.h.f().a(o.m) : this.i.c);
         int $$16 = this.h.h.a($$15);
         int $$17 = $$13 - $$16 - 5;
         $$0.b(this.h.h, $$15, $$17, $$2 + 1, -8355712);
         if (this.o != null && $$6 >= $$13 && $$6 <= $$13 + 10 && $$7 >= $$2 && $$7 <= $$2 + 8) {
            this.g.d(this.o);
         } else if (this.m != null && $$6 >= $$17 && $$6 <= $$17 + $$16 && $$7 >= $$2 && $$7 <= $$2 - 1 + 9) {
            this.g.b(Lists.transform(this.m, xc::g));
         }

         if (this.h.n.ac().c() || $$8) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$18 = $$6 - $$3;
            int $$19 = $$7 - $$2;
            if (this.e()) {
               if ($$18 < 32 && $$18 > 16) {
                  $$0.a(gsn::H, gdb.y, $$3, $$2, 32, 32);
               } else {
                  $$0.a(gsn::H, gdb.z, $$3, $$2, 32, 32);
               }
            }

            if ($$1 > 0) {
               if ($$18 < 16 && $$19 < 16) {
                  $$0.a(gsn::H, gdb.A, $$3, $$2, 32, 32);
               } else {
                  $$0.a(gsn::H, gdb.B, $$3, $$2, 32, 32);
               }
            }

            if ($$1 < this.g.G().c() - 1) {
               if ($$18 < 16 && $$19 > 16) {
                  $$0.a(gsn::H, gdb.C, $$3, $$2, 32, 32);
               } else {
                  $$0.a(gsn::H, gdb.D, $$3, $$2, 32, 32);
               }
            }
         }
      }

      private void d() {
         this.m = null;
         switch (this.i.g()) {
            case a:
            case b:
               this.n = gdb.n;
               this.o = gdb.L;
               break;
            case d:
               this.n = gdb.a;
               this.o = gdb.J;
               this.m = this.i.i;
               break;
            case c:
               this.n = gdb.m;
               this.o = gdb.K;
               break;
            case e:
               if (this.i.f < 150L) {
                  this.n = gdb.r;
               } else if (this.i.f < 300L) {
                  this.n = gdb.q;
               } else if (this.i.f < 600L) {
                  this.n = gdb.p;
               } else if (this.i.f < 1000L) {
                  this.n = gdb.o;
               } else {
                  this.n = gdb.n;
               }

               this.o = xc.a("multiplayer.status.ping", this.i.f);
               this.m = this.i.i;
         }
      }

      public void b() {
         this.g.G().b();
      }

      protected void a(ftz $$0, int $$1, int $$2, alk $$3) {
         $$0.a(gsn::H, $$3, $$1, $$2, 0.0F, 0.0F, 32, 32, 32, 32);
      }

      private boolean e() {
         return true;
      }

      private boolean a(@Nullable byte[] $$0) {
         if ($$0 == null) {
            this.j.a();
         } else {
            try {
               this.j.a(fki.a($$0));
            } catch (Throwable var3) {
               gdb.E.error("Invalid icon for server {} ({})", new Object[]{this.i.a, this.i.b, var3});
               return false;
            }
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (gaf.t()) {
            gdb $$3 = this.g.s;
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
         gdb.a $$2 = this.g.s.aI_().get($$1);
         this.g.s.a($$2);
         gdb.this.f($$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         double $$3 = $$0 - (double)gdb.this.u();
         double $$4 = $$1 - (double)gdb.this.d(gdb.this.aI_().indexOf(this));
         if ($$3 <= 32.0) {
            if ($$3 < 32.0 && $$3 > 16.0 && this.e()) {
               this.g.a(this);
               this.g.m();
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
         if (ag.c() - this.l < 250L) {
            this.g.m();
         }

         this.l = ag.c();
         return super.a($$0, $$1, $$2);
      }

      public gms c() {
         return this.i;
      }

      @Override
      public xc a() {
         xq $$0 = xc.i();
         $$0.b(xc.a("narrator.select", this.i.a));
         $$0.b(xb.t);
         switch (this.i.g()) {
            case b:
               $$0.b(gdb.L);
               break;
            case d:
               $$0.b(gdb.J);
               $$0.b(xb.t);
               $$0.b(xc.a("multiplayer.status.version.narration", this.i.h));
               $$0.b(xb.t);
               $$0.b(xc.a("multiplayer.status.motd.narration", this.i.d));
               break;
            case c:
               $$0.b(gdb.K);
               break;
            default:
               $$0.b(gdb.M);
               $$0.b(xb.t);
               $$0.b(xc.a("multiplayer.status.ping.narration", this.i.f));
               $$0.b(xb.t);
               $$0.b(xc.a("multiplayer.status.motd.narration", this.i.d));
               if (this.i.e != null) {
                  $$0.b(xb.t);
                  $$0.b(xc.a("multiplayer.status.player_count.narration", this.i.e.b(), this.i.e.a()));
                  $$0.b(xb.t);
                  $$0.b(xf.a(this.i.i, xc.b(", ")));
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
