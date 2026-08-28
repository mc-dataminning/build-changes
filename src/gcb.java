public class gcb extends gbd {
   protected gcb(fyd $$0, double $$1, double $$2, double $$3, double $$4, gcg $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.t = 16;
      this.D = 1.5F;
      this.b($$5);
   }

   public static class a implements gbo<ln> {
      private final gcg a;

      public a(gcg $$0) {
         this.a = $$0;
      }

      public gbl a(ln $$0, fyd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gcb($$1, $$2, $$3, $$4, $$5, this.a);
      }
   }
}
