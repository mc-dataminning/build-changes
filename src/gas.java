import java.util.Map;
import java.util.Map.Entry;

public class gas {
   private Map<doz, gnj> a = Map.of();
   private final gnp b;

   public gas(gnp $$0) {
      this.b = $$0;
   }

   public glj a(doz $$0) {
      return this.b($$0).e();
   }

   public gnj b(doz $$0) {
      gnj $$1 = this.a.get($$0);
      if ($$1 == null) {
         $$1 = this.b.a();
      }

      return $$1;
   }

   public gnp a() {
      return this.b;
   }

   public void a(Map<doz, gnj> $$0) {
      this.a = $$0;
   }

   public static gnq c(doz $$0) {
      return a(kr.e.b($$0.b()), $$0);
   }

   public static gnq a(ajt $$0, doz $$1) {
      return new gnq($$0, b($$1.C()));
   }

   public static String b(Map<dqc<?>, Comparable<?>> $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (Entry<dqc<?>, Comparable<?>> $$2 : $$0.entrySet()) {
         if ($$1.length() != 0) {
            $$1.append(',');
         }

         dqc<?> $$3 = $$2.getKey();
         $$1.append($$3.f());
         $$1.append('=');
         $$1.append(a($$3, $$2.getValue()));
      }

      return $$1.toString();
   }

   private static <T extends Comparable<T>> String a(dqc<T> $$0, Comparable<?> $$1) {
      return $$0.a((T)$$1);
   }
}
