import java.util.Map;
import java.util.Map.Entry;

public class gef {
   private Map<dsa, gqy> a = Map.of();
   private final gre b;

   public gef(gre $$0) {
      this.b = $$0;
   }

   public gox a(dsa $$0) {
      return this.b($$0).e();
   }

   public gqy b(dsa $$0) {
      gqy $$1 = this.a.get($$0);
      if ($$1 == null) {
         $$1 = this.b.a();
      }

      return $$1;
   }

   public gre a() {
      return this.b;
   }

   public void a(Map<dsa, gqy> $$0) {
      this.a = $$0;
   }

   public static grf c(dsa $$0) {
      return a(lp.e.b($$0.b()), $$0);
   }

   public static grf a(ale $$0, dsa $$1) {
      return new grf($$0, b($$1.C()));
   }

   public static String b(Map<dtd<?>, Comparable<?>> $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (Entry<dtd<?>, Comparable<?>> $$2 : $$0.entrySet()) {
         if ($$1.length() != 0) {
            $$1.append(',');
         }

         dtd<?> $$3 = $$2.getKey();
         $$1.append($$3.f());
         $$1.append('=');
         $$1.append(a($$3, $$2.getValue()));
      }

      return $$1.toString();
   }

   private static <T extends Comparable<T>> String a(dtd<T> $$0, Comparable<?> $$1) {
      return $$0.a((T)$$1);
   }
}
