import java.util.Map;
import java.util.Map.Entry;

public class fyj {
   private Map<dmz, gkz> a = Map.of();
   private final glf b;

   public fyj(glf $$0) {
      this.b = $$0;
   }

   public giz a(dmz $$0) {
      return this.b($$0).e();
   }

   public gkz b(dmz $$0) {
      gkz $$1 = this.a.get($$0);
      if ($$1 == null) {
         $$1 = this.b.a();
      }

      return $$1;
   }

   public glf a() {
      return this.b;
   }

   public void a(Map<dmz, gkz> $$0) {
      this.a = $$0;
   }

   public static glg c(dmz $$0) {
      return a(ki.e.b($$0.b()), $$0);
   }

   public static glg a(ajh $$0, dmz $$1) {
      return new glg($$0, b($$1.C()));
   }

   public static String b(Map<doc<?>, Comparable<?>> $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (Entry<doc<?>, Comparable<?>> $$2 : $$0.entrySet()) {
         if ($$1.length() != 0) {
            $$1.append(',');
         }

         doc<?> $$3 = $$2.getKey();
         $$1.append($$3.f());
         $$1.append('=');
         $$1.append(a($$3, $$2.getValue()));
      }

      return $$1.toString();
   }

   private static <T extends Comparable<T>> String a(doc<T> $$0, Comparable<?> $$1) {
      return $$0.a((T)$$1);
   }
}
