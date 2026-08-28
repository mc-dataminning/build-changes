public class fxh<T extends ckj> extends fvb<T> implements fwy {
   private final fxo a = this.l.b("hat_rim");

   public fxh(fxo $$0) {
      super($$0);
   }

   public static fxu c() {
      fxw $$0 = fvb.a(fxs.a, 0.0F);
      fxx $$1 = $$0.a();
      $$1.a("head", new fxt().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F).a(24, 0).a(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F), fxq.a);
      fxx $$2 = $$1.a("hat", fxt.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new fxs(0.5F)), fxq.a);
      $$2.a("hat_rim", fxt.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), fxq.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$1.a("body", fxt.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F).a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new fxs(0.05F)), fxq.a);
      $$1.a("right_arm", fxt.c().a(44, 22).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), fxq.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", fxt.c().a(44, 22).a().a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), fxq.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", fxt.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), fxq.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", fxt.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), fxq.a(2.0F, 12.0F, 0.0F));
      return fxu.a($$0, 64, 64);
   }

   public static fxu a(fxs $$0) {
      fxw $$1 = fvb.a($$0, 0.0F);
      fxx $$2 = $$1.a();
      $$2.a("head", fxt.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), fxq.a);
      $$2.a("body", fxt.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0.a(0.1F)), fxq.a);
      $$2.a("right_leg", fxt.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), fxq.a(-2.0F, 12.0F, 0.0F));
      $$2.a("left_leg", fxt.c().a(0, 16).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), fxq.a(2.0F, 12.0F, 0.0F));
      $$2.a("hat").a("hat_rim", fxt.c(), fxq.a);
      return fxu.a($$1, 64, 32);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      ftl.a(this.o, this.n, $$0.gf(), this.c, $$3);
   }

   @Override
   public void a(boolean $$0) {
      this.k.k = $$0;
      this.l.k = $$0;
      this.a.k = $$0;
   }
}
