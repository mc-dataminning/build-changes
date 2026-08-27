public class fux {
   private final fuz a;
   private final fuy b;

   private fux(fuz $$0, fuy $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fur a() {
      return this.a.a().a(this.b.a, this.b.b);
   }

   public static fux a(fuz $$0, int $$1, int $$2) {
      return new fux($$0, new fuy($$1, $$2));
   }
}
