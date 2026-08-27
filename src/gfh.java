public class gfh extends gfl<cam, fnh<cam>> {
   private final fvp a;

   public gfh(gcv<cam, fnh<cam>> $$0, fvp $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(esh $$0, fvt $$1, int $$2, cam $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cpd $$10 = $$3.c(bnx.a);
      if ($$3.A() && !$$3.gy()) {
         float $$11 = -0.6F;
         float $$12 = 1.4F;
         if ($$3.gm()) {
            $$11 -= 0.2F * awi.a($$7 * 0.6F) + 0.2F;
            $$12 -= 0.09F * awi.a($$7 * 0.6F);
         }

         $$0.a();
         $$0.a(0.1F, $$12, $$11);
         this.a.a($$3, $$10, cpa.h, false, $$0, $$1, $$2);
         $$0.b();
      }
   }
}
