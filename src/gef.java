public class gef extends gca<gzj> {
   private final gfc a;

   public gef(gfc $$0) {
      super($$0, gmh::g);
      this.a = $$0.b("tail");
   }

   public static gfi a() {
      gfk $$0 = new gfk();
      gfm $$1 = $$0.a();
      float $$2 = 0.0F;
      float $$3 = 22.0F;
      float $$4 = -3.0F;
      $$1.a("body", gfh.c().a(0, 0).a(-1.5F, -1.0F, 0.0F, 3.0F, 2.0F, 3.0F), gfe.a(0.0F, 22.0F, -3.0F));
      $$1.a("tail", gfh.c().a(0, 0).a(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 7.0F), gfe.a(0.0F, 22.0F, 0.0F));
      return gfi.a($$0, 16, 16);
   }

   public void a(gzj $$0) {
      super.a($$0);
      float $$1 = $$0.ak ? 1.0F : 1.5F;
      this.a.f = -$$1 * 0.25F * ayz.a(0.3F * $$0.u);
   }
}
