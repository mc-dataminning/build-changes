import java.util.Map;
import java.util.Map.Entry;

public class geg {
   private Map<dsb, gqz> a = Map.of();
   private final grf b;

   public geg(grf $$0) {
      this.b = $$0;
   }

   public goy a(dsb $$0) {
      return this.b($$0).e();
   }

   public gqz b(dsb $$0) {
      gqz $$1 = this.a.get($$0);
      if ($$1 == null) {
         $$1 = this.b.a();
      }

      return $$1;
   }

   public grf a() {
      return this.b;
   }

   public void a(Map<dsb, gqz> $$0) {
      this.a = $$0;
   }

   public static grg c(dsb $$0) {
      return a(lp.e.b($$0.b()), $$0);
   }

   public static grg a(ale $$0, dsb $$1) {
      return new grg($$0, b($$1.C()));
   }

   public static String b(Map<dte<?>, Comparable<?>> $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (Entry<dte<?>, Comparable<?>> $$2 : $$0.entrySet()) {
         if ($$1.length() != 0) {
            $$1.append(',');
         }

         dte<?> $$3 = $$2.getKey();
         $$1.append($$3.f());
         $$1.append('=');
         $$1.append(a($$3, $$2.getValue()));
      }

      return $$1.toString();
   }

   private static <T extends Comparable<T>> String a(dte<T> $$0, Comparable<?> $$1) {
      return $$0.a((T)$$1);
   }
}
