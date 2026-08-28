public class gml extends gjl<cns> {
   private static final akk a = new akk("textures/entity/projectiles/wind_charge.png");
   private final fxc f;

   public gml(gjm.a $$0) {
      super($$0);
      this.f = new fxc($$0.a(fxn.bT));
   }

   public void a(cns $$0, float $$1, float $$2, fam $$3, ged $$4, int $$5) {
      float $$6 = (float)$$0.ai + $$2;
      faq $$7 = $$4.getBuffer(gel.a(a, this.a($$6) % 1.0F, 0.0F));
      this.f.a($$0, 0.0F, 0.0F, $$6, 0.0F, 0.0F);
      this.f.a($$3, $$7, $$5, gpf.d, 1.0F, 1.0F, 1.0F, 1.0F);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected float a(float $$0) {
      return $$0 * 0.03F;
   }

   public akk a(cns $$0) {
      return a;
   }
}
