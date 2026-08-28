public class gog extends gnd<cie, fwy<cie>> {
   private static final akk a = new akk("textures/entity/wither/wither_armor.png");
   private final fwy<cie> b;

   public gog(glc<cie, fwy<cie>> $$0, fxe $$1) {
      super($$0);
      this.b = new fwy<>($$1.a(fxh.bW));
   }

   @Override
   protected float a(float $$0) {
      return aye.b($$0 * 0.02F) * 3.0F;
   }

   @Override
   protected akk a() {
      return a;
   }

   @Override
   protected fui<cie> b() {
      return this.b;
   }
}
