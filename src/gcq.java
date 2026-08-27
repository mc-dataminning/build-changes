public class gcq extends gbu<cfm, fny<cfm>> {
   private static final ajh a = new ajh("textures/entity/zombie/drowned.png");

   public gcq(gcy.a $$0) {
      super($$0, new fny<>($$0.a(frc.N)), new fny<>($$0.a(frc.O)), new fny<>($$0.a(frc.P)));
      this.a(new ggr<>(this, $$0.f()));
   }

   @Override
   public ajh a(cgr $$0) {
      return a;
   }

   protected void a(cfm $$0, etz $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = $$0.a($$4);
      if ($$6 > 0.0F) {
         float $$7 = -10.0F - $$0.dE();
         float $$8 = aww.i($$6, 0.0F, $$7);
         $$1.a(a.b.rotationDegrees($$8), 0.0F, $$0.dh() / 2.0F / $$5, 0.0F);
      }
   }
}
