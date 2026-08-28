public class gzk extends gws<cnp, hfe> {
   private final grp a;

   public gzk(gwt.a $$0) {
      super($$0);
      this.e = 0.5F;
      this.a = $$0.d();
   }

   public void a(hfe $$0, fjy $$1, gqm $$2, int $$3) {
      $$1.a();
      $$1.a(0.0F, 0.5F, 0.0F);
      float $$4 = $$0.a;
      if ($$0.a < 10.0F) {
         float $$5 = 1.0F - $$0.a / 10.0F;
         $$5 = azm.a($$5, 0.0F, 1.0F);
         $$5 *= $$5;
         $$5 *= $$5;
         float $$6 = 1.0F + $$5 * 0.3F;
         $$1.b($$6, $$6, $$6);
      }

      $$1.a(a.d.rotationDegrees(-90.0F));
      $$1.a(-0.5F, -0.5F, 0.5F);
      $$1.a(a.d.rotationDegrees(90.0F));
      if ($$0.b != null) {
         gzj.a(this.a, $$0.b, $$1, $$2, $$3, (int)$$4 / 5 % 2 == 0);
      }

      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public hfe a() {
      return new hfe();
   }

   public void a(cnp $$0, hfe $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = (float)$$0.g() - $$2 + 1.0F;
      $$1.b = $$0.j();
   }
}
