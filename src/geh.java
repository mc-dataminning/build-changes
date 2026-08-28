import java.util.Map;
import java.util.Map.Entry;

public class geh {
   private Map<dsc, gra> a = Map.of();
   private final grg b;

   public geh(grg $$0) {
      this.b = $$0;
   }

   public goz a(dsc $$0) {
      return this.b($$0).e();
   }

   public gra b(dsc $$0) {
      gra $$1 = this.a.get($$0);
      if ($$1 == null) {
         $$1 = this.b.a();
      }

      return $$1;
   }

   public grg a() {
      return this.b;
   }

   public void a(Map<dsc, gra> $$0) {
      this.a = $$0;
   }

   public static grh c(dsc $$0) {
      return a(lp.e.b($$0.b()), $$0);
   }

   public static grh a(alf $$0, dsc $$1) {
      return new grh($$0, b($$1.C()));
   }

   public static String b(Map<dtf<?>, Comparable<?>> $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (Entry<dtf<?>, Comparable<?>> $$2 : $$0.entrySet()) {
         if ($$1.length() != 0) {
            $$1.append(',');
         }

         dtf<?> $$3 = $$2.getKey();
         $$1.append($$3.f());
         $$1.append('=');
         $$1.append(a($$3, $$2.getValue()));
      }

      return $$1.toString();
   }

   private static <T extends Comparable<T>> String a(dtf<T> $$0, Comparable<?> $$1) {
      return $$0.a((T)$$1);
   }
}
