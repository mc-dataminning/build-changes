import java.util.Map;
import java.util.Map.Entry;

public class gmm {
   private Map<dxu, hdm> a = Map.of();
   private final hdz b;

   public gmm(hdz $$0) {
      this.b = $$0;
   }

   public hbk a(dxu $$0) {
      return this.b($$0).e();
   }

   public hdm b(dxu $$0) {
      hdm $$1 = this.a.get($$0);
      if ($$1 == null) {
         $$1 = this.b.a();
      }

      return $$1;
   }

   public hdz a() {
      return this.b;
   }

   public void a(Map<dxu, hdm> $$0) {
      this.a = $$0;
   }

   public static hea c(dxu $$0) {
      return a(ma.e.b($$0.b()), $$0);
   }

   public static hea a(alz $$0, dxu $$1) {
      return new hea($$0, b($$1.G()));
   }

   public static String b(Map<dyw<?>, Comparable<?>> $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (Entry<dyw<?>, Comparable<?>> $$2 : $$0.entrySet()) {
         if ($$1.length() != 0) {
            $$1.append(',');
         }

         dyw<?> $$3 = $$2.getKey();
         $$1.append($$3.f());
         $$1.append('=');
         $$1.append(a($$3, $$2.getValue()));
      }

      return $$1.toString();
   }

   private static <T extends Comparable<T>> String a(dyw<T> $$0, Comparable<?> $$1) {
      return $$0.b((T)$$1);
   }
}
