public class gjf extends gij {
   private static final String a = "plate";
   private static final String b = "handle";
   private static final int c = 10;
   private static final int d = 20;
   private final gkr e;
   private final gkr f;

   public gjf(gkr $$0) {
      super($$0, gry::d);
      this.e = $$0.b("plate");
      this.f = $$0.b("handle");
   }

   public static gkx a() {
      gkz $$0 = new gkz();
      glb $$1 = $$0.a();
      $$1.a("plate", gkw.c().a(0, 0).a(-6.0F, -11.0F, -2.0F, 12.0F, 22.0F, 1.0F), gkt.a);
      $$1.a("handle", gkw.c().a(26, 0).a(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 6.0F), gkt.a);
      return gkx.a($$0, 64, 64);
   }

   public gkr b() {
      return this.e;
   }

   public gkr c() {
      return this.f;
   }
}
