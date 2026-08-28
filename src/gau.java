public class gau extends gbk<gxh> {
   private static final float a = 0.6F;
   private static final float b = 0.8F;
   private static final float c = 1.0F;
   private final gem d;
   private final gem e;
   private final gem f;
   private final gem g;
   private final gem i;
   private final gem j;
   private final gem k;

   public gau(gem $$0) {
      super($$0, glt::i);
      this.f = $$0.b("wind_body");
      this.j = this.f.b("wind_bottom");
      this.i = this.j.b("wind_mid");
      this.g = this.i.b("wind_top");
      this.d = $$0.b("body").b("head");
      this.e = this.d.b("eyes");
      this.k = $$0.b("body").b("rods");
   }

   public static ges a(int $$0, int $$1) {
      geu $$2 = new geu();
      gew $$3 = $$2.a();
      gew $$4 = $$3.a("body", ger.c(), geo.a(0.0F, 0.0F, 0.0F));
      gew $$5 = $$4.a("rods", ger.c(), geo.a(0.0F, 8.0F, 0.0F));
      $$5.a("rod_1", ger.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new geq(0.0F)), geo.a(2.5981F, -3.0F, 1.5F, -2.7489F, -1.0472F, 3.1416F));
      $$5.a("rod_2", ger.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new geq(0.0F)), geo.a(-2.5981F, -3.0F, 1.5F, -2.7489F, 1.0472F, 3.1416F));
      $$5.a("rod_3", ger.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new geq(0.0F)), geo.a(0.0F, -3.0F, -3.0F, 0.3927F, 0.0F, 0.0F));
      gew $$6 = $$4.a(
         "head",
         ger.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new geq(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new geq(0.0F)),
         geo.a(0.0F, 4.0F, 0.0F)
      );
      $$6.a(
         "eyes",
         ger.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new geq(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new geq(0.0F)),
         geo.a(0.0F, 0.0F, 0.0F)
      );
      gew $$7 = $$3.a("wind_body", ger.c(), geo.a(0.0F, 0.0F, 0.0F));
      gew $$8 = $$7.a("wind_bottom", ger.c().a(1, 83).a(-2.5F, -7.0F, -2.5F, 5.0F, 7.0F, 5.0F, new geq(0.0F)), geo.a(0.0F, 24.0F, 0.0F));
      gew $$9 = $$8.a(
         "wind_mid",
         ger.c()
            .a(74, 28)
            .a(-6.0F, -6.0F, -6.0F, 12.0F, 6.0F, 12.0F, new geq(0.0F))
            .a(78, 32)
            .a(-4.0F, -6.0F, -4.0F, 8.0F, 6.0F, 8.0F, new geq(0.0F))
            .a(49, 71)
            .a(-2.5F, -6.0F, -2.5F, 5.0F, 6.0F, 5.0F, new geq(0.0F)),
         geo.a(0.0F, -7.0F, 0.0F)
      );
      $$9.a(
         "wind_top",
         ger.c()
            .a(0, 0)
            .a(-9.0F, -8.0F, -9.0F, 18.0F, 8.0F, 18.0F, new geq(0.0F))
            .a(6, 6)
            .a(-6.0F, -8.0F, -6.0F, 12.0F, 8.0F, 12.0F, new geq(0.0F))
            .a(105, 57)
            .a(-2.5F, -8.0F, -2.5F, 5.0F, 8.0F, 5.0F, new geq(0.0F)),
         geo.a(0.0F, -6.0F, 0.0F)
      );
      return ges.a($$2, $$0, $$1);
   }

   public void a(gxh $$0) {
      super.a($$0);
      float $$1 = $$0.p * (float) Math.PI * -0.1F;
      this.g.b = bae.b($$1) * 1.0F * 0.6F;
      this.g.d = bae.a($$1) * 1.0F * 0.6F;
      this.i.b = bae.a($$1) * 0.5F * 0.8F;
      this.i.d = bae.b($$1) * 0.8F;
      this.j.b = bae.b($$1) * -0.25F * 1.0F;
      this.j.d = bae.a($$1) * -0.25F * 1.0F;
      this.d.c = 4.0F + bae.b($$1) / 4.0F;
      this.k.f = $$0.p * (float) Math.PI * 0.1F;
      this.a($$0.a, fmx.a, $$0.p);
      this.a($$0.b, fmx.d, $$0.p);
      this.a($$0.c, fmx.e, $$0.p);
      this.a($$0.d, fmx.c, $$0.p);
      this.a($$0.e, fmx.b, $$0.p);
   }

   public gem a() {
      return this.d;
   }

   public gem b() {
      return this.e;
   }

   public gem c() {
      return this.k;
   }

   public gem d() {
      return this.f;
   }
}
