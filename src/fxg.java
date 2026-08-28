public record fxg(int a, int b) {
   public static fxg a(fxe $$0, int $$1, int $$2) {
      return switch ($$0) {
         case a -> new fxg($$1, $$2);
         case b -> new fxg($$2, $$1);
      };
   }

   public fxg a(fxf $$0) {
      return switch ($$0) {
         case b -> new fxg(this.a, this.b + 1);
         case a -> new fxg(this.a, this.b - 1);
         case c -> new fxg(this.a - 1, this.b);
         case d -> new fxg(this.a + 1, this.b);
      };
   }

   public int a(fxe $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
      };
   }
}
