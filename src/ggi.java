public class ggi {
   private final ggk a;
   private final ggj b;

   private ggi(ggk $$0, ggj $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public ggi a(ggl $$0) {
      return new ggi($$0.apply(this.a), this.b);
   }

   public ggc a() {
      return this.a.a().a(this.b.a, this.b.b);
   }

   public static ggi a(ggk $$0, int $$1, int $$2) {
      return new ggi($$0, new ggj($$1, $$2));
   }
}
