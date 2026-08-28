public class glh extends glj<cka, fvu<cka>> {
   private static final akq a = akq.b("textures/entity/slime/magmacube.png");

   public glh(gkd.a $$0) {
      super($$0, new fvu<>($$0.a(fyd.aB)), 0.25F);
   }

   protected int a(cka $$0, jd $$1) {
      return 15;
   }

   public akq a(cka $$0) {
      return a;
   }

   public void a(cka $$0, float $$1, float $$2, fbc $$3, get $$4, int $$5) {
      this.d = 0.25F * (float)$$0.gn();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(cka $$0, fbc $$1, float $$2) {
      int $$3 = $$0.gn();
      float $$4 = ayn.i($$2, $$0.ca, $$0.bZ) / ((float)$$3 * 0.5F + 1.0F);
      float $$5 = 1.0F / ($$4 + 1.0F);
      $$1.b($$5 * (float)$$3, 1.0F / $$5 * (float)$$3, $$5 * (float)$$3);
   }
}
