public class ggv extends gfx {
   protected ggv(gcy $$0, double $$1, double $$2, double $$3, double $$4, gha $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.t = 16;
      this.D = 1.5F;
      this.b($$5);
   }

   public static class a implements ggi<lw> {
      private final gha a;

      public a(gha $$0) {
         this.a = $$0;
      }

      public ggf a(lw $$0, gcy $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new ggv($$1, $$2, $$3, $$4, $$5, this.a);
      }
   }
}
