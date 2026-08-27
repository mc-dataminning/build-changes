public class gjl extends ggm<clt> {
   private static final akf a = new akf("textures/entity/projectiles/wind_charge.png");
   private final fuf f;

   public gjl(ggn.a $$0) {
      super($$0);
      this.f = new fuf($$0.a(fuq.bT));
   }

   public void a(clt $$0, float $$1, float $$2, exn $$3, gbe $$4, int $$5) {
      float $$6 = (float)$$0.ai + $$2;
      exr $$7 = $$4.getBuffer(gbm.a(a, this.a($$6) % 1.0F, 0.0F));
      this.f.a($$0, 0.0F, 0.0F, $$6, 0.0F, 0.0F);
      this.f.a($$3, $$7, $$5, gmf.d, 1.0F, 1.0F, 1.0F, 1.0F);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected float a(float $$0) {
      return $$0 * 0.03F;
   }

   public akf a(clt $$0) {
      return a;
   }
}
