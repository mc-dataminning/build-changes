public class gic extends ghg {
   private static final String a = "plate";
   private static final String b = "handle";
   private static final int c = 10;
   private static final int d = 20;
   private final gjo e;
   private final gjo f;

   public gic(gjo $$0) {
      super($$0, gqx::d);
      this.e = $$0.b("plate");
      this.f = $$0.b("handle");
   }

   public static gju a() {
      gjw $$0 = new gjw();
      gjy $$1 = $$0.a();
      $$1.a("plate", gjt.c().a(0, 0).a(-6.0F, -11.0F, -2.0F, 12.0F, 22.0F, 1.0F), gjq.a);
      $$1.a("handle", gjt.c().a(26, 0).a(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 6.0F), gjq.a);
      return gju.a($$0, 64, 64);
   }

   public gjo b() {
      return this.e;
   }

   public gjo c() {
      return this.f;
   }
}
