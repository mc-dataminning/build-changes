import java.util.Map;
import java.util.Map.Entry;

public class fwf {
   private Map<dlf, giu> a = Map.of();
   private final gja b;

   public fwf(gja $$0) {
      this.b = $$0;
   }

   public ggu a(dlf $$0) {
      return this.b($$0).e();
   }

   public giu b(dlf $$0) {
      giu $$1 = this.a.get($$0);
      if ($$1 == null) {
         $$1 = this.b.a();
      }

      return $$1;
   }

   public gja a() {
      return this.b;
   }

   public void a(Map<dlf, giu> $$0) {
      this.a = $$0;
   }

   public static gjb c(dlf $$0) {
      return a(kf.e.b($$0.b()), $$0);
   }

   public static gjb a(aiy $$0, dlf $$1) {
      return new gjb($$0, b($$1.C()));
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
