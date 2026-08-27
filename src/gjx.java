public class gjx extends gky<cin, fra<cin>> {
   private static final akf a = new akf("textures/entity/breeze/breeze_wind.png");
   private static final fra<cin> b = new fra<>(fra.a(128, 128).a());

   public gjx(gii<cin, fra<cin>> $$0) {
      super($$0);
   }

   public void a(exn $$0, gbe $$1, int $$2, cin $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      float $$10 = (float)$$3.ai + $$6;
      exr $$11 = $$1.getBuffer(gbm.a(a, this.a($$10) % 1.0F, 0.0F));
      b.a($$3, $$4, $$5, $$7, $$8, $$9);
      gft.a(b, b.e()).a($$0, $$11, $$2, gmf.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }

   private float a(float $$0) {
      return $$0 * 0.02F;
   }
}
