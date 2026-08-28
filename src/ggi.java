public class ggi<T extends hcy> extends ggy<T> {
   public ggi(gjo $$0) {
      super($$0);
   }

   public static gju a() {
      float $$0 = -14.0F;
      gjw $$1 = ggy.a(gjs.a, -14.0F);
      gjy $$2 = $$1.a();
      gjy $$3 = $$2.a("head", gjt.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), gjq.a(0.0F, -13.0F, 0.0F));
      $$3.a("hat", gjt.c().a(0, 16).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new gjs(-0.5F)), gjq.a);
      $$2.a("body", gjt.c().a(32, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F), gjq.a(0.0F, -14.0F, 0.0F));
      $$2.a("right_arm", gjt.c().a(56, 0).a(-1.0F, -2.0F, -1.0F, 2.0F, 30.0F, 2.0F), gjq.a(-5.0F, -12.0F, 0.0F));
      $$2.a("left_arm", gjt.c().a(56, 0).a().a(-1.0F, -2.0F, -1.0F, 2.0F, 30.0F, 2.0F), gjq.a(5.0F, -12.0F, 0.0F));
      $$2.a("right_leg", gjt.c().a(56, 0).a(-1.0F, 0.0F, -1.0F, 2.0F, 30.0F, 2.0F), gjq.a(-2.0F, -5.0F, 0.0F));
      $$2.a("left_leg", gjt.c().a(56, 0).a().a(-1.0F, 0.0F, -1.0F, 2.0F, 30.0F, 2.0F), gjq.a(2.0F, -5.0F, 0.0F));
      return gju.a($$1, 64, 32);
   }

   public void a(T $$0) {
      super.a($$0);
      this.o.k = true;
      this.r.e *= 0.5F;
      this.s.e *= 0.5F;
      this.t.e *= 0.5F;
      this.u.e *= 0.5F;
      float $$1 = 0.4F;
      this.r.e = azm.a(this.r.e, -0.4F, 0.4F);
      this.s.e = azm.a(this.s.e, -0.4F, 0.4F);
      this.t.e = azm.a(this.t.e, -0.4F, 0.4F);
      this.u.e = azm.a(this.u.e, -0.4F, 0.4F);
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
