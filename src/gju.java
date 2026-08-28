public class gju extends ghy {
   protected gju(gfy $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, float $$7, gkb $$8) {
      super($$0, $$1, $$2, $$3, 0.1F, 0.1F, 0.1F, $$4, $$5, $$6, $$7, $$8, 0.3F, 8, -0.1F, true);
   }

   public static class a implements gjj<lx> {
      private final gkb a;

      public a(gkb $$0) {
         this.a = $$0;
      }

      public gjg a(lx $$0, gfy $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gju($$1, $$2, $$3, $$4, $$5, $$6, $$7, 1.0F, this.a);
      }
   }
}
