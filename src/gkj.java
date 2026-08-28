public class gkj extends giy {
   public static final alk a = alk.b("textures/entity/trident.png");

   public gkj(glg $$0) {
      super($$0, gsn::d);
   }

   public static glm a() {
      glo $$0 = new glo();
      glq $$1 = $$0.a();
      glq $$2 = $$1.a("pole", gll.c().a(0, 6).a(-0.5F, 2.0F, -0.5F, 1.0F, 25.0F, 1.0F), gli.a);
      $$2.a("base", gll.c().a(4, 0).a(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F), gli.a);
      $$2.a("left_spike", gll.c().a(4, 3).a(-2.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), gli.a);
      $$2.a("middle_spike", gll.c().a(0, 0).a(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F), gli.a);
      $$2.a("right_spike", gll.c().a(4, 3).a().a(1.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), gli.a);
      return glm.a($$0, 32, 32);
   }
}
