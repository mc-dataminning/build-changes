import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class hda {
   public static final hdb a = new hdb();
   public static final String b = "villager";
   private final hda.a c;

   public hda(hda.a $$0) {
      this.c = $$0;
   }

   public hda.a a() {
      return this.c;
   }

   public static enum a {
      a("none"),
      b("partial"),
      c("full");

      private static final Map<String, hda.a> d = Arrays.stream(values()).collect(Collectors.toMap(hda.a::a, $$0 -> (hda.a)$$0));
      private final String e;

      private a(final String $$0) {
         this.e = $$0;
      }

      public String a() {
         return this.e;
      }

      public static hda.a a(String $$0) {
         return d.getOrDefault($$0, a);
      }
   }
}
