public class gba extends gae {
   private static final String a = "plate";
   private static final String b = "handle";
   private static final int c = 10;
   private static final int d = 20;
   private final gcl e;
   private final gcl f;

   public gba(gcl $$0) {
      super($$0, gjq::c);
      this.e = $$0.b("plate");
      this.f = $$0.b("handle");
   }

   public static gcr a() {
      gct $$0 = new gct();
      gcv $$1 = $$0.a();
      $$1.a("plate", gcq.c().a(0, 0).a(-6.0F, -11.0F, -2.0F, 12.0F, 22.0F, 1.0F), gcn.a);
      $$1.a("handle", gcq.c().a(26, 0).a(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 6.0F), gcn.a);
      return gcr.a($$0, 64, 64);
   }

   public gcl b() {
      return this.e;
   }

   public gcl c() {
      return this.f;
   }
}
