import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class gpj {
   public static final gpk a = new gpk();
   public static final String b = "villager";
   private final gpj.a c;

   public gpj(gpj.a $$0) {
      this.c = $$0;
   }

   public gpj.a a() {
      return this.c;
   }

   public static enum a {
      a("none"),
      b("partial"),
      c("full");

      private static final Map<String, gpj.a> d = Arrays.stream(values()).collect(Collectors.toMap(gpj.a::a, $$0 -> (gpj.a)$$0));
      private final String e;

      private a(String $$0) {
         this.e = $$0;
      }

      public String a() {
         return this.e;
      }

      public static gpj.a a(String $$0) {
         return d.getOrDefault($$0, a);
      }
   }
}
