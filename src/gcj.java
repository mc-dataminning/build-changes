public class gcj extends gbl {
   protected gcj(fyl $$0, double $$1, double $$2, double $$3, double $$4, gco $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.t = 16;
      this.D = 1.5F;
      this.b($$5);
   }

   public static class a implements gbw<ln> {
      private final gco a;

      public a(gco $$0) {
         this.a = $$0;
      }

      public gbt a(ln $$0, fyl $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gcj($$1, $$2, $$3, $$4, $$5, this.a);
      }
   }
}
