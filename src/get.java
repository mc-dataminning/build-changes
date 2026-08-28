public class get<S extends hba> extends gcn<S> implements gel {
   private final gfc a = this.p.b("hat_rim");

   public get(gfc $$0) {
      super($$0);
   }

   public static gfi a() {
      gfk $$0 = gcn.a(gfg.a, 0.0F);
      gfm $$1 = $$0.a();
      gfm $$2 = $$1.a("head", new gfh().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F).a(24, 0).a(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F), gfe.a);
      gfm $$3 = $$2.a("hat", gfh.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new gfg(0.5F)), gfe.a);
      $$3.a("hat_rim", gfh.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), gfe.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$1.a("body", gfh.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F).a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new gfg(0.05F)), gfe.a);
      $$1.a("right_arm", gfh.c().a(44, 22).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), gfe.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", gfh.c().a(44, 22).a().a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), gfe.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", gfh.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), gfe.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", gfh.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), gfe.a(2.0F, 12.0F, 0.0F));
      return gfi.a($$0, 64, 64);
   }

   public static gfi a(gfg $$0) {
      gfk $$1 = gcn.a($$0, 0.0F);
      gfm $$2 = $$1.a();
      gfm $$3 = $$2.a("head", gfh.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), gfe.a);
      $$2.a("body", gfh.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0.a(0.1F)), gfe.a);
      $$2.a("right_leg", gfh.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), gfe.a(-2.0F, 12.0F, 0.0F));
      $$2.a("left_leg", gfh.c().a(0, 16).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), gfe.a(2.0F, 12.0F, 0.0F));
      $$3.b("hat").a("hat_rim", gfh.c(), gfe.a);
      return gfi.a($$1, 64, 32);
   }

   public void a(S $$0) {
      super.a($$0);
      float $$1 = $$0.H;
      gas.a(this.s, this.r, $$0.a, $$1, $$0.u);
   }

   @Override
   public void a(boolean $$0) {
      this.o.k = $$0;
      this.p.k = $$0;
      this.a.k = $$0;
   }

   @Override
   public void a(ffu $$0) {
      this.a(bva.b, $$0);
   }
}
