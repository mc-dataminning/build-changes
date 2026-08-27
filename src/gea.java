public class gea extends gcg<cdk, foz<cdk>> {
   private static final aiy a = new aiy("textures/entity/wither/wither_invulnerable.png");
   private static final aiy i = new aiy("textures/entity/wither/wither.png");

   public gea(gba.a $$0) {
      super($$0, new foz<>($$0.a(fpi.bR)), 1.0F);
      this.a(new gfz(this, $$0.f()));
   }

   protected int a(cdk $$0, hz $$1) {
      return 15;
   }

   public aiy a(cdk $$0) {
      int $$1 = $$0.A();
      return $$1 > 0 && ($$1 > 80 || $$1 / 5 % 2 != 1) ? a : i;
   }

   protected void a(cdk $$0, esh $$1, float $$2) {
      float $$3 = 2.0F;
      int $$4 = $$0.A();
      if ($$4 > 0) {
         $$3 -= ((float)$$4 - $$2) / 220.0F * 0.5F;
      }

      $$1.b($$3, $$3, $$3);
   }
}
