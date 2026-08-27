public class fvt<T extends cfy> extends fvz<T> {
   private static final float a = 1.5F;
   private static final float b = 1.0F;
   private static final float f = 2.5F;
   private final fys g;
   private final fys h;
   private final fys i;
   private final fys j;
   private final fys k;
   private final fys l;
   private final fys m;
   private final fys n;
   private final fys o;
   private final fys p;

   public fvt(fys $$0) {
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

   public static fyy b() {
      fza $$0 = new fza();
      fzb $$1 = $$0.a();
      fzb $$2 = $$1.a("root", fyx.c(), fyu.a(0.0F, 24.0F, 0.0F));
      fzb $$3 = $$2.a(
         "body", fyx.c().a(3, 1).a(-3.5F, -2.0F, -8.0F, 7.0F, 3.0F, 9.0F).a(23, 22).a(-3.5F, -1.0F, -8.0F, 7.0F, 0.0F, 9.0F), fyu.a(0.0F, -2.0F, 4.0F)
      );
      fzb $$4 = $$3.a(
         "head", fyx.c().a(23, 13).a(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F).a(0, 13).a(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F), fyu.a(0.0F, -2.0F, -1.0F)
      );
      fzb $$5 = $$4.a("eyes", fyx.c(), fyu.a(-0.5F, 0.0F, 2.0F));
      $$5.a("right_eye", fyx.c().a(0, 0).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), fyu.a(-1.5F, -3.0F, -6.5F));
      $$5.a("left_eye", fyx.c().a(0, 5).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), fyu.a(2.5F, -3.0F, -6.5F));
      $$3.a("croaking_body", fyx.c().a(26, 5).a(-3.5F, -0.1F, -2.9F, 7.0F, 2.0F, 3.0F, new fyw(-0.1F)), fyu.a(0.0F, -1.0F, -5.0F));
      fzb $$6 = $$3.a("tongue", fyx.c().a(17, 13).a(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F), fyu.a(0.0F, -1.01F, 1.0F));
      fzb $$7 = $$3.a("left_arm", fyx.c().a(0, 32).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), fyu.a(4.0F, -1.0F, -6.5F));
      $$7.a("left_hand", fyx.c().a(18, 40).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fyu.a(0.0F, 3.0F, -1.0F));
      fzb $$8 = $$3.a("right_arm", fyx.c().a(0, 38).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), fyu.a(-4.0F, -1.0F, -6.5F));
      $$8.a("right_hand", fyx.c().a(2, 40).a(-4.0F, 0.01F, -5.0F, 8.0F, 0.0F, 8.0F), fyu.a(0.0F, 3.0F, 0.0F));
      fzb $$9 = $$2.a("left_leg", fyx.c().a(14, 25).a(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), fyu.a(3.5F, -3.0F, 4.0F));
      $$9.a("left_foot", fyx.c().a(2, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fyu.a(2.0F, 3.0F, 0.0F));
      fzb $$10 = $$2.a("right_leg", fyx.c().a(0, 25).a(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), fyu.a(-3.5F, -3.0F, 4.0F));
      $$10.a("right_foot", fyx.c().a(18, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fyu.a(-2.0F, 3.0F, 0.0F));
      return fyy.a($$0, 48, 48);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fys::c);
      this.a($$0.cl, fhh.c, $$3);
      this.a($$0.cm, fhh.a, $$3);
      this.a($$0.cn, fhh.d, $$3);
      if ($$0.bl()) {
         this.a(fhh.e, $$1, $$2, 1.0F, 2.5F);
      } else {
         this.a(fhh.b, $$1, $$2, 1.5F, 2.5F);
      }

      this.a($$0.co, fhh.f, $$3);
      this.p.k = $$0.cm.c();
   }

   @Override
   public fys a() {
      return this.g;
   }
}
