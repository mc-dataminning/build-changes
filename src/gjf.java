public class gjf extends gji {
   private final gcx a;
   private final gmj b = gmj.j(gry.a);

   gjf(gga $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3);
      this.a = new gck(flk.Q().aS().a(gfd.aE));
      this.u = 0.0F;
      this.t = 30;
   }

   @Override
   public gjm b() {
      return gjm.d;
   }

   @Override
   public void a(ffv $$0, glz $$1, fks $$2, float $$3) {
      float $$4 = ((float)this.s + $$3) / (float)this.t;
      float $$5 = 0.05F + 0.5F * ayz.a($$4 * (float) Math.PI);
      int $$6 = axk.a($$5, 1.0F, 1.0F, 1.0F);
      $$0.a();
      $$0.a($$2.f());
      $$0.a(a.b.rotationDegrees(60.0F - 150.0F * $$4));
      float $$7 = 0.42553192F;
      $$0.b(0.42553192F, -0.42553192F, -0.42553192F);
      $$0.a(0.0F, -0.56F, 3.5F);
      ffz $$8 = $$1.getBuffer(this.b);
      this.a.a($$0, $$8, 15728880, hej.d, $$6);
      $$0.b();
   }

   @Override
   public void a(ffz $$0, fks $$1, float $$2) {
   }

   public static class a implements gjl<lx> {
      public gji a(lx $$0, gga $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gjf($$1, $$2, $$3, $$4);
      }
   }
}
