import java.util.Map;
import java.util.Map.Entry;

public class giy {
   private Map<dvd, gzu> a = Map.of();
   private final hah b;

   public giy(hah $$0) {
      this.b = $$0;
   }

   public gxs a(dvd $$0) {
      return this.b($$0).e();
   }

   public gzu b(dvd $$0) {
      gzu $$1 = this.a.get($$0);
      if ($$1 == null) {
         $$1 = this.b.a();
      }

      return $$1;
   }

   public hah a() {
      return this.b;
   }

   public void a(Map<dvd, gzu> $$0) {
      this.a = $$0;
   }

   public static hai c(dvd $$0) {
      return a(lx.e.b($$0.b()), $$0);
   }

   public static hai a(alh $$0, dvd $$1) {
      return new hai($$0, b($$1.G()));
   }

   public static String b(Map<dwg<?>, Comparable<?>> $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (Entry<dwg<?>, Comparable<?>> $$2 : $$0.entrySet()) {
         if ($$1.length() != 0) {
            $$1.append(',');
         }

         dwg<?> $$3 = $$2.getKey();
         $$1.append($$3.f());
         $$1.append('=');
         $$1.append(a($$3, $$2.getValue()));
      }

      return $$1.toString();
   }

   private static <T extends Comparable<T>> String a(dwg<T> $$0, Comparable<?> $$1) {
      return $$0.a((T)$$1);
   }
}
