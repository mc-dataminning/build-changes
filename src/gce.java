public class gce extends gch {
   private final fwa a;
   private final gfb b = gfb.i(gjw.a);

   gce(fyz $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3);
      this.a = new fvl(fgi.Q().aP().a(fyd.W));
      this.u = 0.0F;
      this.t = 30;
   }

   @Override
   public gcl b() {
      return gcl.e;
   }

   @Override
   public void a(fbg $$0, ffs $$1, float $$2) {
      float $$3 = ((float)this.s + $$2) / (float)this.t;
      float $$4 = 0.05F + 0.5F * ayn.a($$3 * (float) Math.PI);
      int $$5 = axx.b.a($$4, 1.0F, 1.0F, 1.0F);
      fbc $$6 = new fbc();
      $$6.a($$1.f());
      $$6.a(a.b.rotationDegrees(150.0F * $$3 - 60.0F));
      $$6.b(1.0F, -1.0F, -1.0F);
      $$6.a(0.0F, -1.101F, 1.5F);
      get.a $$7 = fgi.Q().aO().c();
      fbg $$8 = $$7.getBuffer(this.b);
      this.a.a($$6, $$8, 15728880, gpw.d, $$5);
      $$7.b();
   }

   public static class a implements gck<lq> {
      public gch a(lq $$0, fyz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gce($$1, $$2, $$3, $$4);
      }
   }
}
