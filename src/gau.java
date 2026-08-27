import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class gau {
   public static final gav a = new gav();
   public static final String b = "villager";
   private final gau.a c;

   public gau(gau.a $$0) {
      this.c = $$0;
   }

   public gau.a a() {
      return this.c;
   }

   public static enum a {
      a("none"),
      b("partial"),
      c("full");

      private static final Map<String, gau.a> d = Arrays.stream(values()).collect(Collectors.toMap(gau.a::a, $$0 -> (gau.a)$$0));
      private final String e;

      private a(String $$0) {
         this.e = $$0;
      }

      public String a() {
         return this.e;
      }

      public static gau.a a(String $$0) {
         return d.getOrDefault($$0, a);
      }
   }
}
