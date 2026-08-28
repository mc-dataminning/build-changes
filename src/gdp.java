public class gdp extends gct {
   private static final String a = "plate";
   private static final String b = "handle";
   private static final int c = 10;
   private static final int d = 20;
   private final gfa e;
   private final gfa f;

   public gdp(gfa $$0) {
      super($$0, gmf::d);
      this.e = $$0.b("plate");
      this.f = $$0.b("handle");
   }

   public static gfg a() {
      gfi $$0 = new gfi();
      gfk $$1 = $$0.a();
      $$1.a("plate", gff.c().a(0, 0).a(-6.0F, -11.0F, -2.0F, 12.0F, 22.0F, 1.0F), gfc.a);
      $$1.a("handle", gff.c().a(26, 0).a(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 6.0F), gfc.a);
      return gfg.a($$0, 64, 64);
   }

   public gfa b() {
      return this.e;
   }

   public gfa c() {
      return this.f;
   }
}
