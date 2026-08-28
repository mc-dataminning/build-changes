public class gip extends ghs<cjr, ftw<cjr>> {
   private static final alf a = new alf("textures/entity/zombie/drowned.png");

   public gip(gix.a $$0) {
      super($$0, new ftw<>($$0.a(fwz.R)), new ftw<>($$0.a(fwz.S)), new ftw<>($$0.a(fwz.T)));
      this.a(new gmr<>(this, $$0.f()));
   }

   @Override
   public alf a(ckw $$0) {
      return a;
   }

   protected void a(cjr $$0, ezy $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = $$0.a($$4);
      if ($$6 > 0.0F) {
         float $$7 = -10.0F - $$0.dH();
         float $$8 = ayz.i($$6, 0.0F, $$7);
         $$1.a(a.b.rotationDegrees($$8), 0.0F, $$0.dk() / 2.0F / $$5, 0.0F);
      }
   }
}
