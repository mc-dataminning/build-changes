public class gam extends fxn<cfw> {
   private static final agt a = new agt("textures/entity/projectiles/wind_charge.png");
   private final flm f;

   public gam(fxo.a $$0) {
      super($$0);
      this.f = new flm($$0.a(flx.bQ));
   }

   public void a(cfw $$0, float $$1, float $$2, epd $$3, fsi $$4, int $$5) {
      float $$6 = (float)$$0.ah + $$2;
      eph $$7 = $$4.getBuffer(fsq.a(a, this.a($$6) % 1.0F, 0.0F));
      this.f.a($$0, 0.0F, 0.0F, $$6, 0.0F, 0.0F);
      this.f.a($$3, $$7, $$5, gdf.d, 1.0F, 1.0F, 1.0F, 0.5F);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected float a(float $$0) {
      return $$0 * 0.03F;
   }

   public agt a(cfw $$0) {
      return a;
   }
}
