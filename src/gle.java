public class gle extends gnl {
   gle(gjd $$0, double $$1, double $$2, double $$3, dzo $$4) {
      super($$0, $$1, $$2, $$3);
      this.a(fof.Q().ap().a().a($$4));
      this.u = 0.0F;
      this.t = 80;
      this.n = false;
   }

   @Override
   public gmp b() {
      return gmp.a;
   }

   @Override
   public float b(float $$0) {
      return 0.5F;
   }

   public static class a implements gmo<lp> {
      public gml a(lp $$0, gjd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gle($$1, $$2, $$3, $$4, $$0.b());
      }
   }
}
