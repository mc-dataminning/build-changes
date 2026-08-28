public class gjq extends gkb<cfp, fun<cfp>> {
   private static final ale a = new ale("textures/entity/iron_golem/iron_golem.png");

   public gjq(giv.a $$0) {
      super($$0, new fun<>($$0.a(fwx.av)), 0.7F);
      this.a(new gmy(this));
      this.a(new gmz(this, $$0.c()));
   }

   public ale a(cfp $$0) {
      return a;
   }

   protected void a(cfp $$0, ezw $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!((double)$$0.aU.a() < 0.01)) {
         float $$6 = 13.0F;
         float $$7 = $$0.aU.c($$4) + 6.0F;
         float $$8 = (Math.abs($$7 % 13.0F - 6.5F) - 3.25F) / 3.25F;
         $$1.a(a.f.rotationDegrees(6.5F * $$8));
      }
   }
}
