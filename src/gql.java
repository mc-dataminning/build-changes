import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class gql {
   public static final gqm a = new gqm();
   public static final String b = "villager";
   private final gql.a c;

   public gql(gql.a $$0) {
      this.c = $$0;
   }

   public gql.a a() {
      return this.c;
   }

   public static enum a {
      a("none"),
      b("partial"),
      c("full");

      private static final Map<String, gql.a> d = Arrays.stream(values()).collect(Collectors.toMap(gql.a::a, $$0 -> (gql.a)$$0));
      private final String e;

      private a(final String $$0) {
         this.e = $$0;
      }

      public String a() {
         return this.e;
      }

      public static gql.a a(String $$0) {
         return d.getOrDefault($$0, a);
      }
   }
}
