import java.util.Map;
import java.util.Map.Entry;

public class gpb {
   private Map<dym, his> a = Map.of();
   private final hjg b;

   public gpb(hjg $$0) {
      this.b = $$0;
   }

   public hgs a(dym $$0) {
      return this.b($$0).d();
   }

   public his b(dym $$0) {
      his $$1 = this.a.get($$0);
      if ($$1 == null) {
         $$1 = this.b.a();
      }

      return $$1;
   }

   public hjg a() {
      return this.b;
   }

   public void a(Map<dym, his> $$0) {
      this.a = $$0;
   }

   public static hjh c(dym $$0) {
      return a(md.e.b($$0.b()), $$0);
   }

   public static hjh a(ald $$0, dym $$1) {
      return new hjh($$0, b($$1.G()));
   }

   public static String b(Map<dzp<?>, Comparable<?>> $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (Entry<dzp<?>, Comparable<?>> $$2 : $$0.entrySet()) {
         if ($$1.length() != 0) {
            $$1.append(',');
         }

         dzp<?> $$3 = $$2.getKey();
         $$1.append($$3.f());
         $$1.append('=');
         $$1.append(a($$3, $$2.getValue()));
      }

      return $$1.toString();
   }

   private static <T extends Comparable<T>> String a(dzp<T> $$0, Comparable<?> $$1) {
      return $$0.b((T)$$1);
   }
}
