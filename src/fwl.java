public class fwl extends fxa<gsj> {
   private static final float a = 0.6F;
   private static final float b = 0.8F;
   private static final float c = 1.0F;
   private final gab d;
   private final gab e;
   private final gab f;
   private final gab g;
   private final gab i;
   private final gab j;
   private final gab k;
   private final gab l;

   public fwl(gab $$0) {
      super(ghe::j);
      this.d = $$0;
      this.g = $$0.b("wind_body");
      this.k = this.g.b("wind_bottom");
      this.j = this.k.b("wind_mid");
      this.i = this.j.b("wind_top");
      this.e = $$0.b("body").b("head");
      this.f = this.e.b("eyes");
      this.l = $$0.b("body").b("rods");
   }

   public static gah a(int $$0, int $$1) {
      gaj $$2 = new gaj();
      gal $$3 = $$2.a();
      gal $$4 = $$3.a("body", gag.c(), gad.a(0.0F, 0.0F, 0.0F));
      gal $$5 = $$4.a("rods", gag.c(), gad.a(0.0F, 8.0F, 0.0F));
      $$5.a("rod_1", gag.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new gaf(0.0F)), gad.a(2.5981F, -3.0F, 1.5F, -2.7489F, -1.0472F, 3.1416F));
      $$5.a("rod_2", gag.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new gaf(0.0F)), gad.a(-2.5981F, -3.0F, 1.5F, -2.7489F, 1.0472F, 3.1416F));
      $$5.a("rod_3", gag.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new gaf(0.0F)), gad.a(0.0F, -3.0F, -3.0F, 0.3927F, 0.0F, 0.0F));
      gal $$6 = $$4.a(
         "head",
         gag.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new gaf(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new gaf(0.0F)),
         gad.a(0.0F, 4.0F, 0.0F)
      );
      $$6.a(
         "eyes",
         gag.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new gaf(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new gaf(0.0F)),
         gad.a(0.0F, 0.0F, 0.0F)
      );
      gal $$7 = $$3.a("wind_body", gag.c(), gad.a(0.0F, 0.0F, 0.0F));
      gal $$8 = $$7.a("wind_bottom", gag.c().a(1, 83).a(-2.5F, -7.0F, -2.5F, 5.0F, 7.0F, 5.0F, new gaf(0.0F)), gad.a(0.0F, 24.0F, 0.0F));
      gal $$9 = $$8.a(
         "wind_mid",
         gag.c()
            .a(74, 28)
            .a(-6.0F, -6.0F, -6.0F, 12.0F, 6.0F, 12.0F, new gaf(0.0F))
            .a(78, 32)
            .a(-4.0F, -6.0F, -4.0F, 8.0F, 6.0F, 8.0F, new gaf(0.0F))
            .a(49, 71)
            .a(-2.5F, -6.0F, -2.5F, 5.0F, 6.0F, 5.0F, new gaf(0.0F)),
         gad.a(0.0F, -7.0F, 0.0F)
      );
      $$9.a(
         "wind_top",
         gag.c()
            .a(0, 0)
            .a(-9.0F, -8.0F, -9.0F, 18.0F, 8.0F, 18.0F, new gaf(0.0F))
            .a(6, 6)
            .a(-6.0F, -8.0F, -6.0F, 12.0F, 8.0F, 12.0F, new gaf(0.0F))
            .a(105, 57)
            .a(-2.5F, -8.0F, -2.5F, 5.0F, 8.0F, 5.0F, new gaf(0.0F)),
         gad.a(0.0F, -6.0F, 0.0F)
      );
      return gah.a($$2, $$0, $$1);
   }

   public void a(gsj $$0) {
      this.a().e().forEach(gab::c);
      float $$1 = $$0.p * (float) Math.PI * -0.1F;
      this.i.b = azc.b($$1) * 1.0F * 0.6F;
      this.i.d = azc.a($$1) * 1.0F * 0.6F;
      this.j.b = azc.a($$1) * 0.5F * 0.8F;
      this.j.d = azc.b($$1) * 0.8F;
      this.k.b = azc.b($$1) * -0.25F * 1.0F;
      this.k.d = azc.a($$1) * -0.25F * 1.0F;
      this.e.c = 4.0F + azc.b($$1) / 4.0F;
      this.l.f = $$0.p * (float) Math.PI * 0.1F;
      this.a($$0.a, fiv.a, $$0.p);
      this.a($$0.b, fiv.d, $$0.p);
      this.a($$0.c, fiv.e, $$0.p);
      this.a($$0.d, fiv.c, $$0.p);
      this.a($$0.e, fiv.b, $$0.p);
   }

   @Override
   public gab a() {
      return this.d;
   }

   public gab b() {
      return this.e;
   }

   public gab c() {
      return this.f;
   }

   public gab d() {
      return this.l;
   }

   public gab e() {
      return this.g;
   }
}
