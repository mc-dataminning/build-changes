public class fxi extends fuu<cbf, fip<cbf>> {
   private static final afw a = new afw("textures/entity/zombie_villager/zombie_villager.png");

   public fxi(fud.a $$0) {
      super($$0, new fip<>($$0.a(fiv.cc)), 0.5F);
      this.a(new fyb<>(this, new fip($$0.a(fiv.cd)), new fip($$0.a(fiv.ce)), $$0.g()));
      this.a(new fyw<>(this, $$0.e(), "zombie_villager"));
   }

   public afw a(cbf $$0) {
      return a;
   }

   protected boolean b(cbf $$0) {
      return super.a($$0) || $$0.go();
   }
}
