import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class gqm {
   public static final gqn a = new gqn();
   public static final String b = "villager";
   private final gqm.a c;

   public gqm(gqm.a $$0) {
      this.c = $$0;
   }

   public gqm.a a() {
      return this.c;
   }

   public static enum a {
      a("none"),
      b("partial"),
      c("full");

      private static final Map<String, gqm.a> d = Arrays.stream(values()).collect(Collectors.toMap(gqm.a::a, $$0 -> (gqm.a)$$0));
      private final String e;

      private a(final String $$0) {
         this.e = $$0;
      }

      public String a() {
         return this.e;
      }

      public static gqm.a a(String $$0) {
         return d.getOrDefault($$0, a);
      }
   }
}
