public class hbx extends hcy<hee, ghi> {
   private static final alk a = alk.b("textures/entity/breeze/breeze_wind.png");
   private final ghi b;

   public hbx(gyk.a $$0, hah<hee, ghi> $$1) {
      super($$1);
      this.b = new ghi($$0.a(glf.L));
   }

   public void a(flq $$0, gsc $$1, int $$2, hee $$3, float $$4, float $$5) {
      flt $$6 = $$1.getBuffer(gsn.a(a, this.a($$3.u) % 1.0F, 0.0F));
      this.b.a($$3);
      gxp.a(this.b, this.b.d()).a($$0, $$6, $$2, hks.d);
   }

   private float a(float $$0) {
      return $$0 * 0.02F;
   }
}
