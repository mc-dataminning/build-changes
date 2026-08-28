public class gen {
   private final gep a;
   private final geo b;

   private gen(gep $$0, geo $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gen a(geq $$0) {
      return new gen($$0.apply(this.a), this.b);
   }

   public geh a() {
      return this.a.a().a(this.b.a, this.b.b);
   }

   public static gen a(gep $$0, int $$1, int $$2) {
      return new gen($$0, new geo($$1, $$2));
   }
}
