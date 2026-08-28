import java.util.Map;
import java.util.Map.Entry;

public class gmn {
   private Map<dxv, hdn> a = Map.of();
   private final hea b;

   public gmn(hea $$0) {
      this.b = $$0;
   }

   public hbl a(dxv $$0) {
      return this.b($$0).e();
   }

   public hdn b(dxv $$0) {
      hdn $$1 = this.a.get($$0);
      if ($$1 == null) {
         $$1 = this.b.a();
      }

      return $$1;
   }

   public hea a() {
      return this.b;
   }

   public void a(Map<dxv, hdn> $$0) {
      this.a = $$0;
   }

   public static heb c(dxv $$0) {
      return a(ma.e.b($$0.b()), $$0);
   }

   public static heb a(alz $$0, dxv $$1) {
      return new heb($$0, b($$1.G()));
   }

   public static String b(Map<dyx<?>, Comparable<?>> $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (Entry<dyx<?>, Comparable<?>> $$2 : $$0.entrySet()) {
         if ($$1.length() != 0) {
            $$1.append(',');
         }

         dyx<?> $$3 = $$2.getKey();
         $$1.append($$3.f());
         $$1.append('=');
         $$1.append(a($$3, $$2.getValue()));
      }

      return $$1.toString();
   }

   private static <T extends Comparable<T>> String a(dyx<T> $$0, Comparable<?> $$1) {
      return $$0.b((T)$$1);
   }
}
