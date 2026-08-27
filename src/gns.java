public class gns extends gkp<cnj> {
   private static final akt a = new akt("textures/entity/projectiles/wind_charge.png");
   private final fyg b;

   public gns(gkq.a $$0) {
      super($$0);
      this.b = new fyg($$0.a(fyr.bZ));
   }

   public void a(cnj $$0, float $$1, float $$2, fbc $$3, gfg $$4, int $$5) {
      float $$6 = (float)$$0.am + $$2;
      fbg $$7 = $$4.getBuffer(gfo.a(a, this.a($$6) % 1.0F, 0.0F));
      this.b.a($$0, 0.0F, 0.0F, $$6, 0.0F, 0.0F);
      this.b.a($$3, $$7, $$5, gqp.d, 1.0F, 1.0F, 1.0F, 1.0F);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected float a(float $$0) {
      return $$0 * 0.03F;
   }

   public akt a(cnj $$0) {
      return a;
   }
}
