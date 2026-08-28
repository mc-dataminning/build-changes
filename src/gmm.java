public class gmm extends gou {
   gmm(gkl $$0, double $$1, double $$2, double $$3, eao $$4) {
      super($$0, $$1, $$2, $$3);
      this.a(fpo.Q().ap().a().a($$4));
      this.u = 0.0F;
      this.t = 80;
      this.n = false;
   }

   @Override
   public gny b() {
      return gny.a;
   }

   @Override
   public float b(float $$0) {
      return 0.5F;
   }

   public static class a implements gnx<lq> {
      public gnu a(lq $$0, gkl $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gmm($$1, $$2, $$3, $$4, $$0.b());
      }
   }
}
