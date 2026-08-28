public class ghj {
   private final ghl a;
   private final ghk b;

   private ghj(ghl $$0, ghk $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public ghj a(ghm $$0) {
      return new ghj($$0.apply(this.a), this.b);
   }

   public ghd a() {
      return this.a.a().a(this.b.a, this.b.b);
   }

   public static ghj a(ghl $$0, int $$1, int $$2) {
      return new ghj($$0, new ghk($$1, $$2));
   }
}
