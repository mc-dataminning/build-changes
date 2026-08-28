public class gom extends gnj<cih, fxe<cih>> {
   private static final akk a = new akk("textures/entity/wither/wither_armor.png");
   private final fxe<cih> b;

   public gom(gli<cih, fxe<cih>> $$0, fxk $$1) {
      super($$0);
      this.b = new fxe<>($$1.a(fxn.bW));
   }

   @Override
   protected float a(float $$0) {
      return ayg.b($$0 * 0.02F) * 3.0F;
   }

   @Override
   protected akk a() {
      return a;
   }

   @Override
   protected fuo<cih> b() {
      return this.b;
   }
}
