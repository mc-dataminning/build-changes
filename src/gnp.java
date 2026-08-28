public class gnp<T extends cjs> extends gmr<T, gtq> {
   public static final int a = 5;
   public static final int b = 30;
   private final gnq h;
   private final ggu i;
   private final ghu j;

   public gnp(gms.a $$0) {
      super($$0);
      this.h = $$0.b();
      this.i = $$0.c();
      this.j = $$0.d();
   }

   protected int a(T $$0, je $$1) {
      return $$0.ao() == btq.V ? Math.max(5, super.a($$0, $$1)) : super.a($$0, $$1);
   }

   public void a(gtq $$0, fcu $$1, ggv $$2, int $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$1.a();
      jj $$4 = $$0.a;
      eye $$5 = this.a($$0);
      $$1.a(-$$5.a(), -$$5.b(), -$$5.c());
      double $$6 = 0.46875;
      $$1.a((double)$$4.j() * 0.46875, (double)$$4.k() * 0.46875, (double)$$4.l() * 0.46875);
      float $$7;
      float $$8;
      if ($$4.o().d()) {
         $$7 = 0.0F;
         $$8 = 180.0F - $$4.p();
      } else {
         $$7 = (float)(-90 * $$4.f().a());
         $$8 = 180.0F;
      }

      $$1.a(a.b.rotationDegrees($$7));
      $$1.a(a.d.rotationDegrees($$8));
      cvl $$11 = $$0.b;
      if (!$$0.u) {
         gyw $$12 = this.j.a().a();
         gyx $$13 = this.a($$0.d, $$11);
         $$1.a();
         $$1.a(-0.5F, -0.5F, -0.5F);
         this.j.b().a($$1.c(), $$2.getBuffer(ghe.d(this.b($$0))), null, $$12.a($$13), 1.0F, 1.0F, 1.0F, $$3, gwb.d);
         $$1.b();
      }

      if (!$$11.f()) {
         ert $$14 = $$0.f;
         if ($$0.u) {
            $$1.a(0.0F, 0.0F, 0.5F);
         } else {
            $$1.a(0.0F, 0.0F, 0.4375F);
         }

         int $$15 = $$14 != null ? $$0.c % 4 * 2 : $$0.c;
         $$1.a(a.f.rotationDegrees((float)$$15 * 360.0F / 8.0F));
         if ($$14 != null) {
            $$1.a(a.f.rotationDegrees(180.0F));
            float $$16 = 0.0078125F;
            $$1.b(0.0078125F, 0.0078125F, 0.0078125F);
            $$1.a(-64.0F, -64.0F, 0.0F);
            $$1.a(0.0F, 0.0F, -1.0F);
            int $$17 = this.a($$0.d, 15728850, $$3);
            this.i.a($$0.g, $$1, $$2, true, $$17);
         } else if ($$0.e != null) {
            int $$18 = this.a($$0.d, 15728880, $$3);
            $$1.b(0.5F, 0.5F, 0.5F);
            this.h.a($$11, cvi.i, false, $$1, $$2, $$18, gwb.d, $$0.e);
         }
      }

      $$1.b();
   }

   private int a(boolean $$0, int $$1, int $$2) {
      return $$0 ? $$1 : $$2;
   }

   private gyx a(boolean $$0, cvl $$1) {
      if ($$1.a(cvo.rV)) {
         return $$0 ? gyo.a : gyo.c;
      } else {
         return $$0 ? gyo.b : gyo.d;
      }
   }

   public eye a(gtq $$0) {
      return new eye((double)((float)$$0.a.j() * 0.3F), -0.25, (double)((float)$$0.a.l() * 0.3F));
   }

   public alb b(gtq $$0) {
      return gwj.d;
   }

   protected boolean a(T $$0, double $$1) {
      return fib.M() && !$$0.C().f() && $$0.C().b(kr.g) && this.e.c == $$0;
   }

   protected xd a(T $$0) {
      return $$0.C().y();
   }

   public gtq a() {
      return new gtq();
   }

   public void a(T $$0, gtq $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.cL();
      $$1.b = $$0.C().u();
      $$1.c = $$0.E();
      $$1.d = $$0.ao() == btq.V;
      $$1.e = null;
      $$1.f = null;
      if (!$$1.b.f()) {
         ert $$3 = $$0.a($$1.b);
         if ($$3 != null) {
            erv $$4 = $$0.dS().a($$3);
            if ($$4 != null) {
               this.i.a($$3, $$4, $$1.g);
               $$1.f = $$3;
            }
         } else {
            $$1.e = this.h.a($$1.b, $$0.dS(), null, $$0.ap());
         }
      }
   }
}
