public class gnr extends gnu {
   private final ghg a;
   private final gqx b = gqx.j(gwm.a);

   gnr(gkl $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3);
      this.a = new ggt(fpo.Q().aS().a(gjn.aO));
      this.u = 0.0F;
      this.t = 30;
   }

   @Override
   public gny b() {
      return gny.d;
   }

   @Override
   public void a(fjy $$0, gqm $$1, fow $$2, float $$3) {
      float $$4 = ((float)this.s + $$3) / (float)this.t;
      float $$5 = 0.05F + 0.5F * azm.a($$4 * (float) Math.PI);
      int $$6 = axw.a($$5, 1.0F, 1.0F, 1.0F);
      $$0.a();
      $$0.a($$2.f());
      $$0.a(a.b.rotationDegrees(60.0F - 150.0F * $$4));
      float $$7 = 0.42553192F;
      $$0.b(0.42553192F, -0.42553192F, -0.42553192F);
      $$0.a(0.0F, -0.56F, 3.5F);
      fkc $$8 = $$1.getBuffer(this.b);
      this.a.a($$0, $$8, 15728880, hja.d, $$6);
      $$0.b();
   }

   @Override
   public void a(fkc $$0, fow $$1, float $$2) {
   }

   public static class a implements gnx<mc> {
      public gnu a(mc $$0, gkl $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gnr($$1, $$2, $$3, $$4);
      }
   }
}
