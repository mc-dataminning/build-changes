public class gee extends gct {
   public static final aku a = aku.b("textures/entity/trident.png");

   public gee(gfa $$0) {
      super($$0, gmf::d);
   }

   public static gfg a() {
      gfi $$0 = new gfi();
      gfk $$1 = $$0.a();
      gfk $$2 = $$1.a("pole", gff.c().a(0, 6).a(-0.5F, 2.0F, -0.5F, 1.0F, 25.0F, 1.0F), gfc.a);
      $$2.a("base", gff.c().a(4, 0).a(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F), gfc.a);
      $$2.a("left_spike", gff.c().a(4, 3).a(-2.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), gfc.a);
      $$2.a("middle_spike", gff.c().a(0, 0).a(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F), gfc.a);
      $$2.a("right_spike", gff.c().a(4, 3).a().a(1.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), gfc.a);
      return gfg.a($$0, 32, 32);
   }
}
