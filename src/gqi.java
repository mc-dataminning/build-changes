import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class gqi {
   public static final gqj a = new gqj();
   public static final String b = "villager";
   private final gqi.a c;

   public gqi(gqi.a $$0) {
      this.c = $$0;
   }

   public gqi.a a() {
      return this.c;
   }

   public static enum a {
      a("none"),
      b("partial"),
      c("full");

      private static final Map<String, gqi.a> d = Arrays.stream(values()).collect(Collectors.toMap(gqi.a::a, $$0 -> (gqi.a)$$0));
      private final String e;

      private a(final String $$0) {
         this.e = $$0;
      }

      public String a() {
         return this.e;
      }

      public static gqi.a a(String $$0) {
         return d.getOrDefault($$0, a);
      }
   }
}
