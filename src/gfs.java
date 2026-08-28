public class gfs extends gew {
   private static final String a = "plate";
   private static final String b = "handle";
   private static final int c = 10;
   private static final int d = 20;
   private final ghd e;
   private final ghd f;

   public gfs(ghd $$0) {
      super($$0, goi::d);
      this.e = $$0.b("plate");
      this.f = $$0.b("handle");
   }

   public static ghj a() {
      ghl $$0 = new ghl();
      ghn $$1 = $$0.a();
      $$1.a("plate", ghi.c().a(0, 0).a(-6.0F, -11.0F, -2.0F, 12.0F, 22.0F, 1.0F), ghf.a);
      $$1.a("handle", ghi.c().a(26, 0).a(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 6.0F), ghf.a);
      return ghj.a($$0, 64, 64);
   }

   public ghd b() {
      return this.e;
   }

   public ghd c() {
      return this.f;
   }
}
