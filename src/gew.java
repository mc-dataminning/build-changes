import java.util.Map;
import java.util.Map.Entry;

public class gew {
   private Map<dsk, grp> a = Map.of();
   private final grv b;

   public gew(grv $$0) {
      this.b = $$0;
   }

   public gpo a(dsk $$0) {
      return this.b($$0).e();
   }

   public grp b(dsk $$0) {
      grp $$1 = this.a.get($$0);
      if ($$1 == null) {
         $$1 = this.b.a();
      }

      return $$1;
   }

   public grv a() {
      return this.b;
   }

   public void a(Map<dsk, grp> $$0) {
      this.a = $$0;
   }

   public static grw c(dsk $$0) {
      return a(lq.e.b($$0.b()), $$0);
   }

   public static grw a(akk $$0, dsk $$1) {
      return new grw($$0, b($$1.C()));
   }

   public static String b(Map<dtn<?>, Comparable<?>> $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (Entry<dtn<?>, Comparable<?>> $$2 : $$0.entrySet()) {
         if ($$1.length() != 0) {
            $$1.append(',');
         }

         dtn<?> $$3 = $$2.getKey();
         $$1.append($$3.f());
         $$1.append('=');
         $$1.append(a($$3, $$2.getValue()));
      }

      return $$1.toString();
   }

   private static <T extends Comparable<T>> String a(dtn<T> $$0, Comparable<?> $$1) {
      return $$0.a((T)$$1);
   }
}
