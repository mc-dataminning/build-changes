public class fup<T extends bss> extends fuh<T> {
   private static final String a = "knot";
   private final fwy b;
   private final fwy f;

   public fup(fwy $$0) {
      this.b = $$0;
      this.f = $$0.b("knot");
   }

   public static fxe b() {
      fxg $$0 = new fxg();
      fxh $$1 = $$0.a();
      $$1.a("knot", fxd.c().a(0, 0).a(-3.0F, -8.0F, -3.0F, 6.0F, 8.0F, 6.0F), fxa.a);
      return fxe.a($$0, 32, 32);
   }

   @Override
   public fwy a() {
      return this.b;
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.f.f = $$4 * (float) (Math.PI / 180.0);
      this.f.e = $$5 * (float) (Math.PI / 180.0);
   }
}
