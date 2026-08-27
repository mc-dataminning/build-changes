import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class gas {
   public static final gat a = new gat();
   public static final String b = "villager";
   private final gas.a c;

   public gas(gas.a $$0) {
      this.c = $$0;
   }

   public gas.a a() {
      return this.c;
   }

   public static enum a {
      a("none"),
      b("partial"),
      c("full");

      private static final Map<String, gas.a> d = Arrays.stream(values()).collect(Collectors.toMap(gas.a::a, $$0 -> (gas.a)$$0));
      private final String e;

      private a(String $$0) {
         this.e = $$0;
      }

      public String a() {
         return this.e;
      }

      public static gas.a a(String $$0) {
         return d.getOrDefault($$0, a);
      }
   }
}
