public class gzt extends gws<csv, hcz> {
   private static final alg a = alg.b("textures/entity/projectiles/wind_charge.png");
   private final gja g;

   public gzt(gwt.a $$0) {
      super($$0);
      this.g = new gja($$0.a(gjn.dQ));
   }

   @Override
   public void a(hcz $$0, fjy $$1, gqm $$2, int $$3) {
      fkc $$4 = $$2.getBuffer(gqx.a(a, this.a($$0.u) % 1.0F, 0.0F));
      this.g.a($$0);
      this.g.a($$1, $$4, $$3, hja.d);
      super.a($$0, $$1, $$2, $$3);
   }

   protected float a(float $$0) {
      return $$0 * 0.03F;
   }

   @Override
   public hcz d() {
      return new hcz();
   }
}
