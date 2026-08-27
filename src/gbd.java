public class gbd extends fye<cgg> {
   private static final ahd a = new ahd("textures/entity/projectiles/wind_charge.png");
   private final fmd f;

   public gbd(fyf.a $$0) {
      super($$0);
      this.f = new fmd($$0.a(fmo.bQ));
   }

   public void a(cgg $$0, float $$1, float $$2, ept $$3, fsz $$4, int $$5) {
      float $$6 = (float)$$0.ah + $$2;
      epx $$7 = $$4.getBuffer(fth.a(a, this.a($$6) % 1.0F, 0.0F));
      this.f.a($$0, 0.0F, 0.0F, $$6, 0.0F, 0.0F);
      this.f.a($$3, $$7, $$5, gdw.d, 1.0F, 1.0F, 1.0F, 0.5F);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected float a(float $$0) {
      return $$0 * 0.03F;
   }

   public ahd a(cgg $$0) {
      return a;
   }
}
