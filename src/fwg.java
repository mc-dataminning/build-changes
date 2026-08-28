public enum fwg {
   a,
   b;

   public fwg a() {
      return switch (this) {
         case a -> b;
         case b -> a;
      };
   }

   public fwh b() {
      return switch (this) {
         case a -> fwh.d;
         case b -> fwh.b;
      };
   }

   public fwh c() {
      return switch (this) {
         case a -> fwh.c;
         case b -> fwh.a;
      };
   }

   public fwh a(boolean $$0) {
      return $$0 ? this.b() : this.c();
   }
}
