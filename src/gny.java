public class gny extends gog<cjp, fve<cjp>> {
   private static final akr a = akr.b("textures/entity/creeper/creeper_armor.png");
   private final fve<cjp> b;

   public gny(gmf<cjp, fve<cjp>> $$0, fyg $$1) {
      super($$0);
      this.b = new fve<>($$1.a(fyj.J));
   }

   @Override
   protected float a(float $$0) {
      return $$0 * 0.01F;
   }

   @Override
   protected akr a() {
      return a;
   }

   @Override
   protected fvk<cjp> b() {
      return this.b;
   }
}
