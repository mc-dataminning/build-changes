public class fuy<T extends bsq> extends fvn<T> {
   private final fye a;
   private final fye b;
   private final fye f;
   private final fye g;
   private final fye h;
   private final fye i;
   private static final int j = 6;

   public fuy(fye $$0) {
      this.a = $$0;
      this.b = $$0.b("head");
      this.g = $$0.b("right_hind_leg");
      this.f = $$0.b("left_hind_leg");
      this.i = $$0.b("right_front_leg");
      this.h = $$0.b("left_front_leg");
   }

   public static fyk a(fyi $$0) {
      fym $$1 = new fym();
      fyn $$2 = $$1.a();
      $$2.a("head", fyj.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), fyg.a(0.0F, 6.0F, 0.0F));
      $$2.a("body", fyj.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0), fyg.a(0.0F, 6.0F, 0.0F));
      fyj $$3 = fyj.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, $$0);
      $$2.a("right_hind_leg", $$3, fyg.a(-2.0F, 18.0F, 4.0F));
      $$2.a("left_hind_leg", $$3, fyg.a(2.0F, 18.0F, 4.0F));
      $$2.a("right_front_leg", $$3, fyg.a(-2.0F, 18.0F, -4.0F));
      $$2.a("left_front_leg", $$3, fyg.a(2.0F, 18.0F, -4.0F));
      return fyk.a($$1, 64, 32);
   }

   @Override
   public fye a() {
      return this.a;
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.b.f = $$4 * (float) (Math.PI / 180.0);
      this.b.e = $$5 * (float) (Math.PI / 180.0);
      this.f.e = ayn.b($$1 * 0.6662F) * 1.4F * $$2;
      this.g.e = ayn.b($$1 * 0.6662F + (float) Math.PI) * 1.4F * $$2;
      this.h.e = ayn.b($$1 * 0.6662F + (float) Math.PI) * 1.4F * $$2;
      this.i.e = ayn.b($$1 * 0.6662F) * 1.4F * $$2;
   }
}
