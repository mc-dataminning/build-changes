public class gje extends gih<cje, fuk<cje>> {
   private static final akk a = new akk("textures/entity/zombie/drowned.png");

   public gje(gjm.a $$0) {
      super($$0, new fuk<>($$0.a(fxn.R)), new fuk<>($$0.a(fxn.S)), new fuk<>($$0.a(fxn.T)));
      this.a(new gng<>(this, $$0.f()));
   }

   @Override
   public akk a(ckj $$0) {
      return a;
   }

   protected void a(cje $$0, fam $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = $$0.a($$4);
      if ($$6 > 0.0F) {
         float $$7 = -10.0F - $$0.dI();
         float $$8 = ayg.i($$6, 0.0F, $$7);
         $$1.a(a.b.rotationDegrees($$8), 0.0F, $$0.dl() / 2.0F / $$5, 0.0F);
      }
   }
}
