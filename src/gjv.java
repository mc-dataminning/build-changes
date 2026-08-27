public class gjv extends ggw<cmp> {
   private static final akh a = new akh("textures/entity/projectiles/wind_charge.png");
   private final fup f;

   public gjv(ggx.a $$0) {
      super($$0);
      this.f = new fup($$0.a(fva.bT));
   }

   public void a(cmp $$0, float $$1, float $$2, exx $$3, gbo $$4, int $$5) {
      float $$6 = (float)$$0.ai + $$2;
      eyb $$7 = $$4.getBuffer(gbw.a(a, this.a($$6) % 1.0F, 0.0F));
      this.f.a($$0, 0.0F, 0.0F, $$6, 0.0F, 0.0F);
      this.f.a($$3, $$7, $$5, gmp.d, 1.0F, 1.0F, 1.0F, 1.0F);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected float a(float $$0) {
      return $$0 * 0.03F;
   }

   public akh a(cmp $$0) {
      return a;
   }
}
