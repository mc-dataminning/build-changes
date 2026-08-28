public class gaz extends gbc {
   private final fuw a;
   private final gdw b = gdw.i(giq.a);

   gaz(fxv $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3);
      this.a = new fuh(fff.Q().aR().a(fwz.V));
      this.u = 0.0F;
      this.t = 30;
   }

   @Override
   public gbg b() {
      return gbg.e;
   }

   @Override
   public void a(fac $$0, feq $$1, float $$2) {
      float $$3 = ((float)this.s + $$2) / (float)this.t;
      float $$4 = 0.05F + 0.5F * ayz.a($$3 * (float) Math.PI);
      ezy $$5 = new ezy();
      $$5.a($$1.f());
      $$5.a(a.b.rotationDegrees(150.0F * $$3 - 60.0F));
      $$5.b(-1.0F, -1.0F, 1.0F);
      $$5.a(0.0F, -1.101F, 1.5F);
      gdo.a $$6 = fff.Q().aQ().c();
      fac $$7 = $$6.getBuffer(this.b);
      this.a.a($$5, $$7, 15728880, goq.d, 1.0F, 1.0F, 1.0F, $$4);
      $$6.b();
   }

   public static class a implements gbf<lm> {
      public gbc a(lm $$0, fxv $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gaz($$1, $$2, $$3, $$4);
      }
   }
}
