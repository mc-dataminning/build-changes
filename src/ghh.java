import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.List;
import java.util.Map;

public class ghh implements AutoCloseable {
   private static final List<ghe> b = ghe.M();
   public static final int a = b.stream().mapToInt(ghe::N).sum();
   private final Map<ghe, fcr> c = ad.a(new Reference2ObjectArrayMap(b.size()), $$0 -> {
      for (ghe $$1 : b) {
         $$0.put($$1, new fcr($$1.N()));
      }
   });

   public fcr a(ghe $$0) {
      return this.c.get($$0);
   }

   public void a() {
      this.c.values().forEach(fcr::b);
   }

   public void b() {
      this.c.values().forEach(fcr::c);
   }

   @Override
   public void close() {
      this.c.values().forEach(fcr::close);
   }
}
