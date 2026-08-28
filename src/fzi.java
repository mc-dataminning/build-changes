public class fzi extends fxz<guc> {
   private final gbb a;
   private final gbb b;

   public fzi(gbb $$0) {
      super($$0);
      this.a = $$0.b("left_fin");
      this.b = $$0.b("right_fin");
   }

   public static gbh a() {
      gbj $$0 = new gbj();
      gbl $$1 = $$0.a();
      int $$2 = 23;
      $$1.a("body", gbg.c().a(0, 27).a(-1.5F, -2.0F, -1.5F, 3.0F, 2.0F, 3.0F), gbd.a(0.0F, 23.0F, 0.0F));
      $$1.a("right_eye", gbg.c().a(24, 6).a(-1.5F, 0.0F, -1.5F, 1.0F, 1.0F, 1.0F), gbd.a(0.0F, 20.0F, 0.0F));
      $$1.a("left_eye", gbg.c().a(28, 6).a(0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 1.0F), gbd.a(0.0F, 20.0F, 0.0F));
      $$1.a("back_fin", gbg.c().a(-3, 0).a(-1.5F, 0.0F, 0.0F, 3.0F, 0.0F, 3.0F), gbd.a(0.0F, 22.0F, 1.5F));
      $$1.a("right_fin", gbg.c().a(25, 0).a(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F), gbd.a(-1.5F, 22.0F, -1.5F));
      $$1.a("left_fin", gbg.c().a(25, 0).a(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F), gbd.a(1.5F, 22.0F, -1.5F));
      return gbh.a($$0, 32, 32);
   }

   @Override
   public void a(guc $$0) {
      super.a($$0);
      this.b.g = -0.2F + 0.4F * azj.a($$0.p * 0.2F);
      this.a.g = 0.2F - 0.4F * azj.a($$0.p * 0.2F);
   }
}
