public class fxv extends fyk<guc> {
   private static final float a = 0.6F;
   private static final float b = 0.8F;
   private static final float c = 1.0F;
   private final gbm d;
   private final gbm e;
   private final gbm f;
   private final gbm g;
   private final gbm i;
   private final gbm j;
   private final gbm k;

   public fxv(gbm $$0) {
      super($$0, gir::i);
      this.f = $$0.b("wind_body");
      this.j = this.f.b("wind_bottom");
      this.i = this.j.b("wind_mid");
      this.g = this.i.b("wind_top");
      this.d = $$0.b("body").b("head");
      this.e = this.d.b("eyes");
      this.k = $$0.b("body").b("rods");
   }

   public static gbs a(int $$0, int $$1) {
      gbu $$2 = new gbu();
      gbw $$3 = $$2.a();
      gbw $$4 = $$3.a("body", gbr.c(), gbo.a(0.0F, 0.0F, 0.0F));
      gbw $$5 = $$4.a("rods", gbr.c(), gbo.a(0.0F, 8.0F, 0.0F));
      $$5.a("rod_1", gbr.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new gbq(0.0F)), gbo.a(2.5981F, -3.0F, 1.5F, -2.7489F, -1.0472F, 3.1416F));
      $$5.a("rod_2", gbr.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new gbq(0.0F)), gbo.a(-2.5981F, -3.0F, 1.5F, -2.7489F, 1.0472F, 3.1416F));
      $$5.a("rod_3", gbr.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new gbq(0.0F)), gbo.a(0.0F, -3.0F, -3.0F, 0.3927F, 0.0F, 0.0F));
      gbw $$6 = $$4.a(
         "head",
         gbr.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new gbq(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new gbq(0.0F)),
         gbo.a(0.0F, 4.0F, 0.0F)
      );
      $$6.a(
         "eyes",
         gbr.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new gbq(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new gbq(0.0F)),
         gbo.a(0.0F, 0.0F, 0.0F)
      );
      gbw $$7 = $$3.a("wind_body", gbr.c(), gbo.a(0.0F, 0.0F, 0.0F));
      gbw $$8 = $$7.a("wind_bottom", gbr.c().a(1, 83).a(-2.5F, -7.0F, -2.5F, 5.0F, 7.0F, 5.0F, new gbq(0.0F)), gbo.a(0.0F, 24.0F, 0.0F));
      gbw $$9 = $$8.a(
         "wind_mid",
         gbr.c()
            .a(74, 28)
            .a(-6.0F, -6.0F, -6.0F, 12.0F, 6.0F, 12.0F, new gbq(0.0F))
            .a(78, 32)
            .a(-4.0F, -6.0F, -4.0F, 8.0F, 6.0F, 8.0F, new gbq(0.0F))
            .a(49, 71)
            .a(-2.5F, -6.0F, -2.5F, 5.0F, 6.0F, 5.0F, new gbq(0.0F)),
         gbo.a(0.0F, -7.0F, 0.0F)
      );
      $$9.a(
         "wind_top",
         gbr.c()
            .a(0, 0)
            .a(-9.0F, -8.0F, -9.0F, 18.0F, 8.0F, 18.0F, new gbq(0.0F))
            .a(6, 6)
            .a(-6.0F, -8.0F, -6.0F, 12.0F, 8.0F, 12.0F, new gbq(0.0F))
            .a(105, 57)
            .a(-2.5F, -8.0F, -2.5F, 5.0F, 8.0F, 5.0F, new gbq(0.0F)),
         gbo.a(0.0F, -6.0F, 0.0F)
      );
      return gbs.a($$2, $$0, $$1);
   }

   public void a(guc $$0) {
      super.a($$0);
      float $$1 = $$0.p * (float) Math.PI * -0.1F;
      this.g.b = azk.b($$1) * 1.0F * 0.6F;
      this.g.d = azk.a($$1) * 1.0F * 0.6F;
      this.i.b = azk.a($$1) * 0.5F * 0.8F;
      this.i.d = azk.b($$1) * 0.8F;
      this.j.b = azk.b($$1) * -0.25F * 1.0F;
      this.j.d = azk.a($$1) * -0.25F * 1.0F;
      this.d.c = 4.0F + azk.b($$1) / 4.0F;
      this.k.f = $$0.p * (float) Math.PI * 0.1F;
      this.a($$0.a, fkc.a, $$0.p);
      this.a($$0.b, fkc.d, $$0.p);
      this.a($$0.c, fkc.e, $$0.p);
      this.a($$0.d, fkc.c, $$0.p);
      this.a($$0.e, fkc.b, $$0.p);
   }

   public gbm a() {
      return this.d;
   }

   public gbm b() {
      return this.e;
   }

   public gbm c() {
      return this.k;
   }

   public gbm d() {
      return this.f;
   }
}
