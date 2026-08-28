public class fvn<T extends cgy> extends fvt<T> {
   private static final float a = 1.5F;
   private static final float b = 1.0F;
   private static final float f = 2.5F;
   private final fyk g;
   private final fyk h;
   private final fyk i;
   private final fyk j;
   private final fyk k;
   private final fyk l;
   private final fyk m;
   private final fyk n;
   private final fyk o;
   private final fyk p;

   public fvn(fyk $$0) {
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

   public static fyq b() {
      fys $$0 = new fys();
      fyt $$1 = $$0.a();
      fyt $$2 = $$1.a("root", fyp.c(), fym.a(0.0F, 24.0F, 0.0F));
      fyt $$3 = $$2.a(
         "body", fyp.c().a(3, 1).a(-3.5F, -2.0F, -8.0F, 7.0F, 3.0F, 9.0F).a(23, 22).a(-3.5F, -1.0F, -8.0F, 7.0F, 0.0F, 9.0F), fym.a(0.0F, -2.0F, 4.0F)
      );
      fyt $$4 = $$3.a(
         "head", fyp.c().a(23, 13).a(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F).a(0, 13).a(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F), fym.a(0.0F, -2.0F, -1.0F)
      );
      fyt $$5 = $$4.a("eyes", fyp.c(), fym.a(-0.5F, 0.0F, 2.0F));
      $$5.a("right_eye", fyp.c().a(0, 0).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), fym.a(-1.5F, -3.0F, -6.5F));
      $$5.a("left_eye", fyp.c().a(0, 5).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), fym.a(2.5F, -3.0F, -6.5F));
      $$3.a("croaking_body", fyp.c().a(26, 5).a(-3.5F, -0.1F, -2.9F, 7.0F, 2.0F, 3.0F, new fyo(-0.1F)), fym.a(0.0F, -1.0F, -5.0F));
      fyt $$6 = $$3.a("tongue", fyp.c().a(17, 13).a(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F), fym.a(0.0F, -1.01F, 1.0F));
      fyt $$7 = $$3.a("left_arm", fyp.c().a(0, 32).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), fym.a(4.0F, -1.0F, -6.5F));
      $$7.a("left_hand", fyp.c().a(18, 40).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fym.a(0.0F, 3.0F, -1.0F));
      fyt $$8 = $$3.a("right_arm", fyp.c().a(0, 38).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), fym.a(-4.0F, -1.0F, -6.5F));
      $$8.a("right_hand", fyp.c().a(2, 40).a(-4.0F, 0.01F, -5.0F, 8.0F, 0.0F, 8.0F), fym.a(0.0F, 3.0F, 0.0F));
      fyt $$9 = $$2.a("left_leg", fyp.c().a(14, 25).a(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), fym.a(3.5F, -3.0F, 4.0F));
      $$9.a("left_foot", fyp.c().a(2, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fym.a(2.0F, 3.0F, 0.0F));
      fyt $$10 = $$2.a("right_leg", fyp.c().a(0, 25).a(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), fym.a(-3.5F, -3.0F, 4.0F));
      $$10.a("right_foot", fyp.c().a(18, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fym.a(-2.0F, 3.0F, 0.0F));
      return fyq.a($$0, 48, 48);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fyk::c);
      this.a($$0.cg, fhk.c, $$3);
      this.a($$0.ch, fhk.a, $$3);
      this.a($$0.ci, fhk.d, $$3);
      if ($$0.bi()) {
         this.a(fhk.e, $$1, $$2, 1.0F, 2.5F);
      } else {
         this.a(fhk.b, $$1, $$2, 1.5F, 2.5F);
      }

      this.a($$0.cj, fhk.f, $$3);
      this.p.k = $$0.ch.c();
   }

   @Override
   public fyk a() {
      return this.g;
   }
}
