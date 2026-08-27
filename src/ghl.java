public class ghl extends ggo<ciq, fss<ciq>> {
   private static final akm a = new akm("textures/entity/zombie/drowned.png");

   public ghl(ght.a $$0) {
      super($$0, new fss<>($$0.a(fvv.R)), new fss<>($$0.a(fvv.S)), new fss<>($$0.a(fvv.T)));
      this.a(new gln<>(this, $$0.f()));
   }

   @Override
   public akm a(cjv $$0) {
      return a;
   }

   protected void a(ciq $$0, eys $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = $$0.a($$4);
      if ($$6 > 0.0F) {
         float $$7 = -10.0F - $$0.dH();
         float $$8 = ayd.i($$6, 0.0F, $$7);
         $$1.a(a.b.rotationDegrees($$8), 0.0F, $$0.dk() / 2.0F / $$5, 0.0F);
      }
   }
}
