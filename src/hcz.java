import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class hcz {
   public static final hda a = new hda();
   public static final String b = "villager";
   private final hcz.a c;

   public hcz(hcz.a $$0) {
      this.c = $$0;
   }

   public hcz.a a() {
      return this.c;
   }

   public static enum a {
      a("none"),
      b("partial"),
      c("full");

      private static final Map<String, hcz.a> d = Arrays.stream(values()).collect(Collectors.toMap(hcz.a::a, $$0 -> (hcz.a)$$0));
      private final String e;

      private a(final String $$0) {
         this.e = $$0;
      }

      public String a() {
         return this.e;
      }

      public static hcz.a a(String $$0) {
         return d.getOrDefault($$0, a);
      }
   }
}
