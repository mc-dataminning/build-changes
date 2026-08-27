public class gkq extends gjn<cfy, ftl<cfy>> {
   private static final ajv a = new ajv("textures/entity/wither/wither_armor.png");
   private final ftl<cfy> b;

   public gkq(ghm<cfy, ftl<cfy>> $$0, ftr $$1) {
      super($$0);
      this.b = new ftl<>($$1.a(ftu.bW));
   }

   @Override
   protected float a(float $$0) {
      return axm.b($$0 * 0.02F) * 3.0F;
   }

   @Override
   protected ajv a() {
      return a;
   }

   @Override
   protected fqv<cfy> b() {
      return this.b;
   }
}
