public class fur<T extends ckz> extends fvr<T> {
   private static final float a = 0.6F;
   private static final float b = 0.8F;
   private static final float f = 1.0F;
   private final fyi g;
   private final fyi h;
   private final fyi i;
   private final fyi j;
   private final fyi k;
   private final fyi l;
   private final fyi m;
   private final fyi n;

   public fur(fyi $$0) {
      super(gff::i);
      this.g = $$0;
      this.j = $$0.b("wind_body");
      this.m = this.j.b("wind_bottom");
      this.l = this.m.b("wind_mid");
      this.k = this.l.b("wind_top");
      this.h = $$0.b("body").b("head");
      this.i = this.h.b("eyes");
      this.n = $$0.b("body").b("rods");
   }

   public static fyo a(int $$0, int $$1) {
      fyq $$2 = new fyq();
      fyr $$3 = $$2.a();
      fyr $$4 = $$3.a("body", fyn.c(), fyk.a(0.0F, 0.0F, 0.0F));
      fyr $$5 = $$4.a("rods", fyn.c(), fyk.a(0.0F, 8.0F, 0.0F));
      $$5.a("rod_1", fyn.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fym(0.0F)), fyk.a(2.5981F, -3.0F, 1.5F, -2.7489F, -1.0472F, 3.1416F));
      $$5.a("rod_2", fyn.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fym(0.0F)), fyk.a(-2.5981F, -3.0F, 1.5F, -2.7489F, 1.0472F, 3.1416F));
      $$5.a("rod_3", fyn.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fym(0.0F)), fyk.a(0.0F, -3.0F, -3.0F, 0.3927F, 0.0F, 0.0F));
      fyr $$6 = $$4.a(
         "head",
         fyn.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new fym(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fym(0.0F)),
         fyk.a(0.0F, 4.0F, 0.0F)
      );
      $$6.a(
         "eyes",
         fyn.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new fym(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fym(0.0F)),
         fyk.a(0.0F, 0.0F, 0.0F)
      );
      fyr $$7 = $$3.a("wind_body", fyn.c(), fyk.a(0.0F, 0.0F, 0.0F));
      fyr $$8 = $$7.a("wind_bottom", fyn.c().a(1, 83).a(-2.5F, -7.0F, -2.5F, 5.0F, 7.0F, 5.0F, new fym(0.0F)), fyk.a(0.0F, 24.0F, 0.0F));
      fyr $$9 = $$8.a(
         "wind_mid",
         fyn.c()
            .a(74, 28)
            .a(-6.0F, -6.0F, -6.0F, 12.0F, 6.0F, 12.0F, new fym(0.0F))
            .a(78, 32)
            .a(-4.0F, -6.0F, -4.0F, 8.0F, 6.0F, 8.0F, new fym(0.0F))
            .a(49, 71)
            .a(-2.5F, -6.0F, -2.5F, 5.0F, 6.0F, 5.0F, new fym(0.0F)),
         fyk.a(0.0F, -7.0F, 0.0F)
      );
      $$9.a(
         "wind_top",
         fyn.c()
            .a(0, 0)
            .a(-9.0F, -8.0F, -9.0F, 18.0F, 8.0F, 18.0F, new fym(0.0F))
            .a(6, 6)
            .a(-6.0F, -8.0F, -6.0F, 12.0F, 8.0F, 12.0F, new fym(0.0F))
            .a(105, 57)
            .a(-2.5F, -8.0F, -2.5F, 5.0F, 8.0F, 5.0F, new fym(0.0F)),
         fyk.a(0.0F, -6.0F, 0.0F)
      );
      return fyo.a($$2, $$0, $$1);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fyi::c);
      float $$6 = $$3 * (float) Math.PI * -0.1F;
      this.k.b = ayo.b($$6) * 1.0F * 0.6F;
      this.k.d = ayo.a($$6) * 1.0F * 0.6F;
      this.l.b = ayo.a($$6) * 0.5F * 0.8F;
      this.l.d = ayo.b($$6) * 0.8F;
      this.m.b = ayo.b($$6) * -0.25F * 1.0F;
      this.m.d = ayo.a($$6) * -0.25F * 1.0F;
      this.h.c = 4.0F + ayo.b($$6) / 4.0F;
      this.n.f = $$3 * (float) Math.PI * 0.1F;
      this.a($$0.ca, fhg.a, $$3);
      this.a($$0.c, fhg.c, $$3);
      this.a($$0.d, fhg.d, $$3);
      this.a($$0.e, fhg.b, $$3);
   }

   @Override
   public fyi a() {
      return this.g;
   }

   public fyi b() {
      return this.h;
   }

   public fyi c() {
      return this.i;
   }

   public fyi d() {
      return this.n;
   }

   public fyi e() {
      return this.j;
   }
}
