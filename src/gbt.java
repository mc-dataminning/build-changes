public class gbt extends gca<gyd> {
   public static final gfl a = gfl.scaling(0.5F);
   private final gfc b;
   private final gfc c;
   private final gfc d;

   public gbt(gfc $$0) {
      super($$0);
      this.b = $$0.b("body");
      this.c = this.b.b("tail");
      this.d = this.c.b("tail_fin");
   }

   public static gfi a() {
      gfk $$0 = new gfk();
      gfm $$1 = $$0.a();
      float $$2 = 18.0F;
      float $$3 = -8.0F;
      gfm $$4 = $$1.a("body", gfh.c().a(22, 0).a(-4.0F, -7.0F, 0.0F, 8.0F, 7.0F, 13.0F), gfe.a(0.0F, 22.0F, -5.0F));
      $$4.a("back_fin", gfh.c().a(51, 0).a(-0.5F, 0.0F, 8.0F, 1.0F, 4.0F, 5.0F), gfe.b((float) (Math.PI / 3), 0.0F, 0.0F));
      $$4.a(
         "left_fin",
         gfh.c().a(48, 20).a().a(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 7.0F),
         gfe.a(2.0F, -2.0F, 4.0F, (float) (Math.PI / 3), 0.0F, (float) (Math.PI * 2.0 / 3.0))
      );
      $$4.a(
         "right_fin",
         gfh.c().a(48, 20).a(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 7.0F),
         gfe.a(-2.0F, -2.0F, 4.0F, (float) (Math.PI / 3), 0.0F, (float) (-Math.PI * 2.0 / 3.0))
      );
      gfm $$5 = $$4.a("tail", gfh.c().a(0, 19).a(-2.0F, -2.5F, 0.0F, 4.0F, 5.0F, 11.0F), gfe.a(0.0F, -2.5F, 11.0F, -0.10471976F, 0.0F, 0.0F));
      $$5.a("tail_fin", gfh.c().a(19, 20).a(-5.0F, -0.5F, 0.0F, 10.0F, 1.0F, 6.0F), gfe.a(0.0F, 0.0F, 9.0F));
      gfm $$6 = $$4.a("head", gfh.c().a(0, 0).a(-4.0F, -3.0F, -3.0F, 8.0F, 7.0F, 6.0F), gfe.a(0.0F, -4.0F, -3.0F));
      $$6.a("nose", gfh.c().a(0, 13).a(-1.0F, 2.0F, -7.0F, 2.0F, 2.0F, 4.0F), gfe.a);
      return gfi.a($$0, 64, 64);
   }

   public void a(gyd $$0) {
      super.a($$0);
      this.b.e = $$0.ab * (float) (Math.PI / 180.0);
      this.b.f = $$0.aa * (float) (Math.PI / 180.0);
      if ($$0.a) {
         this.b.e = this.b.e + (-0.05F - 0.05F * ayz.b($$0.u * 0.3F));
         this.c.e = -0.1F * ayz.b($$0.u * 0.3F);
         this.d.e = -0.2F * ayz.b($$0.u * 0.3F);
      }
   }
}
