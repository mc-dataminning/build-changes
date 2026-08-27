public class fwi extends ftu<cai, fhq<cai>> {
   private static final aez a = new aez("textures/entity/zombie_villager/zombie_villager.png");

   public fwi(ftd.a $$0) {
      super($$0, new fhq<>($$0.a(fhw.cc)), 0.5F);
      this.a(new fxb<>(this, new fhq($$0.a(fhw.cd)), new fhq($$0.a(fhw.ce)), $$0.g()));
      this.a(new fxw<>(this, $$0.e(), "zombie_villager"));
   }

   public aez a(cai $$0) {
      return a;
   }

   protected boolean b(cai $$0) {
      return super.a($$0) || $$0.go();
   }
}
