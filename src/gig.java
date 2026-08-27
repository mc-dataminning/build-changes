import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class gig {
   public static final gih a = new gih();
   public static final String b = "villager";
   private final gig.a c;

   public gig(gig.a $$0) {
      this.c = $$0;
   }

   public gig.a a() {
      return this.c;
   }

   public static enum a {
      a("none"),
      b("partial"),
      c("full");

      private static final Map<String, gig.a> d = Arrays.stream(values()).collect(Collectors.toMap(gig.a::a, $$0 -> (gig.a)$$0));
      private final String e;

      private a(String $$0) {
         this.e = $$0;
      }

      public String a() {
         return this.e;
      }

      public static gig.a a(String $$0) {
         return d.getOrDefault($$0, a);
      }
   }
}
