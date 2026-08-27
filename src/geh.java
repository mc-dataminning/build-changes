public class geh extends gde<cft, fpi<cft>> {
   private static final ajc a = new ajc("textures/entity/strider/strider.png");
   private static final ajc i = new ajc("textures/entity/strider/strider_cold.png");
   private static final float j = 0.5F;

   public geh(gby.a $$0) {
      super($$0, new fpi<>($$0.a(fqe.bz)), 0.5F);
      this.a(new ggk<>(this, new fpi<>($$0.a(fqe.bA)), new ajc("textures/entity/strider/strider_saddle.png")));
   }

   public ajc a(cft $$0) {
      return $$0.u() ? i : a;
   }

   protected float b(cft $$0) {
      float $$1 = super.b($$0);
      return $$0.o_() ? $$1 * 0.5F : $$1;
   }

   protected void a(cft $$0, etd $$1, float $$2) {
      float $$3 = $$0.dX();
      $$1.b($$3, $$3, $$3);
   }

   protected boolean c(cft $$0) {
      return super.a($$0) || $$0.u();
   }
}
