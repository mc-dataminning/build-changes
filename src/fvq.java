public class fvq extends fuv {
   private static final String a = "plate";
   private static final String b = "handle";
   private static final int c = 10;
   private static final int d = 20;
   private final fwz e;
   private final fwz f;
   private final fwz g;

   public fvq(fwz $$0) {
      super(gdv::c);
      this.e = $$0;
      this.f = $$0.b("plate");
      this.g = $$0.b("handle");
   }

   public static fxf a() {
      fxh $$0 = new fxh();
      fxi $$1 = $$0.a();
      $$1.a("plate", fxe.c().a(0, 0).a(-6.0F, -11.0F, -2.0F, 12.0F, 22.0F, 1.0F), fxb.a);
      $$1.a("handle", fxe.c().a(26, 0).a(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 6.0F), fxb.a);
      return fxf.a($$0, 64, 64);
   }

   public fwz b() {
      return this.f;
   }

   public fwz c() {
      return this.g;
   }

   @Override
   public void a(ezx $$0, fab $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.e.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
