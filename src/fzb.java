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

public class fzb extends frj<fzb.a> {
   static final ald a = ald.b("server_list/incompatible");
   static final ald m = ald.b("server_list/unreachable");
   static final ald n = ald.b("server_list/ping_1");
   static final ald o = ald.b("server_list/ping_2");
   static final ald p = ald.b("server_list/ping_3");
   static final ald q = ald.b("server_list/ping_4");
   static final ald r = ald.b("server_list/ping_5");
   static final ald s = ald.b("server_list/pinging_1");
   static final ald u = ald.b("server_list/pinging_2");
   static final ald v = ald.b("server_list/pinging_3");
   static final ald w = ald.b("server_list/pinging_4");
   static final ald x = ald.b("server_list/pinging_5");
   static final ald y = ald.b("server_list/join_highlighted");
   static final ald z = ald.b("server_list/join");
   static final ald A = ald.b("server_list/move_up_highlighted");
   static final ald B = ald.b("server_list/move_up");
   static final ald C = ald.b("server_list/move_down_highlighted");
   static final ald D = ald.b("server_list/move_down");
   static final Logger E = LogUtils.getLogger();
   static final ThreadPoolExecutor F = new ScheduledThreadPoolExecutor(
      5, new ThreadFactoryBuilder().setNameFormat("Server Pinger #%d").setDaemon(true).setUncaughtExceptionHandler(new r(E)).build()
   );
   static final wv G = wv.c("lanServer.scanning");
   static final wv H = wv.c("multiplayer.status.cannot_resolve").b(-65536);
   static final wv I = wv.c("multiplayer.status.cannot_connect").b(-65536);
   static final wv J = wv.c("multiplayer.status.incompatible");
   static final wv K = wv.c("multiplayer.status.no_connection");
   static final wv L = wv.c("multiplayer.status.pinging");
   static final wv M = wv.c("multiplayer.status.online");
   private final fyx N;
   private final List<fzb.d> O = Lists.newArrayList();
   private final fzb.a P = new fzb.b();
   private final List<fzb.c> Q = Lists.newArrayList();

   public fzb(fyx $$0, fnd $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$1, $$2, $$3, $$4, $$5);
      this.N = $$0;
   }

   private void c() {
      this.s();
      this.O.forEach($$1 -> this.b($$1));
      this.b(this.P);
      this.Q.forEach($$1 -> this.b($$1));
   }

   public void a(@Nullable fzb.a $$0) {
      super.a($$0);
      this.N.E();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      fzb.a $$3 = this.p();
      return $$3 != null && $$3.a($$0, $$1, $$2) || super.a($$0, $$1, $$2);
   }

   public void a(gip $$0) {
      this.O.clear();

      for (int $$1 = 0; $$1 < $$0.c(); $$1++) {
         this.O.add(new fzb.d(this.N, $$0.a($$1)));
      }

      this.c();
   }

   public void a(List<hle> $$0) {
      int $$1 = $$0.size() - this.Q.size();
      this.Q.clear();

      for (hle $$2 : $$0) {
         this.Q.add(new fzb.c(this.N, $$2));
      }

      this.c();

      for (int $$3 = this.Q.size() - $$1; $$3 < this.Q.size(); $$3++) {
         fzb.c $$4 = this.Q.get($$3);
         int $$5 = $$3 - this.Q.size() + this.aD_().size();
         int $$6 = this.d($$5);
         int $$7 = this.e($$5);
         if ($$7 >= this.G() && $$6 <= this.I()) {
            this.c.aY().b(wv.a("multiplayer.lan.server_found", $$4.c()));
         }
      }
   }

   @Override
   public int a() {
      return 305;
   }

   public void b() {
   }

   public abstract static class a extends frj.a<fzb.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends fzb.a {
      private final fnd a = fnd.Q();

      @Override
      public void a(fpz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.b(this.a.h, fzb.G, this.a.z.n / 2 - this.a.h.a(fzb.G) / 2, $$10, -1);
         String $$11 = fvu.a(af.c());
         $$0.b(this.a.h, $$11, this.a.z.n / 2 - this.a.h.b($$11) / 2, $$10 + 9, -8355712);
      }

      @Override
      public wv a() {
         return fzb.G;
      }
   }

   public static class c extends fzb.a {
      private static final int c = 32;
      private static final wv d = wv.c("lanServer.title");
      private static final wv e = wv.c("selectServer.hiddenAddress");
      private final fyx f;
      protected final fnd a;
      protected final hle b;
      private long g;

      protected c(fyx $$0, hle $$1) {
         this.f = $$0;
         this.b = $$1;
         this.a = fnd.Q();
      }

      @Override
      public void a(fpz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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

      public hle b() {
         return this.b;
      }

      @Override
      public wv a() {
         return wv.a("narrator.select", this.c());
      }

      public wv c() {
         return wv.i().b(d).b(wu.v).f(this.b.a());
      }
   }

   public class d extends fzb.a {
      private static final int b = 32;
      private static final int c = 32;
      private static final int d = 5;
      private static final int e = 10;
      private static final int f = 8;
      private final fyx g;
      private final fnd h;
      private final gio i;
      private final fvp j;
      @Nullable
      private byte[] k;
      private long l;
      @Nullable
      private List<wv> m;
      @Nullable
      private ald n;
      @Nullable
      private wv o;

      protected d(final fyx $$1, final gio $$2) {
         this.g = $$1;
         this.i = $$2;
         this.h = fnd.Q();
         this.j = fvp.b(this.h.aa(), $$2.b);
         this.d();
      }

      @Override
      public void a(fpz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.i.g() == gio.b.a) {
            this.i.a(gio.b.b);
            this.i.d = wu.a;
            this.i.c = wu.a;
            fzb.F.submit(() -> {
               try {
                  this.g.F().a(this.i, () -> this.h.execute(this::b), () -> {
                     this.i.a(this.i.g == ab.b().e() ? gio.b.e : gio.b.d);
                     this.h.execute(this::d);
                  });
               } catch (UnknownHostException var2x) {
                  this.i.a(gio.b.c);
                  this.i.d = fzb.H;
                  this.h.execute(this::d);
               } catch (Exception var3x) {
                  this.i.a(gio.b.c);
                  this.i.d = fzb.I;
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
         if (this.i.g() == gio.b.b) {
            int $$12 = (int)(af.c() / 100L + (long)($$1 * 2) & 7L);
            if ($$12 > 4) {
               $$12 = 8 - $$12;
            }
            this.n = switch ($$12) {
               case 1 -> fzb.u;
               case 2 -> fzb.v;
               case 3 -> fzb.w;
               case 4 -> fzb.x;
               default -> fzb.s;
            };
         }

         int $$13 = $$3 + $$4 - 10 - 5;
         if (this.n != null) {
            $$0.a(goi::H, this.n, $$13, $$2, 10, 8);
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

         wv $$15 = (wv)(this.i.g() == gio.b.d ? this.i.h.f().a(n.m) : this.i.c);
         int $$16 = this.h.h.a($$15);
         int $$17 = $$13 - $$16 - 5;
         $$0.b(this.h.h, $$15, $$17, $$2 + 1, -8355712);
         if (this.o != null && $$6 >= $$13 && $$6 <= $$13 + 10 && $$7 >= $$2 && $$7 <= $$2 + 8) {
            this.g.d(this.o);
         } else if (this.m != null && $$6 >= $$17 && $$6 <= $$17 + $$16 && $$7 >= $$2 && $$7 <= $$2 - 1 + 9) {
            this.g.b(Lists.transform(this.m, wv::g));
         }

         if (this.h.n.ac().c() || $$8) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$18 = $$6 - $$3;
            int $$19 = $$7 - $$2;
            if (this.e()) {
               if ($$18 < 32 && $$18 > 16) {
                  $$0.a(goi::H, fzb.y, $$3, $$2, 32, 32);
               } else {
                  $$0.a(goi::H, fzb.z, $$3, $$2, 32, 32);
               }
            }

            if ($$1 > 0) {
               if ($$18 < 16 && $$19 < 16) {
                  $$0.a(goi::H, fzb.A, $$3, $$2, 32, 32);
               } else {
                  $$0.a(goi::H, fzb.B, $$3, $$2, 32, 32);
               }
            }

            if ($$1 < this.g.G().c() - 1) {
               if ($$18 < 16 && $$19 > 16) {
                  $$0.a(goi::H, fzb.C, $$3, $$2, 32, 32);
               } else {
                  $$0.a(goi::H, fzb.D, $$3, $$2, 32, 32);
               }
            }
         }
      }

      private void d() {
         this.m = null;
         switch (this.i.g()) {
            case a:
            case b:
               this.n = fzb.n;
               this.o = fzb.L;
               break;
            case d:
               this.n = fzb.a;
               this.o = fzb.J;
               this.m = this.i.i;
               break;
            case c:
               this.n = fzb.m;
               this.o = fzb.K;
               break;
            case e:
               if (this.i.f < 150L) {
                  this.n = fzb.r;
               } else if (this.i.f < 300L) {
                  this.n = fzb.q;
               } else if (this.i.f < 600L) {
                  this.n = fzb.p;
               } else if (this.i.f < 1000L) {
                  this.n = fzb.o;
               } else {
                  this.n = fzb.n;
               }

               this.o = wv.a("multiplayer.status.ping", this.i.f);
               this.m = this.i.i;
         }
      }

      public void b() {
         this.g.G().b();
      }

      protected void a(fpz $$0, int $$1, int $$2, ald $$3) {
         $$0.a(goi::H, $$3, $$1, $$2, 0.0F, 0.0F, 32, 32, 32, 32);
      }

      private boolean e() {
         return true;
      }

      private boolean a(@Nullable byte[] $$0) {
         if ($$0 == null) {
            this.j.a();
         } else {
            try {
               this.j.a(fgo.a($$0));
            } catch (Throwable var3) {
               fzb.E.error("Invalid icon for server {} ({})", new Object[]{this.i.a, this.i.b, var3});
               return false;
            }
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fwf.t()) {
            fzb $$3 = this.g.s;
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
         fzb.a $$2 = this.g.s.aD_().get($$1);
         this.g.s.a($$2);
         fzb.this.f($$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         double $$3 = $$0 - (double)fzb.this.u();
         double $$4 = $$1 - (double)fzb.this.d(fzb.this.aD_().indexOf(this));
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

      public gio c() {
         return this.i;
      }

      @Override
      public wv a() {
         xj $$0 = wv.i();
         $$0.b(wv.a("narrator.select", this.i.a));
         $$0.b(wu.t);
         switch (this.i.g()) {
            case b:
               $$0.b(fzb.L);
               break;
            case d:
               $$0.b(fzb.J);
               $$0.b(wu.t);
               $$0.b(wv.a("multiplayer.status.version.narration", this.i.h));
               $$0.b(wu.t);
               $$0.b(wv.a("multiplayer.status.motd.narration", this.i.d));
               break;
            case c:
               $$0.b(fzb.K);
               break;
            default:
               $$0.b(fzb.M);
               $$0.b(wu.t);
               $$0.b(wv.a("multiplayer.status.ping.narration", this.i.f));
               $$0.b(wu.t);
               $$0.b(wv.a("multiplayer.status.motd.narration", this.i.d));
               if (this.i.e != null) {
                  $$0.b(wu.t);
                  $$0.b(wv.a("multiplayer.status.player_count.narration", this.i.e.b(), this.i.e.a()));
                  $$0.b(wu.t);
                  $$0.b(wy.a(this.i.i, wv.b(", ")));
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
