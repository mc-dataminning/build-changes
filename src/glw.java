public class glw extends giw<cof> {
   private static final alf a = new alf("textures/entity/projectiles/wind_charge.png");
   private final fwo f;

   public glw(gix.a $$0) {
      super($$0);
      this.f = new fwo($$0.a(fwz.bT));
   }

   public void a(cof $$0, float $$1, float $$2, ezy $$3, gdo $$4, int $$5) {
      float $$6 = (float)$$0.ai + $$2;
      fac $$7 = $$4.getBuffer(gdw.a(a, this.a($$6) % 1.0F, 0.0F));
      this.f.a($$0, 0.0F, 0.0F, $$6, 0.0F, 0.0F);
      this.f.a($$3, $$7, $$5, goq.d, 1.0F, 1.0F, 1.0F, 1.0F);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected float a(float $$0) {
      return $$0 * 0.03F;
   }

   public alf a(cof $$0) {
      return a;
   }
}
