public class gjz extends gjc<cjr, fve<cjr>> {
   private static final akr a = akr.b("textures/entity/zombie/drowned.png");

   public gjz(gkh.a $$0) {
      super($$0, new fve<>($$0.a(fyh.S)), new fve<>($$0.a(fyh.T)), new fve<>($$0.a(fyh.U)));
      this.a(new gob<>(this, $$0.f()));
   }

   @Override
   public akr a(ckw $$0) {
      return a;
   }

   protected void a(cjr $$0, fbg $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = $$0.a($$4);
      if ($$6 > 0.0F) {
         float $$7 = -10.0F - $$0.dH();
         float $$8 = ayo.i($$6, 0.0F, $$7);
         $$1.a(a.b.rotationDegrees($$8), 0.0F, $$0.dl() / 2.0F / $$5, 0.0F);
      }
   }
}
