import java.util.Map;
import java.util.Map.Entry;

public class gmg {
   private Map<dxn, hdg> a = Map.of();
   private final hdt b;

   public gmg(hdt $$0) {
      this.b = $$0;
   }

   public hbe a(dxn $$0) {
      return this.b($$0).e();
   }

   public hdg b(dxn $$0) {
      hdg $$1 = this.a.get($$0);
      if ($$1 == null) {
         $$1 = this.b.a();
      }

      return $$1;
   }

   public hdt a() {
      return this.b;
   }

   public void a(Map<dxn, hdg> $$0) {
      this.a = $$0;
   }

   public static hdu c(dxn $$0) {
      return a(ma.e.b($$0.b()), $$0);
   }

   public static hdu a(alz $$0, dxn $$1) {
      return new hdu($$0, b($$1.G()));
   }

   public static String b(Map<dyp<?>, Comparable<?>> $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (Entry<dyp<?>, Comparable<?>> $$2 : $$0.entrySet()) {
         if ($$1.length() != 0) {
            $$1.append(',');
         }

         dyp<?> $$3 = $$2.getKey();
         $$1.append($$3.f());
         $$1.append('=');
         $$1.append(a($$3, $$2.getValue()));
      }

      return $$1.toString();
   }

   private static <T extends Comparable<T>> String a(dyp<T> $$0, Comparable<?> $$1) {
      return $$0.b((T)$$1);
   }
}
