import java.util.Map;
import java.util.Map.Entry;

public class gbb {
   private Map<dpi, gns> a = Map.of();
   private final gny b;

   public gbb(gny $$0) {
      this.b = $$0;
   }

   public gls a(dpi $$0) {
      return this.b($$0).e();
   }

   public gns b(dpi $$0) {
      gns $$1 = this.a.get($$0);
      if ($$1 == null) {
         $$1 = this.b.a();
      }

      return $$1;
   }

   public gny a() {
      return this.b;
   }

   public void a(Map<dpi, gns> $$0) {
      this.a = $$0;
   }

   public static gnz c(dpi $$0) {
      return a(kt.e.b($$0.b()), $$0);
   }

   public static gnz a(ajv $$0, dpi $$1) {
      return new gnz($$0, b($$1.C()));
   }

   public static String b(Map<dql<?>, Comparable<?>> $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (Entry<dql<?>, Comparable<?>> $$2 : $$0.entrySet()) {
         if ($$1.length() != 0) {
            $$1.append(',');
         }

         dql<?> $$3 = $$2.getKey();
         $$1.append($$3.f());
         $$1.append('=');
         $$1.append(a($$3, $$2.getValue()));
      }

      return $$1.toString();
   }

   private static <T extends Comparable<T>> String a(dql<T> $$0, Comparable<?> $$1) {
      return $$0.a((T)$$1);
   }
}
