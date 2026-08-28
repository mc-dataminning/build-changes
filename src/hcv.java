import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class hcv {
   public static final hcw a = new hcw();
   public static final String b = "villager";
   private final hcv.a c;

   public hcv(hcv.a $$0) {
      this.c = $$0;
   }

   public hcv.a a() {
      return this.c;
   }

   public static enum a {
      a("none"),
      b("partial"),
      c("full");

      private static final Map<String, hcv.a> d = Arrays.stream(values()).collect(Collectors.toMap(hcv.a::a, $$0 -> (hcv.a)$$0));
      private final String e;

      private a(final String $$0) {
         this.e = $$0;
      }

      public String a() {
         return this.e;
      }

      public static hcv.a a(String $$0) {
         return d.getOrDefault($$0, a);
      }
   }
}
