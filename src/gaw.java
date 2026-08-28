public class gaw extends gbm<gxj> {
   private static final float a = 0.6F;
   private static final float b = 0.8F;
   private static final float c = 1.0F;
   private final geo d;
   private final geo e;
   private final geo f;
   private final geo g;
   private final geo i;
   private final geo j;
   private final geo k;

   public gaw(geo $$0) {
      super($$0, glv::j);
      this.f = $$0.b("wind_body");
      this.j = this.f.b("wind_bottom");
      this.i = this.j.b("wind_mid");
      this.g = this.i.b("wind_top");
      this.d = $$0.b("body").b("head");
      this.e = this.d.b("eyes");
      this.k = $$0.b("body").b("rods");
   }

   public static geu a(int $$0, int $$1) {
      gew $$2 = new gew();
      gey $$3 = $$2.a();
      gey $$4 = $$3.a("body", get.c(), geq.a(0.0F, 0.0F, 0.0F));
      gey $$5 = $$4.a("rods", get.c(), geq.a(0.0F, 8.0F, 0.0F));
      $$5.a("rod_1", get.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new ges(0.0F)), geq.a(2.5981F, -3.0F, 1.5F, -2.7489F, -1.0472F, 3.1416F));
      $$5.a("rod_2", get.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new ges(0.0F)), geq.a(-2.5981F, -3.0F, 1.5F, -2.7489F, 1.0472F, 3.1416F));
      $$5.a("rod_3", get.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new ges(0.0F)), geq.a(0.0F, -3.0F, -3.0F, 0.3927F, 0.0F, 0.0F));
      gey $$6 = $$4.a(
         "head",
         get.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new ges(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new ges(0.0F)),
         geq.a(0.0F, 4.0F, 0.0F)
      );
      $$6.a(
         "eyes",
         get.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new ges(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new ges(0.0F)),
         geq.a(0.0F, 0.0F, 0.0F)
      );
      gey $$7 = $$3.a("wind_body", get.c(), geq.a(0.0F, 0.0F, 0.0F));
      gey $$8 = $$7.a("wind_bottom", get.c().a(1, 83).a(-2.5F, -7.0F, -2.5F, 5.0F, 7.0F, 5.0F, new ges(0.0F)), geq.a(0.0F, 24.0F, 0.0F));
      gey $$9 = $$8.a(
         "wind_mid",
         get.c()
            .a(74, 28)
            .a(-6.0F, -6.0F, -6.0F, 12.0F, 6.0F, 12.0F, new ges(0.0F))
            .a(78, 32)
            .a(-4.0F, -6.0F, -4.0F, 8.0F, 6.0F, 8.0F, new ges(0.0F))
            .a(49, 71)
            .a(-2.5F, -6.0F, -2.5F, 5.0F, 6.0F, 5.0F, new ges(0.0F)),
         geq.a(0.0F, -7.0F, 0.0F)
      );
      $$9.a(
         "wind_top",
         get.c()
            .a(0, 0)
            .a(-9.0F, -8.0F, -9.0F, 18.0F, 8.0F, 18.0F, new ges(0.0F))
            .a(6, 6)
            .a(-6.0F, -8.0F, -6.0F, 12.0F, 8.0F, 12.0F, new ges(0.0F))
            .a(105, 57)
            .a(-2.5F, -8.0F, -2.5F, 5.0F, 8.0F, 5.0F, new ges(0.0F)),
         geq.a(0.0F, -6.0F, 0.0F)
      );
      return geu.a($$2, $$0, $$1);
   }

   public void a(gxj $$0) {
      super.a($$0);
      this.a($$0.a, fmz.a, $$0.p);
      this.a($$0.b, fmz.b, $$0.p);
      this.a($$0.c, fmz.e, $$0.p);
      this.a($$0.d, fmz.f, $$0.p);
      this.a($$0.e, fmz.d, $$0.p);
      this.a($$0.f, fmz.c, $$0.p);
   }

   public geo a() {
      return this.d;
   }

   public geo b() {
      return this.e;
   }

   public geo c() {
      return this.k;
   }

   public geo d() {
      return this.f;
   }
}
