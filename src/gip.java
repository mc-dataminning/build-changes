public class gip extends gfq<cli> {
   private static final ajv a = new ajv("textures/entity/projectiles/wind_charge.png");
   private final ftj f;

   public gip(gfr.a $$0) {
      super($$0);
      this.f = new ftj($$0.a(ftu.bT));
   }

   public void a(cli $$0, float $$1, float $$2, ewr $$3, gai $$4, int $$5) {
      float $$6 = (float)$$0.ah + $$2;
      ewv $$7 = $$4.getBuffer(gaq.a(a, this.a($$6) % 1.0F, 0.0F));
      this.f.a($$0, 0.0F, 0.0F, $$6, 0.0F, 0.0F);
      this.f.a($$3, $$7, $$5, glj.d, 1.0F, 1.0F, 1.0F, 1.0F);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected float a(float $$0) {
      return $$0 * 0.03F;
   }

   public ajv a(cli $$0) {
      return a;
   }
}
