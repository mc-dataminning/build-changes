public final class hkp {
   private static final int a = 16;
   private static final int b = 16;
   private static final String c = "missingno";
   private static final ali d = ali.b("missingno");

   public static fkg a() {
      return a(16, 16);
   }

   public static fkg a(int $$0, int $$1) {
      fkg $$2 = new fkg($$0, $$1, false);
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

   public static hku b() {
      fkg $$0 = a(16, 16);
      return new hku(d, new hmo(16, 16), $$0, avh.a);
   }

   public static ali c() {
      return d;
   }
}
