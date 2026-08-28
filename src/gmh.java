public class gmh extends gni<cky, fti<cky>> {
   private static final ale a = new ale("textures/entity/breeze/breeze_wind.png");
   private static final fti<cky> b = new fti<>(fti.a(128, 128).a());

   public gmh(gks<cky, fti<cky>> $$0) {
      super($$0);
   }

   public void a(ezx $$0, gdn $$1, int $$2, cky $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      float $$10 = (float)$$3.ai + $$6;
      fab $$11 = $$1.getBuffer(gdv.a(a, this.a($$10) % 1.0F, 0.0F));
      b.a($$3, $$4, $$5, $$7, $$8, $$9);
      gic.a(b, b.e()).a($$0, $$11, $$2, gop.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }

   private float a(float $$0) {
      return $$0 * 0.02F;
   }
}
