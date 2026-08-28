import java.util.Map;
import java.util.Map.Entry;

public class gec {
   private Map<drx, gqv> a = Map.of();
   private final grb b;

   public gec(grb $$0) {
      this.b = $$0;
   }

   public gou a(drx $$0) {
      return this.b($$0).e();
   }

   public gqv b(drx $$0) {
      gqv $$1 = this.a.get($$0);
      if ($$1 == null) {
         $$1 = this.b.a();
      }

      return $$1;
   }

   public grb a() {
      return this.b;
   }

   public void a(Map<drx, gqv> $$0) {
      this.a = $$0;
   }

   public static grc c(drx $$0) {
      return a(lp.e.b($$0.b()), $$0);
   }

   public static grc a(alb $$0, drx $$1) {
      return new grc($$0, b($$1.C()));
   }

   public static String b(Map<dta<?>, Comparable<?>> $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (Entry<dta<?>, Comparable<?>> $$2 : $$0.entrySet()) {
         if ($$1.length() != 0) {
            $$1.append(',');
         }

         dta<?> $$3 = $$2.getKey();
         $$1.append($$3.f());
         $$1.append('=');
         $$1.append(a($$3, $$2.getValue()));
      }

      return $$1.toString();
   }

   private static <T extends Comparable<T>> String a(dta<T> $$0, Comparable<?> $$1) {
      return $$0.a((T)$$1);
   }
}
