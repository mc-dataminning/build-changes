public class gre extends grm<gtj, fxg> {
   private static final ale a = ale.b("textures/entity/creeper/creeper_armor.png");
   private final fxg b;

   public gre(gpk<gtj, fxg> $$0, gam $$1) {
      super($$0);
      this.b = new fxg($$1.a(gap.X));
   }

   protected boolean a(gtj $$0) {
      return $$0.b;
   }

   @Override
   protected float a(float $$0) {
      return $$0 * 0.01F;
   }

   @Override
   protected ale a() {
      return a;
   }

   protected fxg b() {
      return this.b;
   }
}
