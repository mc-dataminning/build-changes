public class gjb extends gid {
   protected gjb(gfd $$0, double $$1, double $$2, double $$3, double $$4, gjg $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.t = 16;
      this.D = 1.5F;
      this.b($$5);
   }

   public static class a implements gio<lw> {
      private final gjg a;

      public a(gjg $$0) {
         this.a = $$0;
      }

      public gil a(lw $$0, gfd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gjb($$1, $$2, $$3, $$4, $$5, this.a);
      }
   }
}
