public class fvh extends ftu<bzp, fgx> {
   private static final aer a = new aer("textures/entity/illager/vex.png");
   private static final aer i = new aer("textures/entity/illager/vex_charging.png");

   public fvh(fso.a $$0) {
      super($$0, new fgx($$0.a(fhm.bI)), 0.3F);
      this.a(new fwp<>(this, $$0.d()));
   }

   protected int a(bzp $$0, gu $$1) {
      return 15;
   }

   public aer a(bzp $$0) {
      return $$0.fZ() ? i : a;
   }
}
