import java.util.IllegalFormatException;

public class gfq {
   private static volatile si a = si.a();

   private gfq() {
   }

   static void a(si $$0) {
      a = $$0;
   }

   public static String a(String $$0, Object... $$1) {
      String $$2 = a.a($$0);

      try {
         return String.format($$2, $$1);
      } catch (IllegalFormatException var4) {
         return "Format error: " + $$2;
      }
   }

   public static boolean a(String $$0) {
      return a.b($$0);
   }
}
