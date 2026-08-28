import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.List;
import java.util.Map;

public class giu implements AutoCloseable {
   private static final List<gir> b = gir.L();
   public static final int a = b.stream().mapToInt(gir::M).sum();
   private final Map<gir, fdy> c = ae.a(new Reference2ObjectArrayMap(b.size()), $$0 -> {
      for (gir $$1 : b) {
         $$0.put($$1, new fdy($$1.M()));
      }
   });

   public fdy a(gir $$0) {
      return this.c.get($$0);
   }

   public void a() {
      this.c.values().forEach(fdy::b);
   }

   public void b() {
      this.c.values().forEach(fdy::c);
   }

   @Override
   public void close() {
      this.c.values().forEach(fdy::close);
   }
}
