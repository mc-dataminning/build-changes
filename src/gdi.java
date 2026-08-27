import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class gdi {
   public static final gdj a = new gdj();
   public static final String b = "villager";
   private final gdi.a c;

   public gdi(gdi.a $$0) {
      this.c = $$0;
   }

   public gdi.a a() {
      return this.c;
   }

   public static enum a {
      a("none"),
      b("partial"),
      c("full");

      private static final Map<String, gdi.a> d = Arrays.stream(values()).collect(Collectors.toMap(gdi.a::a, $$0 -> (gdi.a)$$0));
      private final String e;

      private a(String $$0) {
         this.e = $$0;
      }

      public String a() {
         return this.e;
      }

      public static gdi.a a(String $$0) {
         return d.getOrDefault($$0, a);
      }
   }
}
