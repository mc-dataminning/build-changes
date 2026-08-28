public class fxu {
   private final fxw a;
   private final fxv b;

   private fxu(fxw $$0, fxv $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fxo a() {
      return this.a.a().a(this.b.a, this.b.b);
   }

   public static fxu a(fxw $$0, int $$1, int $$2) {
      return new fxu($$0, new fxv($$1, $$2));
   }
}
