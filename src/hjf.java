public final class hjf {
   private static final int a = 16;
   private static final int b = 16;
   private static final String c = "missingno";
   private static final alg d = alg.b("missingno");

   public static fiz a() {
      return a(16, 16);
   }

   public static fiz a(int $$0, int $$1) {
      fiz $$2 = new fiz($$0, $$1, false);
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

   public static hjk b() {
      fiz $$0 = a(16, 16);
      return new hjk(d, new hle(16, 16), $$0, avf.a);
   }

   public static alg c() {
      return d;
   }
}
