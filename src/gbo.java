public class gbo extends gbr {
   private final fvk a;
   private final gel b = gel.i(gjf.a);

   gbo(fyj $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3);
      this.a = new fuv(fft.Q().aR().a(fxn.V));
      this.u = 0.0F;
      this.t = 30;
   }

   @Override
   public gbv b() {
      return gbv.e;
   }

   @Override
   public void a(faq $$0, ffe $$1, float $$2) {
      float $$3 = ((float)this.s + $$2) / (float)this.t;
      float $$4 = 0.05F + 0.5F * ayg.a($$3 * (float) Math.PI);
      fam $$5 = new fam();
      $$5.a($$1.f());
      $$5.a(a.b.rotationDegrees(150.0F * $$3 - 60.0F));
      $$5.b(-1.0F, -1.0F, 1.0F);
      $$5.a(0.0F, -1.101F, 1.5F);
      ged.a $$6 = fft.Q().aQ().c();
      faq $$7 = $$6.getBuffer(this.b);
      this.a.a($$5, $$7, 15728880, gpf.d, 1.0F, 1.0F, 1.0F, $$4);
      $$6.b();
   }

   public static class a implements gbu<ln> {
      public gbr a(ln $$0, fyj $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gbo($$1, $$2, $$3, $$4);
      }
   }
}
