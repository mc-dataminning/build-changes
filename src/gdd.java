import java.util.Map;
import java.util.Map.Entry;

public class gdd {
   private Map<drb, gpw> a = Map.of();
   private final gqc b;

   public gdd(gqc $$0) {
      this.b = $$0;
   }

   public gnv a(drb $$0) {
      return this.b($$0).e();
   }

   public gpw b(drb $$0) {
      gpw $$1 = this.a.get($$0);
      if ($$1 == null) {
         $$1 = this.b.a();
      }

      return $$1;
   }

   public gqc a() {
      return this.b;
   }

   public void a(Map<drb, gpw> $$0) {
      this.a = $$0;
   }

   public static gqd c(drb $$0) {
      return a(le.e.b($$0.b()), $$0);
   }

   public static gqd a(akm $$0, drb $$1) {
      return new gqd($$0, b($$1.C()));
   }

   public static String b(Map<dse<?>, Comparable<?>> $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (Entry<dse<?>, Comparable<?>> $$2 : $$0.entrySet()) {
         if ($$1.length() != 0) {
            $$1.append(',');
         }

         dse<?> $$3 = $$2.getKey();
         $$1.append($$3.f());
         $$1.append('=');
         $$1.append(a($$3, $$2.getValue()));
      }

      return $$1.toString();
   }

   private static <T extends Comparable<T>> String a(dse<T> $$0, Comparable<?> $$1) {
      return $$0.a((T)$$1);
   }
}
