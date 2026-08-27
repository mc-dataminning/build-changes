public class fwa extends fun<bzw, fhm> {
   private static final aex a = new aex("textures/entity/illager/vex.png");
   private static final aex i = new aex("textures/entity/illager/vex_charging.png");

   public fwa(fth.a $$0) {
      super($$0, new fhm($$0.a(fib.bI)), 0.3F);
      this.a(new fxi<>(this, $$0.d()));
   }

   protected int a(bzw $$0, gw $$1) {
      return 15;
   }

   public aex a(bzw $$0) {
      return $$0.gd() ? i : a;
   }
}
