import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.List;
import java.util.Map;

public class ghy implements AutoCloseable {
   private static final List<ghv> b = ghv.L();
   public static final int a = b.stream().mapToInt(ghv::M).sum();
   private final Map<ghv, fdf> c = ad.a(new Reference2ObjectArrayMap(b.size()), $$0 -> {
      for (ghv $$1 : b) {
         $$0.put($$1, new fdf($$1.M()));
      }
   });

   public fdf a(ghv $$0) {
      return this.c.get($$0);
   }

   public void a() {
      this.c.values().forEach(fdf::b);
   }

   public void b() {
      this.c.values().forEach(fdf::c);
   }

   @Override
   public void close() {
      this.c.values().forEach(fdf::close);
   }
}
