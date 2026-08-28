public class ghk extends giw {
   private static final String a = "bottom";
   private static final String b = "lid";
   private static final String c = "lock";
   private final gle d;
   private final gle e;

   public ghk(gle $$0) {
      super($$0, gsl::d);
      this.d = $$0.b("lid");
      this.e = $$0.b("lock");
   }

   public static glk a() {
      glm $$0 = new glm();
      glo $$1 = $$0.a();
      $$1.a("bottom", glj.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F), glg.a);
      $$1.a("lid", glj.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F), glg.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", glj.c().a(0, 0).a(7.0F, -2.0F, 14.0F, 2.0F, 4.0F, 1.0F), glg.a(0.0F, 9.0F, 1.0F));
      return glk.a($$0, 64, 64);
   }

   public static glk b() {
      glm $$0 = new glm();
      glo $$1 = $$0.a();
      $$1.a("bottom", glj.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), glg.a);
      $$1.a("lid", glj.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), glg.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", glj.c().a(0, 0).a(15.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), glg.a(0.0F, 9.0F, 1.0F));
      return glk.a($$0, 64, 64);
   }

   public static glk c() {
      glm $$0 = new glm();
      glo $$1 = $$0.a();
      $$1.a("bottom", glj.c().a(0, 19).a(0.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), glg.a);
      $$1.a("lid", glj.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), glg.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", glj.c().a(0, 0).a(0.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), glg.a(0.0F, 9.0F, 1.0F));
      return glk.a($$0, 64, 64);
   }

   public void a(float $$0) {
      this.d.e = -($$0 * (float) (Math.PI / 2));
      this.e.e = this.d.e;
   }
}
