public class ghk extends gfz {
   public static final ale a = ale.b("textures/entity/trident.png");

   public ghk(gig $$0) {
      super($$0, gpn::d);
   }

   public static gim a() {
      gio $$0 = new gio();
      giq $$1 = $$0.a();
      giq $$2 = $$1.a("pole", gil.c().a(0, 6).a(-0.5F, 2.0F, -0.5F, 1.0F, 25.0F, 1.0F), gii.a);
      $$2.a("base", gil.c().a(4, 0).a(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F), gii.a);
      $$2.a("left_spike", gil.c().a(4, 3).a(-2.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), gii.a);
      $$2.a("middle_spike", gil.c().a(0, 0).a(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F), gii.a);
      $$2.a("right_spike", gil.c().a(4, 3).a().a(1.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), gii.a);
      return gim.a($$0, 32, 32);
   }
}
