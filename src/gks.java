public class gks extends ghs<cng> {
   private static final akn a = new akn("textures/entity/projectiles/wind_charge.png");
   private final fvk f;

   public gks(ght.a $$0) {
      super($$0);
      this.f = new fvk($$0.a(fvv.bT));
   }

   public void a(cng $$0, float $$1, float $$2, eyu $$3, gck $$4, int $$5) {
      float $$6 = (float)$$0.ai + $$2;
      eyy $$7 = $$4.getBuffer(gcs.a(a, this.a($$6) % 1.0F, 0.0F));
      this.f.a($$0, 0.0F, 0.0F, $$6, 0.0F, 0.0F);
      this.f.a($$3, $$7, $$5, gnm.d, 1.0F, 1.0F, 1.0F, 1.0F);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected float a(float $$0) {
      return $$0 * 0.03F;
   }

   public akn a(cng $$0) {
      return a;
   }
}
