public class gex extends gfq<hbs> {
   private static final float a = 0.6F;
   private static final float b = 0.8F;
   private static final float c = 1.0F;
   private final giu d;
   private final giu e;
   private final giu f;
   private final giu g;
   private final giu i;
   private final giu j;
   private final giu k;

   public gex(giu $$0) {
      super($$0, gqc::j);
      this.f = $$0.b("wind_body");
      this.j = this.f.b("wind_bottom");
      this.i = this.j.b("wind_mid");
      this.g = this.i.b("wind_top");
      this.d = $$0.b("body").b("head");
      this.e = this.d.b("eyes");
      this.k = $$0.b("body").b("rods");
   }

   public static gja a(int $$0, int $$1) {
      gjc $$2 = new gjc();
      gje $$3 = $$2.a();
      gje $$4 = $$3.a("body", giz.c(), giw.a(0.0F, 0.0F, 0.0F));
      gje $$5 = $$4.a("rods", giz.c(), giw.a(0.0F, 8.0F, 0.0F));
      $$5.a("rod_1", giz.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new giy(0.0F)), giw.a(2.5981F, -3.0F, 1.5F, -2.7489F, -1.0472F, 3.1416F));
      $$5.a("rod_2", giz.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new giy(0.0F)), giw.a(-2.5981F, -3.0F, 1.5F, -2.7489F, 1.0472F, 3.1416F));
      $$5.a("rod_3", giz.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new giy(0.0F)), giw.a(0.0F, -3.0F, -3.0F, 0.3927F, 0.0F, 0.0F));
      gje $$6 = $$4.a(
         "head",
         giz.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new giy(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new giy(0.0F)),
         giw.a(0.0F, 4.0F, 0.0F)
      );
      $$6.a(
         "eyes",
         giz.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new giy(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new giy(0.0F)),
         giw.a(0.0F, 0.0F, 0.0F)
      );
      gje $$7 = $$3.a("wind_body", giz.c(), giw.a(0.0F, 0.0F, 0.0F));
      gje $$8 = $$7.a("wind_bottom", giz.c().a(1, 83).a(-2.5F, -7.0F, -2.5F, 5.0F, 7.0F, 5.0F, new giy(0.0F)), giw.a(0.0F, 24.0F, 0.0F));
      gje $$9 = $$8.a(
         "wind_mid",
         giz.c()
            .a(74, 28)
            .a(-6.0F, -6.0F, -6.0F, 12.0F, 6.0F, 12.0F, new giy(0.0F))
            .a(78, 32)
            .a(-4.0F, -6.0F, -4.0F, 8.0F, 6.0F, 8.0F, new giy(0.0F))
            .a(49, 71)
            .a(-2.5F, -6.0F, -2.5F, 5.0F, 6.0F, 5.0F, new giy(0.0F)),
         giw.a(0.0F, -7.0F, 0.0F)
      );
      $$9.a(
         "wind_top",
         giz.c()
            .a(0, 0)
            .a(-9.0F, -8.0F, -9.0F, 18.0F, 8.0F, 18.0F, new giy(0.0F))
            .a(6, 6)
            .a(-6.0F, -8.0F, -6.0F, 12.0F, 8.0F, 12.0F, new giy(0.0F))
            .a(105, 57)
            .a(-2.5F, -8.0F, -2.5F, 5.0F, 8.0F, 5.0F, new giy(0.0F)),
         giw.a(0.0F, -6.0F, 0.0F)
      );
      return gja.a($$2, $$0, $$1);
   }

   public void a(hbs $$0) {
      super.a($$0);
      this.a($$0.a, fpl.a, $$0.u);
      this.a($$0.b, fpl.b, $$0.u);
      this.a($$0.c, fpl.e, $$0.u);
      this.a($$0.d, fpl.f, $$0.u);
      this.a($$0.e, fpl.d, $$0.u);
      this.a($$0.f, fpl.c, $$0.u);
   }

   public giu a() {
      return this.d;
   }

   public giu b() {
      return this.e;
   }

   public giu c() {
      return this.k;
   }

   public giu d() {
      return this.f;
   }
}
