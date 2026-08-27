public class fvy implements fvt<dhj> {
   private static final float a = 0.375F;
   private final fzy b;

   public fvy(fvu.a $$0) {
      this.b = $$0.d();
   }

   public void a(dhj $$0, float $$1, eqk $$2, ftt $$3, int $$4, int $$5) {
      ic $$6 = $$0.r().c(cxm.f);
      iq<cng> $$7 = $$0.c();
      int $$8 = (int)$$0.aE_().a();

      for (int $$9 = 0; $$9 < $$7.size(); $$9++) {
         cng $$10 = $$7.get($$9);
         if ($$10 != cng.f) {
            $$2.a();
            $$2.a(0.5F, 0.44921875F, 0.5F);
            ic $$11 = ic.b(($$9 + $$6.e()) % 4);
            float $$12 = -$$11.p();
            $$2.a(a.d.rotationDegrees($$12));
            $$2.a(a.b.rotationDegrees(90.0F));
            $$2.a(-0.3125F, -0.3125F, 0.0F);
            $$2.b(0.375F, 0.375F, 0.375F);
            this.b.a($$10, cnd.i, $$4, $$5, $$2, $$3, $$0.i(), $$8 + $$9);
            $$2.b();
         }
      }
   }
}
