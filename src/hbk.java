public class hbk extends gyj<ctl, her> {
   private static final alk a = alk.b("textures/entity/projectiles/wind_charge.png");
   private final gks g;

   public hbk(gyk.a $$0) {
      super($$0);
      this.g = new gks($$0.a(glf.dS));
   }

   @Override
   public void a(her $$0, flq $$1, gsc $$2, int $$3) {
      flt $$4 = $$2.getBuffer(gsn.a(a, this.a($$0.u) % 1.0F, 0.0F));
      this.g.a($$0);
      this.g.a($$1, $$4, $$3, hks.d);
      super.a($$0, $$1, $$2, $$3);
   }

   protected float a(float $$0) {
      return $$0 * 0.03F;
   }

   @Override
   public her d() {
      return new her();
   }
}
