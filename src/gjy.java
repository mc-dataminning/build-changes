public class gjy extends gja {
   protected gjy(gga $$0, double $$1, double $$2, double $$3, double $$4, gkd $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.t = 16;
      this.D = 1.5F;
      this.b($$5);
   }

   public static class a implements gjl<lx> {
      private final gkd a;

      public a(gkd $$0) {
         this.a = $$0;
      }

      public gji a(lx $$0, gga $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gjy($$1, $$2, $$3, $$4, $$5, this.a);
      }
   }
}
