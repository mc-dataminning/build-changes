public class glu extends giu<cod> {
   private static final ale a = new ale("textures/entity/projectiles/wind_charge.png");
   private final fwm f;

   public glu(giv.a $$0) {
      super($$0);
      this.f = new fwm($$0.a(fwx.bT));
   }

   public void a(cod $$0, float $$1, float $$2, ezw $$3, gdm $$4, int $$5) {
      float $$6 = (float)$$0.ai + $$2;
      faa $$7 = $$4.getBuffer(gdu.a(a, this.a($$6) % 1.0F, 0.0F));
      this.f.a($$0, 0.0F, 0.0F, $$6, 0.0F, 0.0F);
      this.f.a($$3, $$7, $$5, goo.d, 1.0F, 1.0F, 1.0F, 1.0F);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected float a(float $$0) {
      return $$0 * 0.03F;
   }

   public ale a(cod $$0) {
      return a;
   }
}
