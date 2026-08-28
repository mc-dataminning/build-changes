import java.util.Map;
import java.util.Map.Entry;

public class gnc {
   private Map<dwy, hgt> a = Map.of();
   private final hhh b;

   public gnc(hhh $$0) {
      this.b = $$0;
   }

   public het a(dwy $$0) {
      return this.b($$0).d();
   }

   public hgt b(dwy $$0) {
      hgt $$1 = this.a.get($$0);
      if ($$1 == null) {
         $$1 = this.b.a();
      }

      return $$1;
   }

   public hhh a() {
      return this.b;
   }

   public void a(Map<dwy, hgt> $$0) {
      this.a = $$0;
   }

   public static hhi c(dwy $$0) {
      return a(mb.e.b($$0.b()), $$0);
   }

   public static hhi a(akv $$0, dwy $$1) {
      return new hhi($$0, b($$1.G()));
   }

   public static String b(Map<dya<?>, Comparable<?>> $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (Entry<dya<?>, Comparable<?>> $$2 : $$0.entrySet()) {
         if ($$1.length() != 0) {
            $$1.append(',');
         }

         dya<?> $$3 = $$2.getKey();
         $$1.append($$3.f());
         $$1.append('=');
         $$1.append(a($$3, $$2.getValue()));
      }

      return $$1.toString();
   }

   private static <T extends Comparable<T>> String a(dya<T> $$0, Comparable<?> $$1) {
      return $$0.b((T)$$1);
   }
}
