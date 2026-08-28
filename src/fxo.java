public class fxo {
   private final fxq a;
   private final fxp b;

   private fxo(fxq $$0, fxp $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fxi a() {
      return this.a.a().a(this.b.a, this.b.b);
   }

   public static fxo a(fxq $$0, int $$1, int $$2) {
      return new fxo($$0, new fxp($$1, $$2));
   }
}
