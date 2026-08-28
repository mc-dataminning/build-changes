public class fvv<T extends bsq> extends fvn<T> {
   private static final String a = "knot";
   private final fye b;
   private final fye f;

   public fvv(fye $$0) {
      this.b = $$0;
      this.f = $$0.b("knot");
   }

   public static fyk b() {
      fym $$0 = new fym();
      fyn $$1 = $$0.a();
      $$1.a("knot", fyj.c().a(0, 0).a(-3.0F, -8.0F, -3.0F, 6.0F, 8.0F, 6.0F), fyg.a);
      return fyk.a($$0, 32, 32);
   }

   @Override
   public fye a() {
      return this.b;
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.f.f = $$4 * (float) (Math.PI / 180.0);
      this.f.e = $$5 * (float) (Math.PI / 180.0);
   }
}
