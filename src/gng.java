public class gng extends gnk<cfv, fva<cfv>> {
   private final gdl a;

   public gng(gku<cfv, fva<cfv>> $$0, gdl $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(ezz $$0, gdp $$1, int $$2, cfv $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cuq $$10 = $$3.a(btc.a);
      if ($$3.y() && !$$3.gI()) {
         float $$11 = -0.6F;
         float $$12 = 1.4F;
         if ($$3.gw()) {
            $$11 -= 0.2F * ayz.a($$7 * 0.6F) + 0.2F;
            $$12 -= 0.09F * ayz.a($$7 * 0.6F);
         }

         $$0.a();
         $$0.a(0.1F, $$12, $$11);
         this.a.a($$3, $$10, cun.h, false, $$0, $$1, $$2);
         $$0.b();
      }
   }
}
