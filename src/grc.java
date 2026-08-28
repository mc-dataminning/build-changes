import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class grc {
   public static final grd a = new grd();
   public static final String b = "villager";
   private final grc.a c;

   public grc(grc.a $$0) {
      this.c = $$0;
   }

   public grc.a a() {
      return this.c;
   }

   public static enum a {
      a("none"),
      b("partial"),
      c("full");

      private static final Map<String, grc.a> d = Arrays.stream(values()).collect(Collectors.toMap(grc.a::a, $$0 -> (grc.a)$$0));
      private final String e;

      private a(final String $$0) {
         this.e = $$0;
      }

      public String a() {
         return this.e;
      }

      public static grc.a a(String $$0) {
         return d.getOrDefault($$0, a);
      }
   }
}
