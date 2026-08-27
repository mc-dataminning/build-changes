public class gcu extends gcy<byn, fkw<byn>> {
   private final ftd a;

   public gcu(gai<byn, fkw<byn>> $$0, ftd $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(eqb $$0, fth $$1, int $$2, byn $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cmy $$10 = $$3.c(bma.a);
      if ($$3.A() && !$$3.gw()) {
         float $$11 = -0.6F;
         float $$12 = 1.4F;
         if ($$3.gk()) {
            $$11 -= 0.2F * auo.a($$7 * 0.6F) + 0.2F;
            $$12 -= 0.09F * auo.a($$7 * 0.6F);
         }

         $$0.a();
         $$0.a(0.1F, $$12, $$11);
         this.a.a($$3, $$10, cmv.h, false, $$0, $$1, $$2);
         $$0.b();
      }
   }
}
