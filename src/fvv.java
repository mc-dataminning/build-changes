public class fvv extends fui<bzr, fhh> {
   private static final aeu a = new aeu("textures/entity/illager/vex.png");
   private static final aeu i = new aeu("textures/entity/illager/vex_charging.png");

   public fvv(ftc.a $$0) {
      super($$0, new fhh($$0.a(fhw.bI)), 0.3F);
      this.a(new fxd<>(this, $$0.d()));
   }

   protected int a(bzr $$0, gw $$1) {
      return 15;
   }

   public aeu a(bzr $$0) {
      return $$0.ga() ? i : a;
   }
}
