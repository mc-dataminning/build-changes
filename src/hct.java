import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class hct {
   public static final hcu a = new hcu();
   public static final String b = "villager";
   private final hct.a c;

   public hct(hct.a $$0) {
      this.c = $$0;
   }

   public hct.a a() {
      return this.c;
   }

   public static enum a {
      a("none"),
      b("partial"),
      c("full");

      private static final Map<String, hct.a> d = Arrays.stream(values()).collect(Collectors.toMap(hct.a::a, $$0 -> (hct.a)$$0));
      private final String e;

      private a(final String $$0) {
         this.e = $$0;
      }

      public String a() {
         return this.e;
      }

      public static hct.a a(String $$0) {
         return d.getOrDefault($$0, a);
      }
   }
}
