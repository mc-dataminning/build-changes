public class fwn<T extends bsq> extends fvn<T> {
   private final fye a;
   private final fye b;
   private final fye f;

   public fwn(fye $$0) {
      this.a = $$0;
      this.b = $$0.b("left_fin");
      this.f = $$0.b("right_fin");
   }

   public static fyk b() {
      fym $$0 = new fym();
      fyn $$1 = $$0.a();
      int $$2 = 23;
      $$1.a("body", fyj.c().a(0, 27).a(-1.5F, -2.0F, -1.5F, 3.0F, 2.0F, 3.0F), fyg.a(0.0F, 23.0F, 0.0F));
      $$1.a("right_eye", fyj.c().a(24, 6).a(-1.5F, 0.0F, -1.5F, 1.0F, 1.0F, 1.0F), fyg.a(0.0F, 20.0F, 0.0F));
      $$1.a("left_eye", fyj.c().a(28, 6).a(0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 1.0F), fyg.a(0.0F, 20.0F, 0.0F));
      $$1.a("back_fin", fyj.c().a(-3, 0).a(-1.5F, 0.0F, 0.0F, 3.0F, 0.0F, 3.0F), fyg.a(0.0F, 22.0F, 1.5F));
      $$1.a("right_fin", fyj.c().a(25, 0).a(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F), fyg.a(-1.5F, 22.0F, -1.5F));
      $$1.a("left_fin", fyj.c().a(25, 0).a(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F), fyg.a(1.5F, 22.0F, -1.5F));
      return fyk.a($$0, 32, 32);
   }

   @Override
   public fye a() {
      return this.a;
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.f.g = -0.2F + 0.4F * ayn.a($$3 * 0.2F);
      this.b.g = 0.2F - 0.4F * ayn.a($$3 * 0.2F);
   }
}
