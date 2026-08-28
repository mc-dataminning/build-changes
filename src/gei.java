import java.util.Map;
import java.util.Map.Entry;

public class gei {
   private Map<dsd, grb> a = Map.of();
   private final grh b;

   public gei(grh $$0) {
      this.b = $$0;
   }

   public gpa a(dsd $$0) {
      return this.b($$0).e();
   }

   public grb b(dsd $$0) {
      grb $$1 = this.a.get($$0);
      if ($$1 == null) {
         $$1 = this.b.a();
      }

      return $$1;
   }

   public grh a() {
      return this.b;
   }

   public void a(Map<dsd, grb> $$0) {
      this.a = $$0;
   }

   public static gri c(dsd $$0) {
      return a(lp.e.b($$0.b()), $$0);
   }

   public static gri a(alf $$0, dsd $$1) {
      return new gri($$0, b($$1.C()));
   }

   public static String b(Map<dtg<?>, Comparable<?>> $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (Entry<dtg<?>, Comparable<?>> $$2 : $$0.entrySet()) {
         if ($$1.length() != 0) {
            $$1.append(',');
         }

         dtg<?> $$3 = $$2.getKey();
         $$1.append($$3.f());
         $$1.append('=');
         $$1.append(a($$3, $$2.getValue()));
      }

      return $$1.toString();
   }

   private static <T extends Comparable<T>> String a(dtg<T> $$0, Comparable<?> $$1) {
      return $$0.a((T)$$1);
   }
}
