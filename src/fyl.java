import java.util.Map;
import java.util.Map.Entry;

public class fyl {
   private Map<dnb, glc> a = Map.of();
   private final gli b;

   public fyl(gli $$0) {
      this.b = $$0;
   }

   public gjc a(dnb $$0) {
      return this.b($$0).e();
   }

   public glc b(dnb $$0) {
      glc $$1 = this.a.get($$0);
      if ($$1 == null) {
         $$1 = this.b.a();
      }

      return $$1;
   }

   public gli a() {
      return this.b;
   }

   public void a(Map<dnb, glc> $$0) {
      this.a = $$0;
   }

   public static glj c(dnb $$0) {
      return a(ki.e.b($$0.b()), $$0);
   }

   public static glj a(ajh $$0, dnb $$1) {
      return new glj($$0, b($$1.C()));
   }

   public static String b(Map<doe<?>, Comparable<?>> $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (Entry<doe<?>, Comparable<?>> $$2 : $$0.entrySet()) {
         if ($$1.length() != 0) {
            $$1.append(',');
         }

         doe<?> $$3 = $$2.getKey();
         $$1.append($$3.f());
         $$1.append('=');
         $$1.append(a($$3, $$2.getValue()));
      }

      return $$1.toString();
   }

   private static <T extends Comparable<T>> String a(doe<T> $$0, Comparable<?> $$1) {
      return $$0.a((T)$$1);
   }
}
