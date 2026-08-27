public class gce extends gcg<ceq, fmy<ceq>> {
   private static final aiy a = new aiy("textures/entity/slime/magmacube.png");

   public gce(gba.a $$0) {
      super($$0, new fmy<>($$0.a(fpi.aw)), 0.25F);
   }

   protected int a(ceq $$0, hz $$1) {
      return 15;
   }

   public aiy a(ceq $$0) {
      return a;
   }

   public void a(ceq $$0, float $$1, float $$2, esh $$3, fvt $$4, int $$5) {
      this.d = 0.25F * (float)$$0.gh();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(ceq $$0, esh $$1, float $$2) {
      int $$3 = $$0.gh();
      float $$4 = awi.i($$2, $$0.bS, $$0.e) / ((float)$$3 * 0.5F + 1.0F);
      float $$5 = 1.0F / ($$4 + 1.0F);
      $$1.b($$5 * (float)$$3, 1.0F / $$5 * (float)$$3, $$5 * (float)$$3);
   }
}
