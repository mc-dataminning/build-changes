public record fuk(gpn a, gpn b, gpn c) {
   public static fuk a(ale $$0) {
      return new fuk(gpn.v($$0), gpn.z($$0), gpn.x($$0));
   }

   public static fuk b(ale $$0) {
      return new fuk(gpn.u($$0), gpn.y($$0), gpn.w($$0));
   }

   public gpn a(fra.a $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
         case c -> this.c;
      };
   }
}
