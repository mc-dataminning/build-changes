import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class fzu {
   public static final fzv a = new fzv();
   public static final String b = "villager";
   private final fzu.a c;

   public fzu(fzu.a $$0) {
      this.c = $$0;
   }

   public fzu.a a() {
      return this.c;
   }

   public static enum a {
      a("none"),
      b("partial"),
      c("full");

      private static final Map<String, fzu.a> d = Arrays.stream(values()).collect(Collectors.toMap(fzu.a::a, $$0 -> (fzu.a)$$0));
      private final String e;

      private a(String $$0) {
         this.e = $$0;
      }

      public String a() {
         return this.e;
      }

      public static fzu.a a(String $$0) {
         return d.getOrDefault($$0, a);
      }
   }
}
