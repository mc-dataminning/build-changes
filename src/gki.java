public class gki extends gkh<cjp> {
   private static final akk a = new akk("textures/entity/illager/illusioner.png");

   public gki(gjo.a $$0) {
      super($$0, new fve<>($$0.a(fxp.au)), 0.5F);
      this.a(new gnt<cjp, fve<cjp>>(this, $$0.d()) {
         public void a(fao $$0, gef $$1, int $$2, cjp $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.gx() || $$3.ge()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
      this.f.c().k = true;
   }

   public akk a(cjp $$0) {
      return a;
   }

   public void a(cjp $$0, float $$1, float $$2, fao $$3, gef $$4, int $$5) {
      if ($$0.cj()) {
         ewh[] $$6 = $$0.H($$2);
         float $$7 = this.a($$0, $$2);

         for (int $$8 = 0; $$8 < $$6.length; $$8++) {
            $$3.a();
            $$3.a(
               $$6[$$8].c + (double)ayg.b((float)$$8 + $$7 * 0.5F) * 0.025,
               $$6[$$8].d + (double)ayg.b((float)$$8 + $$7 * 0.75F) * 0.0125,
               $$6[$$8].e + (double)ayg.b((float)$$8 + $$7 * 0.7F) * 0.025
            );
            super.a($$0, $$1, $$2, $$3, $$4, $$5);
            $$3.b();
         }
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   protected boolean b(cjp $$0) {
      return true;
   }
}
