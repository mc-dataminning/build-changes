public enum fyp {
   a,
   b;

   public fyp a() {
      return switch (this) {
         case a -> b;
         case b -> a;
      };
   }

   public fyq b() {
      return switch (this) {
         case a -> fyq.d;
         case b -> fyq.b;
      };
   }

   public fyq c() {
      return switch (this) {
         case a -> fyq.c;
         case b -> fyq.a;
      };
   }

   public fyq a(boolean $$0) {
      return $$0 ? this.b() : this.c();
   }
}
