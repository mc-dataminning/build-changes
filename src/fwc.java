public class fwc extends fto<bzu, fhl<bzu>> {
   private static final aer a = new aer("textures/entity/zombie_villager/zombie_villager.png");

   public fwc(fsx.a $$0) {
      super($$0, new fhl<>($$0.a(fhr.cc)), 0.5F);
      this.a(new fwv<>(this, new fhl($$0.a(fhr.cd)), new fhl($$0.a(fhr.ce)), $$0.g()));
      this.a(new fxq<>(this, $$0.e(), "zombie_villager"));
   }

   public aer a(bzu $$0) {
      return a;
   }

   protected boolean b(bzu $$0) {
      return super.a($$0) || $$0.gk();
   }
}
