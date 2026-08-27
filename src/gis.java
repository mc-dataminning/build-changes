public class gis extends gjt<chv, fpv<chv>> {
   private static final ajt a = new ajt("textures/entity/breeze/breeze_wind.png");
   private static final fpv<chv> b = new fpv<>(fpv.a(128, 128).a());

   public gis(ghd<chv, fpv<chv>> $$0) {
      super($$0);
   }

   public void a(ewi $$0, fzz $$1, int $$2, chv $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      float $$10 = (float)$$3.ah + $$6;
      ewm $$11 = $$1.getBuffer(gah.a(a, this.a($$10) % 1.0F, 0.0F));
      b.a($$3, $$4, $$5, $$7, $$8, $$9);
      geo.a(b, b.e()).a($$0, $$11, $$2, gla.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }

   private float a(float $$0) {
      return $$0 * 0.02F;
   }
}
