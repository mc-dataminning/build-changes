import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.List;
import java.util.Map;

public class gjk implements AutoCloseable {
   private static final List<gjh> b = gjh.L();
   public static final int a = b.stream().mapToInt(gjh::M).sum();
   private final Map<gjh, feh> c = ae.a(new Reference2ObjectArrayMap(b.size()), $$0 -> {
      for (gjh $$1 : b) {
         $$0.put($$1, new feh($$1.M()));
      }
   });

   public feh a(gjh $$0) {
      return this.c.get($$0);
   }

   public void a() {
      this.c.values().forEach(feh::b);
   }

   public void b() {
      this.c.values().forEach(feh::c);
   }

   @Override
   public void close() {
      this.c.values().forEach(feh::close);
   }
}
