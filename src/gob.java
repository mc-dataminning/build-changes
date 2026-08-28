import java.util.List;

public abstract class gob implements goh<dvk> {
   private static final int a = -988212;
   private static final int b = ayy.h(16);
   private final fnz c;

   public gob(goi.a $$0) {
      this.c = $$0.g();
   }

   protected abstract gct a(dwv var1, dyh var2);

   protected abstract hgt a(dyh var1);

   protected abstract float a();

   protected abstract float b();

   protected abstract fay c();

   protected abstract void a(ffs var1, float var2, dwv var3);

   public void a(dvk $$0, float $$1, ffs $$2, glv $$3, int $$4, int $$5) {
      dwv $$6 = $$0.m();
      dqp $$7 = (dqp)$$6.b();
      gct $$8 = this.a($$6, $$7.d());
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$7.d(), $$8);
   }

   private void a(dvk $$0, ffs $$1, glv $$2, int $$3, int $$4, dwv $$5, dqp $$6, dyh $$7, gct $$8) {
      $$1.a();
      this.a($$1, -$$6.h($$5), $$5);
      this.a($$1, $$2, $$3, $$4, $$7, $$8);
      this.a($$0.aA_(), $$0.j(), $$1, $$2, $$3, $$0.b(), $$0.c(), true);
      this.a($$0.aA_(), $$0.k(), $$1, $$2, $$3, $$0.b(), $$0.c(), false);
      $$1.b();
   }

   protected void a(ffs $$0, glv $$1, int $$2, int $$3, dyh $$4, gct $$5) {
      $$0.a();
      float $$6 = this.a();
      $$0.b($$6, -$$6, -$$6);
      hgt $$7 = this.a($$4);
      ffw $$8 = $$7.a($$1, $$5::a);
      $$5.a($$0, $$8, $$2, $$3);
      $$0.b();
   }

   private void a(ji $$0, dvl $$1, ffs $$2, glv $$3, int $$4, int $$5, int $$6, boolean $$7) {
      $$2.a();
      this.a($$2, $$7, this.c());
      int $$8 = a($$1);
      int $$9 = 4 * $$5 / 2;
      ayk[] $$10 = $$1.a(flh.Q().aT(), $$1x -> {
         List<ayk> $$2x = this.c.c($$1x, $$6);
         return $$2x.isEmpty() ? ayk.a : $$2x.get(0);
      });
      int $$11;
      boolean $$12;
      int $$13;
      if ($$1.a()) {
         $$11 = $$1.b().g();
         $$12 = a($$0, $$11);
         $$13 = 15728880;
      } else {
         $$11 = $$8;
         $$12 = false;
         $$13 = $$4;
      }

      for (int $$17 = 0; $$17 < 4; $$17++) {
         ayk $$18 = $$10[$$17];
         float $$19 = (float)(-this.c.a($$18) / 2);
         if ($$12) {
            this.c.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, $$8, $$2.c().a(), $$3, $$13);
         } else {
            this.c.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, false, $$2.c().a(), $$3, fnz.a.c, 0, $$13);
         }
      }

      $$2.b();
   }

   private void a(ffs $$0, boolean $$1, fay $$2) {
      if (!$$1) {
         $$0.a(a.d.rotationDegrees(180.0F));
      }

      float $$3 = 0.015625F * this.b();
      $$0.a($$2);
      $$0.b($$3, -$$3, $$3);
   }

   private static boolean a(ji $$0, int $$1) {
      if ($$1 == cvk.p.g()) {
         return true;
      } else {
         flh $$2 = flh.Q();
         gkt $$3 = $$2.t;
         if ($$3 != null && $$2.n.aE().a() && $$3.gH()) {
            return true;
         } else {
            buj $$4 = $$2.ao();
            return $$4 != null && $$4.f(fay.b($$0)) < (double)b;
         }
      }
   }

   public static int a(dvl $$0) {
      int $$1 = $$0.b().g();
      if ($$1 == cvk.p.g() && $$0.a()) {
         return -988212;
      } else {
         double $$2 = 0.4;
         int $$3 = (int)((double)axj.b($$1) * 0.4);
         int $$4 = (int)((double)axj.c($$1) * 0.4);
         int $$5 = (int)((double)axj.d($$1) * 0.4);
         return axj.a(0, $$3, $$4, $$5);
      }
   }
}
