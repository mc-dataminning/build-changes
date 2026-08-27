public class gdl extends gci<cbh, fmm<cbh>> {
   private static final ahg a = new ahg("textures/entity/wither/wither_armor.png");
   private final fmm<cbh> b;

   public gdl(gah<cbh, fmm<cbh>> $$0, fms $$1) {
      super($$0);
      this.b = new fmm<>($$1.a(fmv.bT));
   }

   @Override
   protected float a(float $$0) {
      return aun.b($$0 * 0.02F) * 3.0F;
   }

   @Override
   protected ahg a() {
      return a;
   }

   @Override
   protected fjw<cbh> b() {
      return this.b;
   }
}
