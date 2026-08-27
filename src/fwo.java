public class fwo extends fwq<caz, fhs<caz>> {
   private static final agg a = new agg("textures/entity/slime/magmacube.png");

   public fwo(fvk.a $$0) {
      super($$0, new fhs<>($$0.a(fka.au)), 0.25F);
   }

   protected int a(caz $$0, ht $$1) {
      return 15;
   }

   public agg a(caz $$0) {
      return a;
   }

   public void a(caz $$0, float $$1, float $$2, enk $$3, fqh $$4, int $$5) {
      this.d = 0.25F * (float)$$0.gf();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(caz $$0, enk $$1, float $$2) {
      int $$3 = $$0.gf();
      float $$4 = ati.i($$2, $$0.bS, $$0.e) / ((float)$$3 * 0.5F + 1.0F);
      float $$5 = 1.0F / ($$4 + 1.0F);
      $$1.b($$5 * (float)$$3, 1.0F / $$5 * (float)$$3, $$5 * (float)$$3);
   }
}
