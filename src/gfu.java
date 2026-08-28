public class gfu extends gew {
   protected gfu(gbx $$0, double $$1, double $$2, double $$3, double $$4, gfz $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.t = 16;
      this.D = 1.5F;
      this.b($$5);
   }

   public static class a implements gfh<lu> {
      private final gfz a;

      public a(gfz $$0) {
         this.a = $$0;
      }

      public gfe a(lu $$0, gbx $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gfu($$1, $$2, $$3, $$4, $$5, this.a);
      }
   }
}
