import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class gao {
   public static final gap a = new gap();
   public static final String b = "villager";
   private final gao.a c;

   public gao(gao.a $$0) {
      this.c = $$0;
   }

   public gao.a a() {
      return this.c;
   }

   public static enum a {
      a("none"),
      b("partial"),
      c("full");

      private static final Map<String, gao.a> d = Arrays.stream(values()).collect(Collectors.toMap(gao.a::a, $$0 -> (gao.a)$$0));
      private final String e;

      private a(String $$0) {
         this.e = $$0;
      }

      public String a() {
         return this.e;
      }

      public static gao.a a(String $$0) {
         return d.getOrDefault($$0, a);
      }
   }
}
