public class gbp extends gca<gzi> {
   private final gfc a;

   public gbp(gfc $$0) {
      super($$0);
      this.a = $$0.b("tail_fin");
   }

   public static gfi a() {
      gfk $$0 = new gfk();
      gfm $$1 = $$0.a();
      int $$2 = 22;
      $$1.a("body", gfh.c().a(0, 0).a(-1.0F, -2.0F, 0.0F, 2.0F, 4.0F, 7.0F), gfe.a(0.0F, 22.0F, 0.0F));
      $$1.a("head", gfh.c().a(11, 0).a(-1.0F, -2.0F, -3.0F, 2.0F, 4.0F, 3.0F), gfe.a(0.0F, 22.0F, 0.0F));
      $$1.a("nose", gfh.c().a(0, 0).a(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 1.0F), gfe.a(0.0F, 22.0F, -3.0F));
      $$1.a("right_fin", gfh.c().a(22, 1).a(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F), gfe.a(-1.0F, 23.0F, 0.0F, 0.0F, 0.0F, (float) (-Math.PI / 4)));
      $$1.a("left_fin", gfh.c().a(22, 4).a(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F), gfe.a(1.0F, 23.0F, 0.0F, 0.0F, 0.0F, (float) (Math.PI / 4)));
      $$1.a("tail_fin", gfh.c().a(22, 3).a(0.0F, -2.0F, 0.0F, 0.0F, 4.0F, 4.0F), gfe.a(0.0F, 22.0F, 7.0F));
      $$1.a("top_fin", gfh.c().a(20, -6).a(0.0F, -1.0F, -1.0F, 0.0F, 1.0F, 6.0F), gfe.a(0.0F, 20.0F, 0.0F));
      return gfi.a($$0, 32, 32);
   }

   public void a(gzi $$0) {
      super.a($$0);
      float $$1 = $$0.ak ? 1.0F : 1.5F;
      this.a.f = -$$1 * 0.45F * ayz.a(0.6F * $$0.u);
   }
}
