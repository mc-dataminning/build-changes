public record fvp(gqx a, gqx b, gqx c) {
   public static fvp a(alg $$0) {
      return new fvp(gqx.v($$0), gqx.z($$0), gqx.x($$0));
   }

   public static fvp b(alg $$0) {
      return new fvp(gqx.u($$0), gqx.y($$0), gqx.w($$0));
   }

   public gqx a(fsf.a $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
         case c -> this.c;
      };
   }
}
