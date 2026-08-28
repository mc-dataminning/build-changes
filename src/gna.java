import java.util.Map;
import java.util.Map.Entry;

public class gna {
   private Map<dwx, hgl> a = Map.of();
   private final hgz b;

   public gna(hgz $$0) {
      this.b = $$0;
   }

   public hej a(dwx $$0) {
      return this.b($$0).d();
   }

   public hgl b(dwx $$0) {
      hgl $$1 = this.a.get($$0);
      if ($$1 == null) {
         $$1 = this.b.a();
      }

      return $$1;
   }

   public hgz a() {
      return this.b;
   }

   public void a(Map<dwx, hgl> $$0) {
      this.a = $$0;
   }

   public static hha c(dwx $$0) {
      return a(mb.e.b($$0.b()), $$0);
   }

   public static hha a(aku $$0, dwx $$1) {
      return new hha($$0, b($$1.G()));
   }

   public static String b(Map<dxz<?>, Comparable<?>> $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (Entry<dxz<?>, Comparable<?>> $$2 : $$0.entrySet()) {
         if ($$1.length() != 0) {
            $$1.append(',');
         }

         dxz<?> $$3 = $$2.getKey();
         $$1.append($$3.f());
         $$1.append('=');
         $$1.append(a($$3, $$2.getValue()));
      }

      return $$1.toString();
   }

   private static <T extends Comparable<T>> String a(dxz<T> $$0, Comparable<?> $$1) {
      return $$0.b((T)$$1);
   }
}
