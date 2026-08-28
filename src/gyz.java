public class gyz extends gvy<csj, hcf> {
   private static final alg a = alg.b("textures/entity/projectiles/wind_charge.png");
   private final gig g;

   public gyz(gvz.a $$0) {
      super($$0);
      this.g = new gig($$0.a(git.dO));
   }

   @Override
   public void a(hcf $$0, fjc $$1, gps $$2, int $$3) {
      fjg $$4 = $$2.getBuffer(gqc.a(a, this.a($$0.u) % 1.0F, 0.0F));
      this.g.a($$0);
      this.g.a($$1, $$4, $$3, hif.d);
      super.a($$0, $$1, $$2, $$3);
   }

   protected float a(float $$0) {
      return $$0 * 0.03F;
   }

   @Override
   public hcf d() {
      return new hcf();
   }
}
