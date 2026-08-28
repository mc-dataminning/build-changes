import java.util.Map;
import java.util.Map.Entry;

public class gna {
   private Map<dww, hgr> a = Map.of();
   private final hhf b;

   public gna(hhf $$0) {
      this.b = $$0;
   }

   public her a(dww $$0) {
      return this.b($$0).d();
   }

   public hgr b(dww $$0) {
      hgr $$1 = this.a.get($$0);
      if ($$1 == null) {
         $$1 = this.b.a();
      }

      return $$1;
   }

   public hhf a() {
      return this.b;
   }

   public void a(Map<dww, hgr> $$0) {
      this.a = $$0;
   }

   public static hhg c(dww $$0) {
      return a(mb.e.b($$0.b()), $$0);
   }

   public static hhg a(akv $$0, dww $$1) {
      return new hhg($$0, b($$1.G()));
   }

   public static String b(Map<dxy<?>, Comparable<?>> $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (Entry<dxy<?>, Comparable<?>> $$2 : $$0.entrySet()) {
         if ($$1.length() != 0) {
            $$1.append(',');
         }

         dxy<?> $$3 = $$2.getKey();
         $$1.append($$3.f());
         $$1.append('=');
         $$1.append(a($$3, $$2.getValue()));
      }

      return $$1.toString();
   }

   private static <T extends Comparable<T>> String a(dxy<T> $$0, Comparable<?> $$1) {
      return $$0.b((T)$$1);
   }
}
