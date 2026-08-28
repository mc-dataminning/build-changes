public class fwn extends fve {
   public static final akk a = new akk("textures/entity/trident.png");
   private final fxi b;

   public fwn(fxi $$0) {
      super(gef::c);
      this.b = $$0;
   }

   public static fxo a() {
      fxq $$0 = new fxq();
      fxr $$1 = $$0.a();
      fxr $$2 = $$1.a("pole", fxn.c().a(0, 6).a(-0.5F, 2.0F, -0.5F, 1.0F, 25.0F, 1.0F), fxk.a);
      $$2.a("base", fxn.c().a(4, 0).a(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F), fxk.a);
      $$2.a("left_spike", fxn.c().a(4, 3).a(-2.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), fxk.a);
      $$2.a("middle_spike", fxn.c().a(0, 0).a(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F), fxk.a);
      $$2.a("right_spike", fxn.c().a(4, 3).a().a(1.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), fxk.a);
      return fxo.a($$0, 32, 32);
   }

   @Override
   public void a(fag $$0, fak $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
