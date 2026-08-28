public class giq extends ght<cjs, ftx<cjs>> {
   private static final alf a = new alf("textures/entity/zombie/drowned.png");

   public giq(giy.a $$0) {
      super($$0, new ftx<>($$0.a(fxa.R)), new ftx<>($$0.a(fxa.S)), new ftx<>($$0.a(fxa.T)));
      this.a(new gms<>(this, $$0.f()));
   }

   @Override
   public alf a(ckx $$0) {
      return a;
   }

   protected void a(cjs $$0, ezz $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = $$0.a($$4);
      if ($$6 > 0.0F) {
         float $$7 = -10.0F - $$0.dH();
         float $$8 = ayz.i($$6, 0.0F, $$7);
         $$1.a(a.b.rotationDegrees($$8), 0.0F, $$0.dk() / 2.0F / $$5, 0.0F);
      }
   }
}
