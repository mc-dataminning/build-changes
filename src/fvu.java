public class fvu extends fwc<byl, fee<byl>> {
   private static final aep a = new aep("textures/entity/creeper/creeper_armor.png");
   private final fee<byl> b;

   public fvu(fue<byl, fee<byl>> $$0, fhf $$1) {
      super($$0);
      this.b = new fee<>($$1.a(fhi.C));
   }

   @Override
   protected float a(float $$0) {
      return $$0 * 0.01F;
   }

   @Override
   protected aep a() {
      return a;
   }

   @Override
   protected fek<byl> b() {
      return this.b;
   }
}
