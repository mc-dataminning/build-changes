public class fvw extends fuj<cac, fhh> {
   private static final aez a = new aez("textures/entity/illager/vex.png");
   private static final aez i = new aez("textures/entity/illager/vex_charging.png");

   public fvw(ftd.a $$0) {
      super($$0, new fhh($$0.a(fhw.bI)), 0.3F);
      this.a(new fxe<>(this, $$0.d()));
   }

   protected int a(cac $$0, gw $$1) {
      return 15;
   }

   public aez a(cac $$0) {
      return $$0.ge() ? i : a;
   }
}
