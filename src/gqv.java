import java.util.Map;
import java.util.Map.Entry;

public class gqv {
   private Map<dzz, hkp> a = Map.of();
   private final hld b;

   public gqv(hld $$0) {
      this.b = $$0;
   }

   public hip a(dzz $$0) {
      return this.b($$0).d();
   }

   public hkp b(dzz $$0) {
      hkp $$1 = this.a.get($$0);
      if ($$1 == null) {
         $$1 = this.b.a();
      }

      return $$1;
   }

   public hld a() {
      return this.b;
   }

   public void a(Map<dzz, hkp> $$0) {
      this.a = $$0;
   }

   public static hle c(dzz $$0) {
      return a(mf.e.b($$0.b()), $$0);
   }

   public static hle a(alg $$0, dzz $$1) {
      return new hle($$0, b($$1.G()));
   }

   public static String b(Map<ebc<?>, Comparable<?>> $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (Entry<ebc<?>, Comparable<?>> $$2 : $$0.entrySet()) {
         if ($$1.length() != 0) {
            $$1.append(',');
         }

         ebc<?> $$3 = $$2.getKey();
         $$1.append($$3.f());
         $$1.append('=');
         $$1.append(a($$3, $$2.getValue()));
      }

      return $$1.toString();
   }

   private static <T extends Comparable<T>> String a(ebc<T> $$0, Comparable<?> $$1) {
      return $$0.b((T)$$1);
   }
}
