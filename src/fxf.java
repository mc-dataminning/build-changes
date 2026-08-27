public class fxf extends fwc<bxs, fgz<bxs>> {
   private static final aep a = new aep("textures/entity/wither/wither_armor.png");
   private final fgz<bxs> b;

   public fxf(fue<bxs, fgz<bxs>> $$0, fhf $$1) {
      super($$0);
      this.b = new fgz<>($$1.a(fhi.bP));
   }

   @Override
   protected float a(float $$0) {
      return aro.b($$0 * 0.02F) * 3.0F;
   }

   @Override
   protected aep a() {
      return a;
   }

   @Override
   protected fek<bxs> b() {
      return this.b;
   }
}
