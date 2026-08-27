public class gin extends gim<cjc> {
   private static final akn a = new akn("textures/entity/illager/illusioner.png");

   public gin(ght.a $$0) {
      super($$0, new ftk<>($$0.a(fvv.au)), 0.5F);
      this.a(new gly<cjc, ftk<cjc>>(this, $$0.d()) {
         public void a(eyu $$0, gck $$1, int $$2, cjc $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.gz() || $$3.gh()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
      this.f.c().k = true;
   }

   public akn a(cjc $$0) {
      return a;
   }

   public void a(cjc $$0, float $$1, float $$2, eyu $$3, gck $$4, int $$5) {
      if ($$0.ch()) {
         eum[] $$6 = $$0.G($$2);
         float $$7 = this.a($$0, $$2);

         for (int $$8 = 0; $$8 < $$6.length; $$8++) {
            $$3.a();
            $$3.a(
               $$6[$$8].c + (double)ayf.b((float)$$8 + $$7 * 0.5F) * 0.025,
               $$6[$$8].d + (double)ayf.b((float)$$8 + $$7 * 0.75F) * 0.0125,
               $$6[$$8].e + (double)ayf.b((float)$$8 + $$7 * 0.7F) * 0.025
            );
            super.a($$0, $$1, $$2, $$3, $$4, $$5);
            $$3.b();
         }
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   protected boolean b(cjc $$0) {
      return true;
   }
}
