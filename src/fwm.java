import java.util.Map;
import java.util.Map.Entry;

public class fwm {
   private Map<dlj, gjb> a = Map.of();
   private final gjh b;

   public fwm(gjh $$0) {
      this.b = $$0;
   }

   public ghb a(dlj $$0) {
      return this.b($$0).e();
   }

   public gjb b(dlj $$0) {
      gjb $$1 = this.a.get($$0);
      if ($$1 == null) {
         $$1 = this.b.a();
      }

      return $$1;
   }

   public gjh a() {
      return this.b;
   }

   public void a(Map<dlj, gjb> $$0) {
      this.a = $$0;
   }

   public static gji c(dlj $$0) {
      return a(kf.e.b($$0.b()), $$0);
   }

   public static gji a(aiy $$0, dlj $$1) {
      return new gji($$0, b($$1.C()));
   }

   public static String b(Map<dmm<?>, Comparable<?>> $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (Entry<dmm<?>, Comparable<?>> $$2 : $$0.entrySet()) {
         if ($$1.length() != 0) {
            $$1.append(',');
         }

         dmm<?> $$3 = $$2.getKey();
         $$1.append($$3.f());
         $$1.append('=');
         $$1.append(a($$3, $$2.getValue()));
      }

      return $$1.toString();
   }

   private static <T extends Comparable<T>> String a(dmm<T> $$0, Comparable<?> $$1) {
      return $$0.a((T)$$1);
   }
}
