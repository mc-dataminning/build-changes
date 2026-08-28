public class gjr extends glj<cjn, fuy<cjn>> {
   private static final akq a = akq.b("textures/entity/creeper/creeper.png");

   public gjr(gkd.a $$0) {
      super($$0, new fuy<>($$0.a(fyd.I)), 0.5F);
      this.a(new gns(this, $$0.f()));
   }

   protected void a(cjn $$0, fbc $$1, float $$2) {
      float $$3 = $$0.H($$2);
      float $$4 = 1.0F + ayn.a($$3 * 100.0F) * $$3 * 0.01F;
      $$3 = ayn.a($$3, 0.0F, 1.0F);
      $$3 *= $$3;
      $$3 *= $$3;
      float $$5 = (1.0F + $$3 * 0.4F) * $$4;
      float $$6 = (1.0F + $$3 * 0.1F) / $$4;
      $$1.b($$5, $$6, $$5);
   }

   protected float a(cjn $$0, float $$1) {
      float $$2 = $$0.H($$1);
      return (int)($$2 * 10.0F) % 2 == 0 ? 0.0F : ayn.a($$2, 0.5F, 1.0F);
   }

   public akq a(cjn $$0) {
      return a;
   }
}
