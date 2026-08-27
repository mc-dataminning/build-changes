public class gkh extends gli<cjj, frk<cjj>> {
   private static final akh a = new akh("textures/entity/breeze/breeze_wind.png");
   private static final frk<cjj> b = new frk<>(frk.a(128, 128).a());

   public gkh(gis<cjj, frk<cjj>> $$0) {
      super($$0);
   }

   public void a(exx $$0, gbo $$1, int $$2, cjj $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      float $$10 = (float)$$3.ai + $$6;
      eyb $$11 = $$1.getBuffer(gbw.a(a, this.a($$10) % 1.0F, 0.0F));
      b.a($$3, $$4, $$5, $$7, $$8, $$9);
      ggd.a(b, b.e()).a($$0, $$11, $$2, gmp.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }

   private float a(float $$0) {
      return $$0 * 0.02F;
   }
}
