import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class gmw {
   public static final gmx a = new gmx();
   public static final String b = "villager";
   private final gmw.a c;

   public gmw(gmw.a $$0) {
      this.c = $$0;
   }

   public gmw.a a() {
      return this.c;
   }

   public static enum a {
      a("none"),
      b("partial"),
      c("full");

      private static final Map<String, gmw.a> d = Arrays.stream(values()).collect(Collectors.toMap(gmw.a::a, $$0 -> (gmw.a)$$0));
      private final String e;

      private a(String $$0) {
         this.e = $$0;
      }

      public String a() {
         return this.e;
      }

      public static gmw.a a(String $$0) {
         return d.getOrDefault($$0, a);
      }
   }
}
