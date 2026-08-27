public class fzl extends fyb {
   fzl(fvm $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, fzn $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      this.u = 0.5F;
   }

   public static class a implements fyv<kz> {
      private final fzn a;

      public a(fzn $$0) {
         this.a = $$0;
      }

      public fys a(kz $$0, fvm $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fzl($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }
}
