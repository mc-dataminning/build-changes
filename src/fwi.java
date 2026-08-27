public class fwi extends fup<byd, fhu<byd>> {
   private static final aey a = new aey("textures/entity/wither/wither_invulnerable.png");
   private static final aey i = new aey("textures/entity/wither/wither.png");

   public fwi(ftj.a $$0) {
      super($$0, new fhu<>($$0.a(fid.bO)), 1.0F);
      this.a(new fyf(this, $$0.f()));
   }

   protected int a(byd $$0, gw $$1) {
      return 15;
   }

   public aey a(byd $$0) {
      int $$1 = $$0.y();
      return $$1 > 0 && ($$1 > 80 || $$1 / 5 % 2 != 1) ? a : i;
   }

   protected void a(byd $$0, elr $$1, float $$2) {
      float $$3 = 2.0F;
      int $$4 = $$0.y();
      if ($$4 > 0) {
         $$3 -= ((float)$$4 - $$2) / 220.0F * 0.5F;
      }

      $$1.b($$3, $$3, $$3);
   }
}
