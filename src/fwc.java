public class fwc {
   private final fwe a;
   private final fwd b;

   private fwc(fwe $$0, fwd $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fvw a() {
      return this.a.a().a(this.b.a, this.b.b);
   }

   public static fwc a(fwe $$0, int $$1, int $$2) {
      return new fwc($$0, new fwd($$1, $$2));
   }
}
