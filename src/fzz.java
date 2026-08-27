import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class fzz {
   public static final gaa a = new gaa();
   public static final String b = "villager";
   private final fzz.a c;

   public fzz(fzz.a $$0) {
      this.c = $$0;
   }

   public fzz.a a() {
      return this.c;
   }

   public static enum a {
      a("none"),
      b("partial"),
      c("full");

      private static final Map<String, fzz.a> d = Arrays.stream(values()).collect(Collectors.toMap(fzz.a::a, $$0 -> (fzz.a)$$0));
      private final String e;

      private a(String $$0) {
         this.e = $$0;
      }

      public String a() {
         return this.e;
      }

      public static fzz.a a(String $$0) {
         return d.getOrDefault($$0, a);
      }
   }
}
