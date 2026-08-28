public class gju {
   private final gjw a;
   private final gjv b;

   private gju(gjw $$0, gjv $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gju a(gjx $$0) {
      return new gju($$0.apply(this.a), this.b);
   }

   public gjo a() {
      return this.a.a().a(this.b.a, this.b.b);
   }

   public static gju a(gjw $$0, int $$1, int $$2) {
      return new gju($$0, new gjv($$1, $$2));
   }
}
