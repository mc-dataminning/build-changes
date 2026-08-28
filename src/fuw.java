public record fuw(gqc a, gqc b, gqc c) {
   public static fuw a(alg $$0) {
      return new fuw(gqc.v($$0), gqc.z($$0), gqc.x($$0));
   }

   public static fuw b(alg $$0) {
      return new fuw(gqc.u($$0), gqc.y($$0), gqc.w($$0));
   }

   public gqc a(frm.a $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
         case c -> this.c;
      };
   }
}
