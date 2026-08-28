public enum fur {
   a,
   b;

   public fur a() {
      return switch (this) {
         case a -> b;
         case b -> a;
      };
   }

   public fus b() {
      return switch (this) {
         case a -> fus.d;
         case b -> fus.b;
      };
   }

   public fus c() {
      return switch (this) {
         case a -> fus.c;
         case b -> fus.a;
      };
   }

   public fus a(boolean $$0) {
      return $$0 ? this.b() : this.c();
   }
}
