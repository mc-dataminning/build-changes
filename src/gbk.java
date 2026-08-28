public class gbk extends gca<gxx> {
   private static final float a = 0.6F;
   private static final float b = 0.8F;
   private static final float c = 1.0F;
   private final gfc d;
   private final gfc e;
   private final gfc f;
   private final gfc g;
   private final gfc i;
   private final gfc j;
   private final gfc k;

   public gbk(gfc $$0) {
      super($$0, gmh::j);
      this.f = $$0.b("wind_body");
      this.j = this.f.b("wind_bottom");
      this.i = this.j.b("wind_mid");
      this.g = this.i.b("wind_top");
      this.d = $$0.b("body").b("head");
      this.e = this.d.b("eyes");
      this.k = $$0.b("body").b("rods");
   }

   public static gfi a(int $$0, int $$1) {
      gfk $$2 = new gfk();
      gfm $$3 = $$2.a();
      gfm $$4 = $$3.a("body", gfh.c(), gfe.a(0.0F, 0.0F, 0.0F));
      gfm $$5 = $$4.a("rods", gfh.c(), gfe.a(0.0F, 8.0F, 0.0F));
      $$5.a("rod_1", gfh.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new gfg(0.0F)), gfe.a(2.5981F, -3.0F, 1.5F, -2.7489F, -1.0472F, 3.1416F));
      $$5.a("rod_2", gfh.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new gfg(0.0F)), gfe.a(-2.5981F, -3.0F, 1.5F, -2.7489F, 1.0472F, 3.1416F));
      $$5.a("rod_3", gfh.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new gfg(0.0F)), gfe.a(0.0F, -3.0F, -3.0F, 0.3927F, 0.0F, 0.0F));
      gfm $$6 = $$4.a(
         "head",
         gfh.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new gfg(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new gfg(0.0F)),
         gfe.a(0.0F, 4.0F, 0.0F)
      );
      $$6.a(
         "eyes",
         gfh.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new gfg(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new gfg(0.0F)),
         gfe.a(0.0F, 0.0F, 0.0F)
      );
      gfm $$7 = $$3.a("wind_body", gfh.c(), gfe.a(0.0F, 0.0F, 0.0F));
      gfm $$8 = $$7.a("wind_bottom", gfh.c().a(1, 83).a(-2.5F, -7.0F, -2.5F, 5.0F, 7.0F, 5.0F, new gfg(0.0F)), gfe.a(0.0F, 24.0F, 0.0F));
      gfm $$9 = $$8.a(
         "wind_mid",
         gfh.c()
            .a(74, 28)
            .a(-6.0F, -6.0F, -6.0F, 12.0F, 6.0F, 12.0F, new gfg(0.0F))
            .a(78, 32)
            .a(-4.0F, -6.0F, -4.0F, 8.0F, 6.0F, 8.0F, new gfg(0.0F))
            .a(49, 71)
            .a(-2.5F, -6.0F, -2.5F, 5.0F, 6.0F, 5.0F, new gfg(0.0F)),
         gfe.a(0.0F, -7.0F, 0.0F)
      );
      $$9.a(
         "wind_top",
         gfh.c()
            .a(0, 0)
            .a(-9.0F, -8.0F, -9.0F, 18.0F, 8.0F, 18.0F, new gfg(0.0F))
            .a(6, 6)
            .a(-6.0F, -8.0F, -6.0F, 12.0F, 8.0F, 12.0F, new gfg(0.0F))
            .a(105, 57)
            .a(-2.5F, -8.0F, -2.5F, 5.0F, 8.0F, 5.0F, new gfg(0.0F)),
         gfe.a(0.0F, -6.0F, 0.0F)
      );
      return gfi.a($$2, $$0, $$1);
   }

   public void a(gxx $$0) {
      super.a($$0);
      this.a($$0.a, fmb.a, $$0.u);
      this.a($$0.b, fmb.b, $$0.u);
      this.a($$0.c, fmb.e, $$0.u);
      this.a($$0.d, fmb.f, $$0.u);
      this.a($$0.e, fmb.d, $$0.u);
      this.a($$0.f, fmb.c, $$0.u);
   }

   public gfc a() {
      return this.d;
   }

   public gfc b() {
      return this.e;
   }

   public gfc c() {
      return this.k;
   }

   public gfc d() {
      return this.f;
   }
}
