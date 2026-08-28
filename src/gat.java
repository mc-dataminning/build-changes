import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gat extends fyb {
   public static final int a = 308;
   public static final int b = 100;
   public static final int c = 74;
   public static final int d = 64;
   private static final Logger u = LogUtils.getLogger();
   private final gkq v = new gkq();
   private final fyb w;
   protected gax s;
   private gkp x;
   private fsj y;
   private fsj z;
   private fsj A;
   private gko B;
   private hnk.b C;
   @Nullable
   private hnk.a D;
   private boolean E;

   public gat(fyb $$0) {
      super(wy.c("multiplayer.title"));
      this.w = $$0;
   }

   @Override
   protected void aO_() {
      if (this.E) {
         this.s.a(this.n, this.o - 64 - 32, 0, 32);
      } else {
         this.E = true;
         this.x = new gkp(this.m);
         this.x.a();
         this.C = new hnk.b();

         try {
            this.D = new hnk.a(this.C);
            this.D.start();
         } catch (Exception var8) {
            u.warn("Unable to start LAN server detection: {}", var8.getMessage());
         }

         this.s = new gax(this, this.m, this.n, this.o - 64 - 32, 32, 36);
         this.s.a(this.x);
      }

      this.c(this.s);
      this.z = this.c(fsj.a(wy.c("selectServer.select"), $$0 -> this.m()).a(100).a());
      fsj $$1 = this.c(fsj.a(wy.c("selectServer.direct"), $$0 -> {
         this.B = new gko(hke.a("selectServer.defaultName"), "", gko.c.c);
         this.m.a(new fxh(this, this::h, this.B));
      }).a(100).a());
      fsj $$2 = this.c(fsj.a(wy.c("selectServer.add"), $$0 -> {
         this.B = new gko(hke.a("selectServer.defaultName"), "", gko.c.c);
         this.m.a(new fxj(this, this::g, this.B));
      }).a(100).a());
      this.y = this.c(fsj.a(wy.c("selectServer.edit"), $$0 -> {
         gax.a $$1x = this.s.p();
         if ($$1x instanceof gax.d) {
            gko $$2x = ((gax.d)$$1x).c();
            this.B = new gko($$2x.a, $$2x.b, gko.c.c);
            this.B.b($$2x);
            this.m.a(new fxj(this, this::f, this.B));
         }
      }).a(74).a());
      this.A = this.c(fsj.a(wy.c("selectServer.delete"), $$0 -> {
         gax.a $$1x = this.s.p();
         if ($$1x instanceof gax.d) {
            String $$2x = ((gax.d)$$1x).c().a;
            if ($$2x != null) {
               wy $$3x = wy.c("selectServer.deleteQuestion");
               wy $$4x = wy.a("selectServer.deleteWarning", $$2x);
               wy $$5x = wy.c("selectServer.deleteButton");
               wy $$6x = wx.e;
               this.m.a(new fwz(this::c, $$3x, $$4x, $$5x, $$6x));
            }
         }
      }).a(74).a());
      fsj $$3 = this.c(fsj.a(wy.c("selectServer.refresh"), $$0 -> this.H()).a(74).a());
      fsj $$4 = this.c(fsj.a(wx.k, $$0 -> this.aL_()).a(74).a());
      fwb $$5 = fwb.d();
      fvu $$6 = $$5.a(new fvu(308, 20, fvu.b.a));
      $$6.a(this.z);
      $$6.a($$1);
      $$6.a($$2);
      $$5.a(fwc.b(4));
      fvu $$7 = $$5.a(new fvu(308, 20, fvu.b.a));
      $$7.a(this.y);
      $$7.a(this.A);
      $$7.a($$3);
      $$7.a($$4);
      $$5.a();
      fvv.a($$5, 0, this.o - 64, this.n, 64);
      this.E();
   }

   @Override
   public void aL_() {
      this.m.a(this.w);
   }

   @Override
   public void e() {
      super.e();
      List<hnj> $$0 = this.C.a();
      if ($$0 != null) {
         this.s.a($$0);
      }

      this.v.a();
   }

   @Override
   public void aF_() {
      if (this.D != null) {
         this.D.interrupt();
         this.D = null;
      }

      this.v.b();
      this.s.b();
   }

   private void H() {
      this.m.a(new gat(this.w));
   }

   private void c(boolean $$0) {
      gax.a $$1 = this.s.p();
      if ($$0 && $$1 instanceof gax.d) {
         this.x.a(((gax.d)$$1).c());
         this.x.b();
         this.s.a(null);
         this.s.a(this.x);
      }

      this.m.a(this);
   }

   private void f(boolean $$0) {
      gax.a $$1 = this.s.p();
      if ($$0 && $$1 instanceof gax.d) {
         gko $$2 = ((gax.d)$$1).c();
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
         gko $$1 = this.x.b(this.B.b);
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
         gko $$1 = this.x.a(this.B.b);
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
         if (fwl.a($$0)) {
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
   public void a(frv $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 20, 16777215);
   }

   public void m() {
      gax.a $$0 = this.s.p();
      if ($$0 instanceof gax.d) {
         this.a(((gax.d)$$0).c());
      } else if ($$0 instanceof gax.c) {
         hnj $$1 = ((gax.c)$$0).b();
         this.a(new gko($$1.a(), $$1.b(), gko.c.a));
      }
   }

   private void a(gko $$0) {
      fxa.a(this, this.m, glr.a($$0.b), $$0, false, null);
   }

   public void a(gax.a $$0) {
      this.s.a($$0);
      this.E();
   }

   protected void E() {
      this.z.j = false;
      this.y.j = false;
      this.A.j = false;
      gax.a $$0 = this.s.p();
      if ($$0 != null && !($$0 instanceof gax.b)) {
         this.z.j = true;
         if ($$0 instanceof gax.d) {
            this.y.j = true;
            this.A.j = true;
         }
      }
   }

   public gkq F() {
      return this.v;
   }

   public gkp G() {
      return this.x;
   }
}
