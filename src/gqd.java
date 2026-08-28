public class gqd extends goq {
   gqd(gmb $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, gqf $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      this.u = 0.5F;
   }

   public static class a implements gpn<mc> {
      private final gqf a;

      public a(gqf $$0) {
         this.a = $$0;
      }

      public gpk a(mc $$0, gmb $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gqd($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }
}
