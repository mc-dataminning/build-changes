public class gvu extends gwb<gyc, gbs> {
   private static final akv a = akv.b("textures/entity/creeper/creeper_armor.png");
   private final gbs b;

   public gvu(gua<gyc, gbs> $$0, gey $$1) {
      super($$0);
      this.b = new gbs($$1.a(gfb.aj));
   }

   protected boolean a(gyc $$0) {
      return $$0.b;
   }

   @Override
   protected float a(float $$0) {
      return $$0 * 0.01F;
   }

   @Override
   protected akv a() {
      return a;
   }

   protected gbs b() {
      return this.b;
   }
}
