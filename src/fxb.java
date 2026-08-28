import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fxb extends ful {
   public static final int a = 308;
   public static final int b = 100;
   public static final int c = 74;
   public static final int d = 64;
   private static final Logger u = LogUtils.getLogger();
   private final ggq v = new ggq();
   private final ful w;
   protected fxf s;
   private ggp x;
   private fot y;
   private fot z;
   private fot A;
   private ggo B;
   private hjf.b C;
   @Nullable
   private hjf.a D;
   private boolean E;

   public fxb(ful $$0) {
      super(wp.c("multiplayer.title"));
      this.w = $$0;
   }

   @Override
   protected void aR_() {
      if (this.E) {
         this.s.a(this.n, this.o - 64 - 32, 0, 32);
      } else {
         this.E = true;
         this.x = new ggp(this.m);
         this.x.a();
         this.C = new hjf.b();

         try {
            this.D = new hjf.a(this.C);
            this.D.start();
         } catch (Exception var8) {
            u.warn("Unable to start LAN server detection: {}", var8.getMessage());
         }

         this.s = new fxf(this, this.m, this.n, this.o - 64 - 32, 32, 36);
         this.s.a(this.x);
      }

      this.c(this.s);
      this.z = this.c(fot.a(wp.c("selectServer.select"), $$0 -> this.m()).a(100).a());
      fot $$1 = this.c(fot.a(wp.c("selectServer.direct"), $$0 -> {
         this.B = new ggo(hga.a("selectServer.defaultName"), "", ggo.c.c);
         this.m.a(new ftr(this, this::h, this.B));
      }).a(100).a());
      fot $$2 = this.c(fot.a(wp.c("selectServer.add"), $$0 -> {
         this.B = new ggo(hga.a("selectServer.defaultName"), "", ggo.c.c);
         this.m.a(new ftt(this, this::g, this.B));
      }).a(100).a());
      this.y = this.c(fot.a(wp.c("selectServer.edit"), $$0 -> {
         fxf.a $$1x = this.s.p();
         if ($$1x instanceof fxf.d) {
            ggo $$2x = ((fxf.d)$$1x).c();
            this.B = new ggo($$2x.a, $$2x.b, ggo.c.c);
            this.B.b($$2x);
            this.m.a(new ftt(this, this::f, this.B));
         }
      }).a(74).a());
      this.A = this.c(fot.a(wp.c("selectServer.delete"), $$0 -> {
         fxf.a $$1x = this.s.p();
         if ($$1x instanceof fxf.d) {
            String $$2x = ((fxf.d)$$1x).c().a;
            if ($$2x != null) {
               wp $$3x = wp.c("selectServer.deleteQuestion");
               wp $$4x = wp.a("selectServer.deleteWarning", $$2x);
               wp $$5x = wp.c("selectServer.deleteButton");
               wp $$6x = wo.e;
               this.m.a(new ftj(this::c, $$3x, $$4x, $$5x, $$6x));
            }
         }
      }).a(74).a());
      fot $$3 = this.c(fot.a(wp.c("selectServer.refresh"), $$0 -> this.H()).a(74).a());
      fot $$4 = this.c(fot.a(wo.k, $$0 -> this.aO_()).a(74).a());
      fsl $$5 = fsl.d();
      fse $$6 = $$5.a(new fse(308, 20, fse.b.a));
      $$6.a(this.z);
      $$6.a($$1);
      $$6.a($$2);
      $$5.a(fsm.b(4));
      fse $$7 = $$5.a(new fse(308, 20, fse.b.a));
      $$7.a(this.y);
      $$7.a(this.A);
      $$7.a($$3);
      $$7.a($$4);
      $$5.a();
      fsf.a($$5, 0, this.o - 64, this.n, 64);
      this.E();
   }

   @Override
   public void aO_() {
      this.m.a(this.w);
   }

   @Override
   public void e() {
      super.e();
      List<hje> $$0 = this.C.a();
      if ($$0 != null) {
         this.s.a($$0);
      }

      this.v.a();
   }

   @Override
   public void aI_() {
      if (this.D != null) {
         this.D.interrupt();
         this.D = null;
      }

      this.v.b();
      this.s.b();
   }

   private void H() {
      this.m.a(new fxb(this.w));
   }

   private void c(boolean $$0) {
      fxf.a $$1 = this.s.p();
      if ($$0 && $$1 instanceof fxf.d) {
         this.x.a(((fxf.d)$$1).c());
         this.x.b();
         this.s.a(null);
         this.s.a(this.x);
      }

      this.m.a(this);
   }

   private void f(boolean $$0) {
      fxf.a $$1 = this.s.p();
      if ($$0 && $$1 instanceof fxf.d) {
         ggo $$2 = ((fxf.d)$$1).c();
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
         ggo $$1 = this.x.b(this.B.b);
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
         ggo $$1 = this.x.a(this.B.b);
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
         if (fsv.a($$0)) {
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
   public void a(foe $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 20, 16777215);
   }

   public void m() {
      fxf.a $$0 = this.s.p();
      if ($$0 instanceof fxf.d) {
         this.a(((fxf.d)$$0).c());
      } else if ($$0 instanceof fxf.c) {
         hje $$1 = ((fxf.c)$$0).b();
         this.a(new ggo($$1.a(), $$1.b(), ggo.c.a));
      }
   }

   private void a(ggo $$0) {
      ftk.a(this, this.m, ghr.a($$0.b), $$0, false, null);
   }

   public void a(fxf.a $$0) {
      this.s.a($$0);
      this.E();
   }

   protected void E() {
      this.z.j = false;
      this.y.j = false;
      this.A.j = false;
      fxf.a $$0 = this.s.p();
      if ($$0 != null && !($$0 instanceof fxf.b)) {
         this.z.j = true;
         if ($$0 instanceof fxf.d) {
            this.y.j = true;
            this.A.j = true;
         }
      }
   }

   public ggq F() {
      return this.v;
   }

   public ggp G() {
      return this.x;
   }
}
