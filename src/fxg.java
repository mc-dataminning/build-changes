public class fxg {
   private final fxi a;
   private final fxh b;

   private fxg(fxi $$0, fxh $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fxa a() {
      return this.a.a().a(this.b.a, this.b.b);
   }

   public static fxg a(fxi $$0, int $$1, int $$2) {
      return new fxg($$0, new fxh($$1, $$2));
   }
}
