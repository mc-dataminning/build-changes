public enum fwz {
   a,
   b;

   public fwz a() {
      return switch (this) {
         case a -> b;
         case b -> a;
      };
   }

   public fxa b() {
      return switch (this) {
         case a -> fxa.d;
         case b -> fxa.b;
      };
   }

   public fxa c() {
      return switch (this) {
         case a -> fxa.c;
         case b -> fxa.a;
      };
   }

   public fxa a(boolean $$0) {
      return $$0 ? this.b() : this.c();
   }
}
