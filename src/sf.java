import com.google.common.collect.Sets;
import java.util.Set;
import java.util.stream.Stream;

public class sf {
   private static final Set<jf.c<sr>> a = Sets.newHashSet();

   public static Stream<jf.c<sr>> a() {
      return a.stream();
   }

   public static void a(jf.c<sr> $$0) {
      a.add($$0);
   }

   public static void b() {
      a.clear();
   }
}
