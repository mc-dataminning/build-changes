public class glm extends glz<ceq, fwf<ceq>> {
   private static final akt a = new akt("textures/entity/iron_golem/iron_golem.png");

   public glm(gkq.a $$0) {
      super($$0, new fwf<>($$0.a(fyr.az)), 0.7F);
      this.a(new gow(this));
      this.a(new gox(this, $$0.c()));
   }

   public akt a(ceq $$0) {
      return a;
   }

   protected void a(ceq $$0, fbc $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!((double)$$0.bf.a() < 0.01)) {
         float $$6 = 13.0F;
         float $$7 = $$0.bf.c($$4) + 6.0F;
         float $$8 = (Math.abs($$7 % 13.0F - 6.5F) - 3.25F) / 3.25F;
         $$1.a(a.f.rotationDegrees(6.5F * $$8));
      }
   }
}
