public class gfe extends gfy<hca> {
   private static final float a = 0.6F;
   private static final float b = 0.8F;
   private static final float c = 1.0F;
   private final gjc d;
   private final gjc e;
   private final gjc f;
   private final gjc g;
   private final gjc i;
   private final gjc j;
   private final gjc k;

   public gfe(gjc $$0) {
      super($$0, gqk::j);
      this.f = $$0.b("wind_body");
      this.j = this.f.b("wind_bottom");
      this.i = this.j.b("wind_mid");
      this.g = this.i.b("wind_top");
      this.d = $$0.b("body").b("head");
      this.e = this.d.b("eyes");
      this.k = $$0.b("body").b("rods");
   }

   public static gji a(int $$0, int $$1) {
      gjk $$2 = new gjk();
      gjm $$3 = $$2.a();
      gjm $$4 = $$3.a("body", gjh.c(), gje.a(0.0F, 0.0F, 0.0F));
      gjm $$5 = $$4.a("rods", gjh.c(), gje.a(0.0F, 8.0F, 0.0F));
      $$5.a("rod_1", gjh.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new gjg(0.0F)), gje.a(2.5981F, -3.0F, 1.5F, -2.7489F, -1.0472F, 3.1416F));
      $$5.a("rod_2", gjh.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new gjg(0.0F)), gje.a(-2.5981F, -3.0F, 1.5F, -2.7489F, 1.0472F, 3.1416F));
      $$5.a("rod_3", gjh.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new gjg(0.0F)), gje.a(0.0F, -3.0F, -3.0F, 0.3927F, 0.0F, 0.0F));
      gjm $$6 = $$4.a(
         "head",
         gjh.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new gjg(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new gjg(0.0F)),
         gje.a(0.0F, 4.0F, 0.0F)
      );
      $$6.a(
         "eyes",
         gjh.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new gjg(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new gjg(0.0F)),
         gje.a(0.0F, 0.0F, 0.0F)
      );
      gjm $$7 = $$3.a("wind_body", gjh.c(), gje.a(0.0F, 0.0F, 0.0F));
      gjm $$8 = $$7.a("wind_bottom", gjh.c().a(1, 83).a(-2.5F, -7.0F, -2.5F, 5.0F, 7.0F, 5.0F, new gjg(0.0F)), gje.a(0.0F, 24.0F, 0.0F));
      gjm $$9 = $$8.a(
         "wind_mid",
         gjh.c()
            .a(74, 28)
            .a(-6.0F, -6.0F, -6.0F, 12.0F, 6.0F, 12.0F, new gjg(0.0F))
            .a(78, 32)
            .a(-4.0F, -6.0F, -4.0F, 8.0F, 6.0F, 8.0F, new gjg(0.0F))
            .a(49, 71)
            .a(-2.5F, -6.0F, -2.5F, 5.0F, 6.0F, 5.0F, new gjg(0.0F)),
         gje.a(0.0F, -7.0F, 0.0F)
      );
      $$9.a(
         "wind_top",
         gjh.c()
            .a(0, 0)
            .a(-9.0F, -8.0F, -9.0F, 18.0F, 8.0F, 18.0F, new gjg(0.0F))
            .a(6, 6)
            .a(-6.0F, -8.0F, -6.0F, 12.0F, 8.0F, 12.0F, new gjg(0.0F))
            .a(105, 57)
            .a(-2.5F, -8.0F, -2.5F, 5.0F, 8.0F, 5.0F, new gjg(0.0F)),
         gje.a(0.0F, -6.0F, 0.0F)
      );
      return gji.a($$2, $$0, $$1);
   }

   public void a(hca $$0) {
      super.a($$0);
      this.a($$0.a, fps.a, $$0.u);
      this.a($$0.b, fps.b, $$0.u);
      this.a($$0.c, fps.e, $$0.u);
      this.a($$0.d, fps.f, $$0.u);
      this.a($$0.e, fps.d, $$0.u);
      this.a($$0.f, fps.c, $$0.u);
   }

   public gjc a() {
      return this.d;
   }

   public gjc b() {
      return this.e;
   }

   public gjc c() {
      return this.k;
   }

   public gjc d() {
      return this.f;
   }
}
