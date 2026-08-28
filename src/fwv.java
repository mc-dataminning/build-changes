public class fwv extends fwa {
   private static final String a = "plate";
   private static final String b = "handle";
   private static final int c = 10;
   private static final int d = 20;
   private final fye e;
   private final fye f;
   private final fye g;

   public fwv(fye $$0) {
      super(gfb::c);
      this.e = $$0;
      this.f = $$0.b("plate");
      this.g = $$0.b("handle");
   }

   public static fyk a() {
      fym $$0 = new fym();
      fyn $$1 = $$0.a();
      $$1.a("plate", fyj.c().a(0, 0).a(-6.0F, -11.0F, -2.0F, 12.0F, 22.0F, 1.0F), fyg.a);
      $$1.a("handle", fyj.c().a(26, 0).a(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 6.0F), fyg.a);
      return fyk.a($$0, 64, 64);
   }

   public fye b() {
      return this.f;
   }

   public fye c() {
      return this.g;
   }

   @Override
   public void a(fbc $$0, fbg $$1, int $$2, int $$3, int $$4) {
      this.e.a($$0, $$1, $$2, $$3, $$4);
   }
}
