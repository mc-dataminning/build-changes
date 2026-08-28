public class ghx<S extends heg> extends gfr<S> implements ghp {
   private final gig a = this.p.b("hat_rim");

   public ghx(gig $$0) {
      super($$0);
   }

   public static gim a() {
      gio $$0 = gfr.a(gik.a, 0.0F);
      giq $$1 = $$0.a();
      giq $$2 = $$1.a("head", new gil().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F).a(24, 0).a(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F), gii.a);
      giq $$3 = $$2.a("hat", gil.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new gik(0.5F)), gii.a);
      $$3.a("hat_rim", gil.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), gii.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$1.a("body", gil.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F).a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new gik(0.05F)), gii.a);
      $$1.a("right_arm", gil.c().a(44, 22).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), gii.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", gil.c().a(44, 22).a().a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), gii.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", gil.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), gii.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", gil.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), gii.a(2.0F, 12.0F, 0.0F));
      return gim.a($$0, 64, 64);
   }

   public static gim a(gik $$0) {
      gio $$1 = gfr.a($$0, 0.0F);
      giq $$2 = $$1.a();
      giq $$3 = $$2.a("head", gil.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), gii.a);
      $$2.a("body", gil.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0.a(0.1F)), gii.a);
      $$2.a("right_leg", gil.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), gii.a(-2.0F, 12.0F, 0.0F));
      $$2.a("left_leg", gil.c().a(0, 16).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), gii.a(2.0F, 12.0F, 0.0F));
      $$3.b("hat").a("hat_rim", gil.c(), gii.a);
      return gim.a($$1, 64, 32);
   }

   public void a(S $$0) {
      super.a($$0);
      float $$1 = $$0.H;
      gdt.a(this.s, this.r, $$0.a, $$1, $$0.u);
   }

   @Override
   public void a(boolean $$0) {
      this.o.k = $$0;
      this.p.k = $$0;
      this.a.k = $$0;
   }

   @Override
   public void a(fiq $$0) {
      this.a(bws.b, $$0);
   }
}
