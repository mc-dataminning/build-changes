public class fws extends fxd<bxd, fie<bxd>> {
   private static final agi a = new agi("textures/entity/iron_golem/iron_golem.png");

   public fws(fvx.a $$0) {
      super($$0, new fie<>($$0.a(fkn.ap)), 0.7F);
      this.a(new fzw(this));
      this.a(new fzx(this, $$0.c()));
   }

   public agi a(bxd $$0) {
      return a;
   }

   protected void a(bxd $$0, enw $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!((double)$$0.aQ.a() < 0.01)) {
         float $$5 = 13.0F;
         float $$6 = $$0.aQ.c($$4) + 6.0F;
         float $$7 = (Math.abs($$6 % 13.0F - 6.5F) - 3.25F) / 3.25F;
         $$1.a(a.f.rotationDegrees(6.5F * $$7));
      }
   }
}
