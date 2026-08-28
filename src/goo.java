public class goo extends gnl<cii, fxg<cii>> {
   private static final akk a = new akk("textures/entity/wither/wither_armor.png");
   private final fxg<cii> b;

   public goo(glk<cii, fxg<cii>> $$0, fxm $$1) {
      super($$0);
      this.b = new fxg<>($$1.a(fxp.bW));
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
   protected fuq<cii> b() {
      return this.b;
   }
}
