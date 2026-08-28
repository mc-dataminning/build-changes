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

public class gcm extends fuu<gcm.a> {
   static final alr a = alr.b("server_list/incompatible");
   static final alr m = alr.b("server_list/unreachable");
   static final alr n = alr.b("server_list/ping_1");
   static final alr o = alr.b("server_list/ping_2");
   static final alr p = alr.b("server_list/ping_3");
   static final alr q = alr.b("server_list/ping_4");
   static final alr r = alr.b("server_list/ping_5");
   static final alr s = alr.b("server_list/pinging_1");
   static final alr u = alr.b("server_list/pinging_2");
   static final alr v = alr.b("server_list/pinging_3");
   static final alr w = alr.b("server_list/pinging_4");
   static final alr x = alr.b("server_list/pinging_5");
   static final alr y = alr.b("server_list/join_highlighted");
   static final alr z = alr.b("server_list/join");
   static final alr A = alr.b("server_list/move_up_highlighted");
   static final alr B = alr.b("server_list/move_up");
   static final alr C = alr.b("server_list/move_down_highlighted");
   static final alr D = alr.b("server_list/move_down");
   static final Logger E = LogUtils.getLogger();
   static final ThreadPoolExecutor F = new ScheduledThreadPoolExecutor(
      5, new ThreadFactoryBuilder().setNameFormat("Server Pinger #%d").setDaemon(true).setUncaughtExceptionHandler(new s(E)).build()
   );
   static final xg G = xg.c("lanServer.scanning");
   static final xg H = xg.c("multiplayer.status.cannot_resolve").b(-65536);
   static final xg I = xg.c("multiplayer.status.cannot_connect").b(-65536);
   static final xg J = xg.c("multiplayer.status.incompatible");
   static final xg K = xg.c("multiplayer.status.no_connection");
   static final xg L = xg.c("multiplayer.status.pinging");
   static final xg M = xg.c("multiplayer.status.online");
   private final gci N;
   private final List<gcm.d> O = Lists.newArrayList();
   private final gcm.a P = new gcm.b();
   private final List<gcm.c> Q = Lists.newArrayList();

   public gcm(gci $$0, fqq $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$1, $$2, $$3, $$4, $$5);
      this.N = $$0;
   }

   private void c() {
      this.s();
      this.O.forEach($$1 -> this.b($$1));
      this.b(this.P);
      this.Q.forEach($$1 -> this.b($$1));
   }

   public void a(@Nullable gcm.a $$0) {
      super.a($$0);
      this.N.E();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      gcm.a $$3 = this.p();
      return $$3 != null && $$3.a($$0, $$1, $$2) || super.a($$0, $$1, $$2);
   }

   public void a(gme $$0) {
      this.O.clear();

      for (int $$1 = 0; $$1 < $$0.c(); $$1++) {
         this.O.add(new gcm.d(this.N, $$0.a($$1)));
      }

      this.c();
   }

   public void a(List<hpc> $$0) {
      int $$1 = $$0.size() - this.Q.size();
      this.Q.clear();

      for (hpc $$2 : $$0) {
         this.Q.add(new gcm.c(this.N, $$2));
      }

      this.c();

      for (int $$3 = this.Q.size() - $$1; $$3 < this.Q.size(); $$3++) {
         gcm.c $$4 = this.Q.get($$3);
         int $$5 = $$3 - this.Q.size() + this.aE_().size();
         int $$6 = this.d($$5);
         int $$7 = this.e($$5);
         if ($$7 >= this.G() && $$6 <= this.I()) {
            this.c.aY().b(xg.a("multiplayer.lan.server_found", $$4.c()));
         }
      }
   }

   @Override
   public int a() {
      return 305;
   }

   public void b() {
   }

   public abstract static class a extends fuu.a<gcm.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends gcm.a {
      private final fqq a = fqq.Q();

      @Override
      public void a(ftk $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.b(this.a.h, gcm.G, this.a.z.n / 2 - this.a.h.a(gcm.G) / 2, $$10, -1);
         String $$11 = fzf.a(ag.c());
         $$0.b(this.a.h, $$11, this.a.z.n / 2 - this.a.h.b($$11) / 2, $$10 + 9, -8355712);
      }

      @Override
      public xg a() {
         return gcm.G;
      }
   }

   public static class c extends gcm.a {
      private static final int c = 32;
      private static final xg d = xg.c("lanServer.title");
      private static final xg e = xg.c("selectServer.hiddenAddress");
      private final gci f;
      protected final fqq a;
      protected final hpc b;
      private long g;

      protected c(gci $$0, hpc $$1) {
         this.f = $$0;
         this.b = $$1;
         this.a = fqq.Q();
      }

      @Override
      public void a(ftk $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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

      public hpc b() {
         return this.b;
      }

      @Override
      public xg a() {
         return xg.a("narrator.select", this.c());
      }

      public xg c() {
         return xg.i().b(d).b(xf.v).f(this.b.a());
      }
   }

   public class d extends gcm.a {
      private static final int b = 32;
      private static final int c = 32;
      private static final int d = 5;
      private static final int e = 10;
      private static final int f = 8;
      private final gci g;
      private final fqq h;
      private final gmd i;
      private final fza j;
      @Nullable
      private byte[] k;
      private long l;
      @Nullable
      private List<xg> m;
      @Nullable
      private alr n;
      @Nullable
      private xg o;

      protected d(final gci $$1, final gmd $$2) {
         this.g = $$1;
         this.i = $$2;
         this.h = fqq.Q();
         this.j = fza.b(this.h.aa(), $$2.b);
         this.d();
      }

      @Override
      public void a(ftk $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.i.g() == gmd.b.a) {
            this.i.a(gmd.b.b);
            this.i.d = xf.a;
            this.i.c = xf.a;
            gcm.F.submit(() -> {
               try {
                  this.g.F().a(this.i, () -> this.h.execute(this::b), () -> {
                     this.i.a(this.i.g == ac.b().e() ? gmd.b.e : gmd.b.d);
                     this.h.execute(this::d);
                  });
               } catch (UnknownHostException var2x) {
                  this.i.a(gmd.b.c);
                  this.i.d = gcm.H;
                  this.h.execute(this::d);
               } catch (Exception var3x) {
                  this.i.a(gmd.b.c);
                  this.i.d = gcm.I;
                  this.h.execute(this::d);
               }
            });
         }

         $$0.b(this.h.h, this.i.a, $$3 + 32 + 3, $$2 + 1, -1);
         List<azk> $$10 = this.h.h.c(this.i.d, $$4 - 32 - 2);

         for (int $$11 = 0; $$11 < Math.min($$10.size(), 2); $$11++) {
            $$0.b(this.h.h, $$10.get($$11), $$3 + 32 + 3, $$2 + 12 + 9 * $$11, -8355712);
         }

         this.a($$0, $$3, $$2, this.j.b());
         if (this.i.g() == gmd.b.b) {
            int $$12 = (int)(ag.c() / 100L + (long)($$1 * 2) & 7L);
            if ($$12 > 4) {
               $$12 = 8 - $$12;
            }
            this.n = switch ($$12) {
               case 1 -> gcm.u;
               case 2 -> gcm.v;
               case 3 -> gcm.w;
               case 4 -> gcm.x;
               default -> gcm.s;
            };
         }

         int $$13 = $$3 + $$4 - 10 - 5;
         if (this.n != null) {
            $$0.a(gry::H, this.n, $$13, $$2, 10, 8);
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

         xg $$15 = (xg)(this.i.g() == gmd.b.d ? this.i.h.f().a(o.m) : this.i.c);
         int $$16 = this.h.h.a($$15);
         int $$17 = $$13 - $$16 - 5;
         $$0.b(this.h.h, $$15, $$17, $$2 + 1, -8355712);
         if (this.o != null && $$6 >= $$13 && $$6 <= $$13 + 10 && $$7 >= $$2 && $$7 <= $$2 + 8) {
            this.g.d(this.o);
         } else if (this.m != null && $$6 >= $$17 && $$6 <= $$17 + $$16 && $$7 >= $$2 && $$7 <= $$2 - 1 + 9) {
            this.g.b(Lists.transform(this.m, xg::g));
         }

         if (this.h.n.ac().c() || $$8) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$18 = $$6 - $$3;
            int $$19 = $$7 - $$2;
            if (this.e()) {
               if ($$18 < 32 && $$18 > 16) {
                  $$0.a(gry::H, gcm.y, $$3, $$2, 32, 32);
               } else {
                  $$0.a(gry::H, gcm.z, $$3, $$2, 32, 32);
               }
            }

            if ($$1 > 0) {
               if ($$18 < 16 && $$19 < 16) {
                  $$0.a(gry::H, gcm.A, $$3, $$2, 32, 32);
               } else {
                  $$0.a(gry::H, gcm.B, $$3, $$2, 32, 32);
               }
            }

            if ($$1 < this.g.G().c() - 1) {
               if ($$18 < 16 && $$19 > 16) {
                  $$0.a(gry::H, gcm.C, $$3, $$2, 32, 32);
               } else {
                  $$0.a(gry::H, gcm.D, $$3, $$2, 32, 32);
               }
            }
         }
      }

      private void d() {
         this.m = null;
         switch (this.i.g()) {
            case a:
            case b:
               this.n = gcm.n;
               this.o = gcm.L;
               break;
            case d:
               this.n = gcm.a;
               this.o = gcm.J;
               this.m = this.i.i;
               break;
            case c:
               this.n = gcm.m;
               this.o = gcm.K;
               break;
            case e:
               if (this.i.f < 150L) {
                  this.n = gcm.r;
               } else if (this.i.f < 300L) {
                  this.n = gcm.q;
               } else if (this.i.f < 600L) {
                  this.n = gcm.p;
               } else if (this.i.f < 1000L) {
                  this.n = gcm.o;
               } else {
                  this.n = gcm.n;
               }

               this.o = xg.a("multiplayer.status.ping", this.i.f);
               this.m = this.i.i;
         }
      }

      public void b() {
         this.g.G().b();
      }

      protected void a(ftk $$0, int $$1, int $$2, alr $$3) {
         $$0.a(gry::H, $$3, $$1, $$2, 0.0F, 0.0F, 32, 32, 32, 32);
      }

      private boolean e() {
         return true;
      }

      private boolean a(@Nullable byte[] $$0) {
         if ($$0 == null) {
            this.j.a();
         } else {
            try {
               this.j.a(fkf.a($$0));
            } catch (Throwable var3) {
               gcm.E.error("Invalid icon for server {} ({})", new Object[]{this.i.a, this.i.b, var3});
               return false;
            }
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fzq.t()) {
            gcm $$3 = this.g.s;
            int $$4 = $$3.aE_().indexOf(this);
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
         gcm.a $$2 = this.g.s.aE_().get($$1);
         this.g.s.a($$2);
         gcm.this.f($$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         double $$3 = $$0 - (double)gcm.this.u();
         double $$4 = $$1 - (double)gcm.this.d(gcm.this.aE_().indexOf(this));
         if ($$3 <= 32.0) {
            if ($$3 < 32.0 && $$3 > 16.0 && this.e()) {
               this.g.a(this);
               this.g.m();
               return true;
            }

            int $$5 = this.g.s.aE_().indexOf(this);
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

      public gmd c() {
         return this.i;
      }

      @Override
      public xg a() {
         xu $$0 = xg.i();
         $$0.b(xg.a("narrator.select", this.i.a));
         $$0.b(xf.t);
         switch (this.i.g()) {
            case b:
               $$0.b(gcm.L);
               break;
            case d:
               $$0.b(gcm.J);
               $$0.b(xf.t);
               $$0.b(xg.a("multiplayer.status.version.narration", this.i.h));
               $$0.b(xf.t);
               $$0.b(xg.a("multiplayer.status.motd.narration", this.i.d));
               break;
            case c:
               $$0.b(gcm.K);
               break;
            default:
               $$0.b(gcm.M);
               $$0.b(xf.t);
               $$0.b(xg.a("multiplayer.status.ping.narration", this.i.f));
               $$0.b(xf.t);
               $$0.b(xg.a("multiplayer.status.motd.narration", this.i.d));
               if (this.i.e != null) {
                  $$0.b(xf.t);
                  $$0.b(xg.a("multiplayer.status.player_count.narration", this.i.e.b(), this.i.e.a()));
                  $$0.b(xf.t);
                  $$0.b(xj.a(this.i.i, xg.b(", ")));
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
