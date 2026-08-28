public class gjv extends gln<cjp, fvc<cjp>> {
   private static final akr a = akr.b("textures/entity/creeper/creeper.png");

   public gjv(gkh.a $$0) {
      super($$0, new fvc<>($$0.a(fyh.I)), 0.5F);
      this.a(new gnw(this, $$0.f()));
   }

   protected void a(cjp $$0, fbg $$1, float $$2) {
      float $$3 = $$0.H($$2);
      float $$4 = 1.0F + ayo.a($$3 * 100.0F) * $$3 * 0.01F;
      $$3 = ayo.a($$3, 0.0F, 1.0F);
      $$3 *= $$3;
      $$3 *= $$3;
      float $$5 = (1.0F + $$3 * 0.4F) * $$4;
      float $$6 = (1.0F + $$3 * 0.1F) / $$4;
      $$1.b($$5, $$6, $$5);
   }

   protected float a(cjp $$0, float $$1) {
      float $$2 = $$0.H($$1);
      return (int)($$2 * 10.0F) % 2 == 0 ? 0.0F : ayo.a($$2, 0.5F, 1.0F);
   }

   public akr a(cjp $$0) {
      return a;
   }
}
