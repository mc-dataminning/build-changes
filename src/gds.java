public class gds extends gcw {
   private static final String a = "plate";
   private static final String b = "handle";
   private static final int c = 10;
   private static final int d = 20;
   private final gfd e;
   private final gfd f;

   public gds(gfd $$0) {
      super($$0, gmi::d);
      this.e = $$0.b("plate");
      this.f = $$0.b("handle");
   }

   public static gfj a() {
      gfl $$0 = new gfl();
      gfn $$1 = $$0.a();
      $$1.a("plate", gfi.c().a(0, 0).a(-6.0F, -11.0F, -2.0F, 12.0F, 22.0F, 1.0F), gff.a);
      $$1.a("handle", gfi.c().a(26, 0).a(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 6.0F), gff.a);
      return gfj.a($$0, 64, 64);
   }

   public gfd b() {
      return this.e;
   }

   public gfd c() {
      return this.f;
   }
}
