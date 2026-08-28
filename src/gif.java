public class gif extends ggu {
   public static final alg a = alg.b("textures/entity/trident.png");

   public gif(gjc $$0) {
      super($$0, gqk::d);
   }

   public static gji a() {
      gjk $$0 = new gjk();
      gjm $$1 = $$0.a();
      gjm $$2 = $$1.a("pole", gjh.c().a(0, 6).a(-0.5F, 2.0F, -0.5F, 1.0F, 25.0F, 1.0F), gje.a);
      $$2.a("base", gjh.c().a(4, 0).a(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F), gje.a);
      $$2.a("left_spike", gjh.c().a(4, 3).a(-2.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), gje.a);
      $$2.a("middle_spike", gjh.c().a(0, 0).a(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F), gje.a);
      $$2.a("right_spike", gjh.c().a(4, 3).a().a(1.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), gje.a);
      return gji.a($$0, 32, 32);
   }
}
