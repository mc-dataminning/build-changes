public class gmz extends goa<ckn, ftz<ckn>> {
   private static final akk a = new akk("textures/entity/breeze/breeze_wind.png");
   private static final ftz<ckn> b = new ftz<>(ftz.a(128, 128).a());

   public gmz(glk<ckn, ftz<ckn>> $$0) {
      super($$0);
   }

   public void a(fao $$0, gef $$1, int $$2, ckn $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      float $$10 = (float)$$3.ai + $$6;
      fas $$11 = $$1.getBuffer(gen.a(a, this.a($$10) % 1.0F, 0.0F));
      b.a($$3, $$4, $$5, $$7, $$8, $$9);
      giu.a(b, b.e()).a($$0, $$11, $$2, gph.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }

   private float a(float $$0) {
      return $$0 * 0.02F;
   }
}
