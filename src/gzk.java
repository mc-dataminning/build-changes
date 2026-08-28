import java.util.IllegalFormatException;

public class gzk {
   private static volatile uf a = uf.a();

   private gzk() {
   }

   static void a(uf $$0) {
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
