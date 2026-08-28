public class gmj extends gnk<cla, ftk<cla>> {
   private static final alf a = new alf("textures/entity/breeze/breeze_wind.png");
   private static final ftk<cla> b = new ftk<>(ftk.a(128, 128).a());

   public gmj(gku<cla, ftk<cla>> $$0) {
      super($$0);
   }

   public void a(ezz $$0, gdp $$1, int $$2, cla $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      float $$10 = (float)$$3.ai + $$6;
      fad $$11 = $$1.getBuffer(gdx.a(a, this.a($$10) % 1.0F, 0.0F));
      b.a($$3, $$4, $$5, $$7, $$8, $$9);
      gie.a(b, b.e()).a($$0, $$11, $$2, gor.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }

   private float a(float $$0) {
      return $$0 * 0.02F;
   }
}
