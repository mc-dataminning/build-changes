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

public class gcz extends fvh<gcz.a> {
   static final ali a = ali.b("server_list/incompatible");
   static final ali m = ali.b("server_list/unreachable");
   static final ali n = ali.b("server_list/ping_1");
   static final ali o = ali.b("server_list/ping_2");
   static final ali p = ali.b("server_list/ping_3");
   static final ali q = ali.b("server_list/ping_4");
   static final ali r = ali.b("server_list/ping_5");
   static final ali s = ali.b("server_list/pinging_1");
   static final ali u = ali.b("server_list/pinging_2");
   static final ali v = ali.b("server_list/pinging_3");
   static final ali w = ali.b("server_list/pinging_4");
   static final ali x = ali.b("server_list/pinging_5");
   static final ali y = ali.b("server_list/join_highlighted");
   static final ali z = ali.b("server_list/join");
   static final ali A = ali.b("server_list/move_up_highlighted");
   static final ali B = ali.b("server_list/move_up");
   static final ali C = ali.b("server_list/move_down_highlighted");
   static final ali D = ali.b("server_list/move_down");
   static final Logger E = LogUtils.getLogger();
   static final ThreadPoolExecutor F = new ScheduledThreadPoolExecutor(
      5, new ThreadFactoryBuilder().setNameFormat("Server Pinger #%d").setDaemon(true).setUncaughtExceptionHandler(new s(E)).build()
   );
   static final xa G = xa.c("lanServer.scanning");
   static final xa H = xa.c("multiplayer.status.cannot_resolve").b(-65536);
   static final xa I = xa.c("multiplayer.status.cannot_connect").b(-65536);
   static final xa J = xa.c("multiplayer.status.incompatible");
   static final xa K = xa.c("multiplayer.status.no_connection");
   static final xa L = xa.c("multiplayer.status.pinging");
   static final xa M = xa.c("multiplayer.status.online");
   private final gcv N;
   private final List<gcz.d> O = Lists.newArrayList();
   private final gcz.a P = new gcz.b();
   private final List<gcz.c> Q = Lists.newArrayList();

   public gcz(gcv $$0, frd $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$1, $$2, $$3, $$4, $$5);
      this.N = $$0;
   }

   private void c() {
      this.s();
      this.O.forEach($$1 -> this.b($$1));
      this.b(this.P);
      this.Q.forEach($$1 -> this.b($$1));
   }

   public void a(@Nullable gcz.a $$0) {
      super.a($$0);
      this.N.E();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      gcz.a $$3 = this.p();
      return $$3 != null && $$3.a($$0, $$1, $$2) || super.a($$0, $$1, $$2);
   }

   public void a(gmr $$0) {
      this.O.clear();

      for (int $$1 = 0; $$1 < $$0.c(); $$1++) {
         this.O.add(new gcz.d(this.N, $$0.a($$1)));
      }

      this.c();
   }

   public void a(List<hpm> $$0) {
      int $$1 = $$0.size() - this.Q.size();
      this.Q.clear();

      for (hpm $$2 : $$0) {
         this.Q.add(new gcz.c(this.N, $$2));
      }

      this.c();

      for (int $$3 = this.Q.size() - $$1; $$3 < this.Q.size(); $$3++) {
         gcz.c $$4 = this.Q.get($$3);
         int $$5 = $$3 - this.Q.size() + this.aI_().size();
         int $$6 = this.d($$5);
         int $$7 = this.e($$5);
         if ($$7 >= this.G() && $$6 <= this.I()) {
            this.c.aY().b(xa.a("multiplayer.lan.server_found", $$4.c()));
         }
      }
   }

   @Override
   public int a() {
      return 305;
   }

   public void b() {
   }

   public abstract static class a extends fvh.a<gcz.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends gcz.a {
      private final frd a = frd.Q();

      @Override
      public void a(ftx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.b(this.a.h, gcz.G, this.a.z.n / 2 - this.a.h.a(gcz.G) / 2, $$10, -1);
         String $$11 = fzs.a(ag.c());
         $$0.b(this.a.h, $$11, this.a.z.n / 2 - this.a.h.b($$11) / 2, $$10 + 9, -8355712);
      }

      @Override
      public xa a() {
         return gcz.G;
      }
   }

   public static class c extends gcz.a {
      private static final int c = 32;
      private static final xa d = xa.c("lanServer.title");
      private static final xa e = xa.c("selectServer.hiddenAddress");
      private final gcv f;
      protected final frd a;
      protected final hpm b;
      private long g;

      protected c(gcv $$0, hpm $$1) {
         this.f = $$0;
         this.b = $$1;
         this.a = frd.Q();
      }

      @Override
      public void a(ftx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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

      public hpm b() {
         return this.b;
      }

      @Override
      public xa a() {
         return xa.a("narrator.select", this.c());
      }

      public xa c() {
         return xa.i().b(d).b(wz.v).f(this.b.a());
      }
   }

   public class d extends gcz.a {
      private static final int b = 32;
      private static final int c = 32;
      private static final int d = 5;
      private static final int e = 10;
      private static final int f = 8;
      private final gcv g;
      private final frd h;
      private final gmq i;
      private final fzn j;
      @Nullable
      private byte[] k;
      private long l;
      @Nullable
      private List<xa> m;
      @Nullable
      private ali n;
      @Nullable
      private xa o;

      protected d(final gcv $$1, final gmq $$2) {
         this.g = $$1;
         this.i = $$2;
         this.h = frd.Q();
         this.j = fzn.b(this.h.aa(), $$2.b);
         this.d();
      }

      @Override
      public void a(ftx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.i.g() == gmq.b.a) {
            this.i.a(gmq.b.b);
            this.i.d = wz.a;
            this.i.c = wz.a;
            gcz.F.submit(() -> {
               try {
                  this.g.F().a(this.i, () -> this.h.execute(this::b), () -> {
                     this.i.a(this.i.g == ac.b().e() ? gmq.b.e : gmq.b.d);
                     this.h.execute(this::d);
                  });
               } catch (UnknownHostException var2x) {
                  this.i.a(gmq.b.c);
                  this.i.d = gcz.H;
                  this.h.execute(this::d);
               } catch (Exception var3x) {
                  this.i.a(gmq.b.c);
                  this.i.d = gcz.I;
                  this.h.execute(this::d);
               }
            });
         }

         $$0.b(this.h.h, this.i.a, $$3 + 32 + 3, $$2 + 1, -1);
         List<aza> $$10 = this.h.h.c(this.i.d, $$4 - 32 - 2);

         for (int $$11 = 0; $$11 < Math.min($$10.size(), 2); $$11++) {
            $$0.b(this.h.h, $$10.get($$11), $$3 + 32 + 3, $$2 + 12 + 9 * $$11, -8355712);
         }

         this.a($$0, $$3, $$2, this.j.b());
         if (this.i.g() == gmq.b.b) {
            int $$12 = (int)(ag.c() / 100L + (long)($$1 * 2) & 7L);
            if ($$12 > 4) {
               $$12 = 8 - $$12;
            }
            this.n = switch ($$12) {
               case 1 -> gcz.u;
               case 2 -> gcz.v;
               case 3 -> gcz.w;
               case 4 -> gcz.x;
               default -> gcz.s;
            };
         }

         int $$13 = $$3 + $$4 - 10 - 5;
         if (this.n != null) {
            $$0.a(gsl::H, this.n, $$13, $$2, 10, 8);
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

         xa $$15 = (xa)(this.i.g() == gmq.b.d ? this.i.h.f().a(o.m) : this.i.c);
         int $$16 = this.h.h.a($$15);
         int $$17 = $$13 - $$16 - 5;
         $$0.b(this.h.h, $$15, $$17, $$2 + 1, -8355712);
         if (this.o != null && $$6 >= $$13 && $$6 <= $$13 + 10 && $$7 >= $$2 && $$7 <= $$2 + 8) {
            this.g.d(this.o);
         } else if (this.m != null && $$6 >= $$17 && $$6 <= $$17 + $$16 && $$7 >= $$2 && $$7 <= $$2 - 1 + 9) {
            this.g.b(Lists.transform(this.m, xa::g));
         }

         if (this.h.n.ac().c() || $$8) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$18 = $$6 - $$3;
            int $$19 = $$7 - $$2;
            if (this.e()) {
               if ($$18 < 32 && $$18 > 16) {
                  $$0.a(gsl::H, gcz.y, $$3, $$2, 32, 32);
               } else {
                  $$0.a(gsl::H, gcz.z, $$3, $$2, 32, 32);
               }
            }

            if ($$1 > 0) {
               if ($$18 < 16 && $$19 < 16) {
                  $$0.a(gsl::H, gcz.A, $$3, $$2, 32, 32);
               } else {
                  $$0.a(gsl::H, gcz.B, $$3, $$2, 32, 32);
               }
            }

            if ($$1 < this.g.G().c() - 1) {
               if ($$18 < 16 && $$19 > 16) {
                  $$0.a(gsl::H, gcz.C, $$3, $$2, 32, 32);
               } else {
                  $$0.a(gsl::H, gcz.D, $$3, $$2, 32, 32);
               }
            }
         }
      }

      private void d() {
         this.m = null;
         switch (this.i.g()) {
            case a:
            case b:
               this.n = gcz.n;
               this.o = gcz.L;
               break;
            case d:
               this.n = gcz.a;
               this.o = gcz.J;
               this.m = this.i.i;
               break;
            case c:
               this.n = gcz.m;
               this.o = gcz.K;
               break;
            case e:
               if (this.i.f < 150L) {
                  this.n = gcz.r;
               } else if (this.i.f < 300L) {
                  this.n = gcz.q;
               } else if (this.i.f < 600L) {
                  this.n = gcz.p;
               } else if (this.i.f < 1000L) {
                  this.n = gcz.o;
               } else {
                  this.n = gcz.n;
               }

               this.o = xa.a("multiplayer.status.ping", this.i.f);
               this.m = this.i.i;
         }
      }

      public void b() {
         this.g.G().b();
      }

      protected void a(ftx $$0, int $$1, int $$2, ali $$3) {
         $$0.a(gsl::H, $$3, $$1, $$2, 0.0F, 0.0F, 32, 32, 32, 32);
      }

      private boolean e() {
         return true;
      }

      private boolean a(@Nullable byte[] $$0) {
         if ($$0 == null) {
            this.j.a();
         } else {
            try {
               this.j.a(fkg.a($$0));
            } catch (Throwable var3) {
               gcz.E.error("Invalid icon for server {} ({})", new Object[]{this.i.a, this.i.b, var3});
               return false;
            }
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (gad.t()) {
            gcz $$3 = this.g.s;
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
         gcz.a $$2 = this.g.s.aI_().get($$1);
         this.g.s.a($$2);
         gcz.this.f($$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         double $$3 = $$0 - (double)gcz.this.u();
         double $$4 = $$1 - (double)gcz.this.d(gcz.this.aI_().indexOf(this));
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

      public gmq c() {
         return this.i;
      }

      @Override
      public xa a() {
         xo $$0 = xa.i();
         $$0.b(xa.a("narrator.select", this.i.a));
         $$0.b(wz.t);
         switch (this.i.g()) {
            case b:
               $$0.b(gcz.L);
               break;
            case d:
               $$0.b(gcz.J);
               $$0.b(wz.t);
               $$0.b(xa.a("multiplayer.status.version.narration", this.i.h));
               $$0.b(wz.t);
               $$0.b(xa.a("multiplayer.status.motd.narration", this.i.d));
               break;
            case c:
               $$0.b(gcz.K);
               break;
            default:
               $$0.b(gcz.M);
               $$0.b(wz.t);
               $$0.b(xa.a("multiplayer.status.ping.narration", this.i.f));
               $$0.b(wz.t);
               $$0.b(xa.a("multiplayer.status.motd.narration", this.i.d));
               if (this.i.e != null) {
                  $$0.b(wz.t);
                  $$0.b(xa.a("multiplayer.status.player_count.narration", this.i.e.b(), this.i.e.a()));
                  $$0.b(wz.t);
                  $$0.b(xd.a(this.i.i, xa.b(", ")));
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
