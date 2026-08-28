public final class heh {
   private static final int a = 16;
   private static final int b = 16;
   private static final String c = "missingno";
   private static final akv d = akv.b("missingno");

   public static feu a() {
      return a(16, 16);
   }

   public static feu a(int $$0, int $$1) {
      feu $$2 = new feu($$0, $$1, false);
      int $$3 = -524040;

      for (int $$4 = 0; $$4 < $$1; $$4++) {
         for (int $$5 = 0; $$5 < $$0; $$5++) {
            if ($$4 < $$1 / 2 ^ $$5 < $$0 / 2) {
               $$2.a($$5, $$4, -524040);
            } else {
               $$2.a($$5, $$4, -16777216);
            }
         }
      }

      return $$2;
   }

   public static hem b() {
      feu $$0 = a(16, 16);
      return new hem(d, new hgg(16, 16), $$0, aur.a);
   }

   public static akv c() {
      return d;
   }
}
