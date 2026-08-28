public class fxi {
   private final fxk a;
   private final fxj b;

   private fxi(fxk $$0, fxj $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fxc a() {
      return this.a.a().a(this.b.a, this.b.b);
   }

   public static fxi a(fxk $$0, int $$1, int $$2) {
      return new fxi($$0, new fxj($$1, $$2));
   }
}
