import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class grz {
   public static final gsa a = new gsa();
   public static final String b = "villager";
   private final grz.a c;

   public grz(grz.a $$0) {
      this.c = $$0;
   }

   public grz.a a() {
      return this.c;
   }

   public static enum a {
      a("none"),
      b("partial"),
      c("full");

      private static final Map<String, grz.a> d = Arrays.stream(values()).collect(Collectors.toMap(grz.a::a, $$0 -> (grz.a)$$0));
      private final String e;

      private a(final String $$0) {
         this.e = $$0;
      }

      public String a() {
         return this.e;
      }

      public static grz.a a(String $$0) {
         return d.getOrDefault($$0, a);
      }
   }
}
