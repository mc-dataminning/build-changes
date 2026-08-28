public class gwn extends gvs<cjm, hda, ggi> {
   private static final alg a = alg.b("textures/entity/dolphin.png");

   public gwn(gwy.a $$0) {
      super($$0, new ggi($$0.a(gjs.ax)), new ggi($$0.a(gjs.ay)), 0.7F);
      this.a(new hat(this));
   }

   public alg a(hda $$0) {
      return a;
   }

   public hda a() {
      return new hda();
   }

   public void a(cjm $$0, hda $$1, float $$2) {
      super.a($$0, $$1, $$2);
      hdu.a($$0, $$1, this.h);
      $$1.a = $$0.dx().j() > 1.0E-7;
   }
}
