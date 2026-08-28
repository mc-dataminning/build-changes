public class gjw extends gia {
   protected gjw(gga $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, float $$7, gkd $$8) {
      super($$0, $$1, $$2, $$3, 0.1F, 0.1F, 0.1F, $$4, $$5, $$6, $$7, $$8, 0.3F, 8, -0.1F, true);
   }

   public static class a implements gjl<lx> {
      private final gkd a;

      public a(gkd $$0) {
         this.a = $$0;
      }

      public gji a(lx $$0, gga $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gjw($$1, $$2, $$3, $$4, $$5, $$6, $$7, 1.0F, this.a);
      }
   }
}
