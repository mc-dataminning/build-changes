public enum fyr {
   a,
   b;

   public fyr a() {
      return switch (this) {
         case a -> b;
         case b -> a;
      };
   }

   public fys b() {
      return switch (this) {
         case a -> fys.d;
         case b -> fys.b;
      };
   }

   public fys c() {
      return switch (this) {
         case a -> fys.c;
         case b -> fys.a;
      };
   }

   public fys a(boolean $$0) {
      return $$0 ? this.b() : this.c();
   }
}
