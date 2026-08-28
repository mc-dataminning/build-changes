public class gnv extends gms<cit, fwo<cit>> {
   private static final ale a = new ale("textures/entity/wither/wither_armor.png");
   private final fwo<cit> b;

   public gnv(gkr<cit, fwo<cit>> $$0, fwu $$1) {
      super($$0);
      this.b = new fwo<>($$1.a(fwx.bW));
   }

   @Override
   protected float a(float $$0) {
      return ayx.b($$0 * 0.02F) * 3.0F;
   }

   @Override
   protected ale a() {
      return a;
   }

   @Override
   protected fty<cit> b() {
      return this.b;
   }
}
