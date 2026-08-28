public class gcy extends gcc {
   private static final String a = "plate";
   private static final String b = "handle";
   private static final int c = 10;
   private static final int d = 20;
   private final gej e;
   private final gej f;

   public gcy(gej $$0) {
      super($$0, glq::d);
      this.e = $$0.b("plate");
      this.f = $$0.b("handle");
   }

   public static gep a() {
      ger $$0 = new ger();
      get $$1 = $$0.a();
      $$1.a("plate", geo.c().a(0, 0).a(-6.0F, -11.0F, -2.0F, 12.0F, 22.0F, 1.0F), gel.a);
      $$1.a("handle", geo.c().a(26, 0).a(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 6.0F), gel.a);
      return gep.a($$0, 64, 64);
   }

   public gej b() {
      return this.e;
   }

   public gej c() {
      return this.f;
   }
}
