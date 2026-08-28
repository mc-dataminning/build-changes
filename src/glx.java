public class glx extends gkz {
   protected glx(ghz $$0, double $$1, double $$2, double $$3, double $$4, gmc $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.t = 16;
      this.D = 1.5F;
      this.b($$5);
   }

   public static class a implements glk<lz> {
      private final gmc a;

      public a(gmc $$0) {
         this.a = $$0;
      }

      public glh a(lz $$0, ghz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new glx($$1, $$2, $$3, $$4, $$5, this.a);
      }
   }
}
