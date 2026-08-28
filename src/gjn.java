public class gjn extends gjy<cfm, fuk<cfm>> {
   private static final alb a = new alb("textures/entity/iron_golem/iron_golem.png");

   public gjn(gis.a $$0) {
      super($$0, new fuk<>($$0.a(fwu.av)), 0.7F);
      this.a(new gmv(this));
      this.a(new gmw(this, $$0.c()));
   }

   public alb a(cfm $$0) {
      return a;
   }

   protected void a(cfm $$0, ezt $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!((double)$$0.aU.a() < 0.01)) {
         float $$6 = 13.0F;
         float $$7 = $$0.aU.c($$4) + 6.0F;
         float $$8 = (Math.abs($$7 % 13.0F - 6.5F) - 3.25F) / 3.25F;
         $$1.a(a.f.rotationDegrees(6.5F * $$8));
      }
   }
}
