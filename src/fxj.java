public class fxj extends fwa {
   public static final akq a = akq.b("textures/entity/trident.png");
   private final fye b;

   public fxj(fye $$0) {
      super(gfb::c);
      this.b = $$0;
   }

   public static fyk a() {
      fym $$0 = new fym();
      fyn $$1 = $$0.a();
      fyn $$2 = $$1.a("pole", fyj.c().a(0, 6).a(-0.5F, 2.0F, -0.5F, 1.0F, 25.0F, 1.0F), fyg.a);
      $$2.a("base", fyj.c().a(4, 0).a(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F), fyg.a);
      $$2.a("left_spike", fyj.c().a(4, 3).a(-2.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), fyg.a);
      $$2.a("middle_spike", fyj.c().a(0, 0).a(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F), fyg.a);
      $$2.a("right_spike", fyj.c().a(4, 3).a().a(1.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), fyg.a);
      return fyk.a($$0, 32, 32);
   }

   @Override
   public void a(fbc $$0, fbg $$1, int $$2, int $$3, int $$4) {
      this.b.a($$0, $$1, $$2, $$3, $$4);
   }
}
