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

public class fxe extends fpo<fxe.a> {
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
   private final fxa N;
   private final List<fxe.d> O = Lists.newArrayList();
   private final fxe.a P = new fxe.b();
   private final List<fxe.c> Q = Lists.newArrayList();

   public fxe(fxa $$0, fli $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$1, $$2, $$3, $$4, $$5);
      this.N = $$0;
   }

   private void c() {
      this.s();
      this.O.forEach($$1 -> this.b($$1));
      this.b(this.P);
      this.Q.forEach($$1 -> this.b($$1));
   }

   public void a(@Nullable fxe.a $$0) {
      super.a($$0);
      this.N.E();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      fxe.a $$3 = this.p();
      return $$3 != null && $$3.a($$0, $$1, $$2) || super.a($$0, $$1, $$2);
   }

   public void a(ggo $$0) {
      this.O.clear();

      for (int $$1 = 0; $$1 < $$0.c(); $$1++) {
         this.O.add(new fxe.d(this.N, $$0.a($$1)));
      }

      this.c();
   }

   public void a(List<hjd> $$0) {
      int $$1 = $$0.size() - this.Q.size();
      this.Q.clear();

      for (hjd $$2 : $$0) {
         this.Q.add(new fxe.c(this.N, $$2));
      }

      this.c();

      for (int $$3 = this.Q.size() - $$1; $$3 < this.Q.size(); $$3++) {
         fxe.c $$4 = this.Q.get($$3);
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

   public abstract static class a extends fpo.a<fxe.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends fxe.a {
      private final fli a = fli.Q();

      @Override
      public void a(fod $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.b(this.a.h, fxe.G, this.a.z.n / 2 - this.a.h.a(fxe.G) / 2, $$10, -1);
         String $$11 = ftz.a(af.c());
         $$0.b(this.a.h, $$11, this.a.z.n / 2 - this.a.h.b($$11) / 2, $$10 + 9, -8355712);
      }

      @Override
      public wp a() {
         return fxe.G;
      }
   }

   public static class c extends fxe.a {
      private static final int c = 32;
      private static final wp d = wp.c("lanServer.title");
      private static final wp e = wp.c("selectServer.hiddenAddress");
      private final fxa f;
      protected final fli a;
      protected final hjd b;
      private long g;

      protected c(fxa $$0, hjd $$1) {
         this.f = $$0;
         this.b = $$1;
         this.a = fli.Q();
      }

      @Override
      public void a(fod $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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

      public hjd b() {
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

   public class d extends fxe.a {
      private static final int b = 32;
      private static final int c = 32;
      private static final int d = 5;
      private static final int e = 10;
      private static final int f = 8;
      private final fxa g;
      private final fli h;
      private final ggn i;
      private final ftu j;
      @Nullable
      private byte[] k;
      private long l;
      @Nullable
      private List<wp> m;
      @Nullable
      private akv n;
      @Nullable
      private wp o;

      protected d(final fxa $$1, final ggn $$2) {
         this.g = $$1;
         this.i = $$2;
         this.h = fli.Q();
         this.j = ftu.b(this.h.aa(), $$2.b);
         this.d();
      }

      @Override
      public void a(fod $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.i.g() == ggn.b.a) {
            this.i.a(ggn.b.b);
            this.i.d = wo.a;
            this.i.c = wo.a;
            fxe.F.submit(() -> {
               try {
                  this.g.F().a(this.i, () -> this.h.execute(this::b), () -> {
                     this.i.a(this.i.g == ab.b().e() ? ggn.b.e : ggn.b.d);
                     this.h.execute(this::d);
                  });
               } catch (UnknownHostException var2x) {
                  this.i.a(ggn.b.c);
                  this.i.d = fxe.H;
                  this.h.execute(this::d);
               } catch (Exception var3x) {
                  this.i.a(ggn.b.c);
                  this.i.d = fxe.I;
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
         if (this.i.g() == ggn.b.b) {
            int $$12 = (int)(af.c() / 100L + (long)($$1 * 2) & 7L);
            if ($$12 > 4) {
               $$12 = 8 - $$12;
            }
            this.n = switch ($$12) {
               case 1 -> fxe.u;
               case 2 -> fxe.v;
               case 3 -> fxe.w;
               case 4 -> fxe.x;
               default -> fxe.s;
            };
         }

         int $$13 = $$3 + $$4 - 10 - 5;
         if (this.n != null) {
            $$0.a(gmh::H, this.n, $$13, $$2, 10, 8);
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

         wp $$15 = (wp)(this.i.g() == ggn.b.d ? this.i.h.f().a(n.m) : this.i.c);
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
                  $$0.a(gmh::H, fxe.y, $$3, $$2, 32, 32);
               } else {
                  $$0.a(gmh::H, fxe.z, $$3, $$2, 32, 32);
               }
            }

            if ($$1 > 0) {
               if ($$18 < 16 && $$19 < 16) {
                  $$0.a(gmh::H, fxe.A, $$3, $$2, 32, 32);
               } else {
                  $$0.a(gmh::H, fxe.B, $$3, $$2, 32, 32);
               }
            }

            if ($$1 < this.g.G().c() - 1) {
               if ($$18 < 16 && $$19 > 16) {
                  $$0.a(gmh::H, fxe.C, $$3, $$2, 32, 32);
               } else {
                  $$0.a(gmh::H, fxe.D, $$3, $$2, 32, 32);
               }
            }
         }
      }

      private void d() {
         this.m = null;
         switch (this.i.g()) {
            case a:
            case b:
               this.n = fxe.n;
               this.o = fxe.L;
               break;
            case d:
               this.n = fxe.a;
               this.o = fxe.J;
               this.m = this.i.i;
               break;
            case c:
               this.n = fxe.m;
               this.o = fxe.K;
               break;
            case e:
               if (this.i.f < 150L) {
                  this.n = fxe.r;
               } else if (this.i.f < 300L) {
                  this.n = fxe.q;
               } else if (this.i.f < 600L) {
                  this.n = fxe.p;
               } else if (this.i.f < 1000L) {
                  this.n = fxe.o;
               } else {
                  this.n = fxe.n;
               }

               this.o = wp.a("multiplayer.status.ping", this.i.f);
               this.m = this.i.i;
         }
      }

      public void b() {
         this.g.G().b();
      }

      protected void a(fod $$0, int $$1, int $$2, akv $$3) {
         $$0.a(gmh::H, $$3, $$1, $$2, 0.0F, 0.0F, 32, 32, 32, 32);
      }

      private boolean e() {
         return true;
      }

      private boolean a(@Nullable byte[] $$0) {
         if ($$0 == null) {
            this.j.a();
         } else {
            try {
               this.j.a(fet.a($$0));
            } catch (Throwable var3) {
               fxe.E.error("Invalid icon for server {} ({})", new Object[]{this.i.a, this.i.b, var3});
               return false;
            }
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fuk.t()) {
            fxe $$3 = this.g.s;
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
         fxe.a $$2 = this.g.s.aH_().get($$1);
         this.g.s.a($$2);
         fxe.this.f($$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         double $$3 = $$0 - (double)fxe.this.u();
         double $$4 = $$1 - (double)fxe.this.d(fxe.this.aH_().indexOf(this));
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

      public ggn c() {
         return this.i;
      }

      @Override
      public wp a() {
         xd $$0 = wp.i();
         $$0.b(wp.a("narrator.select", this.i.a));
         $$0.b(wo.t);
         switch (this.i.g()) {
            case b:
               $$0.b(fxe.L);
               break;
            case d:
               $$0.b(fxe.J);
               $$0.b(wo.t);
               $$0.b(wp.a("multiplayer.status.version.narration", this.i.h));
               $$0.b(wo.t);
               $$0.b(wp.a("multiplayer.status.motd.narration", this.i.d));
               break;
            case c:
               $$0.b(fxe.K);
               break;
            default:
               $$0.b(fxe.M);
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
