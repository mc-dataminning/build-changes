public class gll extends gln<ckc, fvy<ckc>> {
   private static final akr a = akr.b("textures/entity/slime/magmacube.png");

   public gll(gkh.a $$0) {
      super($$0, new fvy<>($$0.a(fyh.aB)), 0.25F);
   }

   protected int a(ckc $$0, jd $$1) {
      return 15;
   }

   public akr a(ckc $$0) {
      return a;
   }

   public void a(ckc $$0, float $$1, float $$2, fbg $$3, gex $$4, int $$5) {
      this.e = 0.25F * (float)$$0.gm();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(ckc $$0, fbg $$1, float $$2) {
      int $$3 = $$0.gm();
      float $$4 = ayo.i($$2, $$0.ca, $$0.bZ) / ((float)$$3 * 0.5F + 1.0F);
      float $$5 = 1.0F / ($$4 + 1.0F);
      $$1.b($$5 * (float)$$3, 1.0F / $$5 * (float)$$3, $$5 * (float)$$3);
   }
}
