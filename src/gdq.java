public class gdq extends gcf {
   public static final alz a = alz.b("textures/entity/trident.png");

   public gdq(gem $$0) {
      super($$0, glt::c);
   }

   public static ges a() {
      geu $$0 = new geu();
      gew $$1 = $$0.a();
      gew $$2 = $$1.a("pole", ger.c().a(0, 6).a(-0.5F, 2.0F, -0.5F, 1.0F, 25.0F, 1.0F), geo.a);
      $$2.a("base", ger.c().a(4, 0).a(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F), geo.a);
      $$2.a("left_spike", ger.c().a(4, 3).a(-2.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), geo.a);
      $$2.a("middle_spike", ger.c().a(0, 0).a(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F), geo.a);
      $$2.a("right_spike", ger.c().a(4, 3).a().a(1.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), geo.a);
      return ges.a($$0, 32, 32);
   }
}
