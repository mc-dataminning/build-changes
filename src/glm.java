public class glm extends gkj<cgj, fuh<cgj>> {
   private static final akf a = new akf("textures/entity/wither/wither_armor.png");
   private final fuh<cgj> b;

   public glm(gii<cgj, fuh<cgj>> $$0, fun $$1) {
      super($$0);
      this.b = new fuh<>($$1.a(fuq.bW));
   }

   @Override
   protected float a(float $$0) {
      return axw.b($$0 * 0.02F) * 3.0F;
   }

   @Override
   protected akf a() {
      return a;
   }

   @Override
   protected frr<cgj> b() {
      return this.b;
   }
}
