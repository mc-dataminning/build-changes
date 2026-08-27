public class gbn extends gdu {
   gbn(fzn $$0, double $$1, double $$2, double $$3, dtc $$4) {
      super($$0, $$1, $$2, $$3);
      this.a(fgj.Q().ap().a().a($$4));
      this.u = 0.0F;
      this.t = 80;
      this.n = false;
   }

   @Override
   public gcy b() {
      return gcy.a;
   }

   @Override
   public float b(float $$0) {
      return 0.5F;
   }

   public static class a implements gcx<ks> {
      public gcu a(ks $$0, fzn $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gbn($$1, $$2, $$3, $$4, $$0.b());
      }
   }
}
