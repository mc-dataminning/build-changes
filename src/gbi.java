public class gbi extends gby<gxv> {
   private static final float a = 0.6F;
   private static final float b = 0.8F;
   private static final float c = 1.0F;
   private final gfa d;
   private final gfa e;
   private final gfa f;
   private final gfa g;
   private final gfa i;
   private final gfa j;
   private final gfa k;

   public gbi(gfa $$0) {
      super($$0, gmf::j);
      this.f = $$0.b("wind_body");
      this.j = this.f.b("wind_bottom");
      this.i = this.j.b("wind_mid");
      this.g = this.i.b("wind_top");
      this.d = $$0.b("body").b("head");
      this.e = this.d.b("eyes");
      this.k = $$0.b("body").b("rods");
   }

   public static gfg a(int $$0, int $$1) {
      gfi $$2 = new gfi();
      gfk $$3 = $$2.a();
      gfk $$4 = $$3.a("body", gff.c(), gfc.a(0.0F, 0.0F, 0.0F));
      gfk $$5 = $$4.a("rods", gff.c(), gfc.a(0.0F, 8.0F, 0.0F));
      $$5.a("rod_1", gff.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new gfe(0.0F)), gfc.a(2.5981F, -3.0F, 1.5F, -2.7489F, -1.0472F, 3.1416F));
      $$5.a("rod_2", gff.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new gfe(0.0F)), gfc.a(-2.5981F, -3.0F, 1.5F, -2.7489F, 1.0472F, 3.1416F));
      $$5.a("rod_3", gff.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new gfe(0.0F)), gfc.a(0.0F, -3.0F, -3.0F, 0.3927F, 0.0F, 0.0F));
      gfk $$6 = $$4.a(
         "head",
         gff.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new gfe(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new gfe(0.0F)),
         gfc.a(0.0F, 4.0F, 0.0F)
      );
      $$6.a(
         "eyes",
         gff.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new gfe(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new gfe(0.0F)),
         gfc.a(0.0F, 0.0F, 0.0F)
      );
      gfk $$7 = $$3.a("wind_body", gff.c(), gfc.a(0.0F, 0.0F, 0.0F));
      gfk $$8 = $$7.a("wind_bottom", gff.c().a(1, 83).a(-2.5F, -7.0F, -2.5F, 5.0F, 7.0F, 5.0F, new gfe(0.0F)), gfc.a(0.0F, 24.0F, 0.0F));
      gfk $$9 = $$8.a(
         "wind_mid",
         gff.c()
            .a(74, 28)
            .a(-6.0F, -6.0F, -6.0F, 12.0F, 6.0F, 12.0F, new gfe(0.0F))
            .a(78, 32)
            .a(-4.0F, -6.0F, -4.0F, 8.0F, 6.0F, 8.0F, new gfe(0.0F))
            .a(49, 71)
            .a(-2.5F, -6.0F, -2.5F, 5.0F, 6.0F, 5.0F, new gfe(0.0F)),
         gfc.a(0.0F, -7.0F, 0.0F)
      );
      $$9.a(
         "wind_top",
         gff.c()
            .a(0, 0)
            .a(-9.0F, -8.0F, -9.0F, 18.0F, 8.0F, 18.0F, new gfe(0.0F))
            .a(6, 6)
            .a(-6.0F, -8.0F, -6.0F, 12.0F, 8.0F, 12.0F, new gfe(0.0F))
            .a(105, 57)
            .a(-2.5F, -8.0F, -2.5F, 5.0F, 8.0F, 5.0F, new gfe(0.0F)),
         gfc.a(0.0F, -6.0F, 0.0F)
      );
      return gfg.a($$2, $$0, $$1);
   }

   public void a(gxv $$0) {
      super.a($$0);
      this.a($$0.a, fma.a, $$0.u);
      this.a($$0.b, fma.b, $$0.u);
      this.a($$0.c, fma.e, $$0.u);
      this.a($$0.d, fma.f, $$0.u);
      this.a($$0.e, fma.d, $$0.u);
      this.a($$0.f, fma.c, $$0.u);
   }

   public gfa a() {
      return this.d;
   }

   public gfa b() {
      return this.e;
   }

   public gfa c() {
      return this.k;
   }

   public gfa d() {
      return this.f;
   }
}
