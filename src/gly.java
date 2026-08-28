public class gly extends giy<coh> {
   private static final alf a = new alf("textures/entity/projectiles/wind_charge.png");
   private final fwq f;

   public gly(giz.a $$0) {
      super($$0);
      this.f = new fwq($$0.a(fxb.bT));
   }

   public void a(coh $$0, float $$1, float $$2, faa $$3, gdq $$4, int $$5) {
      float $$6 = (float)$$0.ai + $$2;
      fae $$7 = $$4.getBuffer(gdy.a(a, this.a($$6) % 1.0F, 0.0F));
      this.f.a($$0, 0.0F, 0.0F, $$6, 0.0F, 0.0F);
      this.f.a($$3, $$7, $$5, gos.d, 1.0F, 1.0F, 1.0F, 1.0F);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected float a(float $$0) {
      return $$0 * 0.03F;
   }

   public alf a(coh $$0) {
      return a;
   }
}
