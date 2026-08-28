import java.util.Map;
import java.util.Map.Entry;

public class ght {
   private Map<dua, gym> a = Map.of();
   private final gyw b;

   public ght(gyw $$0) {
      this.b = $$0;
   }

   public gwk a(dua $$0) {
      return this.b($$0).e();
   }

   public gym b(dua $$0) {
      gym $$1 = this.a.get($$0);
      if ($$1 == null) {
         $$1 = this.b.a();
      }

      return $$1;
   }

   public gyw a() {
      return this.b;
   }

   public void a(Map<dua, gym> $$0) {
      this.a = $$0;
   }

   public static gyx c(dua $$0) {
      return a(lu.e.b($$0.b()), $$0);
   }

   public static gyx a(alb $$0, dua $$1) {
      return new gyx($$0, b($$1.G()));
   }

   public static String b(Map<dvd<?>, Comparable<?>> $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (Entry<dvd<?>, Comparable<?>> $$2 : $$0.entrySet()) {
         if ($$1.length() != 0) {
            $$1.append(',');
         }

         dvd<?> $$3 = $$2.getKey();
         $$1.append($$3.f());
         $$1.append('=');
         $$1.append(a($$3, $$2.getValue()));
      }

      return $$1.toString();
   }

   private static <T extends Comparable<T>> String a(dvd<T> $$0, Comparable<?> $$1) {
      return $$0.a((T)$$1);
   }
}
