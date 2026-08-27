public class fxy implements fxt<djd> {
   private static final float a = 0.375F;
   private final gby b;

   public fxy(fxu.a $$0) {
      this.b = $$0.d();
   }

   public void a(djd $$0, float $$1, esh $$2, fvt $$3, int $$4, int $$5) {
      ie $$6 = $$0.r().c(czg.f);
      is<cpd> $$7 = $$0.c();
      int $$8 = (int)$$0.aE_().a();

      for (int $$9 = 0; $$9 < $$7.size(); $$9++) {
         cpd $$10 = $$7.get($$9);
         if ($$10 != cpd.h) {
            $$2.a();
            $$2.a(0.5F, 0.44921875F, 0.5F);
            ie $$11 = ie.b(($$9 + $$6.e()) % 4);
            float $$12 = -$$11.p();
            $$2.a(a.d.rotationDegrees($$12));
            $$2.a(a.b.rotationDegrees(90.0F));
            $$2.a(-0.3125F, -0.3125F, 0.0F);
            $$2.b(0.375F, 0.375F, 0.375F);
            this.b.a($$10, cpa.i, $$4, $$5, $$2, $$3, $$0.i(), $$8 + $$9);
            $$2.b();
         }
      }
   }
}
