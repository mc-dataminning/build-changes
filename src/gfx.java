public class gfx extends gem {
   gfx(gbx $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, gfz $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      this.u = 0.5F;
   }

   public static class a implements gfh<lu> {
      private final gfz a;

      public a(gfz $$0) {
         this.a = $$0;
      }

      public gfe a(lu $$0, gbx $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gfx($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }
}
