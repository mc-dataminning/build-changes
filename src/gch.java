import java.util.Map;
import java.util.Map.Entry;

public class gch {
   private Map<dqh, goz> a = Map.of();
   private final gpf b;

   public gch(gpf $$0) {
      this.b = $$0;
   }

   public gmy a(dqh $$0) {
      return this.b($$0).e();
   }

   public goz b(dqh $$0) {
      goz $$1 = this.a.get($$0);
      if ($$1 == null) {
         $$1 = this.b.a();
      }

      return $$1;
   }

   public gpf a() {
      return this.b;
   }

   public void a(Map<dqh, goz> $$0) {
      this.a = $$0;
   }

   public static gpg c(dqh $$0) {
      return a(ld.e.b($$0.b()), $$0);
   }

   public static gpg a(akh $$0, dqh $$1) {
      return new gpg($$0, b($$1.C()));
   }

   public static String b(Map<drk<?>, Comparable<?>> $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (Entry<drk<?>, Comparable<?>> $$2 : $$0.entrySet()) {
         if ($$1.length() != 0) {
            $$1.append(',');
         }

         drk<?> $$3 = $$2.getKey();
         $$1.append($$3.f());
         $$1.append('=');
         $$1.append(a($$3, $$2.getValue()));
      }

      return $$1.toString();
   }

   private static <T extends Comparable<T>> String a(drk<T> $$0, Comparable<?> $$1) {
      return $$0.a((T)$$1);
   }
}
