public class gbs {
   private final gbu a;
   private final gbt b;

   private gbs(gbu $$0, gbt $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gbs a(gbv $$0) {
      return new gbs($$0.apply(this.a), this.b);
   }

   public gbm a() {
      return this.a.a().a(this.b.a, this.b.b);
   }

   public static gbs a(gbu $$0, int $$1, int $$2) {
      return new gbs($$0, new gbt($$1, $$2));
   }
}
