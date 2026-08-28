public class gdn extends gcc {
   public static final alp a = alp.b("textures/entity/trident.png");

   public gdn(gej $$0) {
      super($$0, glq::d);
   }

   public static gep a() {
      ger $$0 = new ger();
      get $$1 = $$0.a();
      get $$2 = $$1.a("pole", geo.c().a(0, 6).a(-0.5F, 2.0F, -0.5F, 1.0F, 25.0F, 1.0F), gel.a);
      $$2.a("base", geo.c().a(4, 0).a(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F), gel.a);
      $$2.a("left_spike", geo.c().a(4, 3).a(-2.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), gel.a);
      $$2.a("middle_spike", geo.c().a(0, 0).a(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F), gel.a);
      $$2.a("right_spike", geo.c().a(4, 3).a().a(1.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), gel.a);
      return gep.a($$0, 32, 32);
   }
}
