public class fwa extends fur {
   public static final alb a = new alb("textures/entity/trident.png");
   private final fwv b;

   public fwa(fwv $$0) {
      super(gdr::c);
      this.b = $$0;
   }

   public static fxb a() {
      fxd $$0 = new fxd();
      fxe $$1 = $$0.a();
      fxe $$2 = $$1.a("pole", fxa.c().a(0, 6).a(-0.5F, 2.0F, -0.5F, 1.0F, 25.0F, 1.0F), fwx.a);
      $$2.a("base", fxa.c().a(4, 0).a(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F), fwx.a);
      $$2.a("left_spike", fxa.c().a(4, 3).a(-2.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), fwx.a);
      $$2.a("middle_spike", fxa.c().a(0, 0).a(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F), fwx.a);
      $$2.a("right_spike", fxa.c().a(4, 3).a().a(1.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), fwx.a);
      return fxb.a($$0, 32, 32);
   }

   @Override
   public void a(ezt $$0, ezx $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
