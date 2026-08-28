public record fut(int a, int b) {
   public static fut a(fur $$0, int $$1, int $$2) {
      return switch ($$0) {
         case a -> new fut($$1, $$2);
         case b -> new fut($$2, $$1);
      };
   }

   public fut a(fus $$0) {
      return switch ($$0) {
         case b -> new fut(this.a, this.b + 1);
         case a -> new fut(this.a, this.b - 1);
         case c -> new fut(this.a - 1, this.b);
         case d -> new fut(this.a + 1, this.b);
      };
   }

   public int a(fur $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
      };
   }
}
