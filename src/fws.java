public record fws(gry a, gry b, gry c) {
   public static fws a(alr $$0) {
      return new fws(gry.v($$0), gry.z($$0), gry.x($$0));
   }

   public static fws b(alr $$0) {
      return new fws(gry.u($$0), gry.y($$0), gry.w($$0));
   }

   public gry a(fti.a $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
         case c -> this.c;
      };
   }
}
