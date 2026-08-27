import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class fwh {
   public static final fwi a = new fwi();
   public static final String b = "villager";
   private final fwh.a c;

   public fwh(fwh.a $$0) {
      this.c = $$0;
   }

   public fwh.a a() {
      return this.c;
   }

   public static enum a {
      a("none"),
      b("partial"),
      c("full");

      private static final Map<String, fwh.a> d = Arrays.stream(values()).collect(Collectors.toMap(fwh.a::a, $$0 -> (fwh.a)$$0));
      private final String e;

      private a(String $$0) {
         this.e = $$0;
      }

      public String a() {
         return this.e;
      }

      public static fwh.a a(String $$0) {
         return d.getOrDefault($$0, a);
      }
   }
}
