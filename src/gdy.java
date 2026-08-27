public class gdy extends gaz<cir> {
   private static final aiy a = new aiy("textures/entity/projectiles/wind_charge.png");
   private final fox f;

   public gdy(gba.a $$0) {
      super($$0);
      this.f = new fox($$0.a(fpi.bP));
   }

   public void a(cir $$0, float $$1, float $$2, esh $$3, fvt $$4, int $$5) {
      float $$6 = (float)$$0.ag + $$2;
      esl $$7 = $$4.getBuffer(fwb.a(a, this.a($$6) % 1.0F, 0.0F));
      this.f.a($$0, 0.0F, 0.0F, $$6, 0.0F, 0.0F);
      this.f.a($$3, $$7, $$5, ggs.d, 1.0F, 1.0F, 1.0F, 1.0F);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected float a(float $$0) {
      return $$0 * 0.03F;
   }

   public aiy a(cir $$0) {
      return a;
   }
}
