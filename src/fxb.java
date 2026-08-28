public record fxb(int a, int b) {
   public static fxb a(fwz $$0, int $$1, int $$2) {
      return switch ($$0) {
         case a -> new fxb($$1, $$2);
         case b -> new fxb($$2, $$1);
      };
   }

   public fxb a(fxa $$0) {
      return switch ($$0) {
         case b -> new fxb(this.a, this.b + 1);
         case a -> new fxb(this.a, this.b - 1);
         case c -> new fxb(this.a - 1, this.b);
         case d -> new fxb(this.a + 1, this.b);
      };
   }

   public int a(fwz $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
      };
   }
}
