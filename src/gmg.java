public class gmg extends gnh<ckx, fth<ckx>> {
   private static final ale a = new ale("textures/entity/breeze/breeze_wind.png");
   private static final fth<ckx> b = new fth<>(fth.a(128, 128).a());

   public gmg(gkr<ckx, fth<ckx>> $$0) {
      super($$0);
   }

   public void a(ezw $$0, gdm $$1, int $$2, ckx $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      float $$10 = (float)$$3.ai + $$6;
      faa $$11 = $$1.getBuffer(gdu.a(a, this.a($$10) % 1.0F, 0.0F));
      b.a($$3, $$4, $$5, $$7, $$8, $$9);
      gib.a(b, b.e()).a($$0, $$11, $$2, goo.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }

   private float a(float $$0) {
      return $$0 * 0.02F;
   }
}
