public class fxp extends fwg {
   public static final akr a = akr.b("textures/entity/trident.png");
   private final fyk b;

   public fxp(fyk $$0) {
      super(gfh::c);
      this.b = $$0;
   }

   public static fyq a() {
      fys $$0 = new fys();
      fyt $$1 = $$0.a();
      fyt $$2 = $$1.a("pole", fyp.c().a(0, 6).a(-0.5F, 2.0F, -0.5F, 1.0F, 25.0F, 1.0F), fym.a);
      $$2.a("base", fyp.c().a(4, 0).a(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F), fym.a);
      $$2.a("left_spike", fyp.c().a(4, 3).a(-2.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), fym.a);
      $$2.a("middle_spike", fyp.c().a(0, 0).a(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F), fym.a);
      $$2.a("right_spike", fyp.c().a(4, 3).a().a(1.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), fym.a);
      return fyq.a($$0, 32, 32);
   }

   @Override
   public void a(fbi $$0, fbm $$1, int $$2, int $$3, int $$4) {
      this.b.a($$0, $$1, $$2, $$3, $$4);
   }
}
