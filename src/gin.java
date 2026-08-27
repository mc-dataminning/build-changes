public class gin extends gim<cja> {
   private static final akm a = new akm("textures/entity/illager/illusioner.png");

   public gin(ght.a $$0) {
      super($$0, new ftk<>($$0.a(fvv.au)), 0.5F);
      this.a(new gly<cja, ftk<cja>>(this, $$0.d()) {
         public void a(eys $$0, gck $$1, int $$2, cja $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.gz() || $$3.gh()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
      this.f.c().k = true;
   }

   public akm a(cja $$0) {
      return a;
   }

   public void a(cja $$0, float $$1, float $$2, eys $$3, gck $$4, int $$5) {
      if ($$0.ch()) {
         euk[] $$6 = $$0.G($$2);
         float $$7 = this.a($$0, $$2);

         for (int $$8 = 0; $$8 < $$6.length; $$8++) {
            $$3.a();
            $$3.a(
               $$6[$$8].c + (double)ayd.b((float)$$8 + $$7 * 0.5F) * 0.025,
               $$6[$$8].d + (double)ayd.b((float)$$8 + $$7 * 0.75F) * 0.0125,
               $$6[$$8].e + (double)ayd.b((float)$$8 + $$7 * 0.7F) * 0.025
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
