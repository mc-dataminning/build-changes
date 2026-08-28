public class gpq extends god {
   gpq(glo $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, gps $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      this.u = 0.5F;
   }

   public static class a implements gpa<md> {
      private final gps a;

      public a(gps $$0) {
         this.a = $$0;
      }

      public gox a(md $$0, glo $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gpq($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }
}
