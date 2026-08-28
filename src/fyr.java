public record fyr(int a, int b) {
   public static fyr a(fyp $$0, int $$1, int $$2) {
      return switch ($$0) {
         case a -> new fyr($$1, $$2);
         case b -> new fyr($$2, $$1);
      };
   }

   public fyr a(fyq $$0) {
      return switch ($$0) {
         case b -> new fyr(this.a, this.b + 1);
         case a -> new fyr(this.a, this.b - 1);
         case c -> new fyr(this.a - 1, this.b);
         case d -> new fyr(this.a + 1, this.b);
      };
   }

   public int a(fyp $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
      };
   }
}
