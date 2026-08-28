public class fxk extends fxz<gtr> {
   private static final float a = 0.6F;
   private static final float b = 0.8F;
   private static final float c = 1.0F;
   private final gbb d;
   private final gbb e;
   private final gbb f;
   private final gbb g;
   private final gbb i;
   private final gbb j;
   private final gbb k;

   public fxk(gbb $$0) {
      super($$0, gig::i);
      this.f = $$0.b("wind_body");
      this.j = this.f.b("wind_bottom");
      this.i = this.j.b("wind_mid");
      this.g = this.i.b("wind_top");
      this.d = $$0.b("body").b("head");
      this.e = this.d.b("eyes");
      this.k = $$0.b("body").b("rods");
   }

   public static gbh a(int $$0, int $$1) {
      gbj $$2 = new gbj();
      gbl $$3 = $$2.a();
      gbl $$4 = $$3.a("body", gbg.c(), gbd.a(0.0F, 0.0F, 0.0F));
      gbl $$5 = $$4.a("rods", gbg.c(), gbd.a(0.0F, 8.0F, 0.0F));
      $$5.a("rod_1", gbg.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new gbf(0.0F)), gbd.a(2.5981F, -3.0F, 1.5F, -2.7489F, -1.0472F, 3.1416F));
      $$5.a("rod_2", gbg.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new gbf(0.0F)), gbd.a(-2.5981F, -3.0F, 1.5F, -2.7489F, 1.0472F, 3.1416F));
      $$5.a("rod_3", gbg.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new gbf(0.0F)), gbd.a(0.0F, -3.0F, -3.0F, 0.3927F, 0.0F, 0.0F));
      gbl $$6 = $$4.a(
         "head",
         gbg.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new gbf(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new gbf(0.0F)),
         gbd.a(0.0F, 4.0F, 0.0F)
      );
      $$6.a(
         "eyes",
         gbg.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new gbf(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new gbf(0.0F)),
         gbd.a(0.0F, 0.0F, 0.0F)
      );
      gbl $$7 = $$3.a("wind_body", gbg.c(), gbd.a(0.0F, 0.0F, 0.0F));
      gbl $$8 = $$7.a("wind_bottom", gbg.c().a(1, 83).a(-2.5F, -7.0F, -2.5F, 5.0F, 7.0F, 5.0F, new gbf(0.0F)), gbd.a(0.0F, 24.0F, 0.0F));
      gbl $$9 = $$8.a(
         "wind_mid",
         gbg.c()
            .a(74, 28)
            .a(-6.0F, -6.0F, -6.0F, 12.0F, 6.0F, 12.0F, new gbf(0.0F))
            .a(78, 32)
            .a(-4.0F, -6.0F, -4.0F, 8.0F, 6.0F, 8.0F, new gbf(0.0F))
            .a(49, 71)
            .a(-2.5F, -6.0F, -2.5F, 5.0F, 6.0F, 5.0F, new gbf(0.0F)),
         gbd.a(0.0F, -7.0F, 0.0F)
      );
      $$9.a(
         "wind_top",
         gbg.c()
            .a(0, 0)
            .a(-9.0F, -8.0F, -9.0F, 18.0F, 8.0F, 18.0F, new gbf(0.0F))
            .a(6, 6)
            .a(-6.0F, -8.0F, -6.0F, 12.0F, 8.0F, 12.0F, new gbf(0.0F))
            .a(105, 57)
            .a(-2.5F, -8.0F, -2.5F, 5.0F, 8.0F, 5.0F, new gbf(0.0F)),
         gbd.a(0.0F, -6.0F, 0.0F)
      );
      return gbh.a($$2, $$0, $$1);
   }

   public void a(gtr $$0) {
      super.a($$0);
      float $$1 = $$0.p * (float) Math.PI * -0.1F;
      this.g.b = azj.b($$1) * 1.0F * 0.6F;
      this.g.d = azj.a($$1) * 1.0F * 0.6F;
      this.i.b = azj.a($$1) * 0.5F * 0.8F;
      this.i.d = azj.b($$1) * 0.8F;
      this.j.b = azj.b($$1) * -0.25F * 1.0F;
      this.j.d = azj.a($$1) * -0.25F * 1.0F;
      this.d.c = 4.0F + azj.b($$1) / 4.0F;
      this.k.f = $$0.p * (float) Math.PI * 0.1F;
      this.a($$0.a, fju.a, $$0.p);
      this.a($$0.b, fju.d, $$0.p);
      this.a($$0.c, fju.e, $$0.p);
      this.a($$0.d, fju.c, $$0.p);
      this.a($$0.e, fju.b, $$0.p);
   }

   public gbb a() {
      return this.d;
   }

   public gbb b() {
      return this.e;
   }

   public gbb c() {
      return this.k;
   }

   public gbb d() {
      return this.f;
   }
}
