public class gbt<S extends gxt> extends fzn<S> implements gbl {
   private final gcc a = this.p.b("hat_rim");

   public gbt(gcc $$0) {
      super($$0);
   }

   public static gci a() {
      gck $$0 = fzn.a(gcg.a, 0.0F);
      gcm $$1 = $$0.a();
      gcm $$2 = $$1.a("head", new gch().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F).a(24, 0).a(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F), gce.a);
      gcm $$3 = $$2.a("hat", gch.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new gcg(0.5F)), gce.a);
      $$3.a("hat_rim", gch.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), gce.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$1.a("body", gch.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F).a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new gcg(0.05F)), gce.a);
      $$1.a("right_arm", gch.c().a(44, 22).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), gce.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", gch.c().a(44, 22).a().a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), gce.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", gch.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), gce.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", gch.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), gce.a(2.0F, 12.0F, 0.0F));
      return gci.a($$0, 64, 64);
   }

   public static gci a(gcg $$0) {
      gck $$1 = fzn.a($$0, 0.0F);
      gcm $$2 = $$1.a();
      gcm $$3 = $$2.a("head", gch.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), gce.a);
      $$2.a("body", gch.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0.a(0.1F)), gce.a);
      $$2.a("right_leg", gch.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), gce.a(-2.0F, 12.0F, 0.0F));
      $$2.a("left_leg", gch.c().a(0, 16).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), gce.a(2.0F, 12.0F, 0.0F));
      $$3.b("hat").a("hat_rim", gch.c(), gce.a);
      return gci.a($$1, 64, 32);
   }

   public void a(S $$0) {
      super.a($$0);
      float $$1 = $$0.C;
      fxv.a(this.s, this.r, $$0.a, $$1, $$0.p);
   }

   @Override
   public void a(boolean $$0) {
      this.o.k = $$0;
      this.p.k = $$0;
      this.a.k = $$0;
   }
}
