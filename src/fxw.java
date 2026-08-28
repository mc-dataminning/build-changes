public class fxw {
   private final fxy a;
   private final fxx b;

   private fxw(fxy $$0, fxx $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fxq a() {
      return this.a.a().a(this.b.a, this.b.b);
   }

   public static fxw a(fxy $$0, int $$1, int $$2) {
      return new fxw($$0, new fxx($$1, $$2));
   }
}
