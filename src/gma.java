public class gma extends gko {
   gma(ghz $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, gmc $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      this.u = 0.5F;
   }

   public static class a implements glk<lz> {
      private final gmc a;

      public a(gmc $$0) {
         this.a = $$0;
      }

      public glh a(lz $$0, ghz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gma($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }
}
