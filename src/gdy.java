public class gdy<T extends haj> extends geo<T> {
   public gdy(ghd $$0) {
      super($$0);
   }

   public static ghj a() {
      float $$0 = -14.0F;
      ghl $$1 = geo.a(ghh.a, -14.0F);
      ghn $$2 = $$1.a();
      ghn $$3 = $$2.a("head", ghi.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), ghf.a(0.0F, -13.0F, 0.0F));
      $$3.a("hat", ghi.c().a(0, 16).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new ghh(-0.5F)), ghf.a);
      $$2.a("body", ghi.c().a(32, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F), ghf.a(0.0F, -14.0F, 0.0F));
      $$2.a("right_arm", ghi.c().a(56, 0).a(-1.0F, -2.0F, -1.0F, 2.0F, 30.0F, 2.0F), ghf.a(-5.0F, -12.0F, 0.0F));
      $$2.a("left_arm", ghi.c().a(56, 0).a().a(-1.0F, -2.0F, -1.0F, 2.0F, 30.0F, 2.0F), ghf.a(5.0F, -12.0F, 0.0F));
      $$2.a("right_leg", ghi.c().a(56, 0).a(-1.0F, 0.0F, -1.0F, 2.0F, 30.0F, 2.0F), ghf.a(-2.0F, -5.0F, 0.0F));
      $$2.a("left_leg", ghi.c().a(56, 0).a().a(-1.0F, 0.0F, -1.0F, 2.0F, 30.0F, 2.0F), ghf.a(2.0F, -5.0F, 0.0F));
      return ghj.a($$1, 64, 32);
   }

   public void a(T $$0) {
      super.a($$0);
      this.o.k = true;
      this.r.e *= 0.5F;
      this.s.e *= 0.5F;
      this.t.e *= 0.5F;
      this.u.e *= 0.5F;
      float $$1 = 0.4F;
      this.r.e = azk.a(this.r.e, -0.4F, 0.4F);
      this.s.e = azk.a(this.s.e, -0.4F, 0.4F);
      this.t.e = azk.a(this.t.e, -0.4F, 0.4F);
      this.u.e = azk.a(this.u.e, -0.4F, 0.4F);
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
