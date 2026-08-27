public class fyp extends fwb<cbu, fju<cbu>> {
   private static final agg a = new agg("textures/entity/zombie_villager/zombie_villager.png");

   public fyp(fvk.a $$0) {
      super($$0, new fju<>($$0.a(fka.cc)), 0.5F);
      this.a(new fzi<>(this, new fju($$0.a(fka.cd)), new fju($$0.a(fka.ce)), $$0.g()));
      this.a(new gad<>(this, $$0.e(), "zombie_villager"));
   }

   public agg a(cbu $$0) {
      return a;
   }

   protected boolean b(cbu $$0) {
      return super.a($$0) || $$0.go();
   }
}
