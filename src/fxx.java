public class fxx extends fxc<cbx, fjl<cbx>> {
   private static final ahd a = new ahd("textures/entity/zombie/drowned.png");

   public fxx(fyf.a $$0) {
      super($$0, new fjl<>($$0.a(fmo.O)), new fjl<>($$0.a(fmo.P)), new fjl<>($$0.a(fmo.Q)));
      this.a(new gby<>(this, $$0.f()));
   }

   @Override
   public ahd a(cdc $$0) {
      return a;
   }

   protected void a(cbx $$0, ept $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      float $$5 = $$0.a($$4);
      if ($$5 > 0.0F) {
         float $$6 = -10.0F - $$0.dE();
         float $$7 = aui.i($$5, 0.0F, $$6);
         $$1.a(a.b.rotationDegrees($$7), 0.0F, $$0.dh() / 2.0F, 0.0F);
      }
   }
}
