public class gcj extends gda<gyx> {
   private static final float a = 0.6F;
   private static final float b = 0.8F;
   private static final float c = 1.0F;
   private final ggc d;
   private final ggc e;
   private final ggc f;
   private final ggc g;
   private final ggc i;
   private final ggc j;
   private final ggc k;

   public gcj(ggc $$0) {
      super($$0, gnh::j);
      this.f = $$0.b("wind_body");
      this.j = this.f.b("wind_bottom");
      this.i = this.j.b("wind_mid");
      this.g = this.i.b("wind_top");
      this.d = $$0.b("body").b("head");
      this.e = this.d.b("eyes");
      this.k = $$0.b("body").b("rods");
   }

   public static ggi a(int $$0, int $$1) {
      ggk $$2 = new ggk();
      ggm $$3 = $$2.a();
      ggm $$4 = $$3.a("body", ggh.c(), gge.a(0.0F, 0.0F, 0.0F));
      ggm $$5 = $$4.a("rods", ggh.c(), gge.a(0.0F, 8.0F, 0.0F));
      $$5.a("rod_1", ggh.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new ggg(0.0F)), gge.a(2.5981F, -3.0F, 1.5F, -2.7489F, -1.0472F, 3.1416F));
      $$5.a("rod_2", ggh.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new ggg(0.0F)), gge.a(-2.5981F, -3.0F, 1.5F, -2.7489F, 1.0472F, 3.1416F));
      $$5.a("rod_3", ggh.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new ggg(0.0F)), gge.a(0.0F, -3.0F, -3.0F, 0.3927F, 0.0F, 0.0F));
      ggm $$6 = $$4.a(
         "head",
         ggh.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new ggg(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new ggg(0.0F)),
         gge.a(0.0F, 4.0F, 0.0F)
      );
      $$6.a(
         "eyes",
         ggh.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new ggg(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new ggg(0.0F)),
         gge.a(0.0F, 0.0F, 0.0F)
      );
      ggm $$7 = $$3.a("wind_body", ggh.c(), gge.a(0.0F, 0.0F, 0.0F));
      ggm $$8 = $$7.a("wind_bottom", ggh.c().a(1, 83).a(-2.5F, -7.0F, -2.5F, 5.0F, 7.0F, 5.0F, new ggg(0.0F)), gge.a(0.0F, 24.0F, 0.0F));
      ggm $$9 = $$8.a(
         "wind_mid",
         ggh.c()
            .a(74, 28)
            .a(-6.0F, -6.0F, -6.0F, 12.0F, 6.0F, 12.0F, new ggg(0.0F))
            .a(78, 32)
            .a(-4.0F, -6.0F, -4.0F, 8.0F, 6.0F, 8.0F, new ggg(0.0F))
            .a(49, 71)
            .a(-2.5F, -6.0F, -2.5F, 5.0F, 6.0F, 5.0F, new ggg(0.0F)),
         gge.a(0.0F, -7.0F, 0.0F)
      );
      $$9.a(
         "wind_top",
         ggh.c()
            .a(0, 0)
            .a(-9.0F, -8.0F, -9.0F, 18.0F, 8.0F, 18.0F, new ggg(0.0F))
            .a(6, 6)
            .a(-6.0F, -8.0F, -6.0F, 12.0F, 8.0F, 12.0F, new ggg(0.0F))
            .a(105, 57)
            .a(-2.5F, -8.0F, -2.5F, 5.0F, 8.0F, 5.0F, new ggg(0.0F)),
         gge.a(0.0F, -6.0F, 0.0F)
      );
      return ggi.a($$2, $$0, $$1);
   }

   public void a(gyx $$0) {
      super.a($$0);
      this.a($$0.a, fmz.a, $$0.u);
      this.a($$0.b, fmz.b, $$0.u);
      this.a($$0.c, fmz.e, $$0.u);
      this.a($$0.d, fmz.f, $$0.u);
      this.a($$0.e, fmz.d, $$0.u);
      this.a($$0.f, fmz.c, $$0.u);
   }

   public ggc a() {
      return this.d;
   }

   public ggc b() {
      return this.e;
   }

   public ggc c() {
      return this.k;
   }

   public ggc d() {
      return this.f;
   }
}
