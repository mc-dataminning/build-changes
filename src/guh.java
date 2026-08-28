import java.util.List;

public abstract class guh implements gun<dzq> {
   private static final int a = -988212;
   private static final int b = azo.h(16);
   private final ftv c;

   public guh(guo.a $$0) {
      this.c = $$0.g();
   }

   protected abstract giw a(ebe var1, ecs var2);

   protected abstract hnh a(ecs var1);

   protected abstract float a();

   protected abstract float b();

   protected abstract ffq c();

   protected abstract void a(flo var1, float var2, ebe var3);

   public void a(dzq $$0, float $$1, flo $$2, gsa $$3, int $$4, int $$5, ffq $$6) {
      ebe $$7 = $$0.m();
      dum $$8 = (dum)$$7.b();
      giw $$9 = this.a($$7, $$8.d());
      this.a($$0, $$2, $$3, $$4, $$5, $$7, $$8, $$8.d(), $$9);
   }

   private void a(dzq $$0, flo $$1, gsa $$2, int $$3, int $$4, ebe $$5, dum $$6, ecs $$7, giw $$8) {
      $$1.a();
      this.a($$1, -$$6.h($$5), $$5);
      this.a($$1, $$2, $$3, $$4, $$7, $$8);
      this.a($$0.aB_(), $$0.j(), $$1, $$2, $$3, $$0.a(), $$0.c(), true);
      this.a($$0.aB_(), $$0.k(), $$1, $$2, $$3, $$0.a(), $$0.c(), false);
      $$1.b();
   }

   protected void a(flo $$0, gsa $$1, int $$2, int $$3, ecs $$4, giw $$5) {
      $$0.a();
      float $$6 = this.a();
      $$0.b($$6, -$$6, -$$6);
      hnh $$7 = this.a($$4);
      flr $$8 = $$7.a($$1, $$5::a);
      $$5.a($$0, $$8, $$2, $$3);
      $$0.b();
   }

   private void a(iv $$0, dzr $$1, flo $$2, gsa $$3, int $$4, int $$5, int $$6, boolean $$7) {
      $$2.a();
      this.a($$2, $$7, this.c());
      int $$8 = a($$1);
      int $$9 = 4 * $$5 / 2;
      aza[] $$10 = $$1.a(frd.Q().aT(), $$1x -> {
         List<aza> $$2x = this.c.c($$1x, $$6);
         return $$2x.isEmpty() ? aza.a : $$2x.get(0);
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
         aza $$18 = $$10[$$17];
         float $$19 = (float)(-this.c.a($$18) / 2);
         if ($$12) {
            this.c.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, $$8, $$2.c().a(), $$3, $$13);
         } else {
            this.c.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, false, $$2.c().a(), $$3, ftv.a.c, 0, $$13);
         }
      }

      $$2.b();
   }

   private void a(flo $$0, boolean $$1, ffq $$2) {
      if (!$$1) {
         $$0.a(a.d.rotationDegrees(180.0F));
      }

      float $$3 = 0.015625F * this.b();
      $$0.a($$2);
      $$0.b($$3, -$$3, $$3);
   }

   private static boolean a(iv $$0, int $$1) {
      if ($$1 == cyw.p.g()) {
         return true;
      } else {
         frd $$2 = frd.Q();
         gqz $$3 = $$2.t;
         if ($$3 != null && $$2.n.aE().a() && $$3.gH()) {
            return true;
         } else {
            bwt $$4 = $$2.ao();
            return $$4 != null && $$4.g(ffq.b($$0)) < (double)b;
         }
      }
   }

   public static int a(dzr $$0) {
      int $$1 = $$0.b().g();
      if ($$1 == cyw.p.g() && $$0.a()) {
         return -988212;
      } else {
         double $$2 = 0.4;
         int $$3 = (int)((double)axy.b($$1) * 0.4);
         int $$4 = (int)((double)axy.c($$1) * 0.4);
         int $$5 = (int)((double)axy.d($$1) * 0.4);
         return axy.a(0, $$3, $$4, $$5);
      }
   }
}
