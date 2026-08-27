public class ggl extends ggk<che> {
   private static final ajv a = new ajv("textures/entity/illager/illusioner.png");

   public ggl(gfr.a $$0) {
      super($$0, new frj<>($$0.a(ftu.au)), 0.5F);
      this.a(new gjv<che, frj<che>>(this, $$0.d()) {
         public void a(ewr $$0, gai $$1, int $$2, che $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.gx() || $$3.gf()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
      this.f.c().k = true;
   }

   public ajv a(che $$0) {
      return a;
   }

   public void a(che $$0, float $$1, float $$2, ewr $$3, gai $$4, int $$5) {
      if ($$0.ce()) {
         esj[] $$6 = $$0.G($$2);
         float $$7 = this.a($$0, $$2);

         for (int $$8 = 0; $$8 < $$6.length; $$8++) {
            $$3.a();
            $$3.a(
               $$6[$$8].c + (double)axm.b((float)$$8 + $$7 * 0.5F) * 0.025,
               $$6[$$8].d + (double)axm.b((float)$$8 + $$7 * 0.75F) * 0.0125,
               $$6[$$8].e + (double)axm.b((float)$$8 + $$7 * 0.7F) * 0.025
            );
            super.a($$0, $$1, $$2, $$3, $$4, $$5);
            $$3.b();
         }
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   protected boolean b(che $$0) {
      return true;
   }
}
