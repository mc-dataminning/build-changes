public class fxk extends fxn {
   private final fri a;
   private final gah b = gah.i(gfb.a);

   fxk(fuh $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3);
      this.a = new fqt(fbp.Q().aR().a(ftl.V));
      this.u = 0.0F;
      this.t = 30;
   }

   @Override
   public fxr b() {
      return fxr.e;
   }

   @Override
   public void a(ewm $$0, fba $$1, float $$2) {
      float $$3 = ((float)this.s + $$2) / (float)this.t;
      float $$4 = 0.05F + 0.5F * axk.a($$3 * (float) Math.PI);
      ewi $$5 = new ewi();
      $$5.a($$1.f());
      $$5.a(a.b.rotationDegrees(150.0F * $$3 - 60.0F));
      $$5.b(-1.0F, -1.0F, 1.0F);
      $$5.a(0.0F, -1.101F, 1.5F);
      fzz.a $$6 = fbp.Q().aQ().c();
      ewm $$7 = $$6.getBuffer(this.b);
      this.a.a($$5, $$7, 15728880, gla.d, 1.0F, 1.0F, 1.0F, $$4);
      $$6.b();
   }

   public static class a implements fxq<ko> {
      public fxn a(ko $$0, fuh $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fxk($$1, $$2, $$3, $$4);
      }
   }
}
