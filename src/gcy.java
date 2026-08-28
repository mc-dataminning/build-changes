public class gcy<T extends gzi> extends gdn<T> {
   public gcy(ggc $$0) {
      super($$0);
   }

   public static ggi a() {
      float $$0 = -14.0F;
      ggk $$1 = gdn.a(ggg.a, -14.0F);
      ggm $$2 = $$1.a();
      ggm $$3 = $$2.a("head", ggh.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), gge.a(0.0F, -13.0F, 0.0F));
      $$3.a("hat", ggh.c().a(0, 16).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new ggg(-0.5F)), gge.a);
      $$2.a("body", ggh.c().a(32, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F), gge.a(0.0F, -14.0F, 0.0F));
      $$2.a("right_arm", ggh.c().a(56, 0).a(-1.0F, -2.0F, -1.0F, 2.0F, 30.0F, 2.0F), gge.a(-5.0F, -12.0F, 0.0F));
      $$2.a("left_arm", ggh.c().a(56, 0).a().a(-1.0F, -2.0F, -1.0F, 2.0F, 30.0F, 2.0F), gge.a(5.0F, -12.0F, 0.0F));
      $$2.a("right_leg", ggh.c().a(56, 0).a(-1.0F, 0.0F, -1.0F, 2.0F, 30.0F, 2.0F), gge.a(-2.0F, -5.0F, 0.0F));
      $$2.a("left_leg", ggh.c().a(56, 0).a().a(-1.0F, 0.0F, -1.0F, 2.0F, 30.0F, 2.0F), gge.a(2.0F, -5.0F, 0.0F));
      return ggi.a($$1, 64, 32);
   }

   public void a(T $$0) {
      super.a($$0);
      this.o.k = true;
      this.r.e *= 0.5F;
      this.s.e *= 0.5F;
      this.t.e *= 0.5F;
      this.u.e *= 0.5F;
      float $$1 = 0.4F;
      this.r.e = ayz.a(this.r.e, -0.4F, 0.4F);
      this.s.e = ayz.a(this.s.e, -0.4F, 0.4F);
      this.t.e = ayz.a(this.t.e, -0.4F, 0.4F);
      this.u.e = ayz.a(this.u.e, -0.4F, 0.4F);
      if ($$0.b != null) {
         this.r.e = -0.5F;
         this.s.e = -0.5F;
         this.r.g = 0.05F;
         this.s.g = -0.05F;
      }

      if ($$0.a) {
         float $$2 = 5.0F;
         this.o.c -= 5.0F;
         this.p.c += 5.0F;
      }
   }
}
