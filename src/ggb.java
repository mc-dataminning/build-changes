public class ggb extends ggx<cha, fqz<cha>> {
   private static final ajv a = new ajv("textures/entity/ghast/ghast.png");
   private static final ajv i = new ajv("textures/entity/ghast/ghast_shooting.png");

   public ggb(gfr.a $$0) {
      super($$0, new fqz<>($$0.a(ftu.ag)), 1.5F);
   }

   public ajv a(cha $$0) {
      return $$0.r() ? i : a;
   }

   protected void a(cha $$0, ewr $$1, float $$2) {
      float $$3 = 1.0F;
      float $$4 = 4.5F;
      float $$5 = 4.5F;
      $$1.b(4.5F, 4.5F, 4.5F);
   }
}
