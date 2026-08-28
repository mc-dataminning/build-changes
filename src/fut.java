public class fut<T extends ckz> extends fvt<T> {
   private static final float a = 0.6F;
   private static final float b = 0.8F;
   private static final float f = 1.0F;
   private final fyk g;
   private final fyk h;
   private final fyk i;
   private final fyk j;
   private final fyk k;
   private final fyk l;
   private final fyk m;
   private final fyk n;

   public fut(fyk $$0) {
      super(gfh::i);
      this.g = $$0;
      this.j = $$0.b("wind_body");
      this.m = this.j.b("wind_bottom");
      this.l = this.m.b("wind_mid");
      this.k = this.l.b("wind_top");
      this.h = $$0.b("body").b("head");
      this.i = this.h.b("eyes");
      this.n = $$0.b("body").b("rods");
   }

   public static fyq a(int $$0, int $$1) {
      fys $$2 = new fys();
      fyt $$3 = $$2.a();
      fyt $$4 = $$3.a("body", fyp.c(), fym.a(0.0F, 0.0F, 0.0F));
      fyt $$5 = $$4.a("rods", fyp.c(), fym.a(0.0F, 8.0F, 0.0F));
      $$5.a("rod_1", fyp.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fyo(0.0F)), fym.a(2.5981F, -3.0F, 1.5F, -2.7489F, -1.0472F, 3.1416F));
      $$5.a("rod_2", fyp.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fyo(0.0F)), fym.a(-2.5981F, -3.0F, 1.5F, -2.7489F, 1.0472F, 3.1416F));
      $$5.a("rod_3", fyp.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fyo(0.0F)), fym.a(0.0F, -3.0F, -3.0F, 0.3927F, 0.0F, 0.0F));
      fyt $$6 = $$4.a(
         "head",
         fyp.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new fyo(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fyo(0.0F)),
         fym.a(0.0F, 4.0F, 0.0F)
      );
      $$6.a(
         "eyes",
         fyp.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new fyo(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fyo(0.0F)),
         fym.a(0.0F, 0.0F, 0.0F)
      );
      fyt $$7 = $$3.a("wind_body", fyp.c(), fym.a(0.0F, 0.0F, 0.0F));
      fyt $$8 = $$7.a("wind_bottom", fyp.c().a(1, 83).a(-2.5F, -7.0F, -2.5F, 5.0F, 7.0F, 5.0F, new fyo(0.0F)), fym.a(0.0F, 24.0F, 0.0F));
      fyt $$9 = $$8.a(
         "wind_mid",
         fyp.c()
            .a(74, 28)
            .a(-6.0F, -6.0F, -6.0F, 12.0F, 6.0F, 12.0F, new fyo(0.0F))
            .a(78, 32)
            .a(-4.0F, -6.0F, -4.0F, 8.0F, 6.0F, 8.0F, new fyo(0.0F))
            .a(49, 71)
            .a(-2.5F, -6.0F, -2.5F, 5.0F, 6.0F, 5.0F, new fyo(0.0F)),
         fym.a(0.0F, -7.0F, 0.0F)
      );
      $$9.a(
         "wind_top",
         fyp.c()
            .a(0, 0)
            .a(-9.0F, -8.0F, -9.0F, 18.0F, 8.0F, 18.0F, new fyo(0.0F))
            .a(6, 6)
            .a(-6.0F, -8.0F, -6.0F, 12.0F, 8.0F, 12.0F, new fyo(0.0F))
            .a(105, 57)
            .a(-2.5F, -8.0F, -2.5F, 5.0F, 8.0F, 5.0F, new fyo(0.0F)),
         fym.a(0.0F, -6.0F, 0.0F)
      );
      return fyq.a($$2, $$0, $$1);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fyk::c);
      float $$6 = $$3 * (float) Math.PI * -0.1F;
      this.k.b = ayo.b($$6) * 1.0F * 0.6F;
      this.k.d = ayo.a($$6) * 1.0F * 0.6F;
      this.l.b = ayo.a($$6) * 0.5F * 0.8F;
      this.l.d = ayo.b($$6) * 0.8F;
      this.m.b = ayo.b($$6) * -0.25F * 1.0F;
      this.m.d = ayo.a($$6) * -0.25F * 1.0F;
      this.h.c = 4.0F + ayo.b($$6) / 4.0F;
      this.n.f = $$3 * (float) Math.PI * 0.1F;
      this.a($$0.ca, fhi.a, $$3);
      this.a($$0.c, fhi.c, $$3);
      this.a($$0.d, fhi.d, $$3);
      this.a($$0.e, fhi.b, $$3);
   }

   @Override
   public fyk a() {
      return this.g;
   }

   public fyk b() {
      return this.h;
   }

   public fyk c() {
      return this.i;
   }

   public fyk d() {
      return this.n;
   }

   public fyk e() {
      return this.j;
   }
}
