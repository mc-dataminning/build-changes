import java.util.Map;
import java.util.Map.Entry;

public class gii {
   private Map<duo, gzd> a = Map.of();
   private final gzn b;

   public gii(gzn $$0) {
      this.b = $$0;
   }

   public gxb a(duo $$0) {
      return this.b($$0).e();
   }

   public gzd b(duo $$0) {
      gzd $$1 = this.a.get($$0);
      if ($$1 == null) {
         $$1 = this.b.a();
      }

      return $$1;
   }

   public gzn a() {
      return this.b;
   }

   public void a(Map<duo, gzd> $$0) {
      this.a = $$0;
   }

   public static gzo c(duo $$0) {
      return a(lu.e.b($$0.b()), $$0);
   }

   public static gzo a(alc $$0, duo $$1) {
      return new gzo($$0, b($$1.G()));
   }

   public static String b(Map<dvr<?>, Comparable<?>> $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (Entry<dvr<?>, Comparable<?>> $$2 : $$0.entrySet()) {
         if ($$1.length() != 0) {
            $$1.append(',');
         }

         dvr<?> $$3 = $$2.getKey();
         $$1.append($$3.f());
         $$1.append('=');
         $$1.append(a($$3, $$2.getValue()));
      }

      return $$1.toString();
   }

   private static <T extends Comparable<T>> String a(dvr<T> $$0, Comparable<?> $$1) {
      return $$0.a((T)$$1);
   }
}
