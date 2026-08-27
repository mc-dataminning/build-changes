public class fvc extends ftp<bzn, fgt> {
   private static final aep a = new aep("textures/entity/illager/vex.png");
   private static final aep i = new aep("textures/entity/illager/vex_charging.png");

   public fvc(fsj.a $$0) {
      super($$0, new fgt($$0.a(fhi.bI)), 0.3F);
      this.a(new fwk<>(this, $$0.d()));
   }

   protected int a(bzn $$0, gv $$1) {
      return 15;
   }

   public aep a(bzn $$0) {
      return $$0.fZ() ? i : a;
   }
}
