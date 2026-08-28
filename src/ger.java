public class ger extends gdv {
   private static final String a = "plate";
   private static final String b = "handle";
   private static final int c = 10;
   private static final int d = 20;
   private final ggc e;
   private final ggc f;

   public ger(ggc $$0) {
      super($$0, gnh::d);
      this.e = $$0.b("plate");
      this.f = $$0.b("handle");
   }

   public static ggi a() {
      ggk $$0 = new ggk();
      ggm $$1 = $$0.a();
      $$1.a("plate", ggh.c().a(0, 0).a(-6.0F, -11.0F, -2.0F, 12.0F, 22.0F, 1.0F), gge.a);
      $$1.a("handle", ggh.c().a(26, 0).a(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 6.0F), gge.a);
      return ggi.a($$0, 64, 64);
   }

   public ggc b() {
      return this.e;
   }

   public ggc c() {
      return this.f;
   }
}
