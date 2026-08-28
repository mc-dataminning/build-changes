import java.util.Map;
import java.util.Map.Entry;

public class gjj {
   private Map<dvj, haf> a = Map.of();
   private final has b;

   public gjj(has $$0) {
      this.b = $$0;
   }

   public gyd a(dvj $$0) {
      return this.b($$0).e();
   }

   public haf b(dvj $$0) {
      haf $$1 = this.a.get($$0);
      if ($$1 == null) {
         $$1 = this.b.a();
      }

      return $$1;
   }

   public has a() {
      return this.b;
   }

   public void a(Map<dvj, haf> $$0) {
      this.a = $$0;
   }

   public static hat c(dvj $$0) {
      return a(ly.e.b($$0.b()), $$0);
   }

   public static hat a(ali $$0, dvj $$1) {
      return new hat($$0, b($$1.G()));
   }

   public static String b(Map<dwm<?>, Comparable<?>> $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (Entry<dwm<?>, Comparable<?>> $$2 : $$0.entrySet()) {
         if ($$1.length() != 0) {
            $$1.append(',');
         }

         dwm<?> $$3 = $$2.getKey();
         $$1.append($$3.f());
         $$1.append('=');
         $$1.append(a($$3, $$2.getValue()));
      }

      return $$1.toString();
   }

   private static <T extends Comparable<T>> String a(dwm<T> $$0, Comparable<?> $$1) {
      return $$0.b((T)$$1);
   }
}
