import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class gyv {
   public static final gyw a = new gyw();
   public static final String b = "villager";
   private final gyv.a c;

   public gyv(gyv.a $$0) {
      this.c = $$0;
   }

   public gyv.a a() {
      return this.c;
   }

   public static enum a {
      a("none"),
      b("partial"),
      c("full");

      private static final Map<String, gyv.a> d = Arrays.stream(values()).collect(Collectors.toMap(gyv.a::a, $$0 -> (gyv.a)$$0));
      private final String e;

      private a(final String $$0) {
         this.e = $$0;
      }

      public String a() {
         return this.e;
      }

      public static gyv.a a(String $$0) {
         return d.getOrDefault($$0, a);
      }
   }
}
