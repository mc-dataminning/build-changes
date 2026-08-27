public class ggi extends ghj<cgu, fnl<cgu>> {
   private static final ajh a = new ajh("textures/entity/breeze/breeze_wind.png");
   private static final fnl<cgu> b = new fnl<>(fnl.a(128, 128).a());

   public ggi(get<cgu, fnl<cgu>> $$0) {
      super($$0);
   }

   public void a(etz $$0, fxq $$1, int $$2, cgu $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      float $$10 = (float)$$3.ah + $$6;
      eud $$11 = $$1.getBuffer(fxy.a(a, this.a($$10) % 1.0F, 0.0F));
      b.a($$3, $$4, $$5, $$7, $$8, $$9);
      gce.a(b, b.e()).a($$0, $$11, $$2, giq.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }

   private float a(float $$0) {
      return $$0 * 0.02F;
   }
}
