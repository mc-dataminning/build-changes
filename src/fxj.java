import java.util.Map;
import java.util.Map.Entry;

public class fxj {
   private Map<dme, gjz> a = Map.of();
   private final gkf b;

   public fxj(gkf $$0) {
      this.b = $$0;
   }

   public ghz a(dme $$0) {
      return this.b($$0).e();
   }

   public gjz b(dme $$0) {
      gjz $$1 = this.a.get($$0);
      if ($$1 == null) {
         $$1 = this.b.a();
      }

      return $$1;
   }

   public gkf a() {
      return this.b;
   }

   public void a(Map<dme, gjz> $$0) {
      this.a = $$0;
   }

   public static gkg c(dme $$0) {
      return a(kh.e.b($$0.b()), $$0);
   }

   public static gkg a(ajc $$0, dme $$1) {
      return new gkg($$0, b($$1.C()));
   }

   public static String b(Map<dnh<?>, Comparable<?>> $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (Entry<dnh<?>, Comparable<?>> $$2 : $$0.entrySet()) {
         if ($$1.length() != 0) {
            $$1.append(',');
         }

         dnh<?> $$3 = $$2.getKey();
         $$1.append($$3.f());
         $$1.append('=');
         $$1.append(a($$3, $$2.getValue()));
      }

      return $$1.toString();
   }

   private static <T extends Comparable<T>> String a(dnh<T> $$0, Comparable<?> $$1) {
      return $$0.a((T)$$1);
   }
}
