public class gia extends ggx<cht, fsy<cht>> {
   private static final ajv a = new ajv("textures/entity/strider/strider.png");
   private static final ajv i = new ajv("textures/entity/strider/strider_cold.png");
   private static final float j = 0.5F;

   public gia(gfr.a $$0) {
      super($$0, new fsy<>($$0.a(ftu.bD)), 0.5F);
      this.a(new gkd<>(this, new fsy<>($$0.a(ftu.bE)), new ajv("textures/entity/strider/strider_saddle.png")));
   }

   public ajv a(cht $$0) {
      return $$0.r() ? i : a;
   }

   protected float b(cht $$0) {
      float $$1 = super.b($$0);
      return $$0.p_() ? $$1 * 0.5F : $$1;
   }

   protected void a(cht $$0, ewr $$1, float $$2) {
      float $$3 = $$0.ea();
      $$1.b($$3, $$3, $$3);
   }

   protected boolean c(cht $$0) {
      return super.a($$0) || $$0.r();
   }
}
