public class gok extends gnm {
   protected gok(gkl $$0, double $$1, double $$2, double $$3, double $$4, gop $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.t = 16;
      this.D = 1.5F;
      this.b($$5);
   }

   public static class a implements gnx<mc> {
      private final gop a;

      public a(gop $$0) {
         this.a = $$0;
      }

      public gnu a(mc $$0, gkl $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gok($$1, $$2, $$3, $$4, $$5, this.a);
      }
   }
}
