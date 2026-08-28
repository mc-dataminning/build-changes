public class gls extends goa {
   gls(gjr $$0, double $$1, double $$2, double $$3, dzz $$4) {
      super($$0, $$1, $$2, $$3);
      this.a(fos.Q().ap().a().a($$4));
      this.u = 0.0F;
      this.t = 80;
      this.n = false;
   }

   @Override
   public gne b() {
      return gne.a;
   }

   @Override
   public float b(float $$0) {
      return 0.5F;
   }

   public static class a implements gnd<lp> {
      public gna a(lp $$0, gjr $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gls($$1, $$2, $$3, $$4, $$0.b());
      }
   }
}
