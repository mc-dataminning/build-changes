public class fvu extends fva<cbb, fhq<cbb>> {
   private static final agm a = new agm("textures/entity/zombie/drowned.png");

   public fvu(fwc.a $$0) {
      super($$0, new fhq<>($$0.a(fks.L)), new fhq<>($$0.a(fks.M)), new fhq<>($$0.a(fks.N)));
      this.a(new fzs<>(this, $$0.f()));
   }

   @Override
   public agm a(ccg $$0) {
      return a;
   }

   protected void a(cbb $$0, eob $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      float $$5 = $$0.a($$4);
      if ($$5 > 0.0F) {
         float $$6 = -10.0F - $$0.dF();
         float $$7 = atq.i($$5, 0.0F, $$6);
         $$1.a(a.b.rotationDegrees($$7), 0.0F, $$0.di() / 2.0F, 0.0F);
      }
   }
}
