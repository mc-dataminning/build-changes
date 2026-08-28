public class fvh<T extends bsh> extends fuz<T> {
   private static final String a = "knot";
   private final fxq b;
   private final fxq f;

   public fvh(fxq $$0) {
      this.b = $$0;
      this.f = $$0.b("knot");
   }

   public static fxw b() {
      fxy $$0 = new fxy();
      fxz $$1 = $$0.a();
      $$1.a("knot", fxv.c().a(0, 0).a(-3.0F, -8.0F, -3.0F, 6.0F, 8.0F, 6.0F), fxs.a);
      return fxw.a($$0, 32, 32);
   }

   @Override
   public fxq a() {
      return this.b;
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.f.f = $$4 * (float) (Math.PI / 180.0);
      this.f.e = $$5 * (float) (Math.PI / 180.0);
   }
}
