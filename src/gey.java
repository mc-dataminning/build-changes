import java.util.Map;
import java.util.Map.Entry;

public class gey {
   private Map<dsl, grr> a = Map.of();
   private final grx b;

   public gey(grx $$0) {
      this.b = $$0;
   }

   public gpq a(dsl $$0) {
      return this.b($$0).e();
   }

   public grr b(dsl $$0) {
      grr $$1 = this.a.get($$0);
      if ($$1 == null) {
         $$1 = this.b.a();
      }

      return $$1;
   }

   public grx a() {
      return this.b;
   }

   public void a(Map<dsl, grr> $$0) {
      this.a = $$0;
   }

   public static gry c(dsl $$0) {
      return a(lq.e.b($$0.b()), $$0);
   }

   public static gry a(akk $$0, dsl $$1) {
      return new gry($$0, b($$1.C()));
   }

   public static String b(Map<dto<?>, Comparable<?>> $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (Entry<dto<?>, Comparable<?>> $$2 : $$0.entrySet()) {
         if ($$1.length() != 0) {
            $$1.append(',');
         }

         dto<?> $$3 = $$2.getKey();
         $$1.append($$3.f());
         $$1.append('=');
         $$1.append(a($$3, $$2.getValue()));
      }

      return $$1.toString();
   }

   private static <T extends Comparable<T>> String a(dto<T> $$0, Comparable<?> $$1) {
      return $$0.a((T)$$1);
   }
}
