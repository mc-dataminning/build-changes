public class gav extends gbl<gxi> {
   private static final float a = 0.6F;
   private static final float b = 0.8F;
   private static final float c = 1.0F;
   private final gen d;
   private final gen e;
   private final gen f;
   private final gen g;
   private final gen i;
   private final gen j;
   private final gen k;

   public gav(gen $$0) {
      super($$0, glu::j);
      this.f = $$0.b("wind_body");
      this.j = this.f.b("wind_bottom");
      this.i = this.j.b("wind_mid");
      this.g = this.i.b("wind_top");
      this.d = $$0.b("body").b("head");
      this.e = this.d.b("eyes");
      this.k = $$0.b("body").b("rods");
   }

   public static get a(int $$0, int $$1) {
      gev $$2 = new gev();
      gex $$3 = $$2.a();
      gex $$4 = $$3.a("body", ges.c(), gep.a(0.0F, 0.0F, 0.0F));
      gex $$5 = $$4.a("rods", ges.c(), gep.a(0.0F, 8.0F, 0.0F));
      $$5.a("rod_1", ges.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new ger(0.0F)), gep.a(2.5981F, -3.0F, 1.5F, -2.7489F, -1.0472F, 3.1416F));
      $$5.a("rod_2", ges.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new ger(0.0F)), gep.a(-2.5981F, -3.0F, 1.5F, -2.7489F, 1.0472F, 3.1416F));
      $$5.a("rod_3", ges.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new ger(0.0F)), gep.a(0.0F, -3.0F, -3.0F, 0.3927F, 0.0F, 0.0F));
      gex $$6 = $$4.a(
         "head",
         ges.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new ger(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new ger(0.0F)),
         gep.a(0.0F, 4.0F, 0.0F)
      );
      $$6.a(
         "eyes",
         ges.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new ger(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new ger(0.0F)),
         gep.a(0.0F, 0.0F, 0.0F)
      );
      gex $$7 = $$3.a("wind_body", ges.c(), gep.a(0.0F, 0.0F, 0.0F));
      gex $$8 = $$7.a("wind_bottom", ges.c().a(1, 83).a(-2.5F, -7.0F, -2.5F, 5.0F, 7.0F, 5.0F, new ger(0.0F)), gep.a(0.0F, 24.0F, 0.0F));
      gex $$9 = $$8.a(
         "wind_mid",
         ges.c()
            .a(74, 28)
            .a(-6.0F, -6.0F, -6.0F, 12.0F, 6.0F, 12.0F, new ger(0.0F))
            .a(78, 32)
            .a(-4.0F, -6.0F, -4.0F, 8.0F, 6.0F, 8.0F, new ger(0.0F))
            .a(49, 71)
            .a(-2.5F, -6.0F, -2.5F, 5.0F, 6.0F, 5.0F, new ger(0.0F)),
         gep.a(0.0F, -7.0F, 0.0F)
      );
      $$9.a(
         "wind_top",
         ges.c()
            .a(0, 0)
            .a(-9.0F, -8.0F, -9.0F, 18.0F, 8.0F, 18.0F, new ger(0.0F))
            .a(6, 6)
            .a(-6.0F, -8.0F, -6.0F, 12.0F, 8.0F, 12.0F, new ger(0.0F))
            .a(105, 57)
            .a(-2.5F, -8.0F, -2.5F, 5.0F, 8.0F, 5.0F, new ger(0.0F)),
         gep.a(0.0F, -6.0F, 0.0F)
      );
      return get.a($$2, $$0, $$1);
   }

   public void a(gxi $$0) {
      super.a($$0);
      this.a($$0.a, fmy.a, $$0.p);
      this.a($$0.b, fmy.b, $$0.p);
      this.a($$0.c, fmy.e, $$0.p);
      this.a($$0.d, fmy.f, $$0.p);
      this.a($$0.e, fmy.d, $$0.p);
      this.a($$0.f, fmy.c, $$0.p);
   }

   public gen a() {
      return this.d;
   }

   public gen b() {
      return this.e;
   }

   public gen c() {
      return this.k;
   }

   public gen d() {
      return this.f;
   }
}
