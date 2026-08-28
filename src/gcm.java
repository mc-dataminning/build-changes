public class gcm extends gbb {
   gcm(fyl $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, gco $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      this.u = 0.5F;
   }

   public static class a implements gbw<ln> {
      private final gco a;

      public a(gco $$0) {
         this.a = $$0;
      }

      public gbt a(ln $$0, fyl $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gcm($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }
}
