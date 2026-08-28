import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class grt {
   public static final gru a = new gru();
   public static final String b = "villager";
   private final grt.a c;

   public grt(grt.a $$0) {
      this.c = $$0;
   }

   public grt.a a() {
      return this.c;
   }

   public static enum a {
      a("none"),
      b("partial"),
      c("full");

      private static final Map<String, grt.a> d = Arrays.stream(values()).collect(Collectors.toMap(grt.a::a, $$0 -> (grt.a)$$0));
      private final String e;

      private a(final String $$0) {
         this.e = $$0;
      }

      public String a() {
         return this.e;
      }

      public static grt.a a(String $$0) {
         return d.getOrDefault($$0, a);
      }
   }
}
