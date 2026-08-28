public class hap extends haw<hcy, ggh> {
   private static final alg a = alg.b("textures/entity/creeper/creeper_armor.png");
   private final ggh b;

   public hap(gyv<hcy, ggh> $$0, gjp $$1) {
      super($$0);
      this.b = new ggh($$1.a(gjs.ar));
   }

   protected boolean a(hcy $$0) {
      return $$0.b;
   }

   @Override
   protected float a(float $$0) {
      return $$0 * 0.01F;
   }

   @Override
   protected alg a() {
      return a;
   }

   protected ggh b() {
      return this.b;
   }
}
