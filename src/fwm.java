public class fwm extends fty<cac, fhv<cac>> {
   private static final aex a = new aex("textures/entity/zombie_villager/zombie_villager.png");

   public fwm(fth.a $$0) {
      super($$0, new fhv<>($$0.a(fib.cc)), 0.5F);
      this.a(new fxf<>(this, new fhv($$0.a(fib.cd)), new fhv($$0.a(fib.ce)), $$0.g()));
      this.a(new fya<>(this, $$0.e(), "zombie_villager"));
   }

   public aex a(cac $$0) {
      return a;
   }

   protected boolean b(cac $$0) {
      return super.a($$0) || $$0.gn();
   }
}
