import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class hcy {
   public static final hcz a = new hcz();
   public static final String b = "villager";
   private final hcy.a c;

   public hcy(hcy.a $$0) {
      this.c = $$0;
   }

   public hcy.a a() {
      return this.c;
   }

   public static enum a {
      a("none"),
      b("partial"),
      c("full");

      private static final Map<String, hcy.a> d = Arrays.stream(values()).collect(Collectors.toMap(hcy.a::a, $$0 -> (hcy.a)$$0));
      private final String e;

      private a(final String $$0) {
         this.e = $$0;
      }

      public String a() {
         return this.e;
      }

      public static hcy.a a(String $$0) {
         return d.getOrDefault($$0, a);
      }
   }
}
