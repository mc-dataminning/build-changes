public class gea<S extends hag> extends gbu<S> implements gds {
   private final gej a = this.p.b("hat_rim");

   public gea(gej $$0) {
      super($$0);
   }

   public static gep a() {
      ger $$0 = gbu.a(gen.a, 0.0F);
      get $$1 = $$0.a();
      get $$2 = $$1.a("head", new geo().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F).a(24, 0).a(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F), gel.a);
      get $$3 = $$2.a("hat", geo.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new gen(0.5F)), gel.a);
      $$3.a("hat_rim", geo.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), gel.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$1.a("body", geo.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F).a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new gen(0.05F)), gel.a);
      $$1.a("right_arm", geo.c().a(44, 22).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), gel.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", geo.c().a(44, 22).a().a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), gel.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", geo.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), gel.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", geo.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), gel.a(2.0F, 12.0F, 0.0F));
      return gep.a($$0, 64, 64);
   }

   public static gep a(gen $$0) {
      ger $$1 = gbu.a($$0, 0.0F);
      get $$2 = $$1.a();
      get $$3 = $$2.a("head", geo.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), gel.a);
      $$2.a("body", geo.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0.a(0.1F)), gel.a);
      $$2.a("right_leg", geo.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), gel.a(-2.0F, 12.0F, 0.0F));
      $$2.a("left_leg", geo.c().a(0, 16).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), gel.a(2.0F, 12.0F, 0.0F));
      $$3.b("hat").a("hat_rim", geo.c(), gel.a);
      return gep.a($$1, 64, 32);
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

   @Override
   public void a(fgl $$0) {
      this.a(bvr.b, $$0);
   }
}
