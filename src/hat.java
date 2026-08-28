import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class hat {
   public static final hau a = new hau();
   public static final String b = "villager";
   private final hat.a c;

   public hat(hat.a $$0) {
      this.c = $$0;
   }

   public hat.a a() {
      return this.c;
   }

   public static enum a {
      a("none"),
      b("partial"),
      c("full");

      private static final Map<String, hat.a> d = Arrays.stream(values()).collect(Collectors.toMap(hat.a::a, $$0 -> (hat.a)$$0));
      private final String e;

      private a(final String $$0) {
         this.e = $$0;
      }

      public String a() {
         return this.e;
      }

      public static hat.a a(String $$0) {
         return d.getOrDefault($$0, a);
      }
   }
}
