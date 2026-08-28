public class fwd extends fuu {
   public static final ale a = new ale("textures/entity/trident.png");
   private final fwy b;

   public fwd(fwy $$0) {
      super(gdu::c);
      this.b = $$0;
   }

   public static fxe a() {
      fxg $$0 = new fxg();
      fxh $$1 = $$0.a();
      fxh $$2 = $$1.a("pole", fxd.c().a(0, 6).a(-0.5F, 2.0F, -0.5F, 1.0F, 25.0F, 1.0F), fxa.a);
      $$2.a("base", fxd.c().a(4, 0).a(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F), fxa.a);
      $$2.a("left_spike", fxd.c().a(4, 3).a(-2.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), fxa.a);
      $$2.a("middle_spike", fxd.c().a(0, 0).a(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F), fxa.a);
      $$2.a("right_spike", fxd.c().a(4, 3).a().a(1.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), fxa.a);
      return fxe.a($$0, 32, 32);
   }

   @Override
   public void a(ezw $$0, faa $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
