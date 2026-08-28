public class gdd extends gcf {
   protected gdd(fzf $$0, double $$1, double $$2, double $$3, double $$4, gdi $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.t = 16;
      this.D = 1.5F;
      this.b($$5);
   }

   public static class a implements gcq<lq> {
      private final gdi a;

      public a(gdi $$0) {
         this.a = $$0;
      }

      public gcn a(lq $$0, fzf $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gdd($$1, $$2, $$3, $$4, $$5, this.a);
      }
   }
}
