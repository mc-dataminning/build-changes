public class fwf extends fuw {
   public static final alf a = new alf("textures/entity/trident.png");
   private final fxa b;

   public fwf(fxa $$0) {
      super(gdw::c);
      this.b = $$0;
   }

   public static fxg a() {
      fxi $$0 = new fxi();
      fxj $$1 = $$0.a();
      fxj $$2 = $$1.a("pole", fxf.c().a(0, 6).a(-0.5F, 2.0F, -0.5F, 1.0F, 25.0F, 1.0F), fxc.a);
      $$2.a("base", fxf.c().a(4, 0).a(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F), fxc.a);
      $$2.a("left_spike", fxf.c().a(4, 3).a(-2.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), fxc.a);
      $$2.a("middle_spike", fxf.c().a(0, 0).a(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F), fxc.a);
      $$2.a("right_spike", fxf.c().a(4, 3).a().a(1.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), fxc.a);
      return fxg.a($$0, 32, 32);
   }

   @Override
   public void a(ezy $$0, fac $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
