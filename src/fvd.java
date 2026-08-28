public record fvd(gqk a, gqk b, gqk c) {
   public static fvd a(alg $$0) {
      return new fvd(gqk.v($$0), gqk.z($$0), gqk.x($$0));
   }

   public static fvd b(alg $$0) {
      return new fvd(gqk.u($$0), gqk.y($$0), gqk.w($$0));
   }

   public gqk a(frt.a $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
         case c -> this.c;
      };
   }
}
