public class fxn extends fwe {
   public static final akr a = akr.b("textures/entity/trident.png");
   private final fyi b;

   public fxn(fyi $$0) {
      super(gff::c);
      this.b = $$0;
   }

   public static fyo a() {
      fyq $$0 = new fyq();
      fyr $$1 = $$0.a();
      fyr $$2 = $$1.a("pole", fyn.c().a(0, 6).a(-0.5F, 2.0F, -0.5F, 1.0F, 25.0F, 1.0F), fyk.a);
      $$2.a("base", fyn.c().a(4, 0).a(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F), fyk.a);
      $$2.a("left_spike", fyn.c().a(4, 3).a(-2.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), fyk.a);
      $$2.a("middle_spike", fyn.c().a(0, 0).a(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F), fyk.a);
      $$2.a("right_spike", fyn.c().a(4, 3).a().a(1.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), fyk.a);
      return fyo.a($$0, 32, 32);
   }

   @Override
   public void a(fbg $$0, fbk $$1, int $$2, int $$3, int $$4) {
      this.b.a($$0, $$1, $$2, $$3, $$4);
   }
}
