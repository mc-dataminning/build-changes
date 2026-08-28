public class gbu extends gaw {
   protected gbu(fxx $$0, double $$1, double $$2, double $$3, double $$4, gbz $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.t = 16;
      this.D = 1.5F;
      this.b($$5);
   }

   public static class a implements gbh<lm> {
      private final gbz a;

      public a(gbz $$0) {
         this.a = $$0;
      }

      public gbe a(lm $$0, fxx $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gbu($$1, $$2, $$3, $$4, $$5, this.a);
      }
   }
}
