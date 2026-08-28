import java.util.Map;
import java.util.Map.Entry;

public class geq {
   private Map<dsh, grj> a = Map.of();
   private final grp b;

   public geq(grp $$0) {
      this.b = $$0;
   }

   public gpi a(dsh $$0) {
      return this.b($$0).e();
   }

   public grj b(dsh $$0) {
      grj $$1 = this.a.get($$0);
      if ($$1 == null) {
         $$1 = this.b.a();
      }

      return $$1;
   }

   public grp a() {
      return this.b;
   }

   public void a(Map<dsh, grj> $$0) {
      this.a = $$0;
   }

   public static grq c(dsh $$0) {
      return a(lq.e.b($$0.b()), $$0);
   }

   public static grq a(akk $$0, dsh $$1) {
      return new grq($$0, b($$1.C()));
   }

   public static String b(Map<dtk<?>, Comparable<?>> $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (Entry<dtk<?>, Comparable<?>> $$2 : $$0.entrySet()) {
         if ($$1.length() != 0) {
            $$1.append(',');
         }

         dtk<?> $$3 = $$2.getKey();
         $$1.append($$3.f());
         $$1.append('=');
         $$1.append(a($$3, $$2.getValue()));
      }

      return $$1.toString();
   }

   private static <T extends Comparable<T>> String a(dtk<T> $$0, Comparable<?> $$1) {
      return $$0.a((T)$$1);
   }
}
