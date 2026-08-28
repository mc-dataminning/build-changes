public class gln extends glp<ckc, fwa<ckc>> {
   private static final akr a = akr.b("textures/entity/slime/magmacube.png");

   public gln(gkj.a $$0) {
      super($$0, new fwa<>($$0.a(fyj.aB)), 0.25F);
   }

   protected int a(ckc $$0, jd $$1) {
      return 15;
   }

   public akr a(ckc $$0) {
      return a;
   }

   public void a(ckc $$0, float $$1, float $$2, fbi $$3, gez $$4, int $$5) {
      this.e = 0.25F * (float)$$0.gl();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(ckc $$0, fbi $$1, float $$2) {
      int $$3 = $$0.gl();
      float $$4 = ayo.i($$2, $$0.cc, $$0.cb) / ((float)$$3 * 0.5F + 1.0F);
      float $$5 = 1.0F / ($$4 + 1.0F);
      $$1.b($$5 * (float)$$3, 1.0F / $$5 * (float)$$3, $$5 * (float)$$3);
   }
}
