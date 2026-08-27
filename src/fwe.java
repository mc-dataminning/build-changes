import java.util.Map;
import java.util.Map.Entry;

public class fwe {
   private Map<dlf, git> a = Map.of();
   private final giz b;

   public fwe(giz $$0) {
      this.b = $$0;
   }

   public ggt a(dlf $$0) {
      return this.b($$0).e();
   }

   public git b(dlf $$0) {
      git $$1 = this.a.get($$0);
      if ($$1 == null) {
         $$1 = this.b.a();
      }

      return $$1;
   }

   public giz a() {
      return this.b;
   }

   public void a(Map<dlf, git> $$0) {
      this.a = $$0;
   }

   public static gja c(dlf $$0) {
      return a(kf.e.b($$0.b()), $$0);
   }

   public static gja a(aiy $$0, dlf $$1) {
      return new gja($$0, b($$1.C()));
   }

   public static String b(Map<dmi<?>, Comparable<?>> $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (Entry<dmi<?>, Comparable<?>> $$2 : $$0.entrySet()) {
         if ($$1.length() != 0) {
            $$1.append(',');
         }

         dmi<?> $$3 = $$2.getKey();
         $$1.append($$3.f());
         $$1.append('=');
         $$1.append(a($$3, $$2.getValue()));
      }

      return $$1.toString();
   }

   private static <T extends Comparable<T>> String a(dmi<T> $$0, Comparable<?> $$1) {
      return $$0.a((T)$$1);
   }
}
