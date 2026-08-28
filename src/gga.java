public class gga extends ggt {
   protected gga(gcy $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, gha $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, 2.5F, $$7);
   }

   public static class a implements ggi<lw> {
      private final gha a;

      public a(gha $$0) {
         this.a = $$0;
      }

      public ggf a(lw $$0, gcy $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gga($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }
}
