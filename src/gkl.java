public class gkl extends gkt<chz, frv<chz>> {
   private static final akh a = new akh("textures/entity/creeper/creeper_armor.png");
   private final frv<chz> b;

   public gkl(gis<chz, frv<chz>> $$0, fux $$1) {
      super($$0);
      this.b = new frv<>($$1.a(fva.I));
   }

   @Override
   protected float a(float $$0) {
      return $$0 * 0.01F;
   }

   @Override
   protected akh a() {
      return a;
   }

   @Override
   protected fsb<chz> b() {
      return this.b;
   }
}
