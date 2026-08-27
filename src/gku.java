public class gku extends giz<chu, fvm<chu>> {
   private static final akm a = new akm("textures/entity/wither/wither_invulnerable.png");
   private static final akm i = new akm("textures/entity/wither/wither.png");

   public gku(ght.a $$0) {
      super($$0, new fvm<>($$0.a(fvv.bV)), 1.0F);
      this.a(new gmt(this, $$0.f()));
   }

   protected int a(chu $$0, io $$1) {
      return 15;
   }

   public akm a(chu $$0) {
      int $$1 = $$0.y();
      return $$1 > 0 && ($$1 > 80 || $$1 / 5 % 2 != 1) ? a : i;
   }

   protected void a(chu $$0, eys $$1, float $$2) {
      float $$3 = 2.0F;
      int $$4 = $$0.y();
      if ($$4 > 0) {
         $$3 -= ((float)$$4 - $$2) / 220.0F * 0.5F;
      }

      $$1.b($$3, $$3, $$3);
   }
}
