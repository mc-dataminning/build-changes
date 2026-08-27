public class fyp extends fys {
   private final fsn a;
   private final gbm b = gbm.i(ggg.a);

   fyp(fvm $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3);
      this.a = new fry(fcu.Q().aR().a(fuq.V));
      this.u = 0.0F;
      this.t = 30;
   }

   @Override
   public fyw b() {
      return fyw.e;
   }

   @Override
   public void a(exr $$0, fcf $$1, float $$2) {
      float $$3 = ((float)this.s + $$2) / (float)this.t;
      float $$4 = 0.05F + 0.5F * axw.a($$3 * (float) Math.PI);
      exn $$5 = new exn();
      $$5.a($$1.f());
      $$5.a(a.b.rotationDegrees(150.0F * $$3 - 60.0F));
      $$5.b(-1.0F, -1.0F, 1.0F);
      $$5.a(0.0F, -1.101F, 1.5F);
      gbe.a $$6 = fcu.Q().aQ().c();
      exr $$7 = $$6.getBuffer(this.b);
      this.a.a($$5, $$7, 15728880, gmf.d, 1.0F, 1.0F, 1.0F, $$4);
      $$6.b();
   }

   public static class a implements fyv<kz> {
      public fys a(kz $$0, fvm $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fyp($$1, $$2, $$3, $$4);
      }
   }
}
