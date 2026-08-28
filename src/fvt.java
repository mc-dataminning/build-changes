public class fvt<T extends cfo> extends fvn<T> {
   private final fye a;
   private final fye b;
   private final fye f;
   private final fye g;
   private final fye h;
   private final fye i;

   public fvt(fye $$0) {
      this.a = $$0;
      this.b = $$0.b("head");
      this.f = $$0.b("right_arm");
      this.g = $$0.b("left_arm");
      this.h = $$0.b("right_leg");
      this.i = $$0.b("left_leg");
   }

   public static fyk b() {
      fym $$0 = new fym();
      fyn $$1 = $$0.a();
      $$1.a("head", fyj.c().a(0, 0).a(-4.0F, -12.0F, -5.5F, 8.0F, 10.0F, 8.0F).a(24, 0).a(-1.0F, -5.0F, -7.5F, 2.0F, 4.0F, 2.0F), fyg.a(0.0F, -7.0F, -2.0F));
      $$1.a(
         "body",
         fyj.c().a(0, 40).a(-9.0F, -2.0F, -6.0F, 18.0F, 12.0F, 11.0F).a(0, 70).a(-4.5F, 10.0F, -3.0F, 9.0F, 5.0F, 6.0F, new fyi(0.5F)),
         fyg.a(0.0F, -7.0F, 0.0F)
      );
      $$1.a("right_arm", fyj.c().a(60, 21).a(-13.0F, -2.5F, -3.0F, 4.0F, 30.0F, 6.0F), fyg.a(0.0F, -7.0F, 0.0F));
      $$1.a("left_arm", fyj.c().a(60, 58).a(9.0F, -2.5F, -3.0F, 4.0F, 30.0F, 6.0F), fyg.a(0.0F, -7.0F, 0.0F));
      $$1.a("right_leg", fyj.c().a(37, 0).a(-3.5F, -3.0F, -3.0F, 6.0F, 16.0F, 5.0F), fyg.a(-4.0F, 11.0F, 0.0F));
      $$1.a("left_leg", fyj.c().a(60, 0).a().a(-3.5F, -3.0F, -3.0F, 6.0F, 16.0F, 5.0F), fyg.a(5.0F, 11.0F, 0.0F));
      return fyk.a($$0, 128, 128);
   }

   @Override
   public fye a() {
      return this.a;
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.b.f = $$4 * (float) (Math.PI / 180.0);
      this.b.e = $$5 * (float) (Math.PI / 180.0);
      this.h.e = -1.5F * ayn.e($$1, 13.0F) * $$2;
      this.i.e = 1.5F * ayn.e($$1, 13.0F) * $$2;
      this.h.f = 0.0F;
      this.i.f = 0.0F;
   }

   public void a(T $$0, float $$1, float $$2, float $$3) {
      int $$4 = $$0.x();
      if ($$4 > 0) {
         this.f.e = -2.0F + 1.5F * ayn.e((float)$$4 - $$3, 10.0F);
         this.g.e = -2.0F + 1.5F * ayn.e((float)$$4 - $$3, 10.0F);
      } else {
         int $$5 = $$0.gm();
         if ($$5 > 0) {
            this.f.e = -0.8F + 0.025F * ayn.e((float)$$5, 70.0F);
            this.g.e = 0.0F;
         } else {
            this.f.e = (-0.2F + 1.5F * ayn.e($$1, 13.0F)) * $$2;
            this.g.e = (-0.2F - 1.5F * ayn.e($$1, 13.0F)) * $$2;
         }
      }
   }

   public fye c() {
      return this.f;
   }
}
