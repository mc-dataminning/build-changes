public class gir extends ghu<cjt, fty<cjt>> {
   private static final alf a = new alf("textures/entity/zombie/drowned.png");

   public gir(giz.a $$0) {
      super($$0, new fty<>($$0.a(fxb.R)), new fty<>($$0.a(fxb.S)), new fty<>($$0.a(fxb.T)));
      this.a(new gmt<>(this, $$0.f()));
   }

   @Override
   public alf a(cky $$0) {
      return a;
   }

   protected void a(cjt $$0, faa $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = $$0.a($$4);
      if ($$6 > 0.0F) {
         float $$7 = -10.0F - $$0.dH();
         float $$8 = ayz.i($$6, 0.0F, $$7);
         $$1.a(a.b.rotationDegrees($$8), 0.0F, $$0.dk() / 2.0F / $$5, 0.0F);
      }
   }
}
