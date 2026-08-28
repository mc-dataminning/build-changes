public class gmn extends gjn<cnt> {
   private static final akk a = new akk("textures/entity/projectiles/wind_charge.png");
   private final fxe f;

   public gmn(gjo.a $$0) {
      super($$0);
      this.f = new fxe($$0.a(fxp.bT));
   }

   public void a(cnt $$0, float $$1, float $$2, fao $$3, gef $$4, int $$5) {
      float $$6 = (float)$$0.ai + $$2;
      fas $$7 = $$4.getBuffer(gen.a(a, this.a($$6) % 1.0F, 0.0F));
      this.f.a($$0, 0.0F, 0.0F, $$6, 0.0F, 0.0F);
      this.f.a($$3, $$7, $$5, gph.d, 1.0F, 1.0F, 1.0F, 1.0F);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected float a(float $$0) {
      return $$0 * 0.03F;
   }

   public akk a(cnt $$0) {
      return a;
   }
}
