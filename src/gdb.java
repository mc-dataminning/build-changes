public class gdb extends gcf {
   private static final String a = "plate";
   private static final String b = "handle";
   private static final int c = 10;
   private static final int d = 20;
   private final gem e;
   private final gem f;

   public gdb(gem $$0) {
      super($$0, glt::c);
      this.e = $$0.b("plate");
      this.f = $$0.b("handle");
   }

   public static ges a() {
      geu $$0 = new geu();
      gew $$1 = $$0.a();
      $$1.a("plate", ger.c().a(0, 0).a(-6.0F, -11.0F, -2.0F, 12.0F, 22.0F, 1.0F), geo.a);
      $$1.a("handle", ger.c().a(26, 0).a(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 6.0F), geo.a);
      return ges.a($$0, 64, 64);
   }

   public gem b() {
      return this.e;
   }

   public gem c() {
      return this.f;
   }
}
