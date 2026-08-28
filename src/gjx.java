public class gjx extends gjy {
   protected final gle a;

   public gjx(gle $$0) {
      super($$0);
      this.a = $$0.b("head");
   }

   public static glm a() {
      glm $$0 = new glm();
      glo $$1 = $$0.a();
      $$1.a("head", glj.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), glg.a);
      return $$0;
   }

   public static glk b() {
      glm $$0 = a();
      glo $$1 = $$0.a();
      $$1.b("head").a("hat", glj.c().a(32, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new gli(0.25F)), glg.a);
      return glk.a($$0, 64, 64);
   }

   public static glk c() {
      glm $$0 = a();
      return glk.a($$0, 64, 32);
   }

   @Override
   public void a(float $$0, float $$1, float $$2) {
      this.a.f = $$1 * (float) (Math.PI / 180.0);
      this.a.e = $$2 * (float) (Math.PI / 180.0);
   }
}
