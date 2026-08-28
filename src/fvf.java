public class fvf<T extends bsg> extends fux<T> {
   private static final String a = "knot";
   private final fxo b;
   private final fxo f;

   public fvf(fxo $$0) {
      this.b = $$0;
      this.f = $$0.b("knot");
   }

   public static fxu b() {
      fxw $$0 = new fxw();
      fxx $$1 = $$0.a();
      $$1.a("knot", fxt.c().a(0, 0).a(-3.0F, -8.0F, -3.0F, 6.0F, 8.0F, 6.0F), fxq.a);
      return fxu.a($$0, 32, 32);
   }

   @Override
   public fxo a() {
      return this.b;
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.f.f = $$4 * (float) (Math.PI / 180.0);
      this.f.e = $$5 * (float) (Math.PI / 180.0);
   }
}
