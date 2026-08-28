import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class gqn {
   public static final gqo a = new gqo();
   public static final String b = "villager";
   private final gqn.a c;

   public gqn(gqn.a $$0) {
      this.c = $$0;
   }

   public gqn.a a() {
      return this.c;
   }

   public static enum a {
      a("none"),
      b("partial"),
      c("full");

      private static final Map<String, gqn.a> d = Arrays.stream(values()).collect(Collectors.toMap(gqn.a::a, $$0 -> (gqn.a)$$0));
      private final String e;

      private a(final String $$0) {
         this.e = $$0;
      }

      public String a() {
         return this.e;
      }

      public static gqn.a a(String $$0) {
         return d.getOrDefault($$0, a);
      }
   }
}
