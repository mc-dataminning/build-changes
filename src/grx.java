import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class grx {
   public static final gry a = new gry();
   public static final String b = "villager";
   private final grx.a c;

   public grx(grx.a $$0) {
      this.c = $$0;
   }

   public grx.a a() {
      return this.c;
   }

   public static enum a {
      a("none"),
      b("partial"),
      c("full");

      private static final Map<String, grx.a> d = Arrays.stream(values()).collect(Collectors.toMap(grx.a::a, $$0 -> (grx.a)$$0));
      private final String e;

      private a(final String $$0) {
         this.e = $$0;
      }

      public String a() {
         return this.e;
      }

      public static grx.a a(String $$0) {
         return d.getOrDefault($$0, a);
      }
   }
}
