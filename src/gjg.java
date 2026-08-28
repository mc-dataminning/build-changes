public class gjg extends ghu {
   gjg(gff $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, gji $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      this.u = 0.5F;
   }

   public static class a implements giq<lw> {
      private final gji a;

      public a(gji $$0) {
         this.a = $$0;
      }

      public gin a(lw $$0, gff $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gjg($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }
}
