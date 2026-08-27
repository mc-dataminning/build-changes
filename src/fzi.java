public class fzi extends fyk {
   protected fzi(fvm $$0, double $$1, double $$2, double $$3, double $$4, fzn $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.t = 16;
      this.D = 1.5F;
      this.b($$5);
   }

   public static class a implements fyv<kz> {
      private final fzn a;

      public a(fzn $$0) {
         this.a = $$0;
      }

      public fys a(kz $$0, fvm $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fzi($$1, $$2, $$3, $$4, $$5, this.a);
      }
   }
}
