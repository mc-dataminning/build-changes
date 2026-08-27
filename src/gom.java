import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class gom {
   public static final gon a = new gon();
   public static final String b = "villager";
   private final gom.a c;

   public gom(gom.a $$0) {
      this.c = $$0;
   }

   public gom.a a() {
      return this.c;
   }

   public static enum a {
      a("none"),
      b("partial"),
      c("full");

      private static final Map<String, gom.a> d = Arrays.stream(values()).collect(Collectors.toMap(gom.a::a, $$0 -> (gom.a)$$0));
      private final String e;

      private a(String $$0) {
         this.e = $$0;
      }

      public String a() {
         return this.e;
      }

      public static gom.a a(String $$0) {
         return d.getOrDefault($$0, a);
      }
   }
}
