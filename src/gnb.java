public class gnb extends gmd {
   protected gnb(gjd $$0, double $$1, double $$2, double $$3, double $$4, gng $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.t = 16;
      this.D = 1.5F;
      this.b($$5);
   }

   public static class a implements gmo<mb> {
      private final gng a;

      public a(gng $$0) {
         this.a = $$0;
      }

      public gml a(mb $$0, gjd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gnb($$1, $$2, $$3, $$4, $$5, this.a);
      }
   }
}
