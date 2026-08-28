public class gjm extends gic<her> {
   private final glg a;
   private final glg b;

   public gjm(glg $$0) {
      super($$0);
      this.a = $$0.b("left_fin");
      this.b = $$0.b("right_fin");
   }

   public static glm a() {
      glo $$0 = new glo();
      glq $$1 = $$0.a();
      int $$2 = 23;
      $$1.a("body", gll.c().a(0, 27).a(-1.5F, -2.0F, -1.5F, 3.0F, 2.0F, 3.0F), gli.a(0.0F, 23.0F, 0.0F));
      $$1.a("right_eye", gll.c().a(24, 6).a(-1.5F, 0.0F, -1.5F, 1.0F, 1.0F, 1.0F), gli.a(0.0F, 20.0F, 0.0F));
      $$1.a("left_eye", gll.c().a(28, 6).a(0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 1.0F), gli.a(0.0F, 20.0F, 0.0F));
      $$1.a("back_fin", gll.c().a(-3, 0).a(-1.5F, 0.0F, 0.0F, 3.0F, 0.0F, 3.0F), gli.a(0.0F, 22.0F, 1.5F));
      $$1.a("right_fin", gll.c().a(25, 0).a(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F), gli.a(-1.5F, 22.0F, -1.5F));
      $$1.a("left_fin", gll.c().a(25, 0).a(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F), gli.a(1.5F, 22.0F, -1.5F));
      return glm.a($$0, 32, 32);
   }

   @Override
   public void a(her $$0) {
      super.a($$0);
      this.b.g = -0.2F + 0.4F * azq.a($$0.u * 0.2F);
      this.a.g = 0.2F - 0.4F * azq.a($$0.u * 0.2F);
   }
}
