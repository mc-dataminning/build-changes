public record fvw(int a, int b) {
   public static fvw a(fvu $$0, int $$1, int $$2) {
      return switch ($$0) {
         case a -> new fvw($$1, $$2);
         case b -> new fvw($$2, $$1);
      };
   }

   public fvw a(fvv $$0) {
      return switch ($$0) {
         case b -> new fvw(this.a, this.b + 1);
         case a -> new fvw(this.a, this.b - 1);
         case c -> new fvw(this.a - 1, this.b);
         case d -> new fvw(this.a + 1, this.b);
      };
   }

   public int a(fvu $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
      };
   }
}
