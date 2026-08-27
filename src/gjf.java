public class gjf extends gjn<cgs, fqp<cgs>> {
   private static final ajv a = new ajv("textures/entity/creeper/creeper_armor.png");
   private final fqp<cgs> b;

   public gjf(ghm<cgs, fqp<cgs>> $$0, ftr $$1) {
      super($$0);
      this.b = new fqp<>($$1.a(ftu.I));
   }

   @Override
   protected float a(float $$0) {
      return $$0 * 0.01F;
   }

   @Override
   protected ajv a() {
      return a;
   }

   @Override
   protected fqv<cgs> b() {
      return this.b;
   }
}
