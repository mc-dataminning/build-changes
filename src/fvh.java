public class fvh<T extends cgw> extends fvn<T> {
   private static final float a = 1.5F;
   private static final float b = 1.0F;
   private static final float f = 2.5F;
   private final fye g;
   private final fye h;
   private final fye i;
   private final fye j;
   private final fye k;
   private final fye l;
   private final fye m;
   private final fye n;
   private final fye o;
   private final fye p;

   public fvh(fye $$0) {
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

   public static fyk b() {
      fym $$0 = new fym();
      fyn $$1 = $$0.a();
      fyn $$2 = $$1.a("root", fyj.c(), fyg.a(0.0F, 24.0F, 0.0F));
      fyn $$3 = $$2.a(
         "body", fyj.c().a(3, 1).a(-3.5F, -2.0F, -8.0F, 7.0F, 3.0F, 9.0F).a(23, 22).a(-3.5F, -1.0F, -8.0F, 7.0F, 0.0F, 9.0F), fyg.a(0.0F, -2.0F, 4.0F)
      );
      fyn $$4 = $$3.a(
         "head", fyj.c().a(23, 13).a(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F).a(0, 13).a(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F), fyg.a(0.0F, -2.0F, -1.0F)
      );
      fyn $$5 = $$4.a("eyes", fyj.c(), fyg.a(-0.5F, 0.0F, 2.0F));
      $$5.a("right_eye", fyj.c().a(0, 0).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), fyg.a(-1.5F, -3.0F, -6.5F));
      $$5.a("left_eye", fyj.c().a(0, 5).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), fyg.a(2.5F, -3.0F, -6.5F));
      $$3.a("croaking_body", fyj.c().a(26, 5).a(-3.5F, -0.1F, -2.9F, 7.0F, 2.0F, 3.0F, new fyi(-0.1F)), fyg.a(0.0F, -1.0F, -5.0F));
      fyn $$6 = $$3.a("tongue", fyj.c().a(17, 13).a(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F), fyg.a(0.0F, -1.01F, 1.0F));
      fyn $$7 = $$3.a("left_arm", fyj.c().a(0, 32).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), fyg.a(4.0F, -1.0F, -6.5F));
      $$7.a("left_hand", fyj.c().a(18, 40).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fyg.a(0.0F, 3.0F, -1.0F));
      fyn $$8 = $$3.a("right_arm", fyj.c().a(0, 38).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), fyg.a(-4.0F, -1.0F, -6.5F));
      $$8.a("right_hand", fyj.c().a(2, 40).a(-4.0F, 0.01F, -5.0F, 8.0F, 0.0F, 8.0F), fyg.a(0.0F, 3.0F, 0.0F));
      fyn $$9 = $$2.a("left_leg", fyj.c().a(14, 25).a(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), fyg.a(3.5F, -3.0F, 4.0F));
      $$9.a("left_foot", fyj.c().a(2, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fyg.a(2.0F, 3.0F, 0.0F));
      fyn $$10 = $$2.a("right_leg", fyj.c().a(0, 25).a(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), fyg.a(-3.5F, -3.0F, 4.0F));
      $$10.a("right_foot", fyj.c().a(18, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fyg.a(-2.0F, 3.0F, 0.0F));
      return fyk.a($$0, 48, 48);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fye::c);
      this.a($$0.ce, fhe.c, $$3);
      this.a($$0.cf, fhe.a, $$3);
      this.a($$0.cg, fhe.d, $$3);
      if ($$0.bi()) {
         this.a(fhe.e, $$1, $$2, 1.0F, 2.5F);
      } else {
         this.a(fhe.b, $$1, $$2, 1.5F, 2.5F);
      }

      this.a($$0.ch, fhe.f, $$3);
      this.p.k = $$0.cf.c();
   }

   @Override
   public fye a() {
      return this.g;
   }
}
