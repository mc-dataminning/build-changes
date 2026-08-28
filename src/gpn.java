public class gpn extends gop {
   protected gpn(glo $$0, double $$1, double $$2, double $$3, double $$4, gps $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.t = 16;
      this.D = 1.5F;
      this.b($$5);
   }

   public static class a implements gpa<md> {
      private final gps a;

      public a(gps $$0) {
         this.a = $$0;
      }

      public gox a(md $$0, glo $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gpn($$1, $$2, $$3, $$4, $$5, this.a);
      }
   }
}
