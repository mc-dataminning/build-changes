public class gph extends gqa {
   protected gph(gmd $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, gqh $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, 2.5F, $$7);
   }

   public static class a implements gpp<md> {
      private final gqh a;

      public a(gqh $$0) {
         this.a = $$0;
      }

      public gpm a(md $$0, gmd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gph($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }
}
