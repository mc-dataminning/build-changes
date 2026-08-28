import java.util.Map;
import java.util.Map.Entry;

public class goa {
   private Map<dxq, hhr> a = Map.of();
   private final hif b;

   public goa(hif $$0) {
      this.b = $$0;
   }

   public hfr a(dxq $$0) {
      return this.b($$0).d();
   }

   public hhr b(dxq $$0) {
      hhr $$1 = this.a.get($$0);
      if ($$1 == null) {
         $$1 = this.b.a();
      }

      return $$1;
   }

   public hif a() {
      return this.b;
   }

   public void a(Map<dxq, hhr> $$0) {
      this.a = $$0;
   }

   public static hig c(dxq $$0) {
      return a(mb.e.b($$0.b()), $$0);
   }

   public static hig a(aku $$0, dxq $$1) {
      return new hig($$0, b($$1.G()));
   }

   public static String b(Map<dyt<?>, Comparable<?>> $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (Entry<dyt<?>, Comparable<?>> $$2 : $$0.entrySet()) {
         if ($$1.length() != 0) {
            $$1.append(',');
         }

         dyt<?> $$3 = $$2.getKey();
         $$1.append($$3.f());
         $$1.append('=');
         $$1.append(a($$3, $$2.getValue()));
      }

      return $$1.toString();
   }

   private static <T extends Comparable<T>> String a(dyt<T> $$0, Comparable<?> $$1) {
      return $$0.b((T)$$1);
   }
}
