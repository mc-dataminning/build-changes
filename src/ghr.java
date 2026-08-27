public class ghr extends ghq<cil> {
   private static final akh a = new akh("textures/entity/illager/illusioner.png");

   public ghr(ggx.a $$0) {
      super($$0, new fsp<>($$0.a(fva.au)), 0.5F);
      this.a(new glb<cil, fsp<cil>>(this, $$0.d()) {
         public void a(exx $$0, gbo $$1, int $$2, cil $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.gz() || $$3.gh()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
      this.f.c().k = true;
   }

   public akh a(cil $$0) {
      return a;
   }

   public void a(cil $$0, float $$1, float $$2, exx $$3, gbo $$4, int $$5) {
      if ($$0.cf()) {
         etp[] $$6 = $$0.G($$2);
         float $$7 = this.a($$0, $$2);

         for (int $$8 = 0; $$8 < $$6.length; $$8++) {
            $$3.a();
            $$3.a(
               $$6[$$8].c + (double)axz.b((float)$$8 + $$7 * 0.5F) * 0.025,
               $$6[$$8].d + (double)axz.b((float)$$8 + $$7 * 0.75F) * 0.0125,
               $$6[$$8].e + (double)axz.b((float)$$8 + $$7 * 0.7F) * 0.025
            );
            super.a($$0, $$1, $$2, $$3, $$4, $$5);
            $$3.b();
         }
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   protected boolean b(cil $$0) {
      return true;
   }
}
