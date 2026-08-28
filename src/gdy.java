public class gdy<S extends hae> extends gbs<S> implements gdq {
   private final geh a = this.p.b("hat_rim");

   public gdy(geh $$0) {
      super($$0);
   }

   public static gen a() {
      gep $$0 = gbs.a(gel.a, 0.0F);
      ger $$1 = $$0.a();
      ger $$2 = $$1.a("head", new gem().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F).a(24, 0).a(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F), gej.a);
      ger $$3 = $$2.a("hat", gem.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new gel(0.5F)), gej.a);
      $$3.a("hat_rim", gem.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), gej.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$1.a("body", gem.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F).a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new gel(0.05F)), gej.a);
      $$1.a("right_arm", gem.c().a(44, 22).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), gej.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", gem.c().a(44, 22).a().a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), gej.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", gem.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), gej.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", gem.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), gej.a(2.0F, 12.0F, 0.0F));
      return gen.a($$0, 64, 64);
   }

   public static gen a(gel $$0) {
      gep $$1 = gbs.a($$0, 0.0F);
      ger $$2 = $$1.a();
      ger $$3 = $$2.a("head", gem.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), gej.a);
      $$2.a("body", gem.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0.a(0.1F)), gej.a);
      $$2.a("right_leg", gem.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), gej.a(-2.0F, 12.0F, 0.0F));
      $$2.a("left_leg", gem.c().a(0, 16).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), gej.a(2.0F, 12.0F, 0.0F));
      $$3.b("hat").a("hat_rim", gem.c(), gej.a);
      return gen.a($$1, 64, 32);
   }

   public void a(S $$0) {
      super.a($$0);
      float $$1 = $$0.C;
      fzz.a(this.s, this.r, $$0.a, $$1, $$0.p);
   }

   @Override
   public void a(boolean $$0) {
      this.o.k = $$0;
      this.p.k = $$0;
      this.a.k = $$0;
   }
}
