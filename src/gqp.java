import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class gqp {
   public static final gqq a = new gqq();
   public static final String b = "villager";
   private final gqp.a c;

   public gqp(gqp.a $$0) {
      this.c = $$0;
   }

   public gqp.a a() {
      return this.c;
   }

   public static enum a {
      a("none"),
      b("partial"),
      c("full");

      private static final Map<String, gqp.a> d = Arrays.stream(values()).collect(Collectors.toMap(gqp.a::a, $$0 -> (gqp.a)$$0));
      private final String e;

      private a(final String $$0) {
         this.e = $$0;
      }

      public String a() {
         return this.e;
      }

      public static gqp.a a(String $$0) {
         return d.getOrDefault($$0, a);
      }
   }
}
