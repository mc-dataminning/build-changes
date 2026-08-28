public class gju extends gij {
   public static final alr a = alr.b("textures/entity/trident.png");

   public gju(gkr $$0) {
      super($$0, gry::d);
   }

   public static gkx a() {
      gkz $$0 = new gkz();
      glb $$1 = $$0.a();
      glb $$2 = $$1.a("pole", gkw.c().a(0, 6).a(-0.5F, 2.0F, -0.5F, 1.0F, 25.0F, 1.0F), gkt.a);
      $$2.a("base", gkw.c().a(4, 0).a(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F), gkt.a);
      $$2.a("left_spike", gkw.c().a(4, 3).a(-2.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), gkt.a);
      $$2.a("middle_spike", gkw.c().a(0, 0).a(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F), gkt.a);
      $$2.a("right_spike", gkw.c().a(4, 3).a().a(1.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), gkt.a);
      return gkx.a($$0, 32, 32);
   }
}
