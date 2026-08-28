public class gyk extends gvj<csd, hbp> {
   private static final ale a = ale.b("textures/entity/projectiles/wind_charge.png");
   private final ghs g;

   public gyk(gvk.a $$0) {
      super($$0);
      this.g = new ghs($$0.a(gif.dK));
   }

   @Override
   public void a(hbp $$0, fiq $$1, gpd $$2, int $$3) {
      fiu $$4 = $$2.getBuffer(gpn.a(a, this.a($$0.u) % 1.0F, 0.0F));
      this.g.a($$0);
      this.g.a($$1, $$4, $$3, hhp.d);
      super.a($$0, $$1, $$2, $$3);
   }

   protected float a(float $$0) {
      return $$0 * 0.03F;
   }

   @Override
   public hbp d() {
      return new hbp();
   }
}
