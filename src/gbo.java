import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class gbo {
   public static final gbp a = new gbp();
   public static final String b = "villager";
   private final gbo.a c;

   public gbo(gbo.a $$0) {
      this.c = $$0;
   }

   public gbo.a a() {
      return this.c;
   }

   public static enum a {
      a("none"),
      b("partial"),
      c("full");

      private static final Map<String, gbo.a> d = Arrays.stream(values()).collect(Collectors.toMap(gbo.a::a, $$0 -> (gbo.a)$$0));
      private final String e;

      private a(String $$0) {
         this.e = $$0;
      }

      public String a() {
         return this.e;
      }

      public static gbo.a a(String $$0) {
         return d.getOrDefault($$0, a);
      }
   }
}
