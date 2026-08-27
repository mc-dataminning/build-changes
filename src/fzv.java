public class fzv extends fyl {
   fzv(fvw $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, fzx $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      this.u = 0.5F;
   }

   public static class a implements fzf<la> {
      private final fzx a;

      public a(fzx $$0) {
         this.a = $$0;
      }

      public fzc a(la $$0, fvw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fzv($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }
}
