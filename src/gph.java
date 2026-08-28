public class gph extends gpk {
   private final giw a;
   private final gsl b = gsl.j(gyb.a);

   gph(gmb $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3);
      this.a = new gij(frd.Q().aS().a(gld.aO));
      this.u = 0.0F;
      this.t = 30;
   }

   @Override
   public gpo b() {
      return gpo.d;
   }

   @Override
   public void a(flo $$0, gsa $$1, fql $$2, float $$3) {
      float $$4 = ((float)this.s + $$3) / (float)this.t;
      float $$5 = 0.05F + 0.5F * azo.a($$4 * (float) Math.PI);
      int $$6 = axy.a($$5, 1.0F, 1.0F, 1.0F);
      $$0.a();
      $$0.a($$2.f());
      $$0.a(a.b.rotationDegrees(60.0F - 150.0F * $$4));
      float $$7 = 0.42553192F;
      $$0.b(0.42553192F, -0.42553192F, -0.42553192F);
      $$0.a(0.0F, -0.56F, 3.5F);
      flr $$8 = $$1.getBuffer(this.b);
      this.a.a($$0, $$8, 15728880, hkq.d, $$6);
      $$0.b();
   }

   @Override
   public void a(flr $$0, fql $$1, float $$2) {
   }

   public static class a implements gpn<mc> {
      public gpk a(mc $$0, gmb $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gph($$1, $$2, $$3, $$4);
      }
   }
}
