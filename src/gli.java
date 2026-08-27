public class gli extends glq<cio, fsq<cio>> {
   private static final akm a = new akm("textures/entity/creeper/creeper_armor.png");
   private final fsq<cio> b;

   public gli(gjp<cio, fsq<cio>> $$0, fvs $$1) {
      super($$0);
      this.b = new fsq<>($$1.a(fvv.I));
   }

   @Override
   protected float a(float $$0) {
      return $$0 * 0.01F;
   }

   @Override
   protected akm a() {
      return a;
   }

   @Override
   protected fsw<cio> b() {
      return this.b;
   }
}
