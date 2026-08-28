import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.List;
import java.util.Map;

public class gnk implements AutoCloseable {
   private static final List<gnh> b = gnh.Q();
   public static final int a = b.stream().mapToInt(gnh::R).sum();
   private final Map<gnh, fgo> c = af.a(new Reference2ObjectArrayMap(b.size()), $$0 -> {
      for (gnh $$1 : b) {
         $$0.put($$1, new fgo($$1.R()));
      }
   });

   public fgo a(gnh $$0) {
      return this.c.get($$0);
   }

   public void a() {
      this.c.values().forEach(fgo::b);
   }

   public void b() {
      this.c.values().forEach(fgo::c);
   }

   @Override
   public void close() {
      this.c.values().forEach(fgo::close);
   }
}
