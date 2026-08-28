public class fut<T extends cgm> extends fuz<T> {
   private static final float a = 1.5F;
   private static final float b = 1.0F;
   private static final float f = 2.5F;
   private final fxq g;
   private final fxq h;
   private final fxq i;
   private final fxq j;
   private final fxq k;
   private final fxq l;
   private final fxq m;
   private final fxq n;
   private final fxq o;
   private final fxq p;

   public fut(fxq $$0) {
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

   public static fxw b() {
      fxy $$0 = new fxy();
      fxz $$1 = $$0.a();
      fxz $$2 = $$1.a("root", fxv.c(), fxs.a(0.0F, 24.0F, 0.0F));
      fxz $$3 = $$2.a(
         "body", fxv.c().a(3, 1).a(-3.5F, -2.0F, -8.0F, 7.0F, 3.0F, 9.0F).a(23, 22).a(-3.5F, -1.0F, -8.0F, 7.0F, 0.0F, 9.0F), fxs.a(0.0F, -2.0F, 4.0F)
      );
      fxz $$4 = $$3.a(
         "head", fxv.c().a(23, 13).a(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F).a(0, 13).a(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F), fxs.a(0.0F, -2.0F, -1.0F)
      );
      fxz $$5 = $$4.a("eyes", fxv.c(), fxs.a(-0.5F, 0.0F, 2.0F));
      $$5.a("right_eye", fxv.c().a(0, 0).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), fxs.a(-1.5F, -3.0F, -6.5F));
      $$5.a("left_eye", fxv.c().a(0, 5).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), fxs.a(2.5F, -3.0F, -6.5F));
      $$3.a("croaking_body", fxv.c().a(26, 5).a(-3.5F, -0.1F, -2.9F, 7.0F, 2.0F, 3.0F, new fxu(-0.1F)), fxs.a(0.0F, -1.0F, -5.0F));
      fxz $$6 = $$3.a("tongue", fxv.c().a(17, 13).a(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F), fxs.a(0.0F, -1.01F, 1.0F));
      fxz $$7 = $$3.a("left_arm", fxv.c().a(0, 32).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), fxs.a(4.0F, -1.0F, -6.5F));
      $$7.a("left_hand", fxv.c().a(18, 40).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fxs.a(0.0F, 3.0F, -1.0F));
      fxz $$8 = $$3.a("right_arm", fxv.c().a(0, 38).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), fxs.a(-4.0F, -1.0F, -6.5F));
      $$8.a("right_hand", fxv.c().a(2, 40).a(-4.0F, 0.01F, -5.0F, 8.0F, 0.0F, 8.0F), fxs.a(0.0F, 3.0F, 0.0F));
      fxz $$9 = $$2.a("left_leg", fxv.c().a(14, 25).a(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), fxs.a(3.5F, -3.0F, 4.0F));
      $$9.a("left_foot", fxv.c().a(2, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fxs.a(2.0F, 3.0F, 0.0F));
      fxz $$10 = $$2.a("right_leg", fxv.c().a(0, 25).a(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), fxs.a(-3.5F, -3.0F, 4.0F));
      $$10.a("right_foot", fxv.c().a(18, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fxs.a(-2.0F, 3.0F, 0.0F));
      return fxw.a($$0, 48, 48);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fxq::c);
      this.a($$0.ce, fgs.c, $$3);
      this.a($$0.cf, fgs.a, $$3);
      this.a($$0.cg, fgs.d, $$3);
      if ($$0.bj()) {
         this.a(fgs.e, $$1, $$2, 1.0F, 2.5F);
      } else {
         this.a(fgs.b, $$1, $$2, 1.5F, 2.5F);
      }

      this.a($$0.ch, fgs.f, $$3);
      this.p.k = $$0.cf.c();
   }

   @Override
   public fxq a() {
      return this.g;
   }
}
