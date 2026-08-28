public class fvp extends fuu {
   private static final String a = "plate";
   private static final String b = "handle";
   private static final int c = 10;
   private static final int d = 20;
   private final fwy e;
   private final fwy f;
   private final fwy g;

   public fvp(fwy $$0) {
      super(gdu::c);
      this.e = $$0;
      this.f = $$0.b("plate");
      this.g = $$0.b("handle");
   }

   public static fxe a() {
      fxg $$0 = new fxg();
      fxh $$1 = $$0.a();
      $$1.a("plate", fxd.c().a(0, 0).a(-6.0F, -11.0F, -2.0F, 12.0F, 22.0F, 1.0F), fxa.a);
      $$1.a("handle", fxd.c().a(26, 0).a(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 6.0F), fxa.a);
      return fxe.a($$0, 64, 64);
   }

   public fwy b() {
      return this.f;
   }

   public fwy c() {
      return this.g;
   }

   @Override
   public void a(ezw $$0, faa $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.e.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
