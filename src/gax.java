public class gax extends gca<gxp> {
   public gax(gfc $$0) {
      super($$0, gmh::f);
   }

   public static gfi a() {
      gfk $$0 = new gfk();
      gfm $$1 = $$0.a();
      $$1.a("back", gfh.c().a(0, 0).a(0.0F, -2.5F, -2.5F, 0.0F, 5.0F, 5.0F), gfe.a(-11.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F, 0.0F).a(0.8F));
      gfh $$2 = gfh.c().a(0, 0).a(-12.0F, -2.0F, 0.0F, 16.0F, 4.0F, 0.0F, gfg.a, 1.0F, 0.8F);
      $$1.a("cross_1", $$2, gfe.b((float) (Math.PI / 4), 0.0F, 0.0F));
      $$1.a("cross_2", $$2, gfe.b((float) (Math.PI * 3.0 / 4.0), 0.0F, 0.0F));
      return gfi.a($$0.a($$0x -> $$0x.b(0.9F)), 32, 32);
   }

   public void a(gxp $$0) {
      super.a($$0);
      if ($$0.c > 0.0F) {
         float $$1 = -ayz.a($$0.c * 3.0F) * $$0.c;
         this.v.g += $$1 * (float) (Math.PI / 180.0);
      }
   }
}
