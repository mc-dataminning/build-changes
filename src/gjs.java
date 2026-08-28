public class gjs extends gjr<ckc> {
   private static final alf a = new alf("textures/entity/illager/illusioner.png");

   public gjs(giy.a $$0) {
      super($$0, new fup<>($$0.a(fxa.au)), 0.5F);
      this.a(new gnd<ckc, fup<ckc>>(this, $$0.d()) {
         public void a(ezz $$0, gdp $$1, int $$2, ckc $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.gA() || $$3.gi()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
      this.f.c().k = true;
   }

   public alf a(ckc $$0) {
      return a;
   }

   public void a(ckc $$0, float $$1, float $$2, ezz $$3, gdp $$4, int $$5) {
      if ($$0.ch()) {
         evs[] $$6 = $$0.G($$2);
         float $$7 = this.a($$0, $$2);

         for (int $$8 = 0; $$8 < $$6.length; $$8++) {
            $$3.a();
            $$3.a(
               $$6[$$8].c + (double)ayz.b((float)$$8 + $$7 * 0.5F) * 0.025,
               $$6[$$8].d + (double)ayz.b((float)$$8 + $$7 * 0.75F) * 0.0125,
               $$6[$$8].e + (double)ayz.b((float)$$8 + $$7 * 0.7F) * 0.025
            );
            super.a($$0, $$1, $$2, $$3, $$4, $$5);
            $$3.b();
         }
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   protected boolean b(ckc $$0) {
      return true;
   }
}
