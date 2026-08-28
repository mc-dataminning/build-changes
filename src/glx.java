public class glx extends gix<cog> {
   private static final alf a = new alf("textures/entity/projectiles/wind_charge.png");
   private final fwp f;

   public glx(giy.a $$0) {
      super($$0);
      this.f = new fwp($$0.a(fxa.bT));
   }

   public void a(cog $$0, float $$1, float $$2, ezz $$3, gdp $$4, int $$5) {
      float $$6 = (float)$$0.ai + $$2;
      fad $$7 = $$4.getBuffer(gdx.a(a, this.a($$6) % 1.0F, 0.0F));
      this.f.a($$0, 0.0F, 0.0F, $$6, 0.0F, 0.0F);
      this.f.a($$3, $$7, $$5, gor.d, 1.0F, 1.0F, 1.0F, 1.0F);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected float a(float $$0) {
      return $$0 * 0.03F;
   }

   public alf a(cog $$0) {
      return a;
   }
}
