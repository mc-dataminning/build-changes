import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class gnf {
   public static final gng a = new gng();
   public static final String b = "villager";
   private final gnf.a c;

   public gnf(gnf.a $$0) {
      this.c = $$0;
   }

   public gnf.a a() {
      return this.c;
   }

   public static enum a {
      a("none"),
      b("partial"),
      c("full");

      private static final Map<String, gnf.a> d = Arrays.stream(values()).collect(Collectors.toMap(gnf.a::a, $$0 -> (gnf.a)$$0));
      private final String e;

      private a(String $$0) {
         this.e = $$0;
      }

      public String a() {
         return this.e;
      }

      public static gnf.a a(String $$0) {
         return d.getOrDefault($$0, a);
      }
   }
}
