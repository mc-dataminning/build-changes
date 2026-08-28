public class fyj extends fzj<guw> {
   public fyj(gcl $$0) {
      super($$0, gjq::e);
   }

   public static gcr a() {
      gct $$0 = new gct();
      gcv $$1 = $$0.a();
      $$1.a("back", gcq.c().a(0, 0).a(0.0F, -2.5F, -2.5F, 0.0F, 5.0F, 5.0F), gcn.a(-11.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F, 0.0F).a(0.8F));
      gcq $$2 = gcq.c().a(0, 0).a(-12.0F, -2.0F, 0.0F, 16.0F, 4.0F, 0.0F, gcp.a, 1.0F, 0.8F);
      $$1.a("cross_1", $$2, gcn.b((float) (Math.PI / 4), 0.0F, 0.0F));
      $$1.a("cross_2", $$2, gcn.b((float) (Math.PI * 3.0 / 4.0), 0.0F, 0.0F));
      return gcr.a($$0.a($$0x -> $$0x.b(0.9F)), 32, 32);
   }

   public void a(guw $$0) {
      super.a($$0);
      if ($$0.c > 0.0F) {
         float $$1 = -azm.a($$0.c * 3.0F) * $$0.c;
         this.v.g += $$1 * (float) (Math.PI / 180.0);
      }
   }
}
