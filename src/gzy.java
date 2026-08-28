public class gzy extends gwx<csy, hdf> {
   private static final alg a = alg.b("textures/entity/projectiles/wind_charge.png");
   private final gjf g;

   public gzy(gwy.a $$0) {
      super($$0);
      this.g = new gjf($$0.a(gjs.dS));
   }

   @Override
   public void a(hdf $$0, fkd $$1, gqr $$2, int $$3) {
      fkh $$4 = $$2.getBuffer(grc.a(a, this.a($$0.u) % 1.0F, 0.0F));
      this.g.a($$0);
      this.g.a($$1, $$4, $$3, hjg.d);
      super.a($$0, $$1, $$2, $$3);
   }

   protected float a(float $$0) {
      return $$0 * 0.03F;
   }

   @Override
   public hdf d() {
      return new hdf();
   }
}
