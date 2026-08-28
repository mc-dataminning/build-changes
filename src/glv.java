public class glv extends giv<coe> {
   private static final ale a = new ale("textures/entity/projectiles/wind_charge.png");
   private final fwn f;

   public glv(giw.a $$0) {
      super($$0);
      this.f = new fwn($$0.a(fwy.bT));
   }

   public void a(coe $$0, float $$1, float $$2, ezx $$3, gdn $$4, int $$5) {
      float $$6 = (float)$$0.ai + $$2;
      fab $$7 = $$4.getBuffer(gdv.a(a, this.a($$6) % 1.0F, 0.0F));
      this.f.a($$0, 0.0F, 0.0F, $$6, 0.0F, 0.0F);
      this.f.a($$3, $$7, $$5, gop.d, 1.0F, 1.0F, 1.0F, 1.0F);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected float a(float $$0) {
      return $$0 * 0.03F;
   }

   public ale a(coe $$0) {
      return a;
   }
}
