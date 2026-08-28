public class gqc extends gpe {
   protected gqc(gmd $$0, double $$1, double $$2, double $$3, double $$4, gqh $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.t = 16;
      this.D = 1.5F;
      this.b($$5);
   }

   public static class a implements gpp<md> {
      private final gqh a;

      public a(gqh $$0) {
         this.a = $$0;
      }

      public gpm a(md $$0, gmd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gqc($$1, $$2, $$3, $$4, $$5, this.a);
      }
   }
}
