public class giw extends ghl {
   public static final alg a = alg.b("textures/entity/trident.png");

   public giw(gjt $$0) {
      super($$0, grc::d);
   }

   public static gjz a() {
      gkb $$0 = new gkb();
      gkd $$1 = $$0.a();
      gkd $$2 = $$1.a("pole", gjy.c().a(0, 6).a(-0.5F, 2.0F, -0.5F, 1.0F, 25.0F, 1.0F), gjv.a);
      $$2.a("base", gjy.c().a(4, 0).a(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F), gjv.a);
      $$2.a("left_spike", gjy.c().a(4, 3).a(-2.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), gjv.a);
      $$2.a("middle_spike", gjy.c().a(0, 0).a(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F), gjv.a);
      $$2.a("right_spike", gjy.c().a(4, 3).a().a(1.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), gjv.a);
      return gjz.a($$0, 32, 32);
   }
}
