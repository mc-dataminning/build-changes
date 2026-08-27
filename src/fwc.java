public class fwc extends fup<bzy, fho> {
   private static final aey a = new aey("textures/entity/illager/vex.png");
   private static final aey i = new aey("textures/entity/illager/vex_charging.png");

   public fwc(ftj.a $$0) {
      super($$0, new fho($$0.a(fid.bI)), 0.3F);
      this.a(new fxk<>(this, $$0.d()));
   }

   protected int a(bzy $$0, gw $$1) {
      return 15;
   }

   public aey a(bzy $$0) {
      return $$0.gd() ? i : a;
   }
}
