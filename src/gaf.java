import java.util.IllegalFormatException;

public class gaf {
   private static volatile qp a = qp.a();

   private gaf() {
   }

   static void a(qp $$0) {
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
