public class fve<T extends bsr> extends fvt<T> {
   private final fyk a;
   private final fyk b;
   private final fyk f;
   private final fyk g;
   private final fyk h;
   private final fyk i;
   private static final int j = 6;

   public fve(fyk $$0) {
      this.a = $$0;
      this.b = $$0.b("head");
      this.g = $$0.b("right_hind_leg");
      this.f = $$0.b("left_hind_leg");
      this.i = $$0.b("right_front_leg");
      this.h = $$0.b("left_front_leg");
   }

   public static fyq a(fyo $$0) {
      fys $$1 = new fys();
      fyt $$2 = $$1.a();
      $$2.a("head", fyp.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), fym.a(0.0F, 6.0F, 0.0F));
      $$2.a("body", fyp.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0), fym.a(0.0F, 6.0F, 0.0F));
      fyp $$3 = fyp.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, $$0);
      $$2.a("right_hind_leg", $$3, fym.a(-2.0F, 18.0F, 4.0F));
      $$2.a("left_hind_leg", $$3, fym.a(2.0F, 18.0F, 4.0F));
      $$2.a("right_front_leg", $$3, fym.a(-2.0F, 18.0F, -4.0F));
      $$2.a("left_front_leg", $$3, fym.a(2.0F, 18.0F, -4.0F));
      return fyq.a($$1, 64, 32);
   }

   @Override
   public fyk a() {
      return this.a;
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.b.f = $$4 * (float) (Math.PI / 180.0);
      this.b.e = $$5 * (float) (Math.PI / 180.0);
      this.f.e = ayo.b($$1 * 0.6662F) * 1.4F * $$2;
      this.g.e = ayo.b($$1 * 0.6662F + (float) Math.PI) * 1.4F * $$2;
      this.h.e = ayo.b($$1 * 0.6662F + (float) Math.PI) * 1.4F * $$2;
      this.i.e = ayo.b($$1 * 0.6662F) * 1.4F * $$2;
   }
}
