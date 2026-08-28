public class gul extends grk<cqx, gxq> {
   private static final alp a = alp.b("textures/entity/projectiles/wind_charge.png");
   private final gdv b;

   public gul(grl.a $$0) {
      super($$0);
      this.b = new gdv($$0.a(gei.dy));
   }

   @Override
   public void a(gxq $$0, fgl $$1, glg $$2, int $$3) {
      fgp $$4 = $$2.getBuffer(glq.a(a, this.a($$0.p) % 1.0F, 0.0F));
      this.b.a($$0);
      this.b.a($$1, $$4, $$3, hax.d);
      super.a($$0, $$1, $$2, $$3);
   }

   protected float a(float $$0) {
      return $$0 * 0.03F;
   }

   @Override
   public gxq d() {
      return new gxq();
   }
}
