public class gmx extends gny<ckm, ftx<ckm>> {
   private static final akk a = new akk("textures/entity/breeze/breeze_wind.png");
   private static final ftx<ckm> b = new ftx<>(ftx.a(128, 128).a());

   public gmx(gli<ckm, ftx<ckm>> $$0) {
      super($$0);
   }

   public void a(fam $$0, ged $$1, int $$2, ckm $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      float $$10 = (float)$$3.ai + $$6;
      faq $$11 = $$1.getBuffer(gel.a(a, this.a($$10) % 1.0F, 0.0F));
      b.a($$3, $$4, $$5, $$7, $$8, $$9);
      gis.a(b, b.e()).a($$0, $$11, $$2, gpf.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }

   private float a(float $$0) {
      return $$0 * 0.02F;
   }
}
