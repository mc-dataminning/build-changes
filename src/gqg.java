import java.util.Map;
import java.util.Map.Entry;

public class gqg {
   private Map<dzo, hjz> a = Map.of();
   private final hkn b;

   public gqg(hkn $$0) {
      this.b = $$0;
   }

   public hhz a(dzo $$0) {
      return this.b($$0).d();
   }

   public hjz b(dzo $$0) {
      hjz $$1 = this.a.get($$0);
      if ($$1 == null) {
         $$1 = this.b.a();
      }

      return $$1;
   }

   public hkn a() {
      return this.b;
   }

   public void a(Map<dzo, hjz> $$0) {
      this.a = $$0;
   }

   public static hko c(dzo $$0) {
      return a(mf.e.b($$0.b()), $$0);
   }

   public static hko a(ale $$0, dzo $$1) {
      return new hko($$0, b($$1.G()));
   }

   public static String b(Map<ear<?>, Comparable<?>> $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (Entry<ear<?>, Comparable<?>> $$2 : $$0.entrySet()) {
         if ($$1.length() != 0) {
            $$1.append(',');
         }

         ear<?> $$3 = $$2.getKey();
         $$1.append($$3.f());
         $$1.append('=');
         $$1.append(a($$3, $$2.getValue()));
      }

      return $$1.toString();
   }

   private static <T extends Comparable<T>> String a(ear<T> $$0, Comparable<?> $$1) {
      return $$0.b((T)$$1);
   }
}
