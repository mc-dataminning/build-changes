public record fyt(int a, int b) {
   public static fyt a(fyr $$0, int $$1, int $$2) {
      return switch ($$0) {
         case a -> new fyt($$1, $$2);
         case b -> new fyt($$2, $$1);
      };
   }

   public fyt a(fys $$0) {
      return switch ($$0) {
         case b -> new fyt(this.a, this.b + 1);
         case a -> new fyt(this.a, this.b - 1);
         case c -> new fyt(this.a - 1, this.b);
         case d -> new fyt(this.a + 1, this.b);
      };
   }

   public int a(fyr $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
      };
   }
}
