public class fyo {
   private final fyq a;
   private final fyp b;

   private fyo(fyq $$0, fyp $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fyi a() {
      return this.a.a().a(this.b.a, this.b.b);
   }

   public static fyo a(fyq $$0, int $$1, int $$2) {
      return new fyo($$0, new fyp($$1, $$2));
   }
}
