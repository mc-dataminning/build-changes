public class gba extends gdh {
   gba(fyz $$0, double $$1, double $$2, double $$3, dta $$4) {
      super($$0, $$1, $$2, $$3);
      this.a(fgi.Q().ao().a().a($$4));
      this.u = 0.0F;
      this.t = 80;
      this.n = false;
   }

   @Override
   public gcl b() {
      return gcl.a;
   }

   @Override
   public float b(float $$0) {
      return 0.5F;
   }

   public static class a implements gck<le> {
      public gch a(le $$0, fyz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gba($$1, $$2, $$3, $$4, $$0.b());
      }
   }
}
