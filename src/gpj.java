public class gpj extends gpm {
   private final giy a;
   private final gsn b = gsn.j(gyd.a);

   gpj(gmd $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3);
      this.a = new gil(frf.Q().aS().a(glf.aO));
      this.u = 0.0F;
      this.t = 30;
   }

   @Override
   public gpq b() {
      return gpq.d;
   }

   @Override
   public void a(flq $$0, gsc $$1, fqn $$2, float $$3) {
      float $$4 = ((float)this.s + $$3) / (float)this.t;
      float $$5 = 0.05F + 0.5F * azq.a($$4 * (float) Math.PI);
      int $$6 = aya.a($$5, 1.0F, 1.0F, 1.0F);
      $$0.a();
      $$0.a($$2.f());
      $$0.a(a.b.rotationDegrees(60.0F - 150.0F * $$4));
      float $$7 = 0.42553192F;
      $$0.b(0.42553192F, -0.42553192F, -0.42553192F);
      $$0.a(0.0F, -0.56F, 3.5F);
      flt $$8 = $$1.getBuffer(this.b);
      this.a.a($$0, $$8, 15728880, hks.d, $$6);
      $$0.b();
   }

   @Override
   public void a(flt $$0, fqn $$1, float $$2) {
   }

   public static class a implements gpp<md> {
      public gpm a(md $$0, gmd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gpj($$1, $$2, $$3, $$4);
      }
   }
}
