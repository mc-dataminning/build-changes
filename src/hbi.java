public class hbi extends haf<hfa, giq> {
   private static final alg a = alg.b("textures/entity/wither/wither_armor.png");
   private final giq b;

   public hbi(gye<hfa, giq> $$0, giy $$1) {
      super($$0);
      this.b = new giq($$1.a(gjb.dT));
   }

   protected boolean a(hfa $$0) {
      return $$0.d;
   }

   @Override
   protected float a(float $$0) {
      return azm.b($$0 * 0.02F) * 3.0F;
   }

   @Override
   protected alg a() {
      return a;
   }

   protected giq b() {
      return this.b;
   }
}
