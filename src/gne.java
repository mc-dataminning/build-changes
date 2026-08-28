public class gne extends gls {
   gne(gjd $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, gng $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      this.u = 0.5F;
   }

   public static class a implements gmo<mb> {
      private final gng a;

      public a(gng $$0) {
         this.a = $$0;
      }

      public gml a(mb $$0, gjd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gne($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }
}
