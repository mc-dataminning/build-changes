public class gfw extends gcx<cka> {
   private static final ajh a = new ajh("textures/entity/projectiles/wind_charge.png");
   private final fqr f;

   public gfw(gcy.a $$0) {
      super($$0);
      this.f = new fqr($$0.a(frc.bP));
   }

   public void a(cka $$0, float $$1, float $$2, etz $$3, fxq $$4, int $$5) {
      float $$6 = (float)$$0.ah + $$2;
      eud $$7 = $$4.getBuffer(fxy.a(a, this.a($$6) % 1.0F, 0.0F));
      this.f.a($$0, 0.0F, 0.0F, $$6, 0.0F, 0.0F);
      this.f.a($$3, $$7, $$5, giq.d, 1.0F, 1.0F, 1.0F, 1.0F);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected float a(float $$0) {
      return $$0 * 0.03F;
   }

   public ajh a(cka $$0) {
      return a;
   }
}
