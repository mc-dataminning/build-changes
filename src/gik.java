public class gik extends gid<cip, ftc<cip>> {
   private static final akh a = new akh("textures/entity/phantom.png");

   public gik(ggx.a $$0) {
      super($$0, new ftc<>($$0.a(fva.aH)), 0.75F);
      this.a(new glg<>(this));
   }

   public akh a(cip $$0) {
      return a;
   }

   protected void a(cip $$0, exx $$1, float $$2) {
      int $$3 = $$0.r();
      float $$4 = 1.0F + 0.15F * (float)$$3;
      $$1.b($$4, $$4, $$4);
      $$1.a(0.0F, 1.3125F, 0.1875F);
   }

   protected void a(cip $$0, exx $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$1.a(a.b.rotationDegrees($$0.dF()));
   }
}
