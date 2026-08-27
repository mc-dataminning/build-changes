import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class gcv {
   public static final gcw a = new gcw();
   public static final String b = "villager";
   private final gcv.a c;

   public gcv(gcv.a $$0) {
      this.c = $$0;
   }

   public gcv.a a() {
      return this.c;
   }

   public static enum a {
      a("none"),
      b("partial"),
      c("full");

      private static final Map<String, gcv.a> d = Arrays.stream(values()).collect(Collectors.toMap(gcv.a::a, $$0 -> (gcv.a)$$0));
      private final String e;

      private a(String $$0) {
         this.e = $$0;
      }

      public String a() {
         return this.e;
      }

      public static gcv.a a(String $$0) {
         return d.getOrDefault($$0, a);
      }
   }
}
