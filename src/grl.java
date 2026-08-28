public class grl extends gsm<gtr, fxk> {
   private static final alh a = alh.b("textures/entity/breeze/breeze_wind.png");
   private final fxk b;

   public grl(gnz.a $$0, gpv<gtr, fxk> $$1) {
      super($$1);
      this.b = new fxk($$0.a(gba.C));
   }

   public void a(fdt $$0, ghw $$1, int $$2, gtr $$3, float $$4, float $$5) {
      fdx $$6 = $$1.getBuffer(gig.a(a, this.a($$3.p) % 1.0F, 0.0F));
      this.b.a($$3);
      gnf.a(this.b, this.b.d()).a($$0, $$6, $$2, gxj.d);
   }

   private float a(float $$0) {
      return $$0 * 0.02F;
   }
}
