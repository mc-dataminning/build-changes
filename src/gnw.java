public class gnw extends goe<cjp, fvc<cjp>> {
   private static final akr a = akr.b("textures/entity/creeper/creeper_armor.png");
   private final fvc<cjp> b;

   public gnw(gmd<cjp, fvc<cjp>> $$0, fye $$1) {
      super($$0);
      this.b = new fvc<>($$1.a(fyh.J));
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
   protected fvi<cjp> b() {
      return this.b;
   }
}
