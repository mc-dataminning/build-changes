public record fwp(int a, int b) {
   public static fwp a(fwn $$0, int $$1, int $$2) {
      return switch ($$0) {
         case a -> new fwp($$1, $$2);
         case b -> new fwp($$2, $$1);
      };
   }

   public fwp a(fwo $$0) {
      return switch ($$0) {
         case b -> new fwp(this.a, this.b + 1);
         case a -> new fwp(this.a, this.b - 1);
         case c -> new fwp(this.a - 1, this.b);
         case d -> new fwp(this.a + 1, this.b);
      };
   }

   public int a(fwn $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
      };
   }
}
