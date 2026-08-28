public class gjz extends gka {
   protected final glg a;

   public gjz(glg $$0) {
      super($$0);
      this.a = $$0.b("head");
   }

   public static glo a() {
      glo $$0 = new glo();
      glq $$1 = $$0.a();
      $$1.a("head", gll.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), gli.a);
      return $$0;
   }

   public static glm b() {
      glo $$0 = a();
      glq $$1 = $$0.a();
      $$1.b("head").a("hat", gll.c().a(32, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new glk(0.25F)), gli.a);
      return glm.a($$0, 64, 64);
   }

   public static glm c() {
      glo $$0 = a();
      return glm.a($$0, 64, 32);
   }

   @Override
   public void a(float $$0, float $$1, float $$2) {
      this.a.f = $$1 * (float) (Math.PI / 180.0);
      this.a.e = $$2 * (float) (Math.PI / 180.0);
   }
}
