public class gkb extends gje<cjr, fvg<cjr>> {
   private static final akr a = akr.b("textures/entity/zombie/drowned.png");

   public gkb(gkj.a $$0) {
      super($$0, new fvg<>($$0.a(fyj.S)), new fvg<>($$0.a(fyj.T)), new fvg<>($$0.a(fyj.U)));
      this.a(new god<>(this, $$0.f()));
   }

   @Override
   public akr a(ckw $$0) {
      return a;
   }

   protected void a(cjr $$0, fbi $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = $$0.a($$4);
      if ($$6 > 0.0F) {
         float $$7 = -10.0F - $$0.dG();
         float $$8 = ayo.i($$6, 0.0F, $$7);
         $$1.a(a.b.rotationDegrees($$8), 0.0F, $$0.dk() / 2.0F / $$5, 0.0F);
      }
   }
}
