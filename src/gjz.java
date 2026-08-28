import java.util.Map;
import java.util.Map.Entry;

public class gjz {
   private Map<dvo, hav> a = Map.of();
   private final hbi b;

   public gjz(hbi $$0) {
      this.b = $$0;
   }

   public gyt a(dvo $$0) {
      return this.b($$0).e();
   }

   public hav b(dvo $$0) {
      hav $$1 = this.a.get($$0);
      if ($$1 == null) {
         $$1 = this.b.a();
      }

      return $$1;
   }

   public hbi a() {
      return this.b;
   }

   public void a(Map<dvo, hav> $$0) {
      this.a = $$0;
   }

   public static hbj c(dvo $$0) {
      return a(lz.e.b($$0.b()), $$0);
   }

   public static hbj a(all $$0, dvo $$1) {
      return new hbj($$0, b($$1.G()));
   }

   public static String b(Map<dwq<?>, Comparable<?>> $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (Entry<dwq<?>, Comparable<?>> $$2 : $$0.entrySet()) {
         if ($$1.length() != 0) {
            $$1.append(',');
         }

         dwq<?> $$3 = $$2.getKey();
         $$1.append($$3.f());
         $$1.append('=');
         $$1.append(a($$3, $$2.getValue()));
      }

      return $$1.toString();
   }

   private static <T extends Comparable<T>> String a(dwq<T> $$0, Comparable<?> $$1) {
      return $$0.b((T)$$1);
   }
}
