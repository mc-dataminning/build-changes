public class gkb extends gip {
   gkb(gga $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, gkd $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      this.u = 0.5F;
   }

   public static class a implements gjl<lx> {
      private final gkd a;

      public a(gkd $$0) {
         this.a = $$0;
      }

      public gji a(lx $$0, gga $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gkb($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }
}
