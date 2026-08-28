import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class hfy {
   public static final hfz a = new hfz();
   public static final String b = "villager";
   private final hfy.a c;

   public hfy(hfy.a $$0) {
      this.c = $$0;
   }

   public hfy.a a() {
      return this.c;
   }

   public static enum a {
      a("none"),
      b("partial"),
      c("full");

      private static final Map<String, hfy.a> d = Arrays.stream(values()).collect(Collectors.toMap(hfy.a::a, $$0 -> (hfy.a)$$0));
      private final String e;

      private a(final String $$0) {
         this.e = $$0;
      }

      public String a() {
         return this.e;
      }

      public static hfy.a a(String $$0) {
         return d.getOrDefault($$0, a);
      }
   }
}
