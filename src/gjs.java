public class gjs extends giw {
   private static final String a = "plate";
   private static final String b = "handle";
   private static final int c = 10;
   private static final int d = 20;
   private final gle e;
   private final gle f;

   public gjs(gle $$0) {
      super($$0, gsl::d);
      this.e = $$0.b("plate");
      this.f = $$0.b("handle");
   }

   public static glk a() {
      glm $$0 = new glm();
      glo $$1 = $$0.a();
      $$1.a("plate", glj.c().a(0, 0).a(-6.0F, -11.0F, -2.0F, 12.0F, 22.0F, 1.0F), glg.a);
      $$1.a("handle", glj.c().a(26, 0).a(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 6.0F), glg.a);
      return glk.a($$0, 64, 64);
   }

   public gle b() {
      return this.e;
   }

   public gle c() {
      return this.f;
   }
}
