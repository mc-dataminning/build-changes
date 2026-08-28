public class gef<S extends hal> extends gbz<S> implements gdx {
   private final geo a = this.p.b("hat_rim");

   public gef(geo $$0) {
      super($$0);
   }

   public static geu a() {
      gew $$0 = gbz.a(ges.a, 0.0F);
      gey $$1 = $$0.a();
      gey $$2 = $$1.a("head", new get().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F).a(24, 0).a(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F), geq.a);
      gey $$3 = $$2.a("hat", get.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new ges(0.5F)), geq.a);
      $$3.a("hat_rim", get.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), geq.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$1.a("body", get.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F).a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new ges(0.05F)), geq.a);
      $$1.a("right_arm", get.c().a(44, 22).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), geq.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", get.c().a(44, 22).a().a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), geq.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", get.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), geq.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", get.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), geq.a(2.0F, 12.0F, 0.0F));
      return geu.a($$0, 64, 64);
   }

   public static geu a(ges $$0) {
      gew $$1 = gbz.a($$0, 0.0F);
      gey $$2 = $$1.a();
      gey $$3 = $$2.a("head", get.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), geq.a);
      $$2.a("body", get.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0.a(0.1F)), geq.a);
      $$2.a("right_leg", get.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), geq.a(-2.0F, 12.0F, 0.0F));
      $$2.a("left_leg", get.c().a(0, 16).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), geq.a(2.0F, 12.0F, 0.0F));
      $$3.b("hat").a("hat_rim", get.c(), geq.a);
      return geu.a($$1, 64, 32);
   }

   public void a(S $$0) {
      super.a($$0);
      float $$1 = $$0.C;
      gag.a(this.s, this.r, $$0.a, $$1, $$0.p);
   }

   @Override
   public void a(boolean $$0) {
      this.o.k = $$0;
      this.p.k = $$0;
      this.a.k = $$0;
   }
}
