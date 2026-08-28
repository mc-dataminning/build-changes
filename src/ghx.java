public class ghx extends ggm {
   public static final alg a = alg.b("textures/entity/trident.png");

   public ghx(giu $$0) {
      super($$0, gqc::d);
   }

   public static gja a() {
      gjc $$0 = new gjc();
      gje $$1 = $$0.a();
      gje $$2 = $$1.a("pole", giz.c().a(0, 6).a(-0.5F, 2.0F, -0.5F, 1.0F, 25.0F, 1.0F), giw.a);
      $$2.a("base", giz.c().a(4, 0).a(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F), giw.a);
      $$2.a("left_spike", giz.c().a(4, 3).a(-2.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), giw.a);
      $$2.a("middle_spike", giz.c().a(0, 0).a(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F), giw.a);
      $$2.a("right_spike", giz.c().a(4, 3).a().a(1.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), giw.a);
      return gja.a($$0, 32, 32);
   }
}
