public class gel extends gfd<hbd> {
   private static final float a = 0.6F;
   private static final float b = 0.8F;
   private static final float c = 1.0F;
   private final gig d;
   private final gig e;
   private final gig f;
   private final gig g;
   private final gig i;
   private final gig j;
   private final gig k;

   public gel(gig $$0) {
      super($$0, gpn::j);
      this.f = $$0.b("wind_body");
      this.j = this.f.b("wind_bottom");
      this.i = this.j.b("wind_mid");
      this.g = this.i.b("wind_top");
      this.d = $$0.b("body").b("head");
      this.e = this.d.b("eyes");
      this.k = $$0.b("body").b("rods");
   }

   public static gim a(int $$0, int $$1) {
      gio $$2 = new gio();
      giq $$3 = $$2.a();
      giq $$4 = $$3.a("body", gil.c(), gii.a(0.0F, 0.0F, 0.0F));
      giq $$5 = $$4.a("rods", gil.c(), gii.a(0.0F, 8.0F, 0.0F));
      $$5.a("rod_1", gil.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new gik(0.0F)), gii.a(2.5981F, -3.0F, 1.5F, -2.7489F, -1.0472F, 3.1416F));
      $$5.a("rod_2", gil.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new gik(0.0F)), gii.a(-2.5981F, -3.0F, 1.5F, -2.7489F, 1.0472F, 3.1416F));
      $$5.a("rod_3", gil.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new gik(0.0F)), gii.a(0.0F, -3.0F, -3.0F, 0.3927F, 0.0F, 0.0F));
      giq $$6 = $$4.a(
         "head",
         gil.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new gik(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new gik(0.0F)),
         gii.a(0.0F, 4.0F, 0.0F)
      );
      $$6.a(
         "eyes",
         gil.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new gik(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new gik(0.0F)),
         gii.a(0.0F, 0.0F, 0.0F)
      );
      giq $$7 = $$3.a("wind_body", gil.c(), gii.a(0.0F, 0.0F, 0.0F));
      giq $$8 = $$7.a("wind_bottom", gil.c().a(1, 83).a(-2.5F, -7.0F, -2.5F, 5.0F, 7.0F, 5.0F, new gik(0.0F)), gii.a(0.0F, 24.0F, 0.0F));
      giq $$9 = $$8.a(
         "wind_mid",
         gil.c()
            .a(74, 28)
            .a(-6.0F, -6.0F, -6.0F, 12.0F, 6.0F, 12.0F, new gik(0.0F))
            .a(78, 32)
            .a(-4.0F, -6.0F, -4.0F, 8.0F, 6.0F, 8.0F, new gik(0.0F))
            .a(49, 71)
            .a(-2.5F, -6.0F, -2.5F, 5.0F, 6.0F, 5.0F, new gik(0.0F)),
         gii.a(0.0F, -7.0F, 0.0F)
      );
      $$9.a(
         "wind_top",
         gil.c()
            .a(0, 0)
            .a(-9.0F, -8.0F, -9.0F, 18.0F, 8.0F, 18.0F, new gik(0.0F))
            .a(6, 6)
            .a(-6.0F, -8.0F, -6.0F, 12.0F, 8.0F, 12.0F, new gik(0.0F))
            .a(105, 57)
            .a(-2.5F, -8.0F, -2.5F, 5.0F, 8.0F, 5.0F, new gik(0.0F)),
         gii.a(0.0F, -6.0F, 0.0F)
      );
      return gim.a($$2, $$0, $$1);
   }

   public void a(hbd $$0) {
      super.a($$0);
      this.a($$0.a, foz.a, $$0.u);
      this.a($$0.b, foz.b, $$0.u);
      this.a($$0.c, foz.e, $$0.u);
      this.a($$0.d, foz.f, $$0.u);
      this.a($$0.e, foz.d, $$0.u);
      this.a($$0.f, foz.c, $$0.u);
   }

   public gig a() {
      return this.d;
   }

   public gig b() {
      return this.e;
   }

   public gig c() {
      return this.k;
   }

   public gig d() {
      return this.f;
   }
}
