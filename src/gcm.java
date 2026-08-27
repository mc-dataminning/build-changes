public class gcm extends gee<cfk, fnw<cfk>> {
   private static final ajh a = new ajh("textures/entity/creeper/creeper.png");

   public gcm(gcy.a $$0) {
      super($$0, new fnw<>($$0.a(frc.D)), 0.5F);
      this.a(new ggm(this, $$0.f()));
   }

   protected void a(cfk $$0, etz $$1, float $$2) {
      float $$3 = $$0.G($$2);
      float $$4 = 1.0F + aww.a($$3 * 100.0F) * $$3 * 0.01F;
      $$3 = aww.a($$3, 0.0F, 1.0F);
      $$3 *= $$3;
      $$3 *= $$3;
      float $$5 = (1.0F + $$3 * 0.4F) * $$4;
      float $$6 = (1.0F + $$3 * 0.1F) / $$4;
      $$1.b($$5, $$6, $$5);
   }

   protected float a(cfk $$0, float $$1) {
      float $$2 = $$0.G($$1);
      return (int)($$2 * 10.0F) % 2 == 0 ? 0.0F : aww.a($$2, 0.5F, 1.0F);
   }

   public ajh a(cfk $$0) {
      return a;
   }
}
