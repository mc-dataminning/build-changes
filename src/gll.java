public class gll extends glk<cja> {
   private static final akt a = new akt("textures/entity/illager/illusioner.png");

   public gll(gkq.a $$0) {
      super($$0, new fwe<>($$0.a(fyr.ay)), 0.5F);
      this.a(new goy<cja, fwe<cja>>(this, $$0.d()) {
         public void a(fbc $$0, gfg $$1, int $$2, cja $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.gI() || $$3.gq()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
      this.h.c().k = true;
   }

   public akt a(cja $$0) {
      return a;
   }

   public void a(cja $$0, float $$1, float $$2, fbc $$3, gfg $$4, int $$5) {
      if ($$0.cm()) {
         ewu[] $$6 = $$0.G($$2);
         float $$7 = this.a($$0, $$2);

         for (int $$8 = 0; $$8 < $$6.length; $$8++) {
            $$3.a();
            $$3.a(
               $$6[$$8].c + (double)aym.b((float)$$8 + $$7 * 0.5F) * 0.025,
               $$6[$$8].d + (double)aym.b((float)$$8 + $$7 * 0.75F) * 0.0125,
               $$6[$$8].e + (double)aym.b((float)$$8 + $$7 * 0.7F) * 0.025
            );
            super.a($$0, $$1, $$2, $$3, $$4, $$5);
            $$3.b();
         }
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   protected boolean b(cja $$0) {
      return true;
   }
}
