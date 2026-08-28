public class gja {
   private final gjc a;
   private final gjb b;

   private gja(gjc $$0, gjb $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gja a(gjd $$0) {
      return new gja($$0.apply(this.a), this.b);
   }

   public giu a() {
      return this.a.a().a(this.b.a, this.b.b);
   }

   public static gja a(gjc $$0, int $$1, int $$2) {
      return new gja($$0, new gjb($$1, $$2));
   }
}
