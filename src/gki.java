import java.util.Map;
import java.util.Map.Entry;

public class gki {
   private Map<dvv, hbg> a = Map.of();
   private final hbt b;

   public gki(hbt $$0) {
      this.b = $$0;
   }

   public gze a(dvv $$0) {
      return this.b($$0).e();
   }

   public hbg b(dvv $$0) {
      hbg $$1 = this.a.get($$0);
      if ($$1 == null) {
         $$1 = this.b.a();
      }

      return $$1;
   }

   public hbt a() {
      return this.b;
   }

   public void a(Map<dvv, hbg> $$0) {
      this.a = $$0;
   }

   public static hbu c(dvv $$0) {
      return a(lz.e.b($$0.b()), $$0);
   }

   public static hbu a(alj $$0, dvv $$1) {
      return new hbu($$0, b($$1.G()));
   }

   public static String b(Map<dwx<?>, Comparable<?>> $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (Entry<dwx<?>, Comparable<?>> $$2 : $$0.entrySet()) {
         if ($$1.length() != 0) {
            $$1.append(',');
         }

         dwx<?> $$3 = $$2.getKey();
         $$1.append($$3.f());
         $$1.append('=');
         $$1.append(a($$3, $$2.getValue()));
      }

      return $$1.toString();
   }

   private static <T extends Comparable<T>> String a(dwx<T> $$0, Comparable<?> $$1) {
      return $$0.b((T)$$1);
   }
}
