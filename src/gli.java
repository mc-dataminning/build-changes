public class gli extends glq<ciq, fsq<ciq>> {
   private static final akn a = new akn("textures/entity/creeper/creeper_armor.png");
   private final fsq<ciq> b;

   public gli(gjp<ciq, fsq<ciq>> $$0, fvs $$1) {
      super($$0);
      this.b = new fsq<>($$1.a(fvv.I));
   }

   @Override
   protected float a(float $$0) {
      return $$0 * 0.01F;
   }

   @Override
   protected akn a() {
      return a;
   }

   @Override
   protected fsw<ciq> b() {
      return this.b;
   }
}
