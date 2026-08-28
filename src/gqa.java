public class gqa extends gpc {
   protected gqa(gmb $$0, double $$1, double $$2, double $$3, double $$4, gqf $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.t = 16;
      this.D = 1.5F;
      this.b($$5);
   }

   public static class a implements gpn<mc> {
      private final gqf a;

      public a(gqf $$0) {
         this.a = $$0;
      }

      public gpk a(mc $$0, gmb $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gqa($$1, $$2, $$3, $$4, $$5, this.a);
      }
   }
}
