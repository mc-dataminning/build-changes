public class fya extends fzs<cca, fjq<cca>> {
   private static final ahg a = new ahg("textures/entity/creeper/creeper.png");

   public fya(fym.a $$0) {
      super($$0, new fjq<>($$0.a(fmv.E)), 0.5F);
      this.a(new gca(this, $$0.f()));
   }

   protected void a(cca $$0, eqa $$1, float $$2) {
      float $$3 = $$0.E($$2);
      float $$4 = 1.0F + aun.a($$3 * 100.0F) * $$3 * 0.01F;
      $$3 = aun.a($$3, 0.0F, 1.0F);
      $$3 *= $$3;
      $$3 *= $$3;
      float $$5 = (1.0F + $$3 * 0.4F) * $$4;
      float $$6 = (1.0F + $$3 * 0.1F) / $$4;
      $$1.b($$5, $$6, $$5);
   }

   protected float a(cca $$0, float $$1) {
      float $$2 = $$0.E($$1);
      return (int)($$2 * 10.0F) % 2 == 0 ? 0.0F : aun.a($$2, 0.5F, 1.0F);
   }

   public ahg a(cca $$0) {
      return a;
   }
}
