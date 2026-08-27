import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class gfc {
   public static final gfd a = new gfd();
   public static final String b = "villager";
   private final gfc.a c;

   public gfc(gfc.a $$0) {
      this.c = $$0;
   }

   public gfc.a a() {
      return this.c;
   }

   public static enum a {
      a("none"),
      b("partial"),
      c("full");

      private static final Map<String, gfc.a> d = Arrays.stream(values()).collect(Collectors.toMap(gfc.a::a, $$0 -> (gfc.a)$$0));
      private final String e;

      private a(String $$0) {
         this.e = $$0;
      }

      public String a() {
         return this.e;
      }

      public static gfc.a a(String $$0) {
         return d.getOrDefault($$0, a);
      }
   }
}
