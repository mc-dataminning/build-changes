public record fxf(gsl a, gsl b, gsl c) {
   public static fxf a(ali $$0) {
      return new fxf(gsl.v($$0), gsl.z($$0), gsl.x($$0));
   }

   public static fxf b(ali $$0) {
      return new fxf(gsl.u($$0), gsl.y($$0), gsl.w($$0));
   }

   public gsl a(ftv.a $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
         case c -> this.c;
      };
   }
}
