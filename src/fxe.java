public enum fxe {
   a,
   b;

   public fxe a() {
      return switch (this) {
         case a -> b;
         case b -> a;
      };
   }

   public fxf b() {
      return switch (this) {
         case a -> fxf.d;
         case b -> fxf.b;
      };
   }

   public fxf c() {
      return switch (this) {
         case a -> fxf.c;
         case b -> fxf.a;
      };
   }

   public fxf a(boolean $$0) {
      return $$0 ? this.b() : this.c();
   }
}
