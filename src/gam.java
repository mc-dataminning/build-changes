import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gam extends fxu {
   public static final int a = 308;
   public static final int b = 100;
   public static final int c = 74;
   public static final int d = 64;
   private static final Logger u = LogUtils.getLogger();
   private final gki v = new gki();
   private final fxu w;
   protected gaq s;
   private gkh x;
   private fsc y;
   private fsc z;
   private fsc A;
   private gkg B;
   private hnc.b C;
   @Nullable
   private hnc.a D;
   private boolean E;

   public gam(fxu $$0) {
      super(wy.c("multiplayer.title"));
      this.w = $$0;
   }

   @Override
   protected void aN_() {
      if (this.E) {
         this.s.a(this.n, this.o - 64 - 32, 0, 32);
      } else {
         this.E = true;
         this.x = new gkh(this.m);
         this.x.a();
         this.C = new hnc.b();

         try {
            this.D = new hnc.a(this.C);
            this.D.start();
         } catch (Exception var8) {
            u.warn("Unable to start LAN server detection: {}", var8.getMessage());
         }

         this.s = new gaq(this, this.m, this.n, this.o - 64 - 32, 32, 36);
         this.s.a(this.x);
      }

      this.c(this.s);
      this.z = this.c(fsc.a(wy.c("selectServer.select"), $$0 -> this.m()).a(100).a());
      fsc $$1 = this.c(fsc.a(wy.c("selectServer.direct"), $$0 -> {
         this.B = new gkg(hjw.a("selectServer.defaultName"), "", gkg.c.c);
         this.m.a(new fxa(this, this::h, this.B));
      }).a(100).a());
      fsc $$2 = this.c(fsc.a(wy.c("selectServer.add"), $$0 -> {
         this.B = new gkg(hjw.a("selectServer.defaultName"), "", gkg.c.c);
         this.m.a(new fxc(this, this::g, this.B));
      }).a(100).a());
      this.y = this.c(fsc.a(wy.c("selectServer.edit"), $$0 -> {
         gaq.a $$1x = this.s.p();
         if ($$1x instanceof gaq.d) {
            gkg $$2x = ((gaq.d)$$1x).c();
            this.B = new gkg($$2x.a, $$2x.b, gkg.c.c);
            this.B.b($$2x);
            this.m.a(new fxc(this, this::f, this.B));
         }
      }).a(74).a());
      this.A = this.c(fsc.a(wy.c("selectServer.delete"), $$0 -> {
         gaq.a $$1x = this.s.p();
         if ($$1x instanceof gaq.d) {
            String $$2x = ((gaq.d)$$1x).c().a;
            if ($$2x != null) {
               wy $$3x = wy.c("selectServer.deleteQuestion");
               wy $$4x = wy.a("selectServer.deleteWarning", $$2x);
               wy $$5x = wy.c("selectServer.deleteButton");
               wy $$6x = wx.e;
               this.m.a(new fws(this::c, $$3x, $$4x, $$5x, $$6x));
            }
         }
      }).a(74).a());
      fsc $$3 = this.c(fsc.a(wy.c("selectServer.refresh"), $$0 -> this.H()).a(74).a());
      fsc $$4 = this.c(fsc.a(wx.k, $$0 -> this.aK_()).a(74).a());
      fvu $$5 = fvu.d();
      fvn $$6 = $$5.a(new fvn(308, 20, fvn.b.a));
      $$6.a(this.z);
      $$6.a($$1);
      $$6.a($$2);
      $$5.a(fvv.b(4));
      fvn $$7 = $$5.a(new fvn(308, 20, fvn.b.a));
      $$7.a(this.y);
      $$7.a(this.A);
      $$7.a($$3);
      $$7.a($$4);
      $$5.a();
      fvo.a($$5, 0, this.o - 64, this.n, 64);
      this.E();
   }

   @Override
   public void aK_() {
      this.m.a(this.w);
   }

   @Override
   public void e() {
      super.e();
      List<hnb> $$0 = this.C.a();
      if ($$0 != null) {
         this.s.a($$0);
      }

      this.v.a();
   }

   @Override
   public void aE_() {
      if (this.D != null) {
         this.D.interrupt();
         this.D = null;
      }

      this.v.b();
      this.s.b();
   }

   private void H() {
      this.m.a(new gam(this.w));
   }

   private void c(boolean $$0) {
      gaq.a $$1 = this.s.p();
      if ($$0 && $$1 instanceof gaq.d) {
         this.x.a(((gaq.d)$$1).c());
         this.x.b();
         this.s.a(null);
         this.s.a(this.x);
      }

      this.m.a(this);
   }

   private void f(boolean $$0) {
      gaq.a $$1 = this.s.p();
      if ($$0 && $$1 instanceof gaq.d) {
         gkg $$2 = ((gaq.d)$$1).c();
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
         gkg $$1 = this.x.b(this.B.b);
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
         gkg $$1 = this.x.a(this.B.b);
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
         if (fwe.a($$0)) {
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
   public void a(fro $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 20, 16777215);
   }

   public void m() {
      gaq.a $$0 = this.s.p();
      if ($$0 instanceof gaq.d) {
         this.a(((gaq.d)$$0).c());
      } else if ($$0 instanceof gaq.c) {
         hnb $$1 = ((gaq.c)$$0).b();
         this.a(new gkg($$1.a(), $$1.b(), gkg.c.a));
      }
   }

   private void a(gkg $$0) {
      fwt.a(this, this.m, glj.a($$0.b), $$0, false, null);
   }

   public void a(gaq.a $$0) {
      this.s.a($$0);
      this.E();
   }

   protected void E() {
      this.z.j = false;
      this.y.j = false;
      this.A.j = false;
      gaq.a $$0 = this.s.p();
      if ($$0 != null && !($$0 instanceof gaq.b)) {
         this.z.j = true;
         if ($$0 instanceof gaq.d) {
            this.y.j = true;
            this.A.j = true;
         }
      }
   }

   public gki F() {
      return this.v;
   }

   public gkh G() {
      return this.x;
   }
}
