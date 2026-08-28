public class gep {
   private final ger a;
   private final geq b;

   private gep(ger $$0, geq $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gep a(ges $$0) {
      return new gep($$0.apply(this.a), this.b);
   }

   public gej a() {
      return this.a.a().a(this.b.a, this.b.b);
   }

   public static gep a(ger $$0, int $$1, int $$2) {
      return new gep($$0, new geq($$1, $$2));
   }
}
