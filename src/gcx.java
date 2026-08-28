public class gcx extends gbz {
   protected gcx(fyz $$0, double $$1, double $$2, double $$3, double $$4, gdc $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.t = 16;
      this.D = 1.5F;
      this.b($$5);
   }

   public static class a implements gck<lq> {
      private final gdc a;

      public a(gdc $$0) {
         this.a = $$0;
      }

      public gch a(lq $$0, fyz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gcx($$1, $$2, $$3, $$4, $$5, this.a);
      }
   }
}
