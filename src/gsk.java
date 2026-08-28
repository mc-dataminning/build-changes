public class gsk extends gpj<cqd, gvo> {
   private static final alj a = alj.b("textures/entity/projectiles/wind_charge.png");
   private final gbx b;

   public gsk(gpk.a $$0) {
      super($$0);
      this.b = new gbx($$0.a(gck.dp));
   }

   @Override
   public void a(gvo $$0, fer $$1, gjg $$2, int $$3) {
      fev $$4 = $$2.getBuffer(gjq.a(a, this.a($$0.p) % 1.0F, 0.0F));
      this.b.a($$0);
      this.b.a($$1, $$4, $$3, gyv.d);
      super.a($$0, $$1, $$2, $$3);
   }

   protected float a(float $$0) {
      return $$0 * 0.03F;
   }

   @Override
   public gvo d() {
      return new gvo();
   }
}
