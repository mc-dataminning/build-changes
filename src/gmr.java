public class gmr extends gns<ckj, ftr<ckj>> {
   private static final akk a = new akk("textures/entity/breeze/breeze_wind.png");
   private static final ftr<ckj> b = new ftr<>(ftr.a(128, 128).a());

   public gmr(glc<ckj, ftr<ckj>> $$0) {
      super($$0);
   }

   public void a(fag $$0, gdx $$1, int $$2, ckj $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      float $$10 = (float)$$3.ai + $$6;
      fak $$11 = $$1.getBuffer(gef.a(a, this.a($$10) % 1.0F, 0.0F));
      b.a($$3, $$4, $$5, $$7, $$8, $$9);
      gim.a(b, b.e()).a($$0, $$11, $$2, goz.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }

   private float a(float $$0) {
      return $$0 * 0.02F;
   }
}
