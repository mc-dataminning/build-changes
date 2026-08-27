public class fvq extends fud<bzo, fhc> {
   private static final aer a = new aer("textures/entity/illager/vex.png");
   private static final aer i = new aer("textures/entity/illager/vex_charging.png");

   public fvq(fsx.a $$0) {
      super($$0, new fhc($$0.a(fhr.bI)), 0.3F);
      this.a(new fwy<>(this, $$0.d()));
   }

   protected int a(bzo $$0, gu $$1) {
      return 15;
   }

   public aer a(bzo $$0) {
      return $$0.ga() ? i : a;
   }
}
