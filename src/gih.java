public class gih extends ghl {
   private static final String a = "plate";
   private static final String b = "handle";
   private static final int c = 10;
   private static final int d = 20;
   private final gjt e;
   private final gjt f;

   public gih(gjt $$0) {
      super($$0, grc::d);
      this.e = $$0.b("plate");
      this.f = $$0.b("handle");
   }

   public static gjz a() {
      gkb $$0 = new gkb();
      gkd $$1 = $$0.a();
      $$1.a("plate", gjy.c().a(0, 0).a(-6.0F, -11.0F, -2.0F, 12.0F, 22.0F, 1.0F), gjv.a);
      $$1.a("handle", gjy.c().a(26, 0).a(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 6.0F), gjv.a);
      return gjz.a($$0, 64, 64);
   }

   public gjt b() {
      return this.e;
   }

   public gjt c() {
      return this.f;
   }
}
