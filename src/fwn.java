public enum fwn {
   a,
   b;

   public fwn a() {
      return switch (this) {
         case a -> b;
         case b -> a;
      };
   }

   public fwo b() {
      return switch (this) {
         case a -> fwo.d;
         case b -> fwo.b;
      };
   }

   public fwo c() {
      return switch (this) {
         case a -> fwo.c;
         case b -> fwo.a;
      };
   }

   public fwo a(boolean $$0) {
      return $$0 ? this.b() : this.c();
   }
}
