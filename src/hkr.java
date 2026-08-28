public final class hkr {
   private static final int a = 16;
   private static final int b = 16;
   private static final String c = "missingno";
   private static final alk d = alk.b("missingno");

   public static fki a() {
      return a(16, 16);
   }

   public static fki a(int $$0, int $$1) {
      fki $$2 = new fki($$0, $$1, false);
      int $$3 = -524040;

      for (int $$4 = 0; $$4 < $$1; $$4++) {
         for (int $$5 = 0; $$5 < $$0; $$5++) {
            if ($$4 < $$1 / 2 ^ $$5 < $$0 / 2) {
               $$2.b($$5, $$4, -524040);
            } else {
               $$2.b($$5, $$4, -16777216);
            }
         }
      }

      return $$2;
   }

   public static hkw b() {
      fki $$0 = a(16, 16);
      return new hkw(d, new hmq(16, 16), $$0, avj.a);
   }

   public static alk c() {
      return d;
   }
}
