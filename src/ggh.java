public class ggh extends gew {
   public static final ald a = ald.b("textures/entity/trident.png");

   public ggh(ghd $$0) {
      super($$0, goi::d);
   }

   public static ghj a() {
      ghl $$0 = new ghl();
      ghn $$1 = $$0.a();
      ghn $$2 = $$1.a("pole", ghi.c().a(0, 6).a(-0.5F, 2.0F, -0.5F, 1.0F, 25.0F, 1.0F), ghf.a);
      $$2.a("base", ghi.c().a(4, 0).a(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F), ghf.a);
      $$2.a("left_spike", ghi.c().a(4, 3).a(-2.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), ghf.a);
      $$2.a("middle_spike", ghi.c().a(0, 0).a(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F), ghf.a);
      $$2.a("right_spike", ghi.c().a(4, 3).a().a(1.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), ghf.a);
      return ghj.a($$0, 32, 32);
   }
}
