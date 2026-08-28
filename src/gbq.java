public class gbq extends gas {
   protected gbq(fxt $$0, double $$1, double $$2, double $$3, double $$4, gbv $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.t = 16;
      this.D = 1.5F;
      this.b($$5);
   }

   public static class a implements gbd<lm> {
      private final gbv a;

      public a(gbv $$0) {
         this.a = $$0;
      }

      public gba a(lm $$0, fxt $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gbq($$1, $$2, $$3, $$4, $$5, this.a);
      }
   }
}
