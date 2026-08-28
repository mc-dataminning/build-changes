public class gpd extends goa<cis, fxu<cis>> {
   private static final akq a = akq.b("textures/entity/wither/wither_armor.png");
   private final fxu<cis> b;

   public gpd(glz<cis, fxu<cis>> $$0, fya $$1) {
      super($$0);
      this.b = new fxu<>($$1.a(fyd.bX));
   }

   @Override
   protected float a(float $$0) {
      return ayn.b($$0 * 0.02F) * 3.0F;
   }

   @Override
   protected akq a() {
      return a;
   }

   @Override
   protected fve<cis> b() {
      return this.b;
   }
}
