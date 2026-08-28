public class ghx extends ghz {
   protected ghx(gfz $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, float $$7, gkc $$8) {
      super($$0, $$1, $$2, $$3, 0.1F, -0.1F, 0.1F, $$4, $$5, $$6, $$7, $$8, 0.5F, 20, 0.1F, false);
   }

   public static class a implements gjk<lx> {
      private final gkc a;

      public a(gkc $$0) {
         this.a = $$0;
      }

      public gjh a(lx $$0, gfz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new ghx($$1, $$2, $$3, $$4, 0.0, 0.0, 0.0, 1.0F, this.a);
      }
   }
}
