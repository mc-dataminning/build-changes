public class gvq extends gws<gxx, gbk> {
   private static final akv a = akv.b("textures/entity/breeze/breeze_wind.png");
   private final gbk b;

   public gvq(gsd.a $$0, gua<gxx, gbk> $$1) {
      super($$1);
      this.b = new gbk($$0.a(gfb.L));
   }

   public void a(fft $$0, glx $$1, int $$2, gxx $$3, float $$4, float $$5) {
      ffx $$6 = $$1.getBuffer(gmh.a(a, this.a($$3.u) % 1.0F, 0.0F));
      this.b.a($$3);
      gri.a(this.b, this.b.d()).a($$0, $$6, $$2, heh.d);
   }

   private float a(float $$0) {
      return $$0 * 0.02F;
   }
}
