public class fwe extends fuv {
   public static final ale a = new ale("textures/entity/trident.png");
   private final fwz b;

   public fwe(fwz $$0) {
      super(gdv::c);
      this.b = $$0;
   }

   public static fxf a() {
      fxh $$0 = new fxh();
      fxi $$1 = $$0.a();
      fxi $$2 = $$1.a("pole", fxe.c().a(0, 6).a(-0.5F, 2.0F, -0.5F, 1.0F, 25.0F, 1.0F), fxb.a);
      $$2.a("base", fxe.c().a(4, 0).a(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F), fxb.a);
      $$2.a("left_spike", fxe.c().a(4, 3).a(-2.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), fxb.a);
      $$2.a("middle_spike", fxe.c().a(0, 0).a(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F), fxb.a);
      $$2.a("right_spike", fxe.c().a(4, 3).a().a(1.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), fxb.a);
      return fxf.a($$0, 32, 32);
   }

   @Override
   public void a(ezx $$0, fab $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
