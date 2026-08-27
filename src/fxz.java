public class fxz extends fww<byh, fhn<byh>> {
   private static final aez a = new aez("textures/entity/wither/wither_armor.png");
   private final fhn<byh> b;

   public fxz(fuy<byh, fhn<byh>> $$0, fht $$1) {
      super($$0);
      this.b = new fhn<>($$1.a(fhw.bP));
   }

   @Override
   protected float a(float $$0) {
      return asb.b($$0 * 0.02F) * 3.0F;
   }

   @Override
   protected aez a() {
      return a;
   }

   @Override
   protected fey<byh> b() {
      return this.b;
   }
}
