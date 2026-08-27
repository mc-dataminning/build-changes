import java.util.Map;
import java.util.Map.Entry;

public class fum {
   private Map<djp, ghb> a = Map.of();
   private final ghh b;

   public fum(ghh $$0) {
      this.b = $$0;
   }

   public gfb a(djp $$0) {
      return this.b($$0).e();
   }

   public ghb b(djp $$0) {
      ghb $$1 = this.a.get($$0);
      if ($$1 == null) {
         $$1 = this.b.a();
      }

      return $$1;
   }

   public ghh a() {
      return this.b;
   }

   public void a(Map<djp, ghb> $$0) {
      this.a = $$0;
   }

   public static ghi c(djp $$0) {
      return a(kd.e.b($$0.b()), $$0);
   }

   public static ghi a(ahh $$0, djp $$1) {
      return new ghi($$0, b($$1.C()));
   }

   public static String b(Map<dks<?>, Comparable<?>> $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (Entry<dks<?>, Comparable<?>> $$2 : $$0.entrySet()) {
         if ($$1.length() != 0) {
            $$1.append(',');
         }

         dks<?> $$3 = $$2.getKey();
         $$1.append($$3.f());
         $$1.append('=');
         $$1.append(a($$3, $$2.getValue()));
      }

      return $$1.toString();
   }

   private static <T extends Comparable<T>> String a(dks<T> $$0, Comparable<?> $$1) {
      return $$0.a((T)$$1);
   }
}
