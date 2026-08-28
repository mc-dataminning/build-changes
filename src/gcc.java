public class gcc<S extends gye> extends fzw<S> implements gbu {
   private final gcl a = this.p.b("hat_rim");

   public gcc(gcl $$0) {
      super($$0);
   }

   public static gcr a() {
      gct $$0 = fzw.a(gcp.a, 0.0F);
      gcv $$1 = $$0.a();
      gcv $$2 = $$1.a("head", new gcq().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F).a(24, 0).a(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F), gcn.a);
      gcv $$3 = $$2.a("hat", gcq.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new gcp(0.5F)), gcn.a);
      $$3.a("hat_rim", gcq.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), gcn.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$1.a("body", gcq.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F).a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new gcp(0.05F)), gcn.a);
      $$1.a("right_arm", gcq.c().a(44, 22).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), gcn.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", gcq.c().a(44, 22).a().a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), gcn.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", gcq.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), gcn.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", gcq.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), gcn.a(2.0F, 12.0F, 0.0F));
      return gcr.a($$0, 64, 64);
   }

   public static gcr a(gcp $$0) {
      gct $$1 = fzw.a($$0, 0.0F);
      gcv $$2 = $$1.a();
      gcv $$3 = $$2.a("head", gcq.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), gcn.a);
      $$2.a("body", gcq.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0.a(0.1F)), gcn.a);
      $$2.a("right_leg", gcq.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), gcn.a(-2.0F, 12.0F, 0.0F));
      $$2.a("left_leg", gcq.c().a(0, 16).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), gcn.a(2.0F, 12.0F, 0.0F));
      $$3.b("hat").a("hat_rim", gcq.c(), gcn.a);
      return gcr.a($$1, 64, 32);
   }

   public void a(S $$0) {
      super.a($$0);
      float $$1 = $$0.C;
      fye.a(this.s, this.r, $$0.a, $$1, $$0.p);
   }

   @Override
   public void a(boolean $$0) {
      this.o.k = $$0;
      this.p.k = $$0;
      this.a.k = $$0;
   }
}
