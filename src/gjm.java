import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class gjm {
   public static final gjn a = new gjn();
   public static final String b = "villager";
   private final gjm.a c;

   public gjm(gjm.a $$0) {
      this.c = $$0;
   }

   public gjm.a a() {
      return this.c;
   }

   public static enum a {
      a("none"),
      b("partial"),
      c("full");

      private static final Map<String, gjm.a> d = Arrays.stream(values()).collect(Collectors.toMap(gjm.a::a, $$0 -> (gjm.a)$$0));
      private final String e;

      private a(String $$0) {
         this.e = $$0;
      }

      public String a() {
         return this.e;
      }

      public static gjm.a a(String $$0) {
         return d.getOrDefault($$0, a);
      }
   }
}
