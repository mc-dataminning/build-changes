import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class gih {
   public static final gii a = new gii();
   public static final String b = "villager";
   private final gih.a c;

   public gih(gih.a $$0) {
      this.c = $$0;
   }

   public gih.a a() {
      return this.c;
   }

   public static enum a {
      a("none"),
      b("partial"),
      c("full");

      private static final Map<String, gih.a> d = Arrays.stream(values()).collect(Collectors.toMap(gih.a::a, $$0 -> (gih.a)$$0));
      private final String e;

      private a(String $$0) {
         this.e = $$0;
      }

      public String a() {
         return this.e;
      }

      public static gih.a a(String $$0) {
         return d.getOrDefault($$0, a);
      }
   }
}
