import java.util.Map;
import java.util.Map.Entry;

public class gej {
   private Map<dse, grc> a = Map.of();
   private final gri b;

   public gej(gri $$0) {
      this.b = $$0;
   }

   public gpb a(dse $$0) {
      return this.b($$0).e();
   }

   public grc b(dse $$0) {
      grc $$1 = this.a.get($$0);
      if ($$1 == null) {
         $$1 = this.b.a();
      }

      return $$1;
   }

   public gri a() {
      return this.b;
   }

   public void a(Map<dse, grc> $$0) {
      this.a = $$0;
   }

   public static grj c(dse $$0) {
      return a(lp.e.b($$0.b()), $$0);
   }

   public static grj a(alf $$0, dse $$1) {
      return new grj($$0, b($$1.C()));
   }

   public static String b(Map<dth<?>, Comparable<?>> $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (Entry<dth<?>, Comparable<?>> $$2 : $$0.entrySet()) {
         if ($$1.length() != 0) {
            $$1.append(',');
         }

         dth<?> $$3 = $$2.getKey();
         $$1.append($$3.f());
         $$1.append('=');
         $$1.append(a($$3, $$2.getValue()));
      }

      return $$1.toString();
   }

   private static <T extends Comparable<T>> String a(dth<T> $$0, Comparable<?> $$1) {
      return $$0.a((T)$$1);
   }
}
