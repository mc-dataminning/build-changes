public class fvo extends fta<bzt, fhc<bzt>> {
   private static final aep a = new aep("textures/entity/zombie_villager/zombie_villager.png");

   public fvo(fsj.a $$0) {
      super($$0, new fhc<>($$0.a(fhi.cc)), 0.5F);
      this.a(new fwh<>(this, new fhc($$0.a(fhi.cd)), new fhc($$0.a(fhi.ce)), $$0.g()));
      this.a(new fxc<>(this, $$0.e(), "zombie_villager"));
   }

   public aep a(bzt $$0) {
      return a;
   }

   protected boolean b(bzt $$0) {
      return super.a($$0) || $$0.gj();
   }
}
