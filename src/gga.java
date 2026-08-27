import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class gga {
   public static final ggb a = new ggb();
   public static final String b = "villager";
   private final gga.a c;

   public gga(gga.a $$0) {
      this.c = $$0;
   }

   public gga.a a() {
      return this.c;
   }

   public static enum a {
      a("none"),
      b("partial"),
      c("full");

      private static final Map<String, gga.a> d = Arrays.stream(values()).collect(Collectors.toMap(gga.a::a, $$0 -> (gga.a)$$0));
      private final String e;

      private a(String $$0) {
         this.e = $$0;
      }

      public String a() {
         return this.e;
      }

      public static gga.a a(String $$0) {
         return d.getOrDefault($$0, a);
      }
   }
}
