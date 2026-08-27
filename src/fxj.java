public class fxj extends fwn {
   private static final String a = "plate";
   private static final String b = "handle";
   private static final int c = 10;
   private static final int d = 20;
   private final fys e;
   private final fys f;
   private final fys g;

   public fxj(fys $$0) {
      super(gfo::c);
      this.e = $$0;
      this.f = $$0.b("plate");
      this.g = $$0.b("handle");
   }

   public static fyy a() {
      fza $$0 = new fza();
      fzb $$1 = $$0.a();
      $$1.a("plate", fyx.c().a(0, 0).a(-6.0F, -11.0F, -2.0F, 12.0F, 22.0F, 1.0F), fyu.a);
      $$1.a("handle", fyx.c().a(26, 0).a(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 6.0F), fyu.a);
      return fyy.a($$0, 64, 64);
   }

   public fys b() {
      return this.f;
   }

   public fys c() {
      return this.g;
   }

   @Override
   public void a(fbc $$0, fbg $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.e.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
