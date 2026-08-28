import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class gqo {
   public static final gqp a = new gqp();
   public static final String b = "villager";
   private final gqo.a c;

   public gqo(gqo.a $$0) {
      this.c = $$0;
   }

   public gqo.a a() {
      return this.c;
   }

   public static enum a {
      a("none"),
      b("partial"),
      c("full");

      private static final Map<String, gqo.a> d = Arrays.stream(values()).collect(Collectors.toMap(gqo.a::a, $$0 -> (gqo.a)$$0));
      private final String e;

      private a(final String $$0) {
         this.e = $$0;
      }

      public String a() {
         return this.e;
      }

      public static gqo.a a(String $$0) {
         return d.getOrDefault($$0, a);
      }
   }
}
