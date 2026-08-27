public class gfj extends gem<cgu, fqr<cgu>> {
   private static final ajv a = new ajv("textures/entity/zombie/drowned.png");

   public gfj(gfr.a $$0) {
      super($$0, new fqr<>($$0.a(ftu.R)), new fqr<>($$0.a(ftu.S)), new fqr<>($$0.a(ftu.T)));
      this.a(new gjk<>(this, $$0.f()));
   }

   @Override
   public ajv a(chz $$0) {
      return a;
   }

   protected void a(cgu $$0, ewr $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = $$0.a($$4);
      if ($$6 > 0.0F) {
         float $$7 = -10.0F - $$0.dE();
         float $$8 = axm.i($$6, 0.0F, $$7);
         $$1.a(a.b.rotationDegrees($$8), 0.0F, $$0.dh() / 2.0F / $$5, 0.0F);
      }
   }
}
