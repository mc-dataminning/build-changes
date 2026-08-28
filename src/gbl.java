public class gbl extends gcb<gxy> {
   private static final float a = 0.6F;
   private static final float b = 0.8F;
   private static final float c = 1.0F;
   private final gfd d;
   private final gfd e;
   private final gfd f;
   private final gfd g;
   private final gfd i;
   private final gfd j;
   private final gfd k;

   public gbl(gfd $$0) {
      super($$0, gmi::j);
      this.f = $$0.b("wind_body");
      this.j = this.f.b("wind_bottom");
      this.i = this.j.b("wind_mid");
      this.g = this.i.b("wind_top");
      this.d = $$0.b("body").b("head");
      this.e = this.d.b("eyes");
      this.k = $$0.b("body").b("rods");
   }

   public static gfj a(int $$0, int $$1) {
      gfl $$2 = new gfl();
      gfn $$3 = $$2.a();
      gfn $$4 = $$3.a("body", gfi.c(), gff.a(0.0F, 0.0F, 0.0F));
      gfn $$5 = $$4.a("rods", gfi.c(), gff.a(0.0F, 8.0F, 0.0F));
      $$5.a("rod_1", gfi.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new gfh(0.0F)), gff.a(2.5981F, -3.0F, 1.5F, -2.7489F, -1.0472F, 3.1416F));
      $$5.a("rod_2", gfi.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new gfh(0.0F)), gff.a(-2.5981F, -3.0F, 1.5F, -2.7489F, 1.0472F, 3.1416F));
      $$5.a("rod_3", gfi.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new gfh(0.0F)), gff.a(0.0F, -3.0F, -3.0F, 0.3927F, 0.0F, 0.0F));
      gfn $$6 = $$4.a(
         "head",
         gfi.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new gfh(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new gfh(0.0F)),
         gff.a(0.0F, 4.0F, 0.0F)
      );
      $$6.a(
         "eyes",
         gfi.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new gfh(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new gfh(0.0F)),
         gff.a(0.0F, 0.0F, 0.0F)
      );
      gfn $$7 = $$3.a("wind_body", gfi.c(), gff.a(0.0F, 0.0F, 0.0F));
      gfn $$8 = $$7.a("wind_bottom", gfi.c().a(1, 83).a(-2.5F, -7.0F, -2.5F, 5.0F, 7.0F, 5.0F, new gfh(0.0F)), gff.a(0.0F, 24.0F, 0.0F));
      gfn $$9 = $$8.a(
         "wind_mid",
         gfi.c()
            .a(74, 28)
            .a(-6.0F, -6.0F, -6.0F, 12.0F, 6.0F, 12.0F, new gfh(0.0F))
            .a(78, 32)
            .a(-4.0F, -6.0F, -4.0F, 8.0F, 6.0F, 8.0F, new gfh(0.0F))
            .a(49, 71)
            .a(-2.5F, -6.0F, -2.5F, 5.0F, 6.0F, 5.0F, new gfh(0.0F)),
         gff.a(0.0F, -7.0F, 0.0F)
      );
      $$9.a(
         "wind_top",
         gfi.c()
            .a(0, 0)
            .a(-9.0F, -8.0F, -9.0F, 18.0F, 8.0F, 18.0F, new gfh(0.0F))
            .a(6, 6)
            .a(-6.0F, -8.0F, -6.0F, 12.0F, 8.0F, 12.0F, new gfh(0.0F))
            .a(105, 57)
            .a(-2.5F, -8.0F, -2.5F, 5.0F, 8.0F, 5.0F, new gfh(0.0F)),
         gff.a(0.0F, -6.0F, 0.0F)
      );
      return gfj.a($$2, $$0, $$1);
   }

   public void a(gxy $$0) {
      super.a($$0);
      this.a($$0.a, fmc.a, $$0.u);
      this.a($$0.b, fmc.b, $$0.u);
      this.a($$0.c, fmc.e, $$0.u);
      this.a($$0.d, fmc.f, $$0.u);
      this.a($$0.e, fmc.d, $$0.u);
      this.a($$0.f, fmc.c, $$0.u);
   }

   public gfd a() {
      return this.d;
   }

   public gfd b() {
      return this.e;
   }

   public gfd c() {
      return this.k;
   }

   public gfd d() {
      return this.f;
   }
}
