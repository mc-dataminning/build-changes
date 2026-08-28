public class gah {
   private final gaj a;
   private final gai b;

   private gah(gaj $$0, gai $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gah a(gak $$0) {
      return new gah($$0.apply(this.a), this.b);
   }

   public gab a() {
      return this.a.a().a(this.b.a, this.b.b);
   }

   public static gah a(gaj $$0, int $$1, int $$2) {
      return new gah($$0, new gai($$1, $$2));
   }
}
