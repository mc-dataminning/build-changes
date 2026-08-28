public class fvl<T extends cgy> extends fvr<T> {
   private static final float a = 1.5F;
   private static final float b = 1.0F;
   private static final float f = 2.5F;
   private final fyi g;
   private final fyi h;
   private final fyi i;
   private final fyi j;
   private final fyi k;
   private final fyi l;
   private final fyi m;
   private final fyi n;
   private final fyi o;
   private final fyi p;

   public fvl(fyi $$0) {
      this.g = $$0.b("root");
      this.h = this.g.b("body");
      this.i = this.h.b("head");
      this.j = this.i.b("eyes");
      this.k = this.h.b("tongue");
      this.l = this.h.b("left_arm");
      this.m = this.h.b("right_arm");
      this.n = this.g.b("left_leg");
      this.o = this.g.b("right_leg");
      this.p = this.h.b("croaking_body");
   }

   public static fyo b() {
      fyq $$0 = new fyq();
      fyr $$1 = $$0.a();
      fyr $$2 = $$1.a("root", fyn.c(), fyk.a(0.0F, 24.0F, 0.0F));
      fyr $$3 = $$2.a(
         "body", fyn.c().a(3, 1).a(-3.5F, -2.0F, -8.0F, 7.0F, 3.0F, 9.0F).a(23, 22).a(-3.5F, -1.0F, -8.0F, 7.0F, 0.0F, 9.0F), fyk.a(0.0F, -2.0F, 4.0F)
      );
      fyr $$4 = $$3.a(
         "head", fyn.c().a(23, 13).a(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F).a(0, 13).a(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F), fyk.a(0.0F, -2.0F, -1.0F)
      );
      fyr $$5 = $$4.a("eyes", fyn.c(), fyk.a(-0.5F, 0.0F, 2.0F));
      $$5.a("right_eye", fyn.c().a(0, 0).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), fyk.a(-1.5F, -3.0F, -6.5F));
      $$5.a("left_eye", fyn.c().a(0, 5).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), fyk.a(2.5F, -3.0F, -6.5F));
      $$3.a("croaking_body", fyn.c().a(26, 5).a(-3.5F, -0.1F, -2.9F, 7.0F, 2.0F, 3.0F, new fym(-0.1F)), fyk.a(0.0F, -1.0F, -5.0F));
      fyr $$6 = $$3.a("tongue", fyn.c().a(17, 13).a(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F), fyk.a(0.0F, -1.01F, 1.0F));
      fyr $$7 = $$3.a("left_arm", fyn.c().a(0, 32).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), fyk.a(4.0F, -1.0F, -6.5F));
      $$7.a("left_hand", fyn.c().a(18, 40).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fyk.a(0.0F, 3.0F, -1.0F));
      fyr $$8 = $$3.a("right_arm", fyn.c().a(0, 38).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), fyk.a(-4.0F, -1.0F, -6.5F));
      $$8.a("right_hand", fyn.c().a(2, 40).a(-4.0F, 0.01F, -5.0F, 8.0F, 0.0F, 8.0F), fyk.a(0.0F, 3.0F, 0.0F));
      fyr $$9 = $$2.a("left_leg", fyn.c().a(14, 25).a(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), fyk.a(3.5F, -3.0F, 4.0F));
      $$9.a("left_foot", fyn.c().a(2, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fyk.a(2.0F, 3.0F, 0.0F));
      fyr $$10 = $$2.a("right_leg", fyn.c().a(0, 25).a(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), fyk.a(-3.5F, -3.0F, 4.0F));
      $$10.a("right_foot", fyn.c().a(18, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fyk.a(-2.0F, 3.0F, 0.0F));
      return fyo.a($$0, 48, 48);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fyi::c);
      this.a($$0.ce, fhi.c, $$3);
      this.a($$0.cf, fhi.a, $$3);
      this.a($$0.cg, fhi.d, $$3);
      if ($$0.bi()) {
         this.a(fhi.e, $$1, $$2, 1.0F, 2.5F);
      } else {
         this.a(fhi.b, $$1, $$2, 1.5F, 2.5F);
      }

      this.a($$0.ch, fhi.f, $$3);
      this.p.k = $$0.cf.c();
   }

   @Override
   public fyi a() {
      return this.g;
   }
}
