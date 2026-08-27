public class fxo extends fxw<bzx, ffr<bzx>> {
   private static final afw a = new afw("textures/entity/creeper/creeper_armor.png");
   private final ffr<bzx> b;

   public fxo(fvy<bzx, ffr<bzx>> $$0, fis $$1) {
      super($$0);
      this.b = new ffr<>($$1.a(fiv.C));
   }

   @Override
   protected float a(float $$0) {
      return $$0 * 0.01F;
   }

   @Override
   protected afw a() {
      return a;
   }

   @Override
   protected ffx<bzx> b() {
      return this.b;
   }
}
