public class gyx extends gzy<hbd, gel> {
   private static final ale a = ale.b("textures/entity/breeze/breeze_wind.png");
   private final gel b;

   public gyx(gvk.a $$0, gxh<hbd, gel> $$1) {
      super($$1);
      this.b = new gel($$0.a(gif.L));
   }

   public void a(fiq $$0, gpd $$1, int $$2, hbd $$3, float $$4, float $$5) {
      fiu $$6 = $$1.getBuffer(gpn.a(a, this.a($$3.u) % 1.0F, 0.0F));
      this.b.a($$3);
      gup.a(this.b, this.b.d()).a($$0, $$6, $$2, hhp.d);
   }

   private float a(float $$0) {
      return $$0 * 0.02F;
   }
}
