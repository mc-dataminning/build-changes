public class gdc extends gcg {
   private static final String a = "plate";
   private static final String b = "handle";
   private static final int c = 10;
   private static final int d = 20;
   private final gen e;
   private final gen f;

   public gdc(gen $$0) {
      super($$0, glu::d);
      this.e = $$0.b("plate");
      this.f = $$0.b("handle");
   }

   public static get a() {
      gev $$0 = new gev();
      gex $$1 = $$0.a();
      $$1.a("plate", ges.c().a(0, 0).a(-6.0F, -11.0F, -2.0F, 12.0F, 22.0F, 1.0F), gep.a);
      $$1.a("handle", ges.c().a(26, 0).a(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 6.0F), gep.a);
      return get.a($$0, 64, 64);
   }

   public gen b() {
      return this.e;
   }

   public gen c() {
      return this.f;
   }
}
