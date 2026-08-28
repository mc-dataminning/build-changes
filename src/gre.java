import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class gre {
   public static final grf a = new grf();
   public static final String b = "villager";
   private final gre.a c;

   public gre(gre.a $$0) {
      this.c = $$0;
   }

   public gre.a a() {
      return this.c;
   }

   public static enum a {
      a("none"),
      b("partial"),
      c("full");

      private static final Map<String, gre.a> d = Arrays.stream(values()).collect(Collectors.toMap(gre.a::a, $$0 -> (gre.a)$$0));
      private final String e;

      private a(final String $$0) {
         this.e = $$0;
      }

      public String a() {
         return this.e;
      }

      public static gre.a a(String $$0) {
         return d.getOrDefault($$0, a);
      }
   }
}
