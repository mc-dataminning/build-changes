public record fxh(gsn a, gsn b, gsn c) {
   public static fxh a(alk $$0) {
      return new fxh(gsn.v($$0), gsn.z($$0), gsn.x($$0));
   }

   public static fxh b(alk $$0) {
      return new fxh(gsn.u($$0), gsn.y($$0), gsn.w($$0));
   }

   public gsn a(ftx.a $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
         case c -> this.c;
      };
   }
}
