import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gcx extends gaf {
   public static final int a = 308;
   public static final int b = 100;
   public static final int c = 74;
   public static final int d = 64;
   private static final Logger u = LogUtils.getLogger();
   private final gmu v = new gmu();
   private final gaf w;
   protected gdb s;
   private gmt x;
   private fun y;
   private fun z;
   private fun A;
   private gms B;
   private hpp.b C;
   @Nullable
   private hpp.a D;
   private boolean E;

   public gcx(gaf $$0) {
      super(xc.c("multiplayer.title"));
      this.w = $$0;
   }

   @Override
   protected void aS_() {
      if (this.E) {
         this.s.a(this.n, this.o - 64 - 32, 0, 32);
      } else {
         this.E = true;
         this.x = new gmt(this.m);
         this.x.a();
         this.C = new hpp.b();

         try {
            this.D = new hpp.a(this.C);
            this.D.start();
         } catch (Exception var8) {
            u.warn("Unable to start LAN server detection: {}", var8.getMessage());
         }

         this.s = new gdb(this, this.m, this.n, this.o - 64 - 32, 32, 36);
         this.s.a(this.x);
      }

      this.c(this.s);
      this.z = this.c(fun.a(xc.c("selectServer.select"), $$0 -> this.m()).a(100).a());
      fun $$1 = this.c(fun.a(xc.c("selectServer.direct"), $$0 -> {
         this.B = new gms(hmk.a("selectServer.defaultName"), "", gms.c.c);
         this.m.a(new fzl(this, this::h, this.B));
      }).a(100).a());
      fun $$2 = this.c(fun.a(xc.c("selectServer.add"), $$0 -> {
         this.B = new gms(hmk.a("selectServer.defaultName"), "", gms.c.c);
         this.m.a(new fzn(this, this::g, this.B));
      }).a(100).a());
      this.y = this.c(fun.a(xc.c("selectServer.edit"), $$0 -> {
         gdb.a $$1x = this.s.p();
         if ($$1x instanceof gdb.d) {
            gms $$2x = ((gdb.d)$$1x).c();
            this.B = new gms($$2x.a, $$2x.b, gms.c.c);
            this.B.b($$2x);
            this.m.a(new fzn(this, this::f, this.B));
         }
      }).a(74).a());
      this.A = this.c(fun.a(xc.c("selectServer.delete"), $$0 -> {
         gdb.a $$1x = this.s.p();
         if ($$1x instanceof gdb.d) {
            String $$2x = ((gdb.d)$$1x).c().a;
            if ($$2x != null) {
               xc $$3x = xc.c("selectServer.deleteQuestion");
               xc $$4x = xc.a("selectServer.deleteWarning", $$2x);
               xc $$5x = xc.c("selectServer.deleteButton");
               xc $$6x = xb.e;
               this.m.a(new fzd(this::c, $$3x, $$4x, $$5x, $$6x));
            }
         }
      }).a(74).a());
      fun $$3 = this.c(fun.a(xc.c("selectServer.refresh"), $$0 -> this.H()).a(74).a());
      fun $$4 = this.c(fun.a(xb.k, $$0 -> this.aP_()).a(74).a());
      fyf $$5 = fyf.d();
      fxy $$6 = $$5.a(new fxy(308, 20, fxy.b.a));
      $$6.a(this.z);
      $$6.a($$1);
      $$6.a($$2);
      $$5.a(fyg.b(4));
      fxy $$7 = $$5.a(new fxy(308, 20, fxy.b.a));
      $$7.a(this.y);
      $$7.a(this.A);
      $$7.a($$3);
      $$7.a($$4);
      $$5.a();
      fxz.a($$5, 0, this.o - 64, this.n, 64);
      this.E();
   }

   @Override
   public void aP_() {
      this.m.a(this.w);
   }

   @Override
   public void e() {
      super.e();
      List<hpo> $$0 = this.C.a();
      if ($$0 != null) {
         this.s.a($$0);
      }

      this.v.a();
   }

   @Override
   public void aJ_() {
      if (this.D != null) {
         this.D.interrupt();
         this.D = null;
      }

      this.v.b();
      this.s.b();
   }

   private void H() {
      this.m.a(new gcx(this.w));
   }

   private void c(boolean $$0) {
      gdb.a $$1 = this.s.p();
      if ($$0 && $$1 instanceof gdb.d) {
         this.x.a(((gdb.d)$$1).c());
         this.x.b();
         this.s.a(null);
         this.s.a(this.x);
      }

      this.m.a(this);
   }

   private void f(boolean $$0) {
      gdb.a $$1 = this.s.p();
      if ($$0 && $$1 instanceof gdb.d) {
         gms $$2 = ((gdb.d)$$1).c();
         $$2.a = this.B.a;
         $$2.b = this.B.b;
         $$2.b(this.B);
         this.x.b();
         this.s.a(this.x);
      }

      this.m.a(this);
   }

   private void g(boolean $$0) {
      if ($$0) {
         gms $$1 = this.x.b(this.B.b);
         if ($$1 != null) {
            $$1.a(this.B);
            this.x.b();
         } else {
            this.x.a(this.B, false);
            this.x.b();
         }

         this.s.a(null);
         this.s.a(this.x);
      }

      this.m.a(this);
   }

   private void h(boolean $$0) {
      if ($$0) {
         gms $$1 = this.x.a(this.B.b);
         if ($$1 == null) {
            this.x.a(this.B, true);
            this.x.b();
            this.a(this.B);
         } else {
            this.a($$1);
         }
      } else {
         this.m.a(this);
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         return true;
      } else if ($$0 == 294) {
         this.H();
         return true;
      } else if (this.s.p() != null) {
         if (fyp.a($$0)) {
            this.m();
            return true;
         } else {
            return this.s.a($$0, $$1, $$2);
         }
      } else {
         return false;
      }
   }

   @Override
   public void a(ftz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 20, 16777215);
   }

   public void m() {
      gdb.a $$0 = this.s.p();
      if ($$0 instanceof gdb.d) {
         this.a(((gdb.d)$$0).c());
      } else if ($$0 instanceof gdb.c) {
         hpo $$1 = ((gdb.c)$$0).b();
         this.a(new gms($$1.a(), $$1.b(), gms.c.a));
      }
   }

   private void a(gms $$0) {
      fze.a(this, this.m, gnv.a($$0.b), $$0, false, null);
   }

   public void a(gdb.a $$0) {
      this.s.a($$0);
      this.E();
   }

   protected void E() {
      this.z.j = false;
      this.y.j = false;
      this.A.j = false;
      gdb.a $$0 = this.s.p();
      if ($$0 != null && !($$0 instanceof gdb.b)) {
         this.z.j = true;
         if ($$0 instanceof gdb.d) {
            this.y.j = true;
            this.A.j = true;
         }
      }
   }

   public gmu F() {
      return this.v;
   }

   public gmt G() {
      return this.x;
   }
}
