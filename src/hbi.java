public class hbi extends gyh<ctj, hep> {
   private static final ali a = ali.b("textures/entity/projectiles/wind_charge.png");
   private final gkq g;

   public hbi(gyi.a $$0) {
      super($$0);
      this.g = new gkq($$0.a(gld.dS));
   }

   @Override
   public void a(hep $$0, flo $$1, gsa $$2, int $$3) {
      flr $$4 = $$2.getBuffer(gsl.a(a, this.a($$0.u) % 1.0F, 0.0F));
      this.g.a($$0);
      this.g.a($$1, $$4, $$3, hkq.d);
      super.a($$0, $$1, $$2, $$3);
   }

   protected float a(float $$0) {
      return $$0 * 0.03F;
   }

   @Override
   public hep d() {
      return new hep();
   }
}
