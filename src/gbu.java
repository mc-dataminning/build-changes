public class gbu extends gbt<cep> {
   private static final aiy a = new aiy("textures/entity/illager/illusioner.png");

   public gbu(gba.a $$0) {
      super($$0, new fmw<>($$0.a(fpi.aq)), 0.5F);
      this.a(new gfe<cep, fmw<cep>>(this, $$0.d()) {
         public void a(esh $$0, fvt $$1, int $$2, cep $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.gq() || $$3.fY()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
      this.f.c().k = true;
   }

   public aiy a(cep $$0) {
      return a;
   }

   public void a(cep $$0, float $$1, float $$2, esh $$3, fvt $$4, int $$5) {
      if ($$0.ce()) {
         enz[] $$6 = $$0.E($$2);
         float $$7 = this.a($$0, $$2);

         for (int $$8 = 0; $$8 < $$6.length; $$8++) {
            $$3.a();
            $$3.a(
               $$6[$$8].c + (double)awi.b((float)$$8 + $$7 * 0.5F) * 0.025,
               $$6[$$8].d + (double)awi.b((float)$$8 + $$7 * 0.75F) * 0.0125,
               $$6[$$8].e + (double)awi.b((float)$$8 + $$7 * 0.7F) * 0.025
            );
            super.a($$0, $$1, $$2, $$3, $$4, $$5);
            $$3.b();
         }
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   protected boolean b(cep $$0) {
      return true;
   }
}
