public record fwi(int a, int b) {
   public static fwi a(fwg $$0, int $$1, int $$2) {
      return switch ($$0) {
         case a -> new fwi($$1, $$2);
         case b -> new fwi($$2, $$1);
      };
   }

   public fwi a(fwh $$0) {
      return switch ($$0) {
         case b -> new fwi(this.a, this.b + 1);
         case a -> new fwi(this.a, this.b - 1);
         case c -> new fwi(this.a - 1, this.b);
         case d -> new fwi(this.a + 1, this.b);
      };
   }

   public int a(fwg $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
      };
   }
}
