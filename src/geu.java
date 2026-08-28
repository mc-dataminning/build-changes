public class geu extends gdw {
   protected geu(gax $$0, double $$1, double $$2, double $$3, double $$4, gez $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.t = 16;
      this.D = 1.5F;
      this.b($$5);
   }

   public static class a implements geh<lr> {
      private final gez a;

      public a(gez $$0) {
         this.a = $$0;
      }

      public gee a(lr $$0, gax $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new geu($$1, $$2, $$3, $$4, $$5, this.a);
      }
   }
}
