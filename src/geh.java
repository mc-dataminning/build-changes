public class geh extends gcw {
   public static final akv a = akv.b("textures/entity/trident.png");

   public geh(gfd $$0) {
      super($$0, gmi::d);
   }

   public static gfj a() {
      gfl $$0 = new gfl();
      gfn $$1 = $$0.a();
      gfn $$2 = $$1.a("pole", gfi.c().a(0, 6).a(-0.5F, 2.0F, -0.5F, 1.0F, 25.0F, 1.0F), gff.a);
      $$2.a("base", gfi.c().a(4, 0).a(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F), gff.a);
      $$2.a("left_spike", gfi.c().a(4, 3).a(-2.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), gff.a);
      $$2.a("middle_spike", gfi.c().a(0, 0).a(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F), gff.a);
      $$2.a("right_spike", gfi.c().a(4, 3).a().a(1.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), gff.a);
      return gfj.a($$0, 32, 32);
   }
}
