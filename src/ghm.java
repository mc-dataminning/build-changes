public class ghm extends giy {
   private static final String a = "bottom";
   private static final String b = "lid";
   private static final String c = "lock";
   private final glg d;
   private final glg e;

   public ghm(glg $$0) {
      super($$0, gsn::d);
      this.d = $$0.b("lid");
      this.e = $$0.b("lock");
   }

   public static glm a() {
      glo $$0 = new glo();
      glq $$1 = $$0.a();
      $$1.a("bottom", gll.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F), gli.a);
      $$1.a("lid", gll.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F), gli.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", gll.c().a(0, 0).a(7.0F, -2.0F, 14.0F, 2.0F, 4.0F, 1.0F), gli.a(0.0F, 9.0F, 1.0F));
      return glm.a($$0, 64, 64);
   }

   public static glm b() {
      glo $$0 = new glo();
      glq $$1 = $$0.a();
      $$1.a("bottom", gll.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), gli.a);
      $$1.a("lid", gll.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), gli.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", gll.c().a(0, 0).a(15.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), gli.a(0.0F, 9.0F, 1.0F));
      return glm.a($$0, 64, 64);
   }

   public static glm c() {
      glo $$0 = new glo();
      glq $$1 = $$0.a();
      $$1.a("bottom", gll.c().a(0, 19).a(0.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), gli.a);
      $$1.a("lid", gll.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), gli.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", gll.c().a(0, 0).a(0.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), gli.a(0.0F, 9.0F, 1.0F));
      return glm.a($$0, 64, 64);
   }

   public void a(float $$0) {
      this.d.e = -($$0 * (float) (Math.PI / 2));
      this.e.e = this.d.e;
   }
}
