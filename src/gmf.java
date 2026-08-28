public class gmf extends gjf<cnp> {
   private static final akk a = new akk("textures/entity/projectiles/wind_charge.png");
   private final fww f;

   public gmf(gjg.a $$0) {
      super($$0);
      this.f = new fww($$0.a(fxh.bT));
   }

   public void a(cnp $$0, float $$1, float $$2, fag $$3, gdx $$4, int $$5) {
      float $$6 = (float)$$0.ai + $$2;
      fak $$7 = $$4.getBuffer(gef.a(a, this.a($$6) % 1.0F, 0.0F));
      this.f.a($$0, 0.0F, 0.0F, $$6, 0.0F, 0.0F);
      this.f.a($$3, $$7, $$5, goz.d, 1.0F, 1.0F, 1.0F, 1.0F);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected float a(float $$0) {
      return $$0 * 0.03F;
   }

   public akk a(cnp $$0) {
      return a;
   }
}
