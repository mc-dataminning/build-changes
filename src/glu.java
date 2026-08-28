public class glu extends gjr<ckt> {
   private static final alf a = new alf("textures/entity/illager/vindicator.png");

   public glu(giy.a $$0) {
      super($$0, new fup<>($$0.a(fxa.bQ)), 0.5F);
      this.a(new gnd<ckt, fup<ckt>>(this, $$0.d()) {
         public void a(ezz $$0, gdp $$1, int $$2, ckt $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.gi()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
   }

   public alf a(ckt $$0) {
      return a;
   }
}
