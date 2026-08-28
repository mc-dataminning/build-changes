public class gra extends gsb<gtf, fwz> {
   private static final ale a = ale.b("textures/entity/breeze/breeze_wind.png");
   private final fwz b;

   public gra(gno.a $$0, gpk<gtf, fwz> $$1) {
      super($$1);
      this.b = new fwz($$0.a(gap.C));
   }

   public void a(fdi $$0, ghl $$1, int $$2, gtf $$3, float $$4, float $$5) {
      fdm $$6 = $$1.getBuffer(ghv.a(a, this.a($$3.p) % 1.0F, 0.0F));
      this.b.a($$3);
      gmu.a(this.b, this.b.d()).a($$0, $$6, $$2, gwx.d);
   }

   private float a(float $$0) {
      return $$0 * 0.02F;
   }
}
