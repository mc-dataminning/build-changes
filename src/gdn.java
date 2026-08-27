import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class gdn {
   public static final gdo a = new gdo();
   public static final String b = "villager";
   private final gdn.a c;

   public gdn(gdn.a $$0) {
      this.c = $$0;
   }

   public gdn.a a() {
      return this.c;
   }

   public static enum a {
      a("none"),
      b("partial"),
      c("full");

      private static final Map<String, gdn.a> d = Arrays.stream(values()).collect(Collectors.toMap(gdn.a::a, $$0 -> (gdn.a)$$0));
      private final String e;

      private a(String $$0) {
         this.e = $$0;
      }

      public String a() {
         return this.e;
      }

      public static gdn.a a(String $$0) {
         return d.getOrDefault($$0, a);
      }
   }
}
