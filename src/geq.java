public class geq extends get {
   private final fyj a;
   private final ghv b = ghv.i(gnh.a);

   geq(gbm $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3);
      this.a = new fxw(fip.Q().aT().a(gap.aq));
      this.u = 0.0F;
      this.t = 30;
   }

   @Override
   public gex b() {
      return gex.d;
   }

   @Override
   public void a(fdm $$0, fhy $$1, float $$2) {
      float $$3 = ((float)this.s + $$2) / (float)this.t;
      float $$4 = 0.05F + 0.5F * azf.a($$3 * (float) Math.PI);
      int $$5 = axq.a($$4, 1.0F, 1.0F, 1.0F);
      fdi $$6 = new fdi();
      $$6.a($$1.f());
      $$6.a(a.b.rotationDegrees(60.0F - 150.0F * $$3));
      float $$7 = 0.42553192F;
      $$6.b(0.42553192F, -0.42553192F, -0.42553192F);
      $$6.a(0.0F, -0.56F, 3.5F);
      ghl.a $$8 = fip.Q().aS().c();
      fdm $$9 = $$8.getBuffer(this.b);
      this.a.a($$6, $$9, 15728880, gwx.d, $$5);
      $$8.b();
   }

   public static class a implements gew<ls> {
      public get a(ls $$0, gbm $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new geq($$1, $$2, $$3, $$4);
      }
   }
}
