public record fye(int a, int b) {
   public static fye a(fyc $$0, int $$1, int $$2) {
      return switch ($$0) {
         case a -> new fye($$1, $$2);
         case b -> new fye($$2, $$1);
      };
   }

   public fye a(fyd $$0) {
      return switch ($$0) {
         case b -> new fye(this.a, this.b + 1);
         case a -> new fye(this.a, this.b - 1);
         case c -> new fye(this.a - 1, this.b);
         case d -> new fye(this.a + 1, this.b);
      };
   }

   public int a(fyc $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
      };
   }
}
