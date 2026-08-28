import java.util.Map;
import java.util.Map.Entry;

public class gmi {
   private Map<dxo, hdi> a = Map.of();
   private final hdv b;

   public gmi(hdv $$0) {
      this.b = $$0;
   }

   public hbg a(dxo $$0) {
      return this.b($$0).e();
   }

   public hdi b(dxo $$0) {
      hdi $$1 = this.a.get($$0);
      if ($$1 == null) {
         $$1 = this.b.a();
      }

      return $$1;
   }

   public hdv a() {
      return this.b;
   }

   public void a(Map<dxo, hdi> $$0) {
      this.a = $$0;
   }

   public static hdw c(dxo $$0) {
      return a(ma.e.b($$0.b()), $$0);
   }

   public static hdw a(alp $$0, dxo $$1) {
      return new hdw($$0, b($$1.G()));
   }

   public static String b(Map<dyq<?>, Comparable<?>> $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (Entry<dyq<?>, Comparable<?>> $$2 : $$0.entrySet()) {
         if ($$1.length() != 0) {
            $$1.append(',');
         }

         dyq<?> $$3 = $$2.getKey();
         $$1.append($$3.f());
         $$1.append('=');
         $$1.append(a($$3, $$2.getValue()));
      }

      return $$1.toString();
   }

   private static <T extends Comparable<T>> String a(dyq<T> $$0, Comparable<?> $$1) {
      return $$0.b((T)$$1);
   }
}
