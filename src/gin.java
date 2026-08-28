import java.util.Map;
import java.util.Map.Entry;

public class gin {
   private Map<dus, gzi> a = Map.of();
   private final gzs b;

   public gin(gzs $$0) {
      this.b = $$0;
   }

   public gxg a(dus $$0) {
      return this.b($$0).e();
   }

   public gzi b(dus $$0) {
      gzi $$1 = this.a.get($$0);
      if ($$1 == null) {
         $$1 = this.b.a();
      }

      return $$1;
   }

   public gzs a() {
      return this.b;
   }

   public void a(Map<dus, gzi> $$0) {
      this.a = $$0;
   }

   public static gzt c(dus $$0) {
      return a(lv.e.b($$0.b()), $$0);
   }

   public static gzt a(ale $$0, dus $$1) {
      return new gzt($$0, b($$1.G()));
   }

   public static String b(Map<dvv<?>, Comparable<?>> $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (Entry<dvv<?>, Comparable<?>> $$2 : $$0.entrySet()) {
         if ($$1.length() != 0) {
            $$1.append(',');
         }

         dvv<?> $$3 = $$2.getKey();
         $$1.append($$3.f());
         $$1.append('=');
         $$1.append(a($$3, $$2.getValue()));
      }

      return $$1.toString();
   }

   private static <T extends Comparable<T>> String a(dvv<T> $$0, Comparable<?> $$1) {
      return $$0.a((T)$$1);
   }
}
