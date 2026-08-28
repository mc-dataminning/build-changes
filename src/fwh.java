public class fwh extends fuy {
   public static final alf a = new alf("textures/entity/trident.png");
   private final fxc b;

   public fwh(fxc $$0) {
      super(gdy::c);
      this.b = $$0;
   }

   public static fxi a() {
      fxk $$0 = new fxk();
      fxl $$1 = $$0.a();
      fxl $$2 = $$1.a("pole", fxh.c().a(0, 6).a(-0.5F, 2.0F, -0.5F, 1.0F, 25.0F, 1.0F), fxe.a);
      $$2.a("base", fxh.c().a(4, 0).a(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F), fxe.a);
      $$2.a("left_spike", fxh.c().a(4, 3).a(-2.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), fxe.a);
      $$2.a("middle_spike", fxh.c().a(0, 0).a(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F), fxe.a);
      $$2.a("right_spike", fxh.c().a(4, 3).a().a(1.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), fxe.a);
      return fxi.a($$0, 32, 32);
   }

   @Override
   public void a(faa $$0, fae $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
