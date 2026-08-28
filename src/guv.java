public class guv implements gup<dyl> {
   private static final float a = 0.375F;
   private final gzi b;

   public guv(guq.a $$0) {
      this.b = $$0.e();
   }

   public void a(dyl $$0, float $$1, flq $$2, gsc $$3, int $$4, int $$5, ffs $$6) {
      jc $$7 = $$0.m().c(dnu.e);
      jp<daa> $$8 = $$0.c();
      int $$9 = (int)$$0.aB_().a();

      for (int $$10 = 0; $$10 < $$8.size(); $$10++) {
         daa $$11 = $$8.get($$10);
         if ($$11 != daa.k) {
            $$2.a();
            $$2.a(0.5F, 0.44921875F, 0.5F);
            jc $$12 = jc.b(($$10 + $$7.e()) % 4);
            float $$13 = -$$12.p();
            $$2.a(a.d.rotationDegrees($$13));
            $$2.a(a.b.rotationDegrees(90.0F));
            $$2.a(-0.3125F, -0.3125F, 0.0F);
            $$2.b(0.375F, 0.375F, 0.375F);
            this.b.a($$11, czy.i, $$4, $$5, $$2, $$3, $$0.i(), $$9 + $$10);
            $$2.b();
         }
      }
   }
}
