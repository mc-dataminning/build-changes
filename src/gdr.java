public class gdr extends gcv {
   private static final String a = "plate";
   private static final String b = "handle";
   private static final int c = 10;
   private static final int d = 20;
   private final gfc e;
   private final gfc f;

   public gdr(gfc $$0) {
      super($$0, gmh::d);
      this.e = $$0.b("plate");
      this.f = $$0.b("handle");
   }

   public static gfi a() {
      gfk $$0 = new gfk();
      gfm $$1 = $$0.a();
      $$1.a("plate", gfh.c().a(0, 0).a(-6.0F, -11.0F, -2.0F, 12.0F, 22.0F, 1.0F), gfe.a);
      $$1.a("handle", gfh.c().a(26, 0).a(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 6.0F), gfe.a);
      return gfi.a($$0, 64, 64);
   }

   public gfc b() {
      return this.e;
   }

   public gfc c() {
      return this.f;
   }
}
