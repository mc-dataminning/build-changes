public class fuy extends fvj<bwg, fgm<bwg>> {
   private static final afw a = new afw("textures/entity/iron_golem/iron_golem.png");

   public fuy(fud.a $$0) {
      super($$0, new fgm<>($$0.a(fiv.ap)), 0.7F);
      this.a(new fyc(this));
      this.a(new fyd(this, $$0.c()));
   }

   public afw a(bwg $$0) {
      return a;
   }

   protected void a(bwg $$0, emh $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!((double)$$0.aQ.a() < 0.01)) {
         float $$5 = 13.0F;
         float $$6 = $$0.aQ.c($$4) + 6.0F;
         float $$7 = (Math.abs($$6 % 13.0F - 6.5F) - 3.25F) / 3.25F;
         $$1.a(a.f.rotationDegrees(6.5F * $$7));
      }
   }
}
