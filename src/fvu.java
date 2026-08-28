public enum fvu {
   a,
   b;

   public fvu a() {
      return switch (this) {
         case a -> b;
         case b -> a;
      };
   }

   public fvv b() {
      return switch (this) {
         case a -> fvv.d;
         case b -> fvv.b;
      };
   }

   public fvv c() {
      return switch (this) {
         case a -> fvv.c;
         case b -> fvv.a;
      };
   }

   public fvv a(boolean $$0) {
      return $$0 ? this.b() : this.c();
   }
}
