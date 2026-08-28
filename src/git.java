public class git<S extends hfe> extends ggm<S> implements gik {
   private final gjc a = this.p.b("hat_rim");

   public git(gjc $$0) {
      super($$0);
   }

   public static gji a() {
      gjk $$0 = ggm.a(gjg.a, 0.0F);
      gjm $$1 = $$0.a();
      gjm $$2 = $$1.a("head", new gjh().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F).a(24, 0).a(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F), gje.a);
      gjm $$3 = $$2.a("hat", gjh.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new gjg(0.5F)), gje.a);
      $$3.a("hat_rim", gjh.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), gje.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$1.a("body", gjh.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F).a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new gjg(0.05F)), gje.a);
      $$1.a("right_arm", gjh.c().a(44, 22).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), gje.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", gjh.c().a(44, 22).a().a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), gje.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", gjh.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), gje.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", gjh.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), gje.a(2.0F, 12.0F, 0.0F));
      return gji.a($$0, 64, 64);
   }

   public static gji a(gjg $$0) {
      gjk $$1 = ggm.a($$0, 0.0F);
      gjm $$2 = $$1.a();
      gjm $$3 = $$2.a("head", gjh.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), gje.a);
      $$2.a("body", gjh.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0.a(0.1F)), gje.a);
      $$2.a("right_leg", gjh.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), gje.a(-2.0F, 12.0F, 0.0F));
      $$2.a("left_leg", gjh.c().a(0, 16).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), gje.a(2.0F, 12.0F, 0.0F));
      $$3.b("hat").a("hat_rim", gjh.c(), gje.a);
      return gji.a($$1, 64, 32);
   }

   public void a(S $$0) {
      super.a($$0);
      float $$1 = $$0.H;
      gem.a(this.s, this.r, $$0.a, $$1, $$0.u);
   }

   @Override
   public void a(boolean $$0) {
      this.o.k = $$0;
      this.p.k = $$0;
      this.a.k = $$0;
   }

   @Override
   public void a(fjj $$0) {
      this.a(bwx.b, $$0);
   }
}
