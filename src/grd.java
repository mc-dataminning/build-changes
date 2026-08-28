import java.util.Map;
import java.util.Map.Entry;

public class grd {
   private Map<eah, hkx> a = Map.of();
   private final hll b;

   public grd(hll $$0) {
      this.b = $$0;
   }

   public hix a(eah $$0) {
      return this.b($$0).d();
   }

   public hkx b(eah $$0) {
      hkx $$1 = this.a.get($$0);
      if ($$1 == null) {
         $$1 = this.b.a();
      }

      return $$1;
   }

   public hll a() {
      return this.b;
   }

   public void a(Map<eah, hkx> $$0) {
      this.a = $$0;
   }

   public static hlm c(eah $$0) {
      return a(mf.e.b($$0.b()), $$0);
   }

   public static hlm a(alg $$0, eah $$1) {
      return new hlm($$0, b($$1.G()));
   }

   public static String b(Map<ebk<?>, Comparable<?>> $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (Entry<ebk<?>, Comparable<?>> $$2 : $$0.entrySet()) {
         if ($$1.length() != 0) {
            $$1.append(',');
         }

         ebk<?> $$3 = $$2.getKey();
         $$1.append($$3.f());
         $$1.append('=');
         $$1.append(a($$3, $$2.getValue()));
      }

      return $$1.toString();
   }

   private static <T extends Comparable<T>> String a(ebk<T> $$0, Comparable<?> $$1) {
      return $$0.b((T)$$1);
   }
}
