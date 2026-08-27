public class gil extends ggx<cjn, ftg<cjn>> {
   private static final ajv a = new ajv("textures/entity/villager/villager.png");

   public gil(gfr.a $$0) {
      super($$0, new ftg<>($$0.a(ftu.bP)), 0.5F);
      this.a(new gjh<>(this, $$0.f(), $$0.d()));
      this.a(new gkn<>(this, $$0.e(), "villager"));
      this.a(new gjg<>(this, $$0.d()));
   }

   public ajv a(cjn $$0) {
      return a;
   }

   protected void a(cjn $$0, ewr $$1, float $$2) {
      float $$3 = 0.9375F * $$0.ea();
      $$1.b($$3, $$3, $$3);
   }

   protected float b(cjn $$0) {
      float $$1 = super.b($$0);
      return $$0.p_() ? $$1 * 0.5F : $$1;
   }
}
