import com.google.common.collect.Sets;
import java.util.Set;
import java.util.stream.Stream;

public class se {
   private static final Set<js.c<sp>> a = Sets.newHashSet();

   public static Stream<js.c<sp>> a() {
      return a.stream();
   }

   public static void a(js.c<sp> $$0) {
      a.add($$0);
   }

   public static void b() {
      a.clear();
   }
}
