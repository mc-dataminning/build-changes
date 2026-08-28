public class gkx<S extends hhi> extends giq<S> implements gko {
   private final glg a = this.p.b("hat_rim");

   public gkx(glg $$0) {
      super($$0);
   }

   public static glm a() {
      glo $$0 = giq.a(glk.a, 0.0F);
      glq $$1 = $$0.a();
      glq $$2 = $$1.a("head", new gll().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F).a(24, 0).a(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F), gli.a);
      glq $$3 = $$2.a("hat", gll.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new glk(0.5F)), gli.a);
      $$3.a("hat_rim", gll.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), gli.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$1.a("body", gll.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F).a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new glk(0.05F)), gli.a);
      $$1.a("right_arm", gll.c().a(44, 22).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), gli.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", gll.c().a(44, 22).a().a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), gli.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", gll.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), gli.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", gll.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), gli.a(2.0F, 12.0F, 0.0F));
      return glm.a($$0, 64, 64);
   }

   public static glm a(glk $$0) {
      glo $$1 = giq.a($$0, 0.0F);
      glq $$2 = $$1.a();
      glq $$3 = $$2.a("head", gll.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), gli.a);
      $$2.a("body", gll.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0.a(0.1F)), gli.a);
      $$2.a("right_leg", gll.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), gli.a(-2.0F, 12.0F, 0.0F));
      $$2.a("left_leg", gll.c().a(0, 16).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), gli.a(2.0F, 12.0F, 0.0F));
      $$3.b("hat").a("hat_rim", gll.c(), gli.a);
      return glm.a($$1, 64, 32);
   }

   public void a(S $$0) {
      super.a($$0);
      float $$1 = $$0.H;
      ggq.a(this.s, this.r, $$0.a, $$1, $$0.u);
   }

   @Override
   public void a(boolean $$0) {
      this.o.k = $$0;
      this.p.k = $$0;
      this.a.k = $$0;
   }

   @Override
   public void a(flq $$0) {
      this.a(bxn.b, $$0);
   }
}
