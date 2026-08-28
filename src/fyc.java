public enum fyc {
   a,
   b;

   public fyc a() {
      return switch (this) {
         case a -> b;
         case b -> a;
      };
   }

   public fyd b() {
      return switch (this) {
         case a -> fyd.d;
         case b -> fyd.b;
      };
   }

   public fyd c() {
      return switch (this) {
         case a -> fyd.c;
         case b -> fyd.a;
      };
   }

   public fyd a(boolean $$0) {
      return $$0 ? this.b() : this.c();
   }
}
