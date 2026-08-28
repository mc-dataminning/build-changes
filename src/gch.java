public class gch extends gbj {
   protected gch(fyj $$0, double $$1, double $$2, double $$3, double $$4, gcm $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.t = 16;
      this.D = 1.5F;
      this.b($$5);
   }

   public static class a implements gbu<ln> {
      private final gcm a;

      public a(gcm $$0) {
         this.a = $$0;
      }

      public gbr a(ln $$0, fyj $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gch($$1, $$2, $$3, $$4, $$5, this.a);
      }
   }
}
