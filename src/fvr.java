public class fvr extends fuw {
   private static final String a = "plate";
   private static final String b = "handle";
   private static final int c = 10;
   private static final int d = 20;
   private final fxa e;
   private final fxa f;
   private final fxa g;

   public fvr(fxa $$0) {
      super(gdw::c);
      this.e = $$0;
      this.f = $$0.b("plate");
      this.g = $$0.b("handle");
   }

   public static fxg a() {
      fxi $$0 = new fxi();
      fxj $$1 = $$0.a();
      $$1.a("plate", fxf.c().a(0, 0).a(-6.0F, -11.0F, -2.0F, 12.0F, 22.0F, 1.0F), fxc.a);
      $$1.a("handle", fxf.c().a(26, 0).a(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 6.0F), fxc.a);
      return fxg.a($$0, 64, 64);
   }

   public fxa b() {
      return this.f;
   }

   public fxa c() {
      return this.g;
   }

   @Override
   public void a(ezy $$0, fac $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.e.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
