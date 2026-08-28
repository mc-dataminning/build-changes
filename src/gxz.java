import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class gxz {
   public static final gya a = new gya();
   public static final String b = "villager";
   private final gxz.a c;

   public gxz(gxz.a $$0) {
      this.c = $$0;
   }

   public gxz.a a() {
      return this.c;
   }

   public static enum a {
      a("none"),
      b("partial"),
      c("full");

      private static final Map<String, gxz.a> d = Arrays.stream(values()).collect(Collectors.toMap(gxz.a::a, $$0 -> (gxz.a)$$0));
      private final String e;

      private a(final String $$0) {
         this.e = $$0;
      }

      public String a() {
         return this.e;
      }

      public static gxz.a a(String $$0) {
         return d.getOrDefault($$0, a);
      }
   }
}
