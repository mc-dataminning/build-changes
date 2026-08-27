public class goe extends gpi<cka, fuz<cka>> {
   private static final akt a = new akt("textures/entity/breeze/breeze_wind.png");
   private static final fuz<cka> b = new fuz<>(fuz.a(128, 128).a());

   public goe(gmp<cka, fuz<cka>> $$0) {
      super($$0);
   }

   public void a(fbc $$0, gfg $$1, int $$2, cka $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      float $$10 = (float)$$3.am + $$6;
      fbg $$11 = $$1.getBuffer(gfo.a(a, this.a($$10) % 1.0F, 0.0F));
      b.a($$3, $$4, $$5, $$7, $$8, $$9);
      gjw.a(b, b.e()).a($$0, $$11, $$2, gqp.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }

   private float a(float $$0) {
      return $$0 * 0.02F;
   }
}
