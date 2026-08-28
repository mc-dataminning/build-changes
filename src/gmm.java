import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.List;
import java.util.Map;

public class gmm implements AutoCloseable {
   private static final List<gmj> b = gmj.Q();
   public static final int a = b.stream().mapToInt(gmj::R).sum();
   private final Map<gmj, ffs> c = af.a(new Reference2ObjectArrayMap(b.size()), $$0 -> {
      for (gmj $$1 : b) {
         $$0.put($$1, new ffs($$1.R()));
      }
   });

   public ffs a(gmj $$0) {
      return this.c.get($$0);
   }

   public void a() {
      this.c.values().forEach(ffs::b);
   }

   public void b() {
      this.c.values().forEach(ffs::c);
   }

   @Override
   public void close() {
      this.c.values().forEach(ffs::close);
   }
}
