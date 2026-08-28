public class fxe {
   private final fxg a;
   private final fxf b;

   private fxe(fxg $$0, fxf $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fwy a() {
      return this.a.a().a(this.b.a, this.b.b);
   }

   public static fxe a(fxg $$0, int $$1, int $$2) {
      return new fxe($$0, new fxf($$1, $$2));
   }
}
