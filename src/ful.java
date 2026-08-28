public class ful<T extends cgi> extends fur<T> {
   private static final float a = 1.5F;
   private static final float b = 1.0F;
   private static final float f = 2.5F;
   private final fxi g;
   private final fxi h;
   private final fxi i;
   private final fxi j;
   private final fxi k;
   private final fxi l;
   private final fxi m;
   private final fxi n;
   private final fxi o;
   private final fxi p;

   public ful(fxi $$0) {
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

   public static fxo b() {
      fxq $$0 = new fxq();
      fxr $$1 = $$0.a();
      fxr $$2 = $$1.a("root", fxn.c(), fxk.a(0.0F, 24.0F, 0.0F));
      fxr $$3 = $$2.a(
         "body", fxn.c().a(3, 1).a(-3.5F, -2.0F, -8.0F, 7.0F, 3.0F, 9.0F).a(23, 22).a(-3.5F, -1.0F, -8.0F, 7.0F, 0.0F, 9.0F), fxk.a(0.0F, -2.0F, 4.0F)
      );
      fxr $$4 = $$3.a(
         "head", fxn.c().a(23, 13).a(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F).a(0, 13).a(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F), fxk.a(0.0F, -2.0F, -1.0F)
      );
      fxr $$5 = $$4.a("eyes", fxn.c(), fxk.a(-0.5F, 0.0F, 2.0F));
      $$5.a("right_eye", fxn.c().a(0, 0).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), fxk.a(-1.5F, -3.0F, -6.5F));
      $$5.a("left_eye", fxn.c().a(0, 5).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), fxk.a(2.5F, -3.0F, -6.5F));
      $$3.a("croaking_body", fxn.c().a(26, 5).a(-3.5F, -0.1F, -2.9F, 7.0F, 2.0F, 3.0F, new fxm(-0.1F)), fxk.a(0.0F, -1.0F, -5.0F));
      fxr $$6 = $$3.a("tongue", fxn.c().a(17, 13).a(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F), fxk.a(0.0F, -1.01F, 1.0F));
      fxr $$7 = $$3.a("left_arm", fxn.c().a(0, 32).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), fxk.a(4.0F, -1.0F, -6.5F));
      $$7.a("left_hand", fxn.c().a(18, 40).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fxk.a(0.0F, 3.0F, -1.0F));
      fxr $$8 = $$3.a("right_arm", fxn.c().a(0, 38).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), fxk.a(-4.0F, -1.0F, -6.5F));
      $$8.a("right_hand", fxn.c().a(2, 40).a(-4.0F, 0.01F, -5.0F, 8.0F, 0.0F, 8.0F), fxk.a(0.0F, 3.0F, 0.0F));
      fxr $$9 = $$2.a("left_leg", fxn.c().a(14, 25).a(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), fxk.a(3.5F, -3.0F, 4.0F));
      $$9.a("left_foot", fxn.c().a(2, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fxk.a(2.0F, 3.0F, 0.0F));
      fxr $$10 = $$2.a("right_leg", fxn.c().a(0, 25).a(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), fxk.a(-3.5F, -3.0F, 4.0F));
      $$10.a("right_foot", fxn.c().a(18, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fxk.a(-2.0F, 3.0F, 0.0F));
      return fxo.a($$0, 48, 48);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fxi::c);
      this.a($$0.ce, fgk.c, $$3);
      this.a($$0.cf, fgk.a, $$3);
      this.a($$0.cg, fgk.d, $$3);
      if ($$0.bh()) {
         this.a(fgk.e, $$1, $$2, 1.0F, 2.5F);
      } else {
         this.a(fgk.b, $$1, $$2, 1.5F, 2.5F);
      }

      this.a($$0.ch, fgk.f, $$3);
      this.p.k = $$0.cf.c();
   }

   @Override
   public fxi a() {
      return this.g;
   }
}
