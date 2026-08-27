public class fxx extends fwn {
   public static final akt a = new akt("textures/entity/trident.png");
   private final fys b;

   public fxx(fys $$0) {
      super(gfo::c);
      this.b = $$0;
   }

   public static fyy a() {
      fza $$0 = new fza();
      fzb $$1 = $$0.a();
      fzb $$2 = $$1.a("pole", fyx.c().a(0, 6).a(-0.5F, 2.0F, -0.5F, 1.0F, 25.0F, 1.0F), fyu.a);
      $$2.a("base", fyx.c().a(4, 0).a(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F), fyu.a);
      $$2.a("left_spike", fyx.c().a(4, 3).a(-2.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), fyu.a);
      $$2.a("middle_spike", fyx.c().a(0, 0).a(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F), fyu.a);
      $$2.a("right_spike", fyx.c().a(4, 3).a().a(1.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), fyu.a);
      return fyy.a($$0, 32, 32);
   }

   @Override
   public void a(fbc $$0, fbg $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
