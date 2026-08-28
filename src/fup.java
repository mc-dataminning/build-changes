public class fup<T extends cfr> extends fuj<T> {
   private final fxa a;
   private final fxa b;
   private final fxa f;
   private final fxa g;
   private final fxa h;
   private final fxa i;

   public fup(fxa $$0) {
      this.a = $$0;
      this.b = $$0.b("head");
      this.f = $$0.b("right_arm");
      this.g = $$0.b("left_arm");
      this.h = $$0.b("right_leg");
      this.i = $$0.b("left_leg");
   }

   public static fxg b() {
      fxi $$0 = new fxi();
      fxj $$1 = $$0.a();
      $$1.a("head", fxf.c().a(0, 0).a(-4.0F, -12.0F, -5.5F, 8.0F, 10.0F, 8.0F).a(24, 0).a(-1.0F, -5.0F, -7.5F, 2.0F, 4.0F, 2.0F), fxc.a(0.0F, -7.0F, -2.0F));
      $$1.a(
         "body",
         fxf.c().a(0, 40).a(-9.0F, -2.0F, -6.0F, 18.0F, 12.0F, 11.0F).a(0, 70).a(-4.5F, 10.0F, -3.0F, 9.0F, 5.0F, 6.0F, new fxe(0.5F)),
         fxc.a(0.0F, -7.0F, 0.0F)
      );
      $$1.a("right_arm", fxf.c().a(60, 21).a(-13.0F, -2.5F, -3.0F, 4.0F, 30.0F, 6.0F), fxc.a(0.0F, -7.0F, 0.0F));
      $$1.a("left_arm", fxf.c().a(60, 58).a(9.0F, -2.5F, -3.0F, 4.0F, 30.0F, 6.0F), fxc.a(0.0F, -7.0F, 0.0F));
      $$1.a("right_leg", fxf.c().a(37, 0).a(-3.5F, -3.0F, -3.0F, 6.0F, 16.0F, 5.0F), fxc.a(-4.0F, 11.0F, 0.0F));
      $$1.a("left_leg", fxf.c().a(60, 0).a().a(-3.5F, -3.0F, -3.0F, 6.0F, 16.0F, 5.0F), fxc.a(5.0F, 11.0F, 0.0F));
      return fxg.a($$0, 128, 128);
   }

   @Override
   public fxa a() {
      return this.a;
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.b.f = $$4 * (float) (Math.PI / 180.0);
      this.b.e = $$5 * (float) (Math.PI / 180.0);
      this.h.e = -1.5F * ayz.e($$1, 13.0F) * $$2;
      this.i.e = 1.5F * ayz.e($$1, 13.0F) * $$2;
      this.h.f = 0.0F;
      this.i.f = 0.0F;
   }

   public void a(T $$0, float $$1, float $$2, float $$3) {
      int $$4 = $$0.y();
      if ($$4 > 0) {
         this.f.e = -2.0F + 1.5F * ayz.e((float)$$4 - $$3, 10.0F);
         this.g.e = -2.0F + 1.5F * ayz.e((float)$$4 - $$3, 10.0F);
      } else {
         int $$5 = $$0.gq();
         if ($$5 > 0) {
            this.f.e = -0.8F + 0.025F * ayz.e((float)$$5, 70.0F);
            this.g.e = 0.0F;
         } else {
            this.f.e = (-0.2F + 1.5F * ayz.e($$1, 13.0F)) * $$2;
            this.g.e = (-0.2F - 1.5F * ayz.e($$1, 13.0F)) * $$2;
         }
      }
   }

   public fxa c() {
      return this.f;
   }
}
