import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.List;
import java.util.Map;

public class gjt implements AutoCloseable {
   private static final List<gjq> b = gjq.L();
   public static final int a = b.stream().mapToInt(gjq::M).sum();
   private final Map<gjq, feo> c = ae.a(new Reference2ObjectArrayMap(b.size()), $$0 -> {
      for (gjq $$1 : b) {
         $$0.put($$1, new feo($$1.M()));
      }
   });

   public feo a(gjq $$0) {
      return this.c.get($$0);
   }

   public void a() {
      this.c.values().forEach(feo::b);
   }

   public void b() {
      this.c.values().forEach(feo::c);
   }

   @Override
   public void close() {
      this.c.values().forEach(feo::close);
   }
}
