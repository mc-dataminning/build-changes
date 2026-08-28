public class gds extends gch {
   public static final alz a = alz.b("textures/entity/trident.png");

   public gds(geo $$0) {
      super($$0, glv::d);
   }

   public static geu a() {
      gew $$0 = new gew();
      gey $$1 = $$0.a();
      gey $$2 = $$1.a("pole", get.c().a(0, 6).a(-0.5F, 2.0F, -0.5F, 1.0F, 25.0F, 1.0F), geq.a);
      $$2.a("base", get.c().a(4, 0).a(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F), geq.a);
      $$2.a("left_spike", get.c().a(4, 3).a(-2.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), geq.a);
      $$2.a("middle_spike", get.c().a(0, 0).a(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F), geq.a);
      $$2.a("right_spike", get.c().a(4, 3).a().a(1.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), geq.a);
      return geu.a($$0, 32, 32);
   }
}
