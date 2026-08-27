public class gpa extends goq<cjc, fwl<cjc>> {
   private static final akt a = new akt("textures/entity/wither/wither_armor.png");
   private final fwl<cjc> b;

   public gpa(gmp<cjc, fwl<cjc>> $$0, fyo $$1) {
      super($$0);
      this.b = new fwl<>($$1.a(fyr.bz));
   }

   @Override
   protected float a(float $$0) {
      return aym.b($$0 * 0.02F) * 3.0F;
   }

   @Override
   protected akt a() {
      return a;
   }

   @Override
   protected fvq<cjc> b() {
      return this.b;
   }
}
