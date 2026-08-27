public class fvi extends ftp<bxs, fgz<bxs>> {
   private static final aep a = new aep("textures/entity/wither/wither_invulnerable.png");
   private static final aep i = new aep("textures/entity/wither/wither.png");

   public fvi(fsj.a $$0) {
      super($$0, new fgz<>($$0.a(fhi.bO)), 1.0F);
      this.a(new fxf(this, $$0.f()));
   }

   protected int a(bxs $$0, gv $$1) {
      return 15;
   }

   public aep a(bxs $$0) {
      int $$1 = $$0.t();
      return $$1 > 0 && ($$1 > 80 || $$1 / 5 % 2 != 1) ? a : i;
   }

   protected void a(bxs $$0, elh $$1, float $$2) {
      float $$3 = 2.0F;
      int $$4 = $$0.t();
      if ($$4 > 0) {
         $$3 -= ((float)$$4 - $$2) / 220.0F * 0.5F;
      }

      $$1.b($$3, $$3, $$3);
   }
}
