public class gfa extends ged<cgn, fqi<cgn>> {
   private static final ajt a = new ajt("textures/entity/zombie/drowned.png");

   public gfa(gfi.a $$0) {
      super($$0, new fqi<>($$0.a(ftl.R)), new fqi<>($$0.a(ftl.S)), new fqi<>($$0.a(ftl.T)));
      this.a(new gjb<>(this, $$0.f()));
   }

   @Override
   public ajt a(chs $$0) {
      return a;
   }

   protected void a(cgn $$0, ewi $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = $$0.a($$4);
      if ($$6 > 0.0F) {
         float $$7 = -10.0F - $$0.dE();
         float $$8 = axk.i($$6, 0.0F, $$7);
         $$1.a(a.b.rotationDegrees($$8), 0.0F, $$0.dh() / 2.0F / $$5, 0.0F);
      }
   }
}
