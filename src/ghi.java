public class ghi extends gic<hee> {
   private static final float a = 0.6F;
   private static final float b = 0.8F;
   private static final float c = 1.0F;
   private final glg d;
   private final glg e;
   private final glg f;
   private final glg g;
   private final glg i;
   private final glg j;
   private final glg k;

   public ghi(glg $$0) {
      super($$0, gsn::j);
      this.f = $$0.b("wind_body");
      this.j = this.f.b("wind_bottom");
      this.i = this.j.b("wind_mid");
      this.g = this.i.b("wind_top");
      this.d = $$0.b("body").b("head");
      this.e = this.d.b("eyes");
      this.k = $$0.b("body").b("rods");
   }

   public static glm a(int $$0, int $$1) {
      glo $$2 = new glo();
      glq $$3 = $$2.a();
      glq $$4 = $$3.a("body", gll.c(), gli.a(0.0F, 0.0F, 0.0F));
      glq $$5 = $$4.a("rods", gll.c(), gli.a(0.0F, 8.0F, 0.0F));
      $$5.a("rod_1", gll.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new glk(0.0F)), gli.a(2.5981F, -3.0F, 1.5F, -2.7489F, -1.0472F, 3.1416F));
      $$5.a("rod_2", gll.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new glk(0.0F)), gli.a(-2.5981F, -3.0F, 1.5F, -2.7489F, 1.0472F, 3.1416F));
      $$5.a("rod_3", gll.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new glk(0.0F)), gli.a(0.0F, -3.0F, -3.0F, 0.3927F, 0.0F, 0.0F));
      glq $$6 = $$4.a(
         "head",
         gll.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new glk(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new glk(0.0F)),
         gli.a(0.0F, 4.0F, 0.0F)
      );
      $$6.a(
         "eyes",
         gll.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new glk(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new glk(0.0F)),
         gli.a(0.0F, 0.0F, 0.0F)
      );
      glq $$7 = $$3.a("wind_body", gll.c(), gli.a(0.0F, 0.0F, 0.0F));
      glq $$8 = $$7.a("wind_bottom", gll.c().a(1, 83).a(-2.5F, -7.0F, -2.5F, 5.0F, 7.0F, 5.0F, new glk(0.0F)), gli.a(0.0F, 24.0F, 0.0F));
      glq $$9 = $$8.a(
         "wind_mid",
         gll.c()
            .a(74, 28)
            .a(-6.0F, -6.0F, -6.0F, 12.0F, 6.0F, 12.0F, new glk(0.0F))
            .a(78, 32)
            .a(-4.0F, -6.0F, -4.0F, 8.0F, 6.0F, 8.0F, new glk(0.0F))
            .a(49, 71)
            .a(-2.5F, -6.0F, -2.5F, 5.0F, 6.0F, 5.0F, new glk(0.0F)),
         gli.a(0.0F, -7.0F, 0.0F)
      );
      $$9.a(
         "wind_top",
         gll.c()
            .a(0, 0)
            .a(-9.0F, -8.0F, -9.0F, 18.0F, 8.0F, 18.0F, new glk(0.0F))
            .a(6, 6)
            .a(-6.0F, -8.0F, -6.0F, 12.0F, 8.0F, 12.0F, new glk(0.0F))
            .a(105, 57)
            .a(-2.5F, -8.0F, -2.5F, 5.0F, 8.0F, 5.0F, new glk(0.0F)),
         gli.a(0.0F, -6.0F, 0.0F)
      );
      return glm.a($$2, $$0, $$1);
   }

   public void a(hee $$0) {
      super.a($$0);
      this.a($$0.a, fry.a, $$0.u);
      this.a($$0.b, fry.b, $$0.u);
      this.a($$0.c, fry.e, $$0.u);
      this.a($$0.d, fry.f, $$0.u);
      this.a($$0.e, fry.d, $$0.u);
      this.a($$0.f, fry.c, $$0.u);
   }

   public glg a() {
      return this.d;
   }

   public glg b() {
      return this.e;
   }

   public glg c() {
      return this.k;
   }

   public glg d() {
      return this.f;
   }
}
