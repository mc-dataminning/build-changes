public class gei extends gcx {
   public static final akv a = akv.b("textures/entity/trident.png");

   public gei(gfe $$0) {
      super($$0, gmj::d);
   }

   public static gfk a() {
      gfm $$0 = new gfm();
      gfo $$1 = $$0.a();
      gfo $$2 = $$1.a("pole", gfj.c().a(0, 6).a(-0.5F, 2.0F, -0.5F, 1.0F, 25.0F, 1.0F), gfg.a);
      $$2.a("base", gfj.c().a(4, 0).a(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F), gfg.a);
      $$2.a("left_spike", gfj.c().a(4, 3).a(-2.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), gfg.a);
      $$2.a("middle_spike", gfj.c().a(0, 0).a(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F), gfg.a);
      $$2.a("right_spike", gfj.c().a(4, 3).a().a(1.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), gfg.a);
      return gfk.a($$0, 32, 32);
   }
}
