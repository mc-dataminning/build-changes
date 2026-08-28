public class gnz extends gmw<cix, fws<cix>> {
   private static final alf a = new alf("textures/entity/wither/wither_armor.png");
   private final fws<cix> b;

   public gnz(gkv<cix, fws<cix>> $$0, fwy $$1) {
      super($$0);
      this.b = new fws<>($$1.a(fxb.bW));
   }

   @Override
   protected float a(float $$0) {
      return ayz.b($$0 * 0.02F) * 3.0F;
   }

   @Override
   protected alf a() {
      return a;
   }

   @Override
   protected fuc<cix> b() {
      return this.b;
   }
}
