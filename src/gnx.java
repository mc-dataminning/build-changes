public class gnx extends gmu<civ, fwq<civ>> {
   private static final alf a = new alf("textures/entity/wither/wither_armor.png");
   private final fwq<civ> b;

   public gnx(gkt<civ, fwq<civ>> $$0, fww $$1) {
      super($$0);
      this.b = new fwq<>($$1.a(fwz.bW));
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
   protected fua<civ> b() {
      return this.b;
   }
}
