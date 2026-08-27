public class gff extends ggx<cgs, fqp<cgs>> {
   private static final ajv a = new ajv("textures/entity/creeper/creeper.png");

   public gff(gfr.a $$0) {
      super($$0, new fqp<>($$0.a(ftu.H)), 0.5F);
      this.a(new gjf(this, $$0.f()));
   }

   protected void a(cgs $$0, ewr $$1, float $$2) {
      float $$3 = $$0.G($$2);
      float $$4 = 1.0F + axm.a($$3 * 100.0F) * $$3 * 0.01F;
      $$3 = axm.a($$3, 0.0F, 1.0F);
      $$3 *= $$3;
      $$3 *= $$3;
      float $$5 = (1.0F + $$3 * 0.4F) * $$4;
      float $$6 = (1.0F + $$3 * 0.1F) / $$4;
      $$1.b($$5, $$6, $$5);
   }

   protected float a(cgs $$0, float $$1) {
      float $$2 = $$0.G($$1);
      return (int)($$2 * 10.0F) % 2 == 0 ? 0.0F : axm.a($$2, 0.5F, 1.0F);
   }

   public ajv a(cgs $$0) {
      return a;
   }
}
