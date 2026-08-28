public class gji {
   private final gjk a;
   private final gjj b;

   private gji(gjk $$0, gjj $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gji a(gjl $$0) {
      return new gji($$0.apply(this.a), this.b);
   }

   public gjc a() {
      return this.a.a().a(this.b.a, this.b.b);
   }

   public static gji a(gjk $$0, int $$1, int $$2) {
      return new gji($$0, new gjj($$1, $$2));
   }
}
