public class gzy extends haf<hcg, gfq> {
   private static final alg a = alg.b("textures/entity/creeper/creeper_armor.png");
   private final gfq b;

   public gzy(gye<hcg, gfq> $$0, giy $$1) {
      super($$0);
      this.b = new gfq($$1.a(gjb.ar));
   }

   protected boolean a(hcg $$0) {
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

   protected gfq b() {
      return this.b;
   }
}
