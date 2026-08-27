public class gle extends gmf<cjy, fsf<cjy>> {
   private static final akm a = new akm("textures/entity/breeze/breeze_wind.png");
   private static final fsf<cjy> b = new fsf<>(fsf.a(128, 128).a());

   public gle(gjp<cjy, fsf<cjy>> $$0) {
      super($$0);
   }

   public void a(eys $$0, gck $$1, int $$2, cjy $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      float $$10 = (float)$$3.ai + $$6;
      eyw $$11 = $$1.getBuffer(gcs.a(a, this.a($$10) % 1.0F, 0.0F));
      b.a($$3, $$4, $$5, $$7, $$8, $$9);
      ggz.a(b, b.e()).a($$0, $$11, $$2, gnm.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }

   private float a(float $$0) {
      return $$0 * 0.02F;
   }
}
