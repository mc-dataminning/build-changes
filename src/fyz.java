public class fyz extends fxw<bze, fim<bze>> {
   private static final afw a = new afw("textures/entity/wither/wither_armor.png");
   private final fim<bze> b;

   public fyz(fvy<bze, fim<bze>> $$0, fis $$1) {
      super($$0);
      this.b = new fim<>($$1.a(fiv.bP));
   }

   @Override
   protected float a(float $$0) {
      return asy.b($$0 * 0.02F) * 3.0F;
   }

   @Override
   protected afw a() {
      return a;
   }

   @Override
   protected ffx<bze> b() {
      return this.b;
   }
}
