public class gmm extends gmu<cjp, ftu<cjp>> {
   private static final alf a = new alf("textures/entity/creeper/creeper_armor.png");
   private final ftu<cjp> b;

   public gmm(gkt<cjp, ftu<cjp>> $$0, fww $$1) {
      super($$0);
      this.b = new ftu<>($$1.a(fwz.I));
   }

   @Override
   protected float a(float $$0) {
      return $$0 * 0.01F;
   }

   @Override
   protected alf a() {
      return a;
   }

   @Override
   protected fua<cjp> b() {
      return this.b;
   }
}
