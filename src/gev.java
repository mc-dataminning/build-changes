public class gev<S extends hbd> extends gcp<S> implements gen {
   private final gfe a = this.p.b("hat_rim");

   public gev(gfe $$0) {
      super($$0);
   }

   public static gfk a() {
      gfm $$0 = gcp.a(gfi.a, 0.0F);
      gfo $$1 = $$0.a();
      gfo $$2 = $$1.a("head", new gfj().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F).a(24, 0).a(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F), gfg.a);
      gfo $$3 = $$2.a("hat", gfj.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new gfi(0.5F)), gfg.a);
      $$3.a("hat_rim", gfj.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), gfg.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$1.a("body", gfj.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F).a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new gfi(0.05F)), gfg.a);
      $$1.a("right_arm", gfj.c().a(44, 22).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), gfg.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", gfj.c().a(44, 22).a().a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), gfg.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", gfj.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), gfg.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", gfj.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), gfg.a(2.0F, 12.0F, 0.0F));
      return gfk.a($$0, 64, 64);
   }

   public static gfk a(gfi $$0) {
      gfm $$1 = gcp.a($$0, 0.0F);
      gfo $$2 = $$1.a();
      gfo $$3 = $$2.a("head", gfj.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), gfg.a);
      $$2.a("body", gfj.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0.a(0.1F)), gfg.a);
      $$2.a("right_leg", gfj.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), gfg.a(-2.0F, 12.0F, 0.0F));
      $$2.a("left_leg", gfj.c().a(0, 16).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), gfg.a(2.0F, 12.0F, 0.0F));
      $$3.b("hat").a("hat_rim", gfj.c(), gfg.a);
      return gfk.a($$1, 64, 32);
   }

   public void a(S $$0) {
      super.a($$0);
      float $$1 = $$0.H;
      gau.a(this.s, this.r, $$0.a, $$1, $$0.u);
   }

   @Override
   public void a(boolean $$0) {
      this.o.k = $$0;
      this.p.k = $$0;
      this.a.k = $$0;
   }

   @Override
   public void a(ffv $$0) {
      this.a(bvc.b, $$0);
   }
}
