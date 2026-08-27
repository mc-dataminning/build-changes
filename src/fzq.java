public class fzq extends fxv {
   protected fzq(fvw $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, float $$7, fzx $$8) {
      super($$0, $$1, $$2, $$3, 0.1F, 0.1F, 0.1F, $$4, $$5, $$6, $$7, $$8, 0.3F, 8, -0.1F, true);
   }

   public static class a implements fzf<la> {
      private final fzx a;

      public a(fzx $$0) {
         this.a = $$0;
      }

      public fzc a(la $$0, fvw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fzq($$1, $$2, $$3, $$4, $$5, $$6, $$7, 1.0F, this.a);
      }
   }
}
