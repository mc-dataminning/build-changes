import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class gsm {
   public static final gsn a = new gsn();
   public static final String b = "villager";
   private final gsm.a c;

   public gsm(gsm.a $$0) {
      this.c = $$0;
   }

   public gsm.a a() {
      return this.c;
   }

   public static enum a {
      a("none"),
      b("partial"),
      c("full");

      private static final Map<String, gsm.a> d = Arrays.stream(values()).collect(Collectors.toMap(gsm.a::a, $$0 -> (gsm.a)$$0));
      private final String e;

      private a(String $$0) {
         this.e = $$0;
      }

      public String a() {
         return this.e;
      }

      public static gsm.a a(String $$0) {
         return d.getOrDefault($$0, a);
      }
   }
}
