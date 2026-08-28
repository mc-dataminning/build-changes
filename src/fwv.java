public class fwv extends fxk<gta> {
   private static final float a = 0.6F;
   private static final float b = 0.8F;
   private static final float c = 1.0F;
   private final gal d;
   private final gal e;
   private final gal f;
   private final gal g;
   private final gal i;
   private final gal j;
   private final gal k;
   private final gal l;

   public fwv(gal $$0) {
      super(ghq::i);
      this.d = $$0;
      this.g = $$0.b("wind_body");
      this.k = this.g.b("wind_bottom");
      this.j = this.k.b("wind_mid");
      this.i = this.j.b("wind_top");
      this.e = $$0.b("body").b("head");
      this.f = this.e.b("eyes");
      this.l = $$0.b("body").b("rods");
   }

   public static gar a(int $$0, int $$1) {
      gat $$2 = new gat();
      gav $$3 = $$2.a();
      gav $$4 = $$3.a("body", gaq.c(), gan.a(0.0F, 0.0F, 0.0F));
      gav $$5 = $$4.a("rods", gaq.c(), gan.a(0.0F, 8.0F, 0.0F));
      $$5.a("rod_1", gaq.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new gap(0.0F)), gan.a(2.5981F, -3.0F, 1.5F, -2.7489F, -1.0472F, 3.1416F));
      $$5.a("rod_2", gaq.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new gap(0.0F)), gan.a(-2.5981F, -3.0F, 1.5F, -2.7489F, 1.0472F, 3.1416F));
      $$5.a("rod_3", gaq.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new gap(0.0F)), gan.a(0.0F, -3.0F, -3.0F, 0.3927F, 0.0F, 0.0F));
      gav $$6 = $$4.a(
         "head",
         gaq.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new gap(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new gap(0.0F)),
         gan.a(0.0F, 4.0F, 0.0F)
      );
      $$6.a(
         "eyes",
         gaq.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new gap(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new gap(0.0F)),
         gan.a(0.0F, 0.0F, 0.0F)
      );
      gav $$7 = $$3.a("wind_body", gaq.c(), gan.a(0.0F, 0.0F, 0.0F));
      gav $$8 = $$7.a("wind_bottom", gaq.c().a(1, 83).a(-2.5F, -7.0F, -2.5F, 5.0F, 7.0F, 5.0F, new gap(0.0F)), gan.a(0.0F, 24.0F, 0.0F));
      gav $$9 = $$8.a(
         "wind_mid",
         gaq.c()
            .a(74, 28)
            .a(-6.0F, -6.0F, -6.0F, 12.0F, 6.0F, 12.0F, new gap(0.0F))
            .a(78, 32)
            .a(-4.0F, -6.0F, -4.0F, 8.0F, 6.0F, 8.0F, new gap(0.0F))
            .a(49, 71)
            .a(-2.5F, -6.0F, -2.5F, 5.0F, 6.0F, 5.0F, new gap(0.0F)),
         gan.a(0.0F, -7.0F, 0.0F)
      );
      $$9.a(
         "wind_top",
         gaq.c()
            .a(0, 0)
            .a(-9.0F, -8.0F, -9.0F, 18.0F, 8.0F, 18.0F, new gap(0.0F))
            .a(6, 6)
            .a(-6.0F, -8.0F, -6.0F, 12.0F, 8.0F, 12.0F, new gap(0.0F))
            .a(105, 57)
            .a(-2.5F, -8.0F, -2.5F, 5.0F, 8.0F, 5.0F, new gap(0.0F)),
         gan.a(0.0F, -6.0F, 0.0F)
      );
      return gar.a($$2, $$0, $$1);
   }

   public void a(gta $$0) {
      this.a().e().forEach(gal::c);
      float $$1 = $$0.p * (float) Math.PI * -0.1F;
      this.i.b = azd.b($$1) * 1.0F * 0.6F;
      this.i.d = azd.a($$1) * 1.0F * 0.6F;
      this.j.b = azd.a($$1) * 0.5F * 0.8F;
      this.j.d = azd.b($$1) * 0.8F;
      this.k.b = azd.b($$1) * -0.25F * 1.0F;
      this.k.d = azd.a($$1) * -0.25F * 1.0F;
      this.e.c = 4.0F + azd.b($$1) / 4.0F;
      this.l.f = $$0.p * (float) Math.PI * 0.1F;
      this.a($$0.a, fjf.a, $$0.p);
      this.a($$0.b, fjf.d, $$0.p);
      this.a($$0.c, fjf.e, $$0.p);
      this.a($$0.d, fjf.c, $$0.p);
      this.a($$0.e, fjf.b, $$0.p);
   }

   @Override
   public gal a() {
      return this.d;
   }

   public gal b() {
      return this.e;
   }

   public gal c() {
      return this.f;
   }

   public gal d() {
      return this.l;
   }

   public gal e() {
      return this.g;
   }
}
