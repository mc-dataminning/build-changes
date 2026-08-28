public final class hkf {
   private static final int a = 16;
   private static final int b = 16;
   private static final String c = "missingno";
   private static final alr d = alr.b("missingno");

   public static fkf a() {
      return a(16, 16);
   }

   public static fkf a(int $$0, int $$1) {
      fkf $$2 = new fkf($$0, $$1, false);
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

   public static hkk b() {
      fkf $$0 = a(16, 16);
      return new hkk(d, new hme(16, 16), $$0, avq.a);
   }

   public static alr c() {
      return d;
   }
}
