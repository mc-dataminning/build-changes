public record fvu(grc a, grc b, grc c) {
   public static fvu a(alg $$0) {
      return new fvu(grc.v($$0), grc.z($$0), grc.x($$0));
   }

   public static fvu b(alg $$0) {
      return new fvu(grc.u($$0), grc.y($$0), grc.w($$0));
   }

   public grc a(fsk.a $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
         case c -> this.c;
      };
   }
}
