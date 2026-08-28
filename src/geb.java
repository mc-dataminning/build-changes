public class geb extends gee {
   private final fxv a;
   private final ghe b = ghe.j(gml.a);

   geb(gax $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3);
      this.a = new fxi(fib.Q().aS().a(gaa.aq));
      this.u = 0.0F;
      this.t = 30;
   }

   @Override
   public gei b() {
      return gei.d;
   }

   @Override
   public void a(fcy $$0, fhk $$1, float $$2) {
      float $$3 = ((float)this.s + $$2) / (float)this.t;
      float $$4 = 0.05F + 0.5F * azc.a($$3 * (float) Math.PI);
      int $$5 = axn.a($$4, 1.0F, 1.0F, 1.0F);
      fcu $$6 = new fcu();
      $$6.a($$1.f());
      $$6.a(a.b.rotationDegrees(60.0F - 150.0F * $$3));
      $$6.b(1.0F, -1.0F, -1.0F);
      $$6.a(0.0F, -1.101F, 1.5F);
      ggv.a $$7 = fib.Q().aR().c();
      fcy $$8 = $$7.getBuffer(this.b);
      this.a.a($$6, $$8, 15728880, gwb.d, $$5);
      $$7.b();
   }

   public static class a implements geh<lr> {
      public gee a(lr $$0, gax $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new geb($$1, $$2, $$3, $$4);
      }
   }
}
