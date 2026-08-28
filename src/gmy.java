import java.util.Map;
import java.util.Map.Entry;

public class gmy {
   private Map<dwv, hgm> a = Map.of();
   private final hha b;

   public gmy(hha $$0) {
      this.b = $$0;
   }

   public hem a(dwv $$0) {
      return this.b($$0).d();
   }

   public hgm b(dwv $$0) {
      hgm $$1 = this.a.get($$0);
      if ($$1 == null) {
         $$1 = this.b.a();
      }

      return $$1;
   }

   public hha a() {
      return this.b;
   }

   public void a(Map<dwv, hgm> $$0) {
      this.a = $$0;
   }

   public static hhb c(dwv $$0) {
      return a(mb.e.b($$0.b()), $$0);
   }

   public static hhb a(aku $$0, dwv $$1) {
      return new hhb($$0, b($$1.G()));
   }

   public static String b(Map<dxx<?>, Comparable<?>> $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (Entry<dxx<?>, Comparable<?>> $$2 : $$0.entrySet()) {
         if ($$1.length() != 0) {
            $$1.append(',');
         }

         dxx<?> $$3 = $$2.getKey();
         $$1.append($$3.f());
         $$1.append('=');
         $$1.append(a($$3, $$2.getValue()));
      }

      return $$1.toString();
   }

   private static <T extends Comparable<T>> String a(dxx<T> $$0, Comparable<?> $$1) {
      return $$0.b((T)$$1);
   }
}
