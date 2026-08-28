public class gee<S extends hak> extends gby<S> implements gdw {
   private final gen a = this.p.b("hat_rim");

   public gee(gen $$0) {
      super($$0);
   }

   public static get a() {
      gev $$0 = gby.a(ger.a, 0.0F);
      gex $$1 = $$0.a();
      gex $$2 = $$1.a("head", new ges().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F).a(24, 0).a(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F), gep.a);
      gex $$3 = $$2.a("hat", ges.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new ger(0.5F)), gep.a);
      $$3.a("hat_rim", ges.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), gep.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$1.a("body", ges.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F).a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new ger(0.05F)), gep.a);
      $$1.a("right_arm", ges.c().a(44, 22).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), gep.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", ges.c().a(44, 22).a().a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), gep.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", ges.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), gep.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", ges.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), gep.a(2.0F, 12.0F, 0.0F));
      return get.a($$0, 64, 64);
   }

   public static get a(ger $$0) {
      gev $$1 = gby.a($$0, 0.0F);
      gex $$2 = $$1.a();
      gex $$3 = $$2.a("head", ges.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), gep.a);
      $$2.a("body", ges.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0.a(0.1F)), gep.a);
      $$2.a("right_leg", ges.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), gep.a(-2.0F, 12.0F, 0.0F));
      $$2.a("left_leg", ges.c().a(0, 16).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), gep.a(2.0F, 12.0F, 0.0F));
      $$3.b("hat").a("hat_rim", ges.c(), gep.a);
      return get.a($$1, 64, 32);
   }

   public void a(S $$0) {
      super.a($$0);
      float $$1 = $$0.C;
      gaf.a(this.s, this.r, $$0.a, $$1, $$0.p);
   }

   @Override
   public void a(boolean $$0) {
      this.o.k = $$0;
      this.p.k = $$0;
      this.a.k = $$0;
   }
}
