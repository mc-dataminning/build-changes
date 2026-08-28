public class fxb extends fwg {
   private static final String a = "plate";
   private static final String b = "handle";
   private static final int c = 10;
   private static final int d = 20;
   private final fyk e;
   private final fyk f;
   private final fyk g;

   public fxb(fyk $$0) {
      super(gfh::c);
      this.e = $$0;
      this.f = $$0.b("plate");
      this.g = $$0.b("handle");
   }

   public static fyq a() {
      fys $$0 = new fys();
      fyt $$1 = $$0.a();
      $$1.a("plate", fyp.c().a(0, 0).a(-6.0F, -11.0F, -2.0F, 12.0F, 22.0F, 1.0F), fym.a);
      $$1.a("handle", fyp.c().a(26, 0).a(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 6.0F), fym.a);
      return fyq.a($$0, 64, 64);
   }

   public fyk b() {
      return this.f;
   }

   public fyk c() {
      return this.g;
   }

   @Override
   public void a(fbi $$0, fbm $$1, int $$2, int $$3, int $$4) {
      this.e.a($$0, $$1, $$2, $$3, $$4);
   }
}
