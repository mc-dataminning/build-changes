import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class gqw {
   public static final gqx a = new gqx();
   public static final String b = "villager";
   private final gqw.a c;

   public gqw(gqw.a $$0) {
      this.c = $$0;
   }

   public gqw.a a() {
      return this.c;
   }

   public static enum a {
      a("none"),
      b("partial"),
      c("full");

      private static final Map<String, gqw.a> d = Arrays.stream(values()).collect(Collectors.toMap(gqw.a::a, $$0 -> (gqw.a)$$0));
      private final String e;

      private a(final String $$0) {
         this.e = $$0;
      }

      public String a() {
         return this.e;
      }

      public static gqw.a a(String $$0) {
         return d.getOrDefault($$0, a);
      }
   }
}
