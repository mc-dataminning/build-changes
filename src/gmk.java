public class gmk extends glm<ckj, gvj, fwv> {
   private static final alb a = alb.b("textures/entity/zombie/drowned.png");

   public gmk(gms.a $$0) {
      super($$0, new fwv($$0.a(gaa.ai)), new fwv($$0.a(gaa.am)), new fwv($$0.a(gaa.aj)), new fwv($$0.a(gaa.ak)), new fwv($$0.a(gaa.an)), new fwv($$0.a(gaa.ao)));
      this.a(new gqn(this, $$0.f()));
   }

   public gvj a() {
      return new gvj();
   }

   @Override
   public alb a(gvj $$0) {
      return a;
   }

   protected void a(gvj $$0, fcu $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = $$0.B;
      if ($$4 > 0.0F) {
         float $$5 = -10.0F - $$0.V;
         float $$6 = azc.h($$4, 0.0F, $$5);
         $$1.a(a.b.rotationDegrees($$6), 0.0F, $$0.r / 2.0F / $$3, 0.0F);
      }
   }
}
