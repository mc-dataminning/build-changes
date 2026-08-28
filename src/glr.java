public class glr extends gir<coa> {
   private static final alb a = new alb("textures/entity/projectiles/wind_charge.png");
   private final fwj f;

   public glr(gis.a $$0) {
      super($$0);
      this.f = new fwj($$0.a(fwu.bT));
   }

   public void a(coa $$0, float $$1, float $$2, ezt $$3, gdj $$4, int $$5) {
      float $$6 = (float)$$0.ai + $$2;
      ezx $$7 = $$4.getBuffer(gdr.a(a, this.a($$6) % 1.0F, 0.0F));
      this.f.a($$0, 0.0F, 0.0F, $$6, 0.0F, 0.0F);
      this.f.a($$3, $$7, $$5, gol.d, 1.0F, 1.0F, 1.0F, 1.0F);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected float a(float $$0) {
      return $$0 * 0.03F;
   }

   public alb a(coa $$0) {
      return a;
   }
}
