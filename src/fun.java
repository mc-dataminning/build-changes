public class fun<T extends ckx> extends fvn<T> {
   private static final float a = 0.6F;
   private static final float b = 0.8F;
   private static final float f = 1.0F;
   private final fye g;
   private final fye h;
   private final fye i;
   private final fye j;
   private final fye k;
   private final fye l;
   private final fye m;
   private final fye n;

   public fun(fye $$0) {
      super(gfb::i);
      this.g = $$0;
      this.j = $$0.b("wind_body");
      this.m = this.j.b("wind_bottom");
      this.l = this.m.b("wind_mid");
      this.k = this.l.b("wind_top");
      this.h = $$0.b("body").b("head");
      this.i = this.h.b("eyes");
      this.n = $$0.b("body").b("rods");
   }

   public static fyk a(int $$0, int $$1) {
      fym $$2 = new fym();
      fyn $$3 = $$2.a();
      fyn $$4 = $$3.a("body", fyj.c(), fyg.a(0.0F, 0.0F, 0.0F));
      fyn $$5 = $$4.a("rods", fyj.c(), fyg.a(0.0F, 8.0F, 0.0F));
      $$5.a("rod_1", fyj.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fyi(0.0F)), fyg.a(2.5981F, -3.0F, 1.5F, -2.7489F, -1.0472F, 3.1416F));
      $$5.a("rod_2", fyj.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fyi(0.0F)), fyg.a(-2.5981F, -3.0F, 1.5F, -2.7489F, 1.0472F, 3.1416F));
      $$5.a("rod_3", fyj.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fyi(0.0F)), fyg.a(0.0F, -3.0F, -3.0F, 0.3927F, 0.0F, 0.0F));
      fyn $$6 = $$4.a(
         "head",
         fyj.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new fyi(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fyi(0.0F)),
         fyg.a(0.0F, 4.0F, 0.0F)
      );
      $$6.a(
         "eyes",
         fyj.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new fyi(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fyi(0.0F)),
         fyg.a(0.0F, 0.0F, 0.0F)
      );
      fyn $$7 = $$3.a("wind_body", fyj.c(), fyg.a(0.0F, 0.0F, 0.0F));
      fyn $$8 = $$7.a("wind_bottom", fyj.c().a(1, 83).a(-2.5F, -7.0F, -2.5F, 5.0F, 7.0F, 5.0F, new fyi(0.0F)), fyg.a(0.0F, 24.0F, 0.0F));
      fyn $$9 = $$8.a(
         "wind_mid",
         fyj.c()
            .a(74, 28)
            .a(-6.0F, -6.0F, -6.0F, 12.0F, 6.0F, 12.0F, new fyi(0.0F))
            .a(78, 32)
            .a(-4.0F, -6.0F, -4.0F, 8.0F, 6.0F, 8.0F, new fyi(0.0F))
            .a(49, 71)
            .a(-2.5F, -6.0F, -2.5F, 5.0F, 6.0F, 5.0F, new fyi(0.0F)),
         fyg.a(0.0F, -7.0F, 0.0F)
      );
      $$9.a(
         "wind_top",
         fyj.c()
            .a(0, 0)
            .a(-9.0F, -8.0F, -9.0F, 18.0F, 8.0F, 18.0F, new fyi(0.0F))
            .a(6, 6)
            .a(-6.0F, -8.0F, -6.0F, 12.0F, 8.0F, 12.0F, new fyi(0.0F))
            .a(105, 57)
            .a(-2.5F, -8.0F, -2.5F, 5.0F, 8.0F, 5.0F, new fyi(0.0F)),
         fyg.a(0.0F, -6.0F, 0.0F)
      );
      return fyk.a($$2, $$0, $$1);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fye::c);
      float $$6 = $$3 * (float) Math.PI * -0.1F;
      this.k.b = ayn.b($$6) * 1.0F * 0.6F;
      this.k.d = ayn.a($$6) * 1.0F * 0.6F;
      this.l.b = ayn.a($$6) * 0.5F * 0.8F;
      this.l.d = ayn.b($$6) * 0.8F;
      this.m.b = ayn.b($$6) * -0.25F * 1.0F;
      this.m.d = ayn.a($$6) * -0.25F * 1.0F;
      this.h.c = 4.0F + ayn.b($$6) / 4.0F;
      this.n.f = $$3 * (float) Math.PI * 0.1F;
      this.a($$0.ca, fhc.a, $$3);
      this.a($$0.c, fhc.c, $$3);
      this.a($$0.d, fhc.d, $$3);
      this.a($$0.e, fhc.b, $$3);
   }

   @Override
   public fye a() {
      return this.g;
   }

   public fye b() {
      return this.h;
   }

   public fye c() {
      return this.i;
   }

   public fye d() {
      return this.n;
   }

   public fye e() {
      return this.j;
   }
}
