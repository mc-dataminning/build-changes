public class gdi extends gea<gzy> {
   private static final float a = 0.6F;
   private static final float b = 0.8F;
   private static final float c = 1.0F;
   private final ghd d;
   private final ghd e;
   private final ghd f;
   private final ghd g;
   private final ghd i;
   private final ghd j;
   private final ghd k;

   public gdi(ghd $$0) {
      super($$0, goi::j);
      this.f = $$0.b("wind_body");
      this.j = this.f.b("wind_bottom");
      this.i = this.j.b("wind_mid");
      this.g = this.i.b("wind_top");
      this.d = $$0.b("body").b("head");
      this.e = this.d.b("eyes");
      this.k = $$0.b("body").b("rods");
   }

   public static ghj a(int $$0, int $$1) {
      ghl $$2 = new ghl();
      ghn $$3 = $$2.a();
      ghn $$4 = $$3.a("body", ghi.c(), ghf.a(0.0F, 0.0F, 0.0F));
      ghn $$5 = $$4.a("rods", ghi.c(), ghf.a(0.0F, 8.0F, 0.0F));
      $$5.a("rod_1", ghi.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new ghh(0.0F)), ghf.a(2.5981F, -3.0F, 1.5F, -2.7489F, -1.0472F, 3.1416F));
      $$5.a("rod_2", ghi.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new ghh(0.0F)), ghf.a(-2.5981F, -3.0F, 1.5F, -2.7489F, 1.0472F, 3.1416F));
      $$5.a("rod_3", ghi.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new ghh(0.0F)), ghf.a(0.0F, -3.0F, -3.0F, 0.3927F, 0.0F, 0.0F));
      ghn $$6 = $$4.a(
         "head",
         ghi.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new ghh(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new ghh(0.0F)),
         ghf.a(0.0F, 4.0F, 0.0F)
      );
      $$6.a(
         "eyes",
         ghi.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new ghh(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new ghh(0.0F)),
         ghf.a(0.0F, 0.0F, 0.0F)
      );
      ghn $$7 = $$3.a("wind_body", ghi.c(), ghf.a(0.0F, 0.0F, 0.0F));
      ghn $$8 = $$7.a("wind_bottom", ghi.c().a(1, 83).a(-2.5F, -7.0F, -2.5F, 5.0F, 7.0F, 5.0F, new ghh(0.0F)), ghf.a(0.0F, 24.0F, 0.0F));
      ghn $$9 = $$8.a(
         "wind_mid",
         ghi.c()
            .a(74, 28)
            .a(-6.0F, -6.0F, -6.0F, 12.0F, 6.0F, 12.0F, new ghh(0.0F))
            .a(78, 32)
            .a(-4.0F, -6.0F, -4.0F, 8.0F, 6.0F, 8.0F, new ghh(0.0F))
            .a(49, 71)
            .a(-2.5F, -6.0F, -2.5F, 5.0F, 6.0F, 5.0F, new ghh(0.0F)),
         ghf.a(0.0F, -7.0F, 0.0F)
      );
      $$9.a(
         "wind_top",
         ghi.c()
            .a(0, 0)
            .a(-9.0F, -8.0F, -9.0F, 18.0F, 8.0F, 18.0F, new ghh(0.0F))
            .a(6, 6)
            .a(-6.0F, -8.0F, -6.0F, 12.0F, 8.0F, 12.0F, new ghh(0.0F))
            .a(105, 57)
            .a(-2.5F, -8.0F, -2.5F, 5.0F, 8.0F, 5.0F, new ghh(0.0F)),
         ghf.a(0.0F, -6.0F, 0.0F)
      );
      return ghj.a($$2, $$0, $$1);
   }

   public void a(gzy $$0) {
      super.a($$0);
      this.a($$0.a, fnw.a, $$0.u);
      this.a($$0.b, fnw.b, $$0.u);
      this.a($$0.c, fnw.e, $$0.u);
      this.a($$0.d, fnw.f, $$0.u);
      this.a($$0.e, fnw.d, $$0.u);
      this.a($$0.f, fnw.c, $$0.u);
   }

   public ghd a() {
      return this.d;
   }

   public ghd b() {
      return this.e;
   }

   public ghd c() {
      return this.k;
   }

   public ghd d() {
      return this.f;
   }
}
