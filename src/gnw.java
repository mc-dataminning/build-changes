public class gnw extends gmt<ciu, fwp<ciu>> {
   private static final ale a = new ale("textures/entity/wither/wither_armor.png");
   private final fwp<ciu> b;

   public gnw(gks<ciu, fwp<ciu>> $$0, fwv $$1) {
      super($$0);
      this.b = new fwp<>($$1.a(fwy.bW));
   }

   @Override
   protected float a(float $$0) {
      return ayy.b($$0 * 0.02F) * 3.0F;
   }

   @Override
   protected ale a() {
      return a;
   }

   @Override
   protected ftz<ciu> b() {
      return this.b;
   }
}
