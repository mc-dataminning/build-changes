public class glt extends gjy<ciq, fwl<ciq>> {
   private static final alb a = new alb("textures/entity/wither/wither_invulnerable.png");
   private static final alb i = new alb("textures/entity/wither/wither.png");

   public glt(gis.a $$0) {
      super($$0, new fwl<>($$0.a(fwu.bV)), 1.0F);
      this.a(new gns(this, $$0.f()));
   }

   protected int a(ciq $$0, iz $$1) {
      return 15;
   }

   public alb a(ciq $$0) {
      int $$1 = $$0.y();
      return $$1 > 0 && ($$1 > 80 || $$1 / 5 % 2 != 1) ? a : i;
   }

   protected void a(ciq $$0, ezt $$1, float $$2) {
      float $$3 = 2.0F;
      int $$4 = $$0.y();
      if ($$4 > 0) {
         $$3 -= ((float)$$4 - $$2) / 220.0F * 0.5F;
      }

      $$1.b($$3, $$3, $$3);
   }
}
