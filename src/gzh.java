import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class gzh {
   public static final gzi a = new gzi();
   public static final String b = "villager";
   private final gzh.a c;

   public gzh(gzh.a $$0) {
      this.c = $$0;
   }

   public gzh.a a() {
      return this.c;
   }

   public static enum a {
      a("none"),
      b("partial"),
      c("full");

      private static final Map<String, gzh.a> d = Arrays.stream(values()).collect(Collectors.toMap(gzh.a::a, $$0 -> (gzh.a)$$0));
      private final String e;

      private a(final String $$0) {
         this.e = $$0;
      }

      public String a() {
         return this.e;
      }

      public static gzh.a a(String $$0) {
         return d.getOrDefault($$0, a);
      }
   }
}
