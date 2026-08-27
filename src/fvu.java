public class fvu extends fuw {
   protected fvu(fry $$0, double $$1, double $$2, double $$3, double $$4, fvz $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.t = 16;
      this.D = 1.5F;
      this.b($$5);
   }

   public static class a implements fvh<kf> {
      private final fvz a;

      public a(fvz $$0) {
         this.a = $$0;
      }

      public fve a(kf $$0, fry $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fvu($$1, $$2, $$3, $$4, $$5, this.a);
      }
   }
}
