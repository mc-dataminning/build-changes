public class gia<T extends heq> extends giq<T> {
   public gia(glg $$0) {
      super($$0);
   }

   public static glm a() {
      float $$0 = -14.0F;
      glo $$1 = giq.a(glk.a, -14.0F);
      glq $$2 = $$1.a();
      glq $$3 = $$2.a("head", gll.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), gli.a(0.0F, -13.0F, 0.0F));
      $$3.a("hat", gll.c().a(0, 16).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new glk(-0.5F)), gli.a);
      $$2.a("body", gll.c().a(32, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F), gli.a(0.0F, -14.0F, 0.0F));
      $$2.a("right_arm", gll.c().a(56, 0).a(-1.0F, -2.0F, -1.0F, 2.0F, 30.0F, 2.0F), gli.a(-5.0F, -12.0F, 0.0F));
      $$2.a("left_arm", gll.c().a(56, 0).a().a(-1.0F, -2.0F, -1.0F, 2.0F, 30.0F, 2.0F), gli.a(5.0F, -12.0F, 0.0F));
      $$2.a("right_leg", gll.c().a(56, 0).a(-1.0F, 0.0F, -1.0F, 2.0F, 30.0F, 2.0F), gli.a(-2.0F, -5.0F, 0.0F));
      $$2.a("left_leg", gll.c().a(56, 0).a().a(-1.0F, 0.0F, -1.0F, 2.0F, 30.0F, 2.0F), gli.a(2.0F, -5.0F, 0.0F));
      return glm.a($$1, 64, 32);
   }

   public void a(T $$0) {
      super.a($$0);
      this.o.k = true;
      this.r.e *= 0.5F;
      this.s.e *= 0.5F;
      this.t.e *= 0.5F;
      this.u.e *= 0.5F;
      float $$1 = 0.4F;
      this.r.e = azq.a(this.r.e, -0.4F, 0.4F);
      this.s.e = azq.a(this.s.e, -0.4F, 0.4F);
      this.t.e = azq.a(this.t.e, -0.4F, 0.4F);
      this.u.e = azq.a(this.u.e, -0.4F, 0.4F);
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
