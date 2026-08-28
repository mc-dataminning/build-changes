public class gju extends giw {
   protected gju(gfw $$0, double $$1, double $$2, double $$3, double $$4, gjz $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.t = 16;
      this.D = 1.5F;
      this.b($$5);
   }

   public static class a implements gjh<lx> {
      private final gjz a;

      public a(gjz $$0) {
         this.a = $$0;
      }

      public gje a(lx $$0, gfw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gju($$1, $$2, $$3, $$4, $$5, this.a);
      }
   }
}
