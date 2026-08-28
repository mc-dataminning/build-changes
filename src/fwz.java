public class fwz extends fwe {
   private static final String a = "plate";
   private static final String b = "handle";
   private static final int c = 10;
   private static final int d = 20;
   private final fyi e;
   private final fyi f;
   private final fyi g;

   public fwz(fyi $$0) {
      super(gff::c);
      this.e = $$0;
      this.f = $$0.b("plate");
      this.g = $$0.b("handle");
   }

   public static fyo a() {
      fyq $$0 = new fyq();
      fyr $$1 = $$0.a();
      $$1.a("plate", fyn.c().a(0, 0).a(-6.0F, -11.0F, -2.0F, 12.0F, 22.0F, 1.0F), fyk.a);
      $$1.a("handle", fyn.c().a(26, 0).a(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 6.0F), fyk.a);
      return fyo.a($$0, 64, 64);
   }

   public fyi b() {
      return this.f;
   }

   public fyi c() {
      return this.g;
   }

   @Override
   public void a(fbg $$0, fbk $$1, int $$2, int $$3, int $$4) {
      this.e.a($$0, $$1, $$2, $$3, $$4);
   }
}
