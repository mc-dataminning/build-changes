public class fwf extends fxd<bxb, fhr<bxb>> {
   private static final agi a = new agi("textures/entity/fox/fox.png");
   private static final agi i = new agi("textures/entity/fox/fox_sleep.png");
   private static final agi j = new agi("textures/entity/fox/snow_fox.png");
   private static final agi k = new agi("textures/entity/fox/snow_fox_sleep.png");

   public fwf(fvx.a $$0) {
      super($$0, new fhr<>($$0.a(fkn.X)), 0.4F);
      this.a(new fzs(this, $$0.d()));
   }

   protected void a(bxb $$0, enw $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$0.gl() || $$0.gf()) {
         float $$5 = -atm.i($$4, $$0.O, $$0.dF());
         $$1.a(a.b.rotationDegrees($$5));
      }
   }

   public agi a(bxb $$0) {
      if ($$0.w() == bxb.v.a) {
         return $$0.fE() ? i : a;
      } else {
         return $$0.fE() ? k : j;
      }
   }
}
