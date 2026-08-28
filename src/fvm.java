public class fvm extends fur {
   private static final String a = "plate";
   private static final String b = "handle";
   private static final int c = 10;
   private static final int d = 20;
   private final fwv e;
   private final fwv f;
   private final fwv g;

   public fvm(fwv $$0) {
      super(gdr::c);
      this.e = $$0;
      this.f = $$0.b("plate");
      this.g = $$0.b("handle");
   }

   public static fxb a() {
      fxd $$0 = new fxd();
      fxe $$1 = $$0.a();
      $$1.a("plate", fxa.c().a(0, 0).a(-6.0F, -11.0F, -2.0F, 12.0F, 22.0F, 1.0F), fwx.a);
      $$1.a("handle", fxa.c().a(26, 0).a(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 6.0F), fwx.a);
      return fxb.a($$0, 64, 64);
   }

   public fwv b() {
      return this.f;
   }

   public fwv c() {
      return this.g;
   }

   @Override
   public void a(ezt $$0, ezx $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.e.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
