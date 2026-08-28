public class gon extends gna {
   gon(gkl $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, gop $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      this.u = 0.5F;
   }

   public static class a implements gnx<mc> {
      private final gop a;

      public a(gop $$0) {
         this.a = $$0;
      }

      public gnu a(mc $$0, gkl $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gon($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }
}
