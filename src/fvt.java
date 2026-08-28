public class fvt extends fuy {
   private static final String a = "plate";
   private static final String b = "handle";
   private static final int c = 10;
   private static final int d = 20;
   private final fxc e;
   private final fxc f;
   private final fxc g;

   public fvt(fxc $$0) {
      super(gdy::c);
      this.e = $$0;
      this.f = $$0.b("plate");
      this.g = $$0.b("handle");
   }

   public static fxi a() {
      fxk $$0 = new fxk();
      fxl $$1 = $$0.a();
      $$1.a("plate", fxh.c().a(0, 0).a(-6.0F, -11.0F, -2.0F, 12.0F, 22.0F, 1.0F), fxe.a);
      $$1.a("handle", fxh.c().a(26, 0).a(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 6.0F), fxe.a);
      return fxi.a($$0, 64, 64);
   }

   public fxc b() {
      return this.f;
   }

   public fxc c() {
      return this.g;
   }

   @Override
   public void a(faa $$0, fae $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.e.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
