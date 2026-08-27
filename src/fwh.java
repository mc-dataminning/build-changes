public class fwh<T extends brv> extends fvz<T> {
   private static final String a = "knot";
   private final fys b;
   private final fys f;

   public fwh(fys $$0) {
      this.b = $$0;
      this.f = $$0.b("knot");
   }

   public static fyy b() {
      fza $$0 = new fza();
      fzb $$1 = $$0.a();
      $$1.a("knot", fyx.c().a(0, 0).a(-3.0F, -8.0F, -3.0F, 6.0F, 8.0F, 6.0F), fyu.a);
      return fyy.a($$0, 32, 32);
   }

   @Override
   public fys a() {
      return this.b;
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.f.f = $$4 * (float) (Math.PI / 180.0);
      this.f.e = $$5 * (float) (Math.PI / 180.0);
   }
}
