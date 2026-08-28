public class ghg extends gia<hec> {
   private static final float a = 0.6F;
   private static final float b = 0.8F;
   private static final float c = 1.0F;
   private final gle d;
   private final gle e;
   private final gle f;
   private final gle g;
   private final gle i;
   private final gle j;
   private final gle k;

   public ghg(gle $$0) {
      super($$0, gsl::j);
      this.f = $$0.b("wind_body");
      this.j = this.f.b("wind_bottom");
      this.i = this.j.b("wind_mid");
      this.g = this.i.b("wind_top");
      this.d = $$0.b("body").b("head");
      this.e = this.d.b("eyes");
      this.k = $$0.b("body").b("rods");
   }

   public static glk a(int $$0, int $$1) {
      glm $$2 = new glm();
      glo $$3 = $$2.a();
      glo $$4 = $$3.a("body", glj.c(), glg.a(0.0F, 0.0F, 0.0F));
      glo $$5 = $$4.a("rods", glj.c(), glg.a(0.0F, 8.0F, 0.0F));
      $$5.a("rod_1", glj.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new gli(0.0F)), glg.a(2.5981F, -3.0F, 1.5F, -2.7489F, -1.0472F, 3.1416F));
      $$5.a("rod_2", glj.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new gli(0.0F)), glg.a(-2.5981F, -3.0F, 1.5F, -2.7489F, 1.0472F, 3.1416F));
      $$5.a("rod_3", glj.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new gli(0.0F)), glg.a(0.0F, -3.0F, -3.0F, 0.3927F, 0.0F, 0.0F));
      glo $$6 = $$4.a(
         "head",
         glj.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new gli(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new gli(0.0F)),
         glg.a(0.0F, 4.0F, 0.0F)
      );
      $$6.a(
         "eyes",
         glj.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new gli(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new gli(0.0F)),
         glg.a(0.0F, 0.0F, 0.0F)
      );
      glo $$7 = $$3.a("wind_body", glj.c(), glg.a(0.0F, 0.0F, 0.0F));
      glo $$8 = $$7.a("wind_bottom", glj.c().a(1, 83).a(-2.5F, -7.0F, -2.5F, 5.0F, 7.0F, 5.0F, new gli(0.0F)), glg.a(0.0F, 24.0F, 0.0F));
      glo $$9 = $$8.a(
         "wind_mid",
         glj.c()
            .a(74, 28)
            .a(-6.0F, -6.0F, -6.0F, 12.0F, 6.0F, 12.0F, new gli(0.0F))
            .a(78, 32)
            .a(-4.0F, -6.0F, -4.0F, 8.0F, 6.0F, 8.0F, new gli(0.0F))
            .a(49, 71)
            .a(-2.5F, -6.0F, -2.5F, 5.0F, 6.0F, 5.0F, new gli(0.0F)),
         glg.a(0.0F, -7.0F, 0.0F)
      );
      $$9.a(
         "wind_top",
         glj.c()
            .a(0, 0)
            .a(-9.0F, -8.0F, -9.0F, 18.0F, 8.0F, 18.0F, new gli(0.0F))
            .a(6, 6)
            .a(-6.0F, -8.0F, -6.0F, 12.0F, 8.0F, 12.0F, new gli(0.0F))
            .a(105, 57)
            .a(-2.5F, -8.0F, -2.5F, 5.0F, 8.0F, 5.0F, new gli(0.0F)),
         glg.a(0.0F, -6.0F, 0.0F)
      );
      return glk.a($$2, $$0, $$1);
   }

   public void a(hec $$0) {
      super.a($$0);
      this.a($$0.a, frw.a, $$0.u);
      this.a($$0.b, frw.b, $$0.u);
      this.a($$0.c, frw.e, $$0.u);
      this.a($$0.d, frw.f, $$0.u);
      this.a($$0.e, frw.d, $$0.u);
      this.a($$0.f, frw.c, $$0.u);
   }

   public gle a() {
      return this.d;
   }

   public gle b() {
      return this.e;
   }

   public gle c() {
      return this.k;
   }

   public gle d() {
      return this.f;
   }
}
