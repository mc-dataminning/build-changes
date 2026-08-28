public class gbm extends gcc<gxz> {
   private static final float a = 0.6F;
   private static final float b = 0.8F;
   private static final float c = 1.0F;
   private final gfe d;
   private final gfe e;
   private final gfe f;
   private final gfe g;
   private final gfe i;
   private final gfe j;
   private final gfe k;

   public gbm(gfe $$0) {
      super($$0, gmj::j);
      this.f = $$0.b("wind_body");
      this.j = this.f.b("wind_bottom");
      this.i = this.j.b("wind_mid");
      this.g = this.i.b("wind_top");
      this.d = $$0.b("body").b("head");
      this.e = this.d.b("eyes");
      this.k = $$0.b("body").b("rods");
   }

   public static gfk a(int $$0, int $$1) {
      gfm $$2 = new gfm();
      gfo $$3 = $$2.a();
      gfo $$4 = $$3.a("body", gfj.c(), gfg.a(0.0F, 0.0F, 0.0F));
      gfo $$5 = $$4.a("rods", gfj.c(), gfg.a(0.0F, 8.0F, 0.0F));
      $$5.a("rod_1", gfj.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new gfi(0.0F)), gfg.a(2.5981F, -3.0F, 1.5F, -2.7489F, -1.0472F, 3.1416F));
      $$5.a("rod_2", gfj.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new gfi(0.0F)), gfg.a(-2.5981F, -3.0F, 1.5F, -2.7489F, 1.0472F, 3.1416F));
      $$5.a("rod_3", gfj.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new gfi(0.0F)), gfg.a(0.0F, -3.0F, -3.0F, 0.3927F, 0.0F, 0.0F));
      gfo $$6 = $$4.a(
         "head",
         gfj.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new gfi(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new gfi(0.0F)),
         gfg.a(0.0F, 4.0F, 0.0F)
      );
      $$6.a(
         "eyes",
         gfj.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new gfi(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new gfi(0.0F)),
         gfg.a(0.0F, 0.0F, 0.0F)
      );
      gfo $$7 = $$3.a("wind_body", gfj.c(), gfg.a(0.0F, 0.0F, 0.0F));
      gfo $$8 = $$7.a("wind_bottom", gfj.c().a(1, 83).a(-2.5F, -7.0F, -2.5F, 5.0F, 7.0F, 5.0F, new gfi(0.0F)), gfg.a(0.0F, 24.0F, 0.0F));
      gfo $$9 = $$8.a(
         "wind_mid",
         gfj.c()
            .a(74, 28)
            .a(-6.0F, -6.0F, -6.0F, 12.0F, 6.0F, 12.0F, new gfi(0.0F))
            .a(78, 32)
            .a(-4.0F, -6.0F, -4.0F, 8.0F, 6.0F, 8.0F, new gfi(0.0F))
            .a(49, 71)
            .a(-2.5F, -6.0F, -2.5F, 5.0F, 6.0F, 5.0F, new gfi(0.0F)),
         gfg.a(0.0F, -7.0F, 0.0F)
      );
      $$9.a(
         "wind_top",
         gfj.c()
            .a(0, 0)
            .a(-9.0F, -8.0F, -9.0F, 18.0F, 8.0F, 18.0F, new gfi(0.0F))
            .a(6, 6)
            .a(-6.0F, -8.0F, -6.0F, 12.0F, 8.0F, 12.0F, new gfi(0.0F))
            .a(105, 57)
            .a(-2.5F, -8.0F, -2.5F, 5.0F, 8.0F, 5.0F, new gfi(0.0F)),
         gfg.a(0.0F, -6.0F, 0.0F)
      );
      return gfk.a($$2, $$0, $$1);
   }

   public void a(gxz $$0) {
      super.a($$0);
      this.a($$0.a, fmd.a, $$0.u);
      this.a($$0.b, fmd.b, $$0.u);
      this.a($$0.c, fmd.e, $$0.u);
      this.a($$0.d, fmd.f, $$0.u);
      this.a($$0.e, fmd.d, $$0.u);
      this.a($$0.f, fmd.c, $$0.u);
   }

   public gfe a() {
      return this.d;
   }

   public gfe b() {
      return this.e;
   }

   public gfe c() {
      return this.k;
   }

   public gfe d() {
      return this.f;
   }
}
