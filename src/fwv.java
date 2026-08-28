public class fwv extends fvm {
   public static final akk a = new akk("textures/entity/trident.png");
   private final fxq b;

   public fwv(fxq $$0) {
      super(gen::c);
      this.b = $$0;
   }

   public static fxw a() {
      fxy $$0 = new fxy();
      fxz $$1 = $$0.a();
      fxz $$2 = $$1.a("pole", fxv.c().a(0, 6).a(-0.5F, 2.0F, -0.5F, 1.0F, 25.0F, 1.0F), fxs.a);
      $$2.a("base", fxv.c().a(4, 0).a(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F), fxs.a);
      $$2.a("left_spike", fxv.c().a(4, 3).a(-2.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), fxs.a);
      $$2.a("middle_spike", fxv.c().a(0, 0).a(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F), fxs.a);
      $$2.a("right_spike", fxv.c().a(4, 3).a().a(1.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), fxs.a);
      return fxw.a($$0, 32, 32);
   }

   @Override
   public void a(fao $$0, fas $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
