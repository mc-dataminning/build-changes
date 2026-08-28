public class gft<S extends hcb> extends gdn<S> implements gfl {
   private final ggc a = this.p.b("hat_rim");

   public gft(ggc $$0) {
      super($$0);
   }

   public static ggi a() {
      ggk $$0 = gdn.a(ggg.a, 0.0F);
      ggm $$1 = $$0.a();
      ggm $$2 = $$1.a("head", new ggh().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F).a(24, 0).a(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F), gge.a);
      ggm $$3 = $$2.a("hat", ggh.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new ggg(0.5F)), gge.a);
      $$3.a("hat_rim", ggh.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), gge.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$1.a("body", ggh.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F).a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new ggg(0.05F)), gge.a);
      $$1.a("right_arm", ggh.c().a(44, 22).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), gge.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", ggh.c().a(44, 22).a().a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), gge.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", ggh.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), gge.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", ggh.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), gge.a(2.0F, 12.0F, 0.0F));
      return ggi.a($$0, 64, 64);
   }

   public static ggi a(ggg $$0) {
      ggk $$1 = gdn.a($$0, 0.0F);
      ggm $$2 = $$1.a();
      ggm $$3 = $$2.a("head", ggh.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), gge.a);
      $$2.a("body", ggh.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0.a(0.1F)), gge.a);
      $$2.a("right_leg", ggh.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), gge.a(-2.0F, 12.0F, 0.0F));
      $$2.a("left_leg", ggh.c().a(0, 16).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), gge.a(2.0F, 12.0F, 0.0F));
      $$3.b("hat").a("hat_rim", ggh.c(), gge.a);
      return ggi.a($$1, 64, 32);
   }

   public void a(S $$0) {
      super.a($$0);
      float $$1 = $$0.H;
      gbr.a(this.s, this.r, $$0.a, $$1, $$0.u);
   }

   @Override
   public void a(boolean $$0) {
      this.o.k = $$0;
      this.p.k = $$0;
      this.a.k = $$0;
   }

   @Override
   public void a(fgr $$0) {
      this.a(bvr.b, $$0);
   }
}
